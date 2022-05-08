import java.util.Objects;

public class Storage {

    private int deliveryTime;

    public Storage() {
    }

    public Storage(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryTime);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Storage other = (Storage) obj;
        return deliveryTime == other.deliveryTime;
    }

    @Override
    public String toString() {
        return "Storage [deliveryTime=" + deliveryTime + "]";
    }

}
