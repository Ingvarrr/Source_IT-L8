/**
 * Created by vig on 10/28/16.
 */
public class Plane implements NotAlive, Flying{
    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }

    @Override
    public boolean canFly() {
        return false;
    }
}
