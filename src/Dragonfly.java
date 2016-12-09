/**
 * Created by vig on 10/28/16.
 */
public class Dragonfly extends Insect  {
    @Override
    public void fly() {
        System.out.println("Dragonfly fly");
    }

    @Override
    public void bite(Object object) {
        System.out.println("Dragonfly Can bite");
        if (object instanceof Fly) {
            Fly f = (Fly) object;
            f.setCanFly(false);
        }
    }
    }
