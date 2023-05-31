package Task_3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть назву книги: ");
        Title title = new Title(scanner.next());

        System.out.print("Введіть автора книги: ");
        Author author = new Author(scanner.next());

        System.out.print("Введіть контент книги: ");
        Content content = new Content(scanner.next());
        System.out.println("---------------");
        title.show();
        author.show();
        content.show();

    }
}
