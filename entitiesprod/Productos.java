package entitiesprod;

public class Productos {
    String name;
    String price;
    public Productos() {

    }
    public Productos(String name) {
        this.name=name;
    }
    public Productos(String name, String price) {
        this.name=name;
        this.price=price;
    }

    public void laugh() {
        System.out.println( name +" Prod");
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
    
}
