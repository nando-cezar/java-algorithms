package queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        Queues<Integer> queues = new Queues<>();

        queues.addInQueues(1);
        queues.addInQueues(2);
        queues.addInQueues(3);

        System.out.println(queues.isEmpty());
        System.out.println(queues.getSize());
        System.out.println(queues.toString());
        System.out.println(queues.spy());

        queues.removeInQueues();

        System.out.println(queues.toString());

        ///////////////////////////////////////////

        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);

        System.out.println(fila);

        System.out.println(fila.peek());

        System.out.println(fila.remove());

        System.out.println(fila);

        QueuePriority<Integer> qp = new QueuePriority<>();

        qp.addInQueues(1);
        qp.addInQueues(2);
        qp.addInQueues(3);

        System.out.println(qp);
    }
}
