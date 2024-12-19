import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Creating Queue using the PriorityQueue class (min heap)
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.offer(5);
        numbers.offer(1);
        numbers.offer(2);
        System.out.println("Queue: " + numbers);
        System.out.print(numbers.poll() + " ");
        System.out.print(numbers.poll() + " ");
        System.out.print(numbers.poll() + " ");

        System.out.println();

        // Max-heap
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.offer(5);
        maxHeap.offer(1);
        maxHeap.offer(2);
        System.out.println("Queue: " + maxHeap);
        System.out.print(maxHeap.poll() + " ");
        System.out.print(maxHeap.poll() + " ");
        System.out.print(maxHeap.poll());

    }
}
