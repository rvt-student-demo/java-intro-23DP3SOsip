package lv.rvt;

public class Product {
    private double initialPrice;
    private String initialName;
    private int initialQuantity;
    private String initialLocation;
    private int initialWeight;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public Product(String name) {
        this.initialName = name;
        this.initialWeight = 1;
        this.initialLocation = "shelf";
    }

    public Product(String name, String location) {
        this.initialName = name;
        this.initialLocation = location;
        this.initialWeight = 1;
    }

    public Product(String name, int weight) {
        this.initialName = name;
        this.initialWeight = weight;
        this.initialLocation = "shelf";
    }

    public void printProduct() {
        System.out.println(this.initialName + ", price: " + this.initialPrice +", "+ this.initialQuantity + " pcs");
    }

    public String toString() {
        return this.initialName + " ("+ this.initialWeight+ " kg) can be found from the " + this.initialLocation;
    }

}
