public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    protected int first = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.print("You can not insert a new element because of exceeding max size " + end);
            return false;
        }
        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("The remove operation can not be done in an empty array");
        }
        int elementToRemoved = data[first++];
        first %= data.length;
        size--;
        return elementToRemoved;
    }

    public int front()throws Exception{
        if (isEmpty()){
            throw new Exception("The front operation can not be done in an empty array");
        }
        return data[first];
    }

    public void display(){
        int i = first;
        do {
            System.out.print(data[i]+"<-");
            i++;
            i%=data.length;
        }while(i!=end);
        System.out.print(" END");
    }

    protected boolean isFull() {
        return size == data.length;
    }
    private boolean isEmpty() {
        return size == 0;
    }
}
