package Practice1;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Lermontov", 309);
        Book book2 = new Book("Pushkin", 278);
        Book book3 = new Book("Dostoevsky", 723);
        //System.out.println(book1);
        book1.print();
        book2.print();
        book3.print();
    }
}
