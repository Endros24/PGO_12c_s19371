public class Flower extends Plant{

    public Flower(String name, int baseReagent, int toxity) {
        super(name, baseReagent, toxity);
    }

    @Override
    public int getReagent() {
        return super.getReagent() * 2;
    }
}
