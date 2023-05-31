package Task_4;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < 5; i++) {
            Computer newComputer = new Computer("Computer" + (i + 1));
            computers[i] = newComputer;
        }

        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
