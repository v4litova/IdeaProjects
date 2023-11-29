package Practice4;

public class Book {
    private String author;
    private String name;
    private int pages;
    private int year;
    public Book(String name, String author, int year, int pages) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public void print() {
        System.out.println("Название: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Год написания: " + year);
        System.out.println("Количество страниц: " + pages);
    }
}
