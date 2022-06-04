public class Mineral extends Ingredient{

    protected int power;

    public Mineral(String name, int baseReagent, int power) {
        super(name, baseReagent);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int getReagent() {
        return baseReagent + power;
    }
}
