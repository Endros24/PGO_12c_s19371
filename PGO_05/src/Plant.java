public class Plant extends Ingredient{

    protected int toxity;

    public Plant(String name, int baseReagent, int toxity) {
        super(name, baseReagent);
        this.toxity = toxity;
    }

    public int getToxity() {
        return toxity;
    }

    public void setToxity(int toxity) {
        this.toxity = toxity;
    }

    @Override
    public int getReagent() {
        return baseReagent * toxity;
    }
}
