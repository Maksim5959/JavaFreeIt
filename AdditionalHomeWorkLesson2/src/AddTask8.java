/*
* 8)Начав тренировки, спортсмен в первый день пробежал 10 км.
* Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
* Какой суммарный путь пробежит спортсмен за 7 дней?
*/
public class AddTask8 {
    public static void main(String[] args) {
        double beginRunnerDistance = 10;
        double endRunnerDistance = beginRunnerDistance;
        double runnerProgress = beginRunnerDistance;
        for (int i = 0;i < 7; i++) {
            runnerProgress += (endRunnerDistance * 0.1);
            endRunnerDistance += runnerProgress;
        }
        double scale = Math.pow(10, 2);
        double result = Math.ceil(endRunnerDistance * scale) / scale;
        System.out.println("Бегун пробежит суммарный путь равный " + result + " км. ");
    }
}
