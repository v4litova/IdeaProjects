package Practice21;

//Класс ArrayQueue должен реализовывать очередь в виде класса (с
//неявной передачей ссылки на экземпляр очереди).

public class ArrayQueue<T> extends AbstractQueue<T> {
    private int size;
    private int usedСount;
    Object[] objects;
    ArrayQueue(int size) {
        this.size = size;
        usedСount = 0;
        objects = new Object[size];
    }
    public void enqueue(T t) {
        int i = 0;
        while (objects[i] != null) {
            i++;
        }
        objects[i] = t;
        usedСount++;
    }
    public T element() {
        return (T)objects[0];
    }
    public T dequeue() {
        T t = (T)objects[0];
        for (int i = 0; i < usedСount - 1; i++) {
            objects[i] = objects[i+1];
        }
        objects[usedСount-1] = null;
        usedСount--;
        return t;
    }
    public int size() {
        return usedСount;
    }

    public boolean isEmpty() {
        if (usedСount == 0) {
            return true;
        }
        return false;
    }
    public void clear() {
        int i = 0;
        while (objects[i] != null) {
            objects[i] = null;
            i++;
        }
        usedСount = 0;
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < usedСount; i++) {
            result += objects[i] + " ";
        }
        result += "]";
        return result;
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(4);
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