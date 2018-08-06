package SolidConcepts.InterfaceSegregrationPrinciple;

public class Product {
    private int productId;
    private String productName;
    private double productprice;

    public Product(int productId, String productName, double productprice) {
        this.productId = productId;
        this.productName = productName;
        this.productprice = productprice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productprice=" + productprice +
                '}';
    }
}
