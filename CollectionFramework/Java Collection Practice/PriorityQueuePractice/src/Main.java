import java.util.ArrayList;
import java.util.Comparator;
import  java.util.PriorityQueue ;
import  java.util.List ;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Red") ;
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");

        System.out.println("Priority Queue : "+pq);

        // Inserts the specified element into this priority queue.
//        pq.offer("Blue");
//        System.out.println(pq);

//        System.out.println("The first element of the Queue: "+pq.peek());
//
//        System.out.println("Removes the first element: "+pq.poll());

//        List<String>array_list = new ArrayList<>(pq);
//        System.out.println(array_list);

        //Convert Priority Queue to a string representation
        String str1;
        str1 = pq.toString();
//        System.out.println("String representation of the Priority Queue: "+str1);

        // maximum priority queue
        PriorityQueue<Integer> st = new PriorityQueue<>(Comparator.reverseOrder()) ;
        st.add(1) ;
        st.add(3) ;
        System.out.println(st);

    }
}