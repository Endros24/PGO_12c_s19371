public class Liquid extends Ingredient{

    protected int dissolubility;

    public Liquid(String name, int baseReagent, int dissolubility) {
        super(name, baseReagent);
        this.dissolubility = dissolubility;
    }

    public int getDissolubility() {
        return dissolubility;
    }

    public void setDissolubility(int dissolubility) {
        if (dissolubility > 0 || dissolubility < 100){
            this.dissolubility = dissolubility;
        }else{
            throw new RuntimeException("The dissolubility value should be from 0 to 100.");
        }
    }

    @Override
    public int getReagent() {
        return baseReagent;
    }
}