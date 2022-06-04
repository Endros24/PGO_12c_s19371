public class Ore extends Mineral{

    private boolean metallic;

    public Ore(String name, int baseReagent, int power, boolean metallic) {
        super(name, baseReagent, power);
        this.metallic = metallic;
    }

    public boolean isMetallic() {
        return metallic;
    }

    public void setMetallic(boolean metallic) {
        this.metallic = metallic;
    }

    @Override
    public int getReagent() {
        int result = super.getReagent();

        if(!metallic) {
            return result / 2;
        } else {
            return result;
        }
    }
}
