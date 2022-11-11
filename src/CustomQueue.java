public class CustomQueue {
    protected int[] data;
    private int end = 0;
    private static final int DEFAULT_SIZE = 5;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.print("You can not insert a new element because of exceeding max size");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("The remove operation can not be done in an empty array");
        }
        int elementToRemoved = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return elementToRemoved;
    }

    public int front()throws Exception{
        if (isEmpty()){
            throw new Exception("The front operation can not be done in an empty array");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+"<-");
        }
        System.out.print("End");
    }

    private boolean isFull() {
        return end == data.length;
    }
    private boolean isEmpty() {
        return end == 0;
    }
}
