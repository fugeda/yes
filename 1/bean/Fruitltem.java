package bean;

public class Fruitltem {
    private String number;
    private String name;
    private String price;
    private String unit;

    public Fruitltem(String number, String name, String price, String unit) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public Fruitltem() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
