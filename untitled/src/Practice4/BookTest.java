package Practice4;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Капитанская дочка", "Пушкин", 1836, 120 );
        Book book2 = new Book("Мертвые души", "Гоголь", 1835, 237 );
        //System.out.println(book1);
        book1.print();
        System.out.println();
        book2.print();

        System.out.println();
        System.out.println("Установлено новое число страниц");
        book1.setPages(143);
        book1.print();
    }
}
