package Practice21;

public abstract class AbstractQueue<T> {
    public abstract void enqueue(T t);
    public abstract T element();
    public abstract T dequeue();
    public abstract int size();
    public abstract boolean isEmpty();
    public abstract void clear();
}