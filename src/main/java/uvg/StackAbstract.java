package uvg;

public abstract class StackAbstract<T> {
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract void push(T item);
    public abstract T pop();
    public abstract T peek();
}
