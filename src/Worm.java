/**
 * Created by vig on 10/28/16.
 */
public class Worm extends Insect {
    @Override
    public void bite(Object object) {
        throw new RuntimeException();
    }

    @Override
    public void fly() {
        throw new RuntimeException();
        }

    @Override
    public boolean canFly() {
        return false;
    }
}
