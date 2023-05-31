package Task_3;

public class Author {
    public Author(String author) {
        this.author = author;
    }

    public String getauthor() {
        return author;
    }

    public void show() {
        System.out.println("Автор книги: " + this.author);
    }

    public void setauthor(String author) {
        this.author = author;
    }

    private String author;
}
