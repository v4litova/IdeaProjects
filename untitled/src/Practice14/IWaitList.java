package Practice14;
import java.util.Collection;

public interface IWaitList<E> {
    /**
     * Добавляет элемент в коллекцию.
     *
     * @param element Элемент, который необходимо добавить в коллекцию.
     */
    public void add(E element);
    /**
     * Удаляет и возвращает элемент из коллекции.
     *
     * @return Удаленный элемент.
     */
    public E remove();
    /**
     * Проверяет, содержит ли коллекция указанный элемент.
     *
     * @param element Элемент для проверки наличия.
     * @return true, если элемент присутствует в коллекции, иначе - false.
     */
    public boolean contains(E element);
    /**
     * Проверяет, содержит ли коллекция все элементы из заданной коллекции.
     *
     * @param c Коллекция элементов для проверки.
     * @return true, если все элементы из заданной коллекции присутствуют
     * в данной коллекции, иначе - false.
     */
    public boolean containsAll(Collection<E> c);
    /**
     * Проверяет, является ли коллекция пустой.
     *
     * @return true, если коллекция пуста, иначе - false.
     */
    public boolean isEmpty();
}
