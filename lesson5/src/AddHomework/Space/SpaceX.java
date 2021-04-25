package AddHomework.Space;

import java.util.Random;

public class SpaceX implements IStart{
    @Override
    public boolean startSystemCheck() {
        Random random = new Random();
        int chekStart = random.nextInt(10);
        if (chekStart > 3) {
            System.out.println("Предстартовая проверка систем космического коробля " + "\"SpaceX\"" +" прошла успешно!");
            return true;
        } else {
            System.out.println("Найдены ошибки систем космического коробля " + "\"SpaceX\"" +", необходимо произвести ремонт корабля!");
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели космического коробля " + "\"SpaceX\"" + " запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Космический корабль " + "\"SpaceX\"" + " идет на взлет!");
    }
}
