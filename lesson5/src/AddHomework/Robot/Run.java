package AddHomework.Robot;

/*
 * Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
 * Класс SonyHead является примером реализацией головы от Sony.
 * Создайте 3 робота с разными комплектующими.
 * Например у робота голова и нога от Sony а, рука от Samsung.
 * У всех роботов вызовите метод action.
 * Среди 3-х роботов найдите самого дорогого.
 */

import AddHomework.Robot.Hands.IHand;
import AddHomework.Robot.Hands.SamsungHand;
import AddHomework.Robot.Hands.SonyHand;
import AddHomework.Robot.Hands.ToshibaHand;
import AddHomework.Robot.Heads.IHead;
import AddHomework.Robot.Heads.SamsungHead;
import AddHomework.Robot.Heads.SonyHead;
import AddHomework.Robot.Heads.ToshibaHead;
import AddHomework.Robot.Legs.ILeg;
import AddHomework.Robot.Legs.SamsungLegs;
import AddHomework.Robot.Legs.SonyLegs;
import AddHomework.Robot.Legs.ToshibaLegs;

public class Run {
    public static void main(String[] args) {
        IHead samsungHead = new SamsungHead(350);
        IHead sonyHead = new SonyHead(300);
        IHead toshibaHead = new ToshibaHead(550);

        IHand samsungHand = new SamsungHand(150);
        IHand sonyHand = new SonyHand(650);
        IHand toshibaHand = new ToshibaHand(250);

        ILeg samsungLeg = new SamsungLegs(300);
        ILeg sonyLeg = new SonyLegs(800);
        ILeg toshibaLeg = new ToshibaLegs(200);

        Robot roboCop = new Robot(samsungHead, sonyHand, toshibaLeg, "RoboCop");
        Robot terminator = new Robot(toshibaHead, samsungHand, sonyLeg, "Terminator");
        Robot valley = new Robot(sonyHead, toshibaHand, samsungLeg, "Valley");
        System.out.println("RoboCop:");
        roboCop.action();
        System.out.println("Terminator: ");
        terminator.action();
        System.out.println("Valley: ");
        valley.action();

        Robot.CostRobot costRobot = new Robot.CostRobot();
        costRobot.costRobot(terminator, valley, roboCop);
    }
}
