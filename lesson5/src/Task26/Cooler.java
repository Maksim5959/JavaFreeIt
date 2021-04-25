package Task26;

public class Cooler extends RefrigerationAppliances {
    private int maxWaterVolume;


    public Cooler(String firm, String model, int coolingTemperature, int maxWaterVolume) {
        super(firm, model, coolingTemperature);
        this.maxWaterVolume = maxWaterVolume;
    }

    @Override
    public void on() {
        System.out.println("Кулер " + getFirm() + " " + getModel() +  " включен в розетку.");
    }

    @Override
    public void off() {
        System.out.println("Кулер " + getFirm() + " " + getModel() +  " выключен из розетки.");
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

    public int getMaxWaterVolume() {
        return maxWaterVolume;
    }

    @Override
    public void setCoolingTemperature(int coolingTemperature) {
        super.setCoolingTemperature(coolingTemperature);
    }

    public void setMaxWaterVolume(int maxWaterVolume) {
        this.maxWaterVolume = maxWaterVolume;
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
    public String toString() {
        return "Cooler{" +
                "maxWaterVolume=" + maxWaterVolume +
                "} " + super.toString();
    }
}
