public abstract class Ingredient {

    protected String name;
    protected int baseReagent;

    Ingredient(String name, int baseReagent) {
        this.name = name;
        this.baseReagent = baseReagent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseReagent() {
        return baseReagent;
    }

    public void setBaseReagent(int baseReagent) {
        this.baseReagent = baseReagent;
    }

    public abstract int getReagent();
}