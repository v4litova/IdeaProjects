package Practice14;
//Этот список ожидания имеет ограниченную емкость, указываемую в момент создания.
public class BoundedWaitList<E> extends WaitList {
    private int capacity;
    BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        if (capacity > content.size()) {
            content.add(element);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}