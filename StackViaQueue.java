import java.util.LinkedList;
import java.util.Queue;
class MyStack{

    Queue<Integer> queueNewest, queueOldest;
    
    public MyStack(){
        queueNewest = new LinkedList<>();
        queueOldest = new LinkedList<>();
    }
    private void shift(){
        if(queueNewest.isEmpty()){
            while(!queueOldest.isEmpty()){
                queueNewest.add(queueOldest.remove());
            }
        }
    }
    public void push(int value){
        queueOldest.add(value);

    }
    public int pop(){
        shift();
        while(queueNewest.size()>1){
            queueOldest.add(queueNewest.remove());
        }
        return queueNewest.remove();

    }
    public int peek(){
        shift();
        while(queueNewest.size()>1){
            queueOldest.add(queueNewest.remove());
        }
        int temp = queueNewest.poll();
        queueOldest.add(temp);
        return temp;
    }
}


public class StackViaQueue {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());
        ms.push(10);
        System.out.println(ms.peek());
        System.out.println(ms.pop());
        System.out.println(ms.peek());

    
    }
}