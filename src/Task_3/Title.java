package Task_3;

public class Title {
    public Title(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void show() {
        System.out.println("Назва книги: " + this.title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}
