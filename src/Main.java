/**
 * Created by vig on 10/28/16.
 */
public class Main {
    public static void main(String[] args) {
        Insect[] someInsects = {
                new Fly(),
                new Dragonfly(),
                new Butterfly(),
                new Worm()
        };

        for (Insect i : someInsects) {
            if (i.canFly()){
                i.fly();
                i.bite("");
            }
        }
        Plane a = new Plane();
        System.out.println(a instanceof NotAlive); //проверка наличия интерфейса
        System.out.println(NotAlive.class.isAssignableFrom(a.getClass())); //правильная проверка интерфейса
    }
}
