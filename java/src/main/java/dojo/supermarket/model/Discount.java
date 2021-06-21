package dojo.supermarket.model;

public class Discount {
    private final String description;
    private final double discountAmount;
    private final Product product;

    public Discount(Product product, String description, double discountAmount) {
        this.product = product;
        this.description = description;
        this.discountAmount = discountAmount;
    }

    public String getDescription() {
        return this.description;
    }

    public double getDiscountAmount() {
        return this.discountAmount;
    }

    public Product getProduct() {
        return this.product;
    }

}
