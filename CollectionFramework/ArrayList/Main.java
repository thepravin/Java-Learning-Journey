package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        // ArrayList<String> cars = new ArrayList<String>();
        // List<Integer> list = new ArrayList<>(3);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        System.out.println(cars.isEmpty());
        System.out.println(cars.set(2, "pravin"));
        System.out.println(cars.get(2));
        cars.add(4, "hi");
        System.out.println(cars.get(4));

        List<String> list2 = new ArrayList<>();
        list2.add("first");
        list2.add("second");
        list2.addAll(cars);
        System.out.println(list2);

        System.out.println(list2.remove(0));
        System.out.println(list2.remove(String.valueOf("BMW")));
        System.out.println(list2);

        /*
         * List traversing methods
         */

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        for (String string : list2) {
            System.out.print(string + " ");
        }
        System.out.println();

        Iterator<String> it = list2.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();


        /* 
         * ----------------------- Sort ----------------------
         */

         List<Integer>arr = new ArrayList<>();
         arr.add(12);
         arr.add(11);
         arr.add(18);
         arr.add(5);
         arr.add(8);

         Collections.sort(arr); // ascending order
         System.out.println(arr);

         Collections.sort(arr,Collections.reverseOrder()); // descending order

         System.out.println(arr.indexOf(11));
    }
}