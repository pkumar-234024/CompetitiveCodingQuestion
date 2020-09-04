import java.util.Stack;

class MyQueue{
    Stack<Integer> stackNewest,stackOldest;
    public MyQueue(){
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }
    public void add(int value){
        stackNewest.push(value);
    }

    public void shiftStack(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public int peek(){
        shiftStack();
        return stackOldest.peek();
    }

    public int remove(){
        shiftStack();
        return stackOldest.pop();
    }

}


class QueueViaStack{
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.add(1);
        mq.add(2);
        mq.add(2);
        mq.add(2);
        System.out.println(mq.peek());
        mq.remove();
        System.out.println(mq.peek());
        mq.add(5);
        System.out.println(mq.peek());



    }
}