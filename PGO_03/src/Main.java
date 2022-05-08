public class Main {
    public static void main(String[] args) throws Exception {
        // Tworzymy nowego klienta
        Person person = new Person("Jan", "Kowalski", 100, 300);

        // Tworzymy produkty
        Product product1 = new Product("Macbook", ProductType.Electronic, 10000, 10, null);
        Product product2 = new Product("Game", ProductType.Entertainment, 100, 100, null);
        Product product3 = new Product("Movie", ProductType.Electronic, 50, 10, null);

        // Test w ktorym kwota zamowienia > kwota na koncie
        person.makeOrder();
        person.getCurrentShoppingCart().addProduct(product1);
        person.buyByCash();

        person.makeOrder();
        person.getCurrentShoppingCart().addProduct(product1);
        person.buyByCard();

        // Test w ktorym kwota zamowienia < kwota na koncie
        person.makeOrder();
        person.getCurrentShoppingCart().addProduct(product3);
        person.buyByCash();

        // Sprawdzamy czy zakupy dodane do historii
        System.out.println(person.getHistory());

        // Sprawdzamy czy kwota w portfelu zostala pomniejszona o kwote zakupow
        System.out.println(person.getMoneyInCash());
    }
}
