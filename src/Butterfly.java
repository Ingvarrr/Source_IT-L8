/**
 * Created by vig on 10/28/16.
 */
public class Butterfly extends Insect {
    public void fly (){
        System.out.println("fly Butterfly");
    }

    @Override
    public void bite(Object object) {
        System.out.println("can`t bite");
    }
}
