
class StackArraay{

    int top = -1, size;
    int arr[];
    public StackArraay(int n){
        arr = new int[n];
        size = n;
        
    }

    public void push(int value){
        if(top <= size-1){
            arr[++top] = value;
        }
        if(top > size-1){
            System.out.println("Stack oVerflow");
        }
    }

    public int pop(){
        if(top <= size-1){
            int temp = arr[top];
            top--;
            return temp;
        }
        if(top < 0){
            System.out.println("Stack UnderFlow");
        }
        return 0;
    }

    public int peek(){
        if(top <= size-1){
            int temp = arr[top];
            return temp;
        }
        if(top < 0){
            System.out.println("Stack UnderFlow");
        }
        return 0;
    }

    public int length(){
        return top+1;
    }

    


}

public class StackViaArray {
    public static void main(String[] args) {
        StackArraay sa = new StackArraay(10);
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);
        System.out.println(sa.length());
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        sa.push(10);
        System.out.println(sa.peek());
        System.out.println(sa.length());

    }
    
}