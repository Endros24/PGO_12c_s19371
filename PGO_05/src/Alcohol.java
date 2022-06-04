public class Alcohol extends Liquid {

    private int percent;

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        if (percent > 0 || percent < 100){
            this.percent = percent;
        }else{
            throw new RuntimeException("The alcohol value should be from 0 to 100.");
        }
    }

    public Alcohol(String name, int baseReagent, int dissolubility, int percent) {
        super(name, baseReagent, dissolubility);
        this.percent = percent;
    }

    @Override
    public int getReagent() {
        return (int)(1 - (percent / 100.0)) * super.getReagent();
    }
}