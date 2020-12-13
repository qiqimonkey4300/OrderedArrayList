import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  private void sorting() {
    int min = 0;
    T temp = super.get(0);
    int x = 0;
    for (int i = 0; i < size(); i++) {
      min = i;
      for (int j = i + 1; j < size(); j++) {
        if (super.get(j).compareTo(super.get(i)) < 0) {
          min = j;
          x = 1;
        }
      }
      temp = super.get(i);
      set (i, super.get(min));
      super.set(min, temp);
      if (x != 0) {
        i--; x = 0;
      }
    }
  }

  public boolean add(T value) {
    super.add(value);
    sorting(); return true;
  }

  public void add(int index, T value) {
    super.add(index, value);
    sorting();
  }

  //public T set(int index, T value) {
  //}
}
