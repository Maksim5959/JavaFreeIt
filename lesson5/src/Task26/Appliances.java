package Task26;

public abstract class Appliances {
    private String firm;
    private String model;

    public Appliances (String firm, String model) {
        this.firm = firm;
        this.model = model;
    }

    public abstract void on ();

    public abstract void off ();

    public String getFirm() {
        return firm;
    }

    public String getModel() {
        return model;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
