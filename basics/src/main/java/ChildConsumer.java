
public class ChildConsumer {
    public static void main(String[] args) {
        //final Consumer<Long, String> consumer = BaseConsumer();
        final BaseConsumer consumerThread = new BaseConsumer("messages");
        System.out.println("DEMO WORKS");
        consumerThread.start();
    }
}