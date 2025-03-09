import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        //queue is a FIFO

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Lucky");
        queue.offer("Aspas");
        queue.offer("Messi");
        queue.offer("Goat");
        // We can use add or offer for queues

        queue.poll();
        // We can use remove or poll for queues

        System.out.println(queue.element());
        System.out.println(queue.size());
        System.out.println(queue.contains("Goat"));

        System.out.println(queue);

    }
}
