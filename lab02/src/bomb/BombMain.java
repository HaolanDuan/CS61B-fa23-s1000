package bomb;

import common.IntList;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BombMain {
    public static void main(String[] args) {
        int phase = 2;
        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct inputs (passwords) to each phase using debugging techniques
        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {
            b.phase1(IntList.of(0,9,3,0,8)); // Figure this out too
        }
        if (phase >= 2) {
            //b.phase2("Figure this out. I wonder where the phases are defined...");
            Random r = new Random(1337);
            Set<Integer> numbers = new HashSet<>();
            while (numbers.size() < 100000) {
                numbers.add(r.nextInt());
            }

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 1338; i++) {
                str.append(numbers.toArray()[i]).append(" ");
            }
            b.phase2(str.toString());
        }
    }
}
