import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentShoppingCart = null;
    private List<ShoppingCart> history = new ArrayList<>();

    public Person() {
    }

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) throws Exception {
        if (Objects.isNull(name) || Objects.isNull(surname) || Objects.isNull(moneyInCash)
                || Objects.isNull(moneyOnCard)) {
            throw new Exception("Empty value");
        }
        System.out.println("Create new Person: " + name + " " + surname);
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        this.moneyOnCard = moneyOnCard;
    }

    public ShoppingCart getCurrentShoppingCart() {
        return currentShoppingCart;
    }

    public void setCurrentShoppingCart(ShoppingCart currentShoppingCart) {
        this.currentShoppingCart = currentShoppingCart;
    }

    public List<ShoppingCart> getHistory() {
        return history;
    }

    public void setHistory(List<ShoppingCart> history) {
        this.history = history;
    }

    public void makeOrder() {
        System.out.println("Start order");
        setCurrentShoppingCart(new ShoppingCart());
    }

    public void buyByCard() {
        System.out.println("buyByCard");
        if (getMoneyOnCard() >= getCurrentShoppingCart().getTotalPrice()) {
            getCurrentShoppingCart().sell();
            addShoppingCartToHistory(getCurrentShoppingCart());
            setMoneyOnCard(getMoneyOnCard() - getCurrentShoppingCart().getTotalPrice());
            setCurrentShoppingCart(null);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    public void buyByCash() {
        System.out.println("buyByCash");
        if (getMoneyInCash() >= getCurrentShoppingCart().getTotalPrice()) {
            getCurrentShoppingCart().sell();
            addShoppingCartToHistory(getCurrentShoppingCart());
            setMoneyInCash(getMoneyInCash() - getCurrentShoppingCart().getTotalPrice());
            setCurrentShoppingCart(null);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    public void addShoppingCartToHistory(ShoppingCart shoppingCart) {
        if (Objects.nonNull(shoppingCart)) {
            this.history.add(shoppingCart);
        } else {
            System.out.println("Empty basket cannot be added");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentShoppingCart, history, moneyInCash, moneyOnCard, name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return Objects.equals(currentShoppingCart, other.currentShoppingCart) && Objects.equals(history, other.history)
                && Double.doubleToLongBits(moneyInCash) == Double.doubleToLongBits(other.moneyInCash)
                && Double.doubleToLongBits(moneyOnCard) == Double.doubleToLongBits(other.moneyOnCard)
                && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surname=" + surname + ", moneyInCash=" + moneyInCash + ", moneyOnCard="
                + moneyOnCard + ", currentShoppingCart=" + currentShoppingCart + ", history=" + history + "]";
    }

}
