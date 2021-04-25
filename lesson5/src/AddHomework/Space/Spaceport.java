package AddHomework.Space;

public class Spaceport{
    void starting (IStart start) throws InterruptedException{
        if (!start.startSystemCheck()) {
            System.out.println("Предстартовая проверка провалена!");
        } else {
            start.startEngine();
            int time = 10;
            for (int i = (int) time; i >= 0; i--) {
                System.out.println("До запуска осталось: " + ((i > 4)? i + " секунд": (i > 1)? i + " секунды" : (i == 1)? i + " секунда":"Полетели!"));
                Thread.sleep(1000L);
            }
            start.start();
        }
    }
}
