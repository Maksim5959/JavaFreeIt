package Task26;

public abstract class RefrigerationAppliances extends Appliances{
    private int coolingTemperature;

    public RefrigerationAppliances(String firm, String model, int coolingTemperature) {
        super(firm, model);
        this.coolingTemperature = coolingTemperature;
    }

    @Override
    public String getFirm() {
        return super.getFirm();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setFirm(String firm) {
        super.setFirm(firm);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    public int getCoolingTemperature() {
        return coolingTemperature;
    }

    public void setCoolingTemperature(int coolingTemperature) {
        this.coolingTemperature = coolingTemperature;
    }

    @Override
    public String toString() {
        return "RefrigerationAppliances{" +
                "coolingTemperature=" + coolingTemperature +
                "} " + super.toString();
    }
}
