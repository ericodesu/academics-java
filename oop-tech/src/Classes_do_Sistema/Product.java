package Classes_do_Sistema;

public class Product {
    private int productID;
    private String productName;
    private String productDescription;
    private double productProductionPrice;
    private double productSellingPrice;
    private int productStock;
    
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    
    public double getProductSellingPrice() {
        return productSellingPrice;
    }

    public void setProductSellingPrice(double productSellingPrice) {
        this.productSellingPrice = productSellingPrice;
    }
    
    public double getProductProductionPrice() {
        return productProductionPrice;
    }

    public void setProductProductionPrice(double productProductionPrice) {
        this.productProductionPrice = productProductionPrice;
    }
    
    public double getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }    
    
}
