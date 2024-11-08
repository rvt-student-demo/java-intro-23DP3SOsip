package lv.rvt;

public class Product {
    private double initialPrice;
    private String initialName;
    private int initialQuantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.initialName + ", price: " + this.initialPrice +", "+ this.initialQuantity + " pcs");
    }
}
