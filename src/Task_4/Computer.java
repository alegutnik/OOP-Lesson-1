package Task_4;

public class Computer {
    private String numberComputer;

    public Computer(String numberComputer) {
        this.numberComputer = numberComputer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Им'я компьютера: '" + numberComputer + '\'' +
                '}';
    }
}
