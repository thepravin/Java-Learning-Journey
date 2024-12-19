import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>(); 
        // set<Integer>set  = new LinkedHashSet<>();
        // set<Integer>set = new TreeSet<>();

        st.add(32);
        st.add(2);
        st.add(5);
        st.add(54);
        st.add(65);
        st.add(21);

        System.out.println("Set : "+st);

        System.out.println(st.contains(21));


    }
}
