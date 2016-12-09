/**
 * Created by vig on 10/28/16.
 */
public abstract class Insect implements Flying {
    public abstract void bite(Object object);

    private int numberOfLegs;
    private boolean canFly;

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
