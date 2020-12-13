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
    T temp = get(0);
    int x = 0;
    for (int i = 0; i < size(); i++) {
      min = i;
      for (int j = i + 1; j < size(); j++) {
        if (get(j).compareTo(get(i)) < 0) {
          min = j;
          x = 1;
        }
      }
      temp = get(i);
      super.set (i, get(min));
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

  public T set(int index, T value) {
    T x = super.remove(index);
    super.add(index, value);
    sorting();
    return x;
  }
}
