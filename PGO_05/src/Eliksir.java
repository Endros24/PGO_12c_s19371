import java.util.ArrayList;
import java.util.List;

public class Eliksir {

    private String name;
    private boolean isCreated = false;
    private int power;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Eliksir(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCreated() {
        return isCreated;
    }

    public void setCreated(boolean created) {
        isCreated = created;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        if(isCreated) {
            System.out.println("Eliksir juz zostal utworzony, nie mozna dodac skladnika..");
        } else {
            ingredients.add(ingredient);
        }
    }
    public void removeIngredient(Ingredient ingredient) {
        if(isCreated) {
            System.out.println("Eliksir juz zostal utworzony, nie mozna usunac skladnika..");
        } else {
            ingredients.remove(ingredient);
        }
    }

    public void Create() {
        System.out.println("Tworzenie eliksiru...");
        for(Ingredient ingredient : ingredients) {
            power += ingredient.getReagent();
        }
        isCreated = true;
        System.out.println("Eliksir został utowrzony, moc eliksiru..");
    }

    public void getInfo() {
        if(isCreated) {
            System.out.println("Moc eliksiru: " + power);
            System.out.println("Skladniki: ");
            for(Ingredient ingredient : ingredients) {
                System.out.println(ingredient.getName());
            }
        } else {
            System.out.println("Eliksir nie został jeszcze stworzony...");
        }
    }
}
