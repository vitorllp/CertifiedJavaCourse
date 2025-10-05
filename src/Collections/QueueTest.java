package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        //FIFO FIRST IN FIRST OUT
        queue.add("Ana");
        queue.add("Carlos");
        queue.add("Beatriz");
        queue.add("Daniel");

        System.out.println("queue: " + queue);
        System.out.println("next (peek): " + queue.peek());

        String removed = queue.poll();
        System.out.println("removed with poll(): " + removed);
        System.out.println("queue after removing: " + queue);

        queue.offer("Eduardo");
        System.out.println("queue offer(): " + queue);
        System.out.println("First now: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println("\nqueue empty " + queue);
    }
}
