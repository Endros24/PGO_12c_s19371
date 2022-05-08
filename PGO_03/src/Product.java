import java.util.Objects;

public class Product {

    private String name;
    private ProductType productType;
    private double price;
    private int quantity;
    private Storage storage;

    public Product() {
    }

    public Product(String name, ProductType productType, double price, int quantity, Storage storage) throws Exception {
        if (Objects.isNull(name) || Objects.isNull(productType) || Objects.isNull(price) || Objects.isNull(quantity)) {
            throw new Exception("Empty value");
        }
        System.out.println("Create product: " + name);
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void sell() {
        System.out.println("Sell " + this.name);
        setQuantity(getQuantity() - 1);
    }

    public void increaseQuantity(int quantity) {
        System.out.println("Increase " + this.name + " + " + quantity);
        setQuantity(getQuantity() - quantity);
    }

    public int getDeliveryTime() {
        if (Objects.isNull(storage)) {
            return 0;
        } else {
            return storage.getDeliveryTime();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, productType, quantity, storage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return Objects.equals(name, other.name)
                && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
                && productType == other.productType && quantity == other.quantity
                && Objects.equals(storage, other.storage);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", productType=" + productType + ", price=" + price + ", quantity=" + quantity
                + ", storage=" + storage + "]";
    }

}
