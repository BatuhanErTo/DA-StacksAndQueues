public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int pointer = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.print("Stack is full");
        }
        pointer++;
        data[pointer] = item;
        return  true;
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("You can not pop an element if stack is empty");
        }
        return data[pointer--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("You can not pop an element if stack is empty");
        }
        return data[pointer];
    }
    protected boolean isEmpty(){
        if(pointer==-1){
            return true;
        }
        return false;
    }
    protected boolean isFull() {
        if(pointer == data.length-1){
            return true;
        }
        return false;
    }
}
