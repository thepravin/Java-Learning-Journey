import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Map<String,Integer> mp = new HashMap<>();
        Map<String,Integer> mp = new TreeMap<>(); // sort on key.


        mp.put("one", 1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put("four",4);
        // mp.put("five",5);

        mp.putIfAbsent("five", 6);

        // System.out.println(mp);

        /* Interating on map */

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            // System.out.print(e);
            System.out.print(e.getKey()+" : ");
            System.out.print(e.getValue());
            System.out.println();

        }

        for(String key : mp.keySet()){
            System.out.print(key+" ");
        }
        System.err.println();

        for(Integer value : mp.values()){
            System.out.print(value+" ");
        }




    }
}
