package AddHomework.Computer;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer("Core i7","8 GB", "1 TB",2);
        computer.printComputerParams();
        for (;computer.live();) {
            computer.on();
            computer.off();
        }
        computer.on();
    }
}
