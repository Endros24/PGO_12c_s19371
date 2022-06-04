import java.util.List;

public class Main {
    public static void main(String[] args) {
        Eliksir eliksir1 = new Eliksir("Zabojca");
        eliksir1.addIngredient(new Water("h20", 10, 2, true));
        Crystal crystal = new Crystal("diamond", 14, 10, 3);
        eliksir1.addIngredient(crystal);


        eliksir1.Create();

        eliksir1.getInfo();

        eliksir1.addIngredient(new Plant("roza", 20, 3));

        eliksir1.setCreated(false);

        eliksir1.addIngredient(new Plant("roza", 20, 3));
        eliksir1.removeIngredient(crystal);

        eliksir1.Create();

        eliksir1.getInfo();



    }
}
