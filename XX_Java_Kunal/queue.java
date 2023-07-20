package XX_Java_Kunal;
import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(12);
        q.offer(2);
        q.offer(3);

        System.out.println(q.peek());
        System.out.println(q.poll());

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Works as a max heap, without comparator it is a min heap
        pq.offer(12);
        pq.offer(2);
        pq.offer(3);

        System.out.println(pq.peek());
    }
}
