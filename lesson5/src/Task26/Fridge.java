package Task26;

public class Fridge extends RefrigerationAppliances {
    private int countSection;
    private boolean noFrost;

    public Fridge(String firm, String model, int coolingTemperature, int countSection, boolean noFrost) {
        super(firm, model, coolingTemperature);
        this.countSection = countSection;
        this.noFrost = noFrost;
    }

    public int getCountSection() {
        return countSection;
    }

    public boolean getNoFrost() {
        return noFrost;
    }

    public void setCountSection(int countSection) {
        this.countSection = countSection;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }

    @Override
    public void on() {
        System.out.println("Холодильник " + getFirm() + " " + getModel() +  " включен в розетку.");
    }

    @Override
    public void off() {
        System.out.println("Холодильник " + getFirm() + " " + getModel() +  " выключен из розетки.");
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getFirm() {
        return super.getFirm();
    }

    @Override
    public int getCoolingTemperature() {
        return super.getCoolingTemperature();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setFirm(String firm) {
        super.setFirm(firm);
    }

    @Override
    public void setCoolingTemperature(int coolingTemperature) {
        super.setCoolingTemperature(coolingTemperature);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "countSection=" + countSection +
                ", noFrost=" + noFrost +
                "} " + super.toString();
    }
}
