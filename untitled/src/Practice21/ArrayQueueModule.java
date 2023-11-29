package Practice21;

import java.util.ArrayList;
import java.util.List;
//Класс ArrayQueueModule должен реализовывать один экземпляр
//очереди с использованием переменных класса.

public class ArrayQueueModule<T> {
    List<T> objects;
    ArrayQueueModule() {
        objects = new ArrayList<>();
    }
    public void enqueue(T t) {
        objects.add(t);
    }

    public T element() {
        try {
            return objects.get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    public T dequeue() {
        T result = element();
        objects.remove(0);
        return result;
    }

    public int size() {
        return objects.size();
    }

    public boolean isEmpty() {
        return objects.isEmpty();
    }
    public void clear() {
        objects.clear();
    }

    @Override
    public String toString() {
        return objects.toString();
    }

    public static void main(String[] args) {
        ArrayQueueModule<Integer> queue = new ArrayQueueModule<>();
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