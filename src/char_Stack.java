public class char_Stack {

    private int capacity;
    private int top;
    private char[] stk = new char[10];

    public char_Stack(int capacity){
        this.capacity = capacity;
        top = 0;
        stk = new char[capacity];
    }

    public void push (char a){
        if(isFull()){
            //에러
        }
        stk[top++] = a;
    }

    public char pop (char a){
        if(isEmpty()){
            //에러
        }
        return stk[top--];

    }

    public char peek(){
        return stk[top-1];
    }

    public boolean isFull(){
        return top>=capacity;
    }

    public boolean isEmpty(){
        return top<=0;
    }

    public void clear(){
        top=0;
    }

    public int indexOf(char key){
        for(int i : stk){
            if(stk[i]==key){
                return i;
            }
        }
        return -1;
    }
    public int size(){
        return capacity;
    }

    public void dump(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i : stk){
                System.out.println("["+stk[i]+"]");
            }
        }
    }

}
