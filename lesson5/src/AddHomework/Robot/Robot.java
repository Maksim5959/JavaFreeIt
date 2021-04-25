package AddHomework.Robot;

import AddHomework.Robot.Hands.IHand;
import AddHomework.Robot.Heads.IHead;
import AddHomework.Robot.Legs.ILeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private String name;

    public Robot(IHead head, IHand hand, ILeg leg, String name) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.name = name;
    }

    public Robot() {
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     *
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }

    public static class CostRobot {
        public void costRobot(Robot robot1, Robot robot2, Robot robot3) {
            Robot[] costRobot = {robot1, robot2, robot3};
            int maxCostRobot = Integer.MIN_VALUE;
            int i;
            for (i = 0; i < costRobot.length; i++) {
                if (maxCostRobot < costRobot[i].getPrice()) {
                    maxCostRobot = costRobot[i].getPrice();
                }
            }
            for (i = 0; i < costRobot.length; i++) {
                if (costRobot[i].getPrice() == maxCostRobot) {
                    System.out.println("Робот " + costRobot[i].name + " обойдется вам дороже всех, его стоимость составит " + maxCostRobot + " долларов.");
                }
            }
        }
    }
}
