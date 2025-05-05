import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<String>tree_set = new TreeSet<>();
        tree_set.add("Red") ;
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.print("Tree set: ");
        System.out.println(tree_set);

        // @ reverse order tree
//        Iterator it = tree_set.descendingIterator() ;
//        while (it.hasNext()){
//            System.out.print(it.next()+" ");
//        }

        // @ get the first and last elements in a tree set
//        System.out.println(tree_set.first());
//        System.out.println(tree_set.last());

        //@ get the element in a tree set which is greater than or equal to the given element.
        // creating TreeSet
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);

        System.out.println("Greater than or equal to 86 : "+tree_num.ceiling(86));
        System.out.println("Greater than or equal to 29 : "+tree_num.ceiling(29));

        // @remove first
//        System.out.println(tree_set.pollFirst()) ;
//        System.out.println(tree_set.pollLast());

        System.out.println(tree_num);
        System.out.println(tree_num.remove(36));
        System.out.println(tree_num);

    }
}
