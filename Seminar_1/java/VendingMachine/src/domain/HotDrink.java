package domain;

public class HotDrink extends product {
    private int temperature;

    public HotDrink(String name, int place, int price, String type, int temperature) {
        super(name, place, price, type);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString () {
        return super.toString() + "; temperature = " + this.temperature;
    }

}
