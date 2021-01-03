package queues;

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
    }
}
