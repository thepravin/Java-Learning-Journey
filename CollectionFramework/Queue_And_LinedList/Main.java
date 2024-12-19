import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/* 
 * LinkedList: When you care about insertion order and may need features like double-ended queue operations.
 * ArrayDeque: When you need a fast, lightweight, and general-purpose queue for insertion/removal.
 * PriorityQueue: When you need priority-based ordering of elements (e.g., for task scheduling).
 */

public class Main {
    public static void main(String[] args) {
        // LinkedList implementation of Queue
        Queue<String> animal1 = new LinkedList<>();

        // Array implementation of Queue
        Queue<String> animal2 = new ArrayDeque<>();

        // Priority Queue implementation of Queue
        Queue<String> animal3 = new PriorityQueue<>();


        animal1.offer("dog");
        animal1.offer("cat");
        animal1.offer("tiger");
        animal1.offer("elephant");
        // System.out.println(animal1.add("lion"));  // true

        System.out.println("Queue : "+animal1);
        
        System.out.println(animal1.poll());
        System.out.println("Queue : "+animal1);
        
        


  


    }
}
