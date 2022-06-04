public class Water extends Liquid{

    private boolean distilated;

    public Water(String name, int baseReagent, int dissolubility, boolean distilated) {
        super(name, baseReagent, dissolubility);
        this.distilated = distilated;
    }

    public boolean isDistilated() {
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }

    @Override
    public int getReagent() {
        int result = super.getReagent();
        if(!distilated) {
            return result / 2;
        } else {
            return result;
        }
    }
}
