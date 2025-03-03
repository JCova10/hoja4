package uvg;

public abstract class AbstractList<T> {
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract void add(T item);
    public abstract T remove(T item);
    public abstract T get(int index);

   
}