package Practice1;

public class Book {
    private String autor;
    private int pages;
    public Book(String a, int p){
        autor = a;
        pages = p;
    }
    public Book(String a){
        autor = a;
        pages = 0;
    }

    public Book(){
        autor = "autor";
        pages = 0;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(String autor){
        return autor;
    }

    public int getPages(){
        return pages;
    }

    public String toString(){
        return this.autor+", number of pages"+this.pages;
    }

    public void print(){
        System.out.println("Autor of the book:" + autor+", number of pages is "+pages);
    }
}
