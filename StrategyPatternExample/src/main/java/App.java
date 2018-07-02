import wow.Human;
import wow.Orc;
import wow.Race;
import wow.TaichiFight;
import wow.Tauren;

import java.util.Arrays;

public class App {
    public static void main(String... args) {
        Race human = new Human();
        Race orc = new Orc();
        Race tauren = new Tauren();

        System.out.println("Human traits: " + Arrays.toString(human.getTraits()));
        human.dance();
        human.fight();
        System.out.println();


        System.out.println("Orc traits: " + Arrays.toString(orc.getTraits()));
        orc.dance();
        orc.fight();
        System.out.println();

        System.out.println("Tauren traits: " + Arrays.toString(tauren.getTraits()));
        tauren.dance();
        tauren.fight();
        System.out.println();

        System.out.println("Change Human to use Tai Chi Fight");
        human.setFightBehavior(new TaichiFight());
        human.fight();

    }
}
