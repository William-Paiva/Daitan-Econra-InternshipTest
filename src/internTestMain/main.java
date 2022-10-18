package internTestMain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {

    static Set<List<Integer>> possibleWays;

    public static void main(String[] args) {
        possibleWays = new HashSet<>();

        makeChange(12);
        System.out.println(possibleWays);
    }

    public static void backTrack(int n, List<Integer> partial){
        if(n == 0) {
            possibleWays.add(new ArrayList<>(partial));
        }
        else {
            if (n >= 25) {
                int tmp = partial.get(0);
                partial.set(0, tmp + 1);
                backTrack(n - 25, partial);
                partial.set(0, tmp);
            }
            if (n >= 10) {
                int tmp = partial.get(1);
                partial.set(1, tmp + 1);
                backTrack(n - 10, partial);
                partial.set(1, tmp);
            }
            if (n >= 5) {
                int tmp = partial.get(2);
                partial.set(2, tmp + 1);
                backTrack(n - 5, partial);
                partial.set(2, tmp);
            }
            if (n >= 1) {
                int tmp = partial.get(3);
                partial.set(3, tmp + 1);
                backTrack(n - 1, partial);
                partial.set(3, tmp);
            }
        }
    }

    public static void makeChange(int n){
        List<Integer> result = new ArrayList<>();
        result.add(0,0);
        result.add(1,0);
        result.add(2,0);
        result.add(3,0);

        backTrack(n, result);
    }
}


