import java.util.ArrayList;
import java.util.Collections;

public class HorseBarn {
    public static void main(String[] args) {
        ArrayList<Horse> horses = new ArrayList<>();
        horses.add(new Horse("Trigger", 1340));
        horses.add(new Horse("Silver",1210));
        horses.add(new Horse("Lady",1575));
        horses.add(new Horse("Patches",1350));
        horses.add(new Horse("Duke",1410));
        horses.add(new Horse("Major",1495));
        horses.add(new Horse("Misty",1425));
        horses.add(new Horse("Buddy",1340));
        horses.add(new Horse("Autumn",1460));
        horses.add(new Horse("Spirit",1295));

        shuffle(horses);

        // if a horse will not have a pair, add a fake horse to the end called "nobody"
        if(horses.size() % 2 != 0) {
            horses.add(new Horse("nobody", 0));
        }

        // print the pairs
        for(int i = 0; i < horses.size(); i++) {
            if(i % 2 == 0) {
                System.out.print(horses.get(i) + " and ");
            } else {
                System.out.println(horses.get(i));
            }
        }
    }

    private static void shuffle(ArrayList<Horse> in) {
        // shuffle using something like the Fisher-Yates algorithm
        // essentially just move a random Horse to the back until all Horse have been moved
        // The range [0, i] represents the indices of the Horses that haven't been moved yet
        for(int i = in.size() - 1; i >= 0; i--) {
            in.add(in.remove((int)Math.floor(Math.random() * (i + 1))));
        }
    }
}
