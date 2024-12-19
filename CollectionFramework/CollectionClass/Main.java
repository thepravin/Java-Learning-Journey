import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(98);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 12));

        Collections.sort(list);

        

    }
}
