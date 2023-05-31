package Task_3;

public class Content {
    public Content(String content) {
        this.content = content;
    }

    public String getcontent() {
        return content;
    }

    public void show() {
        System.out.println("Контент книги: " + this.content);
    }

    public void setcontent(String content) {
        this.content = content;
    }

    private String content;
}
