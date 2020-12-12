import java.util.ArrayList;
import java.io.*;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("A null value is not allowed to be added.");
    }
    return super.add(value);
  }
  //public void add(int index, T value) {
  //}
  //public T set(int index, T value) {
  //}
}
