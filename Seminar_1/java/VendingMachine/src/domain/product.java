package domain;

public class product{
    private String name;
    private int place;
    private int price;
    private String type;
    public product(String name, int place, int price, String type) {
        this.name = name;
        this.place = place;
        this.price = price;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPlace() {
        return place;
    }
    public void setPlace(int place) {
        this.place = place;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString () {
        return "product" + " name = " + this.name + "; place = " + this.place + "; price = " + this.price + "; type = " + this.type;
    }

}