public class Main {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue = new DynamicQueue(5);
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);
        queue.display();
        System.out.println(" ");
        queue.insert(6);
        queue.display();
    }
}