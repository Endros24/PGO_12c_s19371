public class Crystal extends Mineral{

    private int magicPower;

    public Crystal(String name, int baseReagent,int power, int magicPower) {
        super(name, baseReagent, power);
        this.magicPower = magicPower;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public int getReagent() {
        return super.getReagent() + magicPower;
    }
}
