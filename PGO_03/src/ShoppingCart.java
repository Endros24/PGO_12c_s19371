import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {

    private int id;
    private double totalPrice;
    private int totalDeliveryTime;
    private List<Product> products = new ArrayList<>();

    public ShoppingCart() {
    }

    public ShoppingCart(int id, double totalPrice, int totalDeliveryTime, List<Product> products) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.totalDeliveryTime = totalDeliveryTime;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {

        double price = 0;
        for (Product p : products) {
            price += p.getPrice();
        }
        setTotalPrice(price);
        System.out.println("Total price: " + this.totalPrice);
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setTotalDeliveryTime(int totalDeliveryTime) {
        this.totalDeliveryTime = totalDeliveryTime;
    }

    public int getTotalDeliveryTime() {
        return totalDeliveryTime;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        System.out.println("Add new product to shoppingCart");
        products.add(product);
    }

    public void sell() {
        System.out.println("Sell in ShoppingCart");
        for (Product p : products) {
            p.sell();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products, totalDeliveryTime, totalPrice);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ShoppingCart other = (ShoppingCart) obj;
        return id == other.id && Objects.equals(products, other.products)
                && totalDeliveryTime == other.totalDeliveryTime
                && Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
    }

    @Override
    public String toString() {
        return "ShoppingCart [id=" + id + ", totalPrice=" + totalPrice + ", totalDeliveryTime=" + totalDeliveryTime
                + ", products=" + products + "]";
    }

}
