package uvg;
import java.util.Stack;

public interface ListInterface<T> {
    void add(T item);
    T remove(T item);
    T get(int index);
    boolean isEmpty();
    int size();
}
