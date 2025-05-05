import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hahSetPractice {
    public static void main(String[] args) {
        HashSet<String>h_set  = new HashSet<>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("HahsSet : "+h_set);

        // @ iterate through all elements
//        for (String s : h_set){
//            System.out.print(s+" ");
//        }

        // @ empty an hash set.
//        set.removeAll(set);
//        System.out.println(set.isEmpty());

        // @ clone
//        HashSet <String> new_h_set = new HashSet <String> ();
//        new_h_set = (HashSet)set.clone();
//        System.out.println(new_h_set);

        // @ convert to array
//        String new_Array[]=new String[set.size()];
//        set.toArray(new_Array);
//        for(String element : new_Array){
//            System.out.println(element);
//        }

        // @ convert a hash set to a tree set.
//        Set<String>tree_set  = new TreeSet<>(h_set) ;
//        System.out.println(tree_set); // sorted manner

        // @ compare two sets and retain elements that are the same.
        HashSet<String> h_set1 = new HashSet<String>();
        // use add() method to add values in the hash set
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");
        System.out.println("Frist HashSet content: "+h_set1);
        HashSet<String>h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        System.out.println("Second HashSet content: "+h_set2);
        h_set1.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set1);

    }
}