package Practice21;

//Класс ArrayQueueADT должен реализовывать очередь в виде
//абстрактного типа данных (с явной передачей ссылки на экземпляр очереди).
public class ArrayQueueADT<T> {
    private int size;
    private int usedСount;
    Object[] objects;
    ArrayQueueADT(int size) {
        this.size = size;
        this.usedСount = 0;
        this.objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (this.objects[i] != null) {
            i++;
        }
        this.objects[i] = t;
        this.usedСount++;
    }
    public T element() {
        return (T)this.objects[0];
    }
    public T dequeue() {
        T t = (T)this.objects[0];
        for (int i = 0; i < this.usedСount - 1; i++) {
            this.objects[i] = this.objects[i+1];
        }
        this.objects[this.usedСount-1] = null;
        this.usedСount--;
        return t;
    }
    public int size() {
        return this.usedСount;
    }
    public boolean isEmpty() {
        if (this.usedСount == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (this.objects[i] != null) {
            this.objects[i] = null;
            i++;
        }
        this.usedСount = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < this.usedСount; i++) {
            result += this.objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue = new ArrayQueueADT<>(4);
        queue.enqueue(4);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(3);
        System.out.println("Изначальный вид: ");
        System.out.println(queue);
        System.out.println("Размер: ");
        System.out.println(queue.size());
        System.out.println("Выведем и удалим первый элемент: ");
        System.out.println(queue.dequeue());
        System.out.println("Первый элемент: ");
        System.out.println(queue.element());
        System.out.println("Результат: ");
        System.out.println(queue);
    }
}