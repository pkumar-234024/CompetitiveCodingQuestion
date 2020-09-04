
class TwoStackArray{
    int size;
    int arr[];
    int top1;
    int top2;
    public TwoStackArray(int n){
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }
    public void push1(int value){
        if(top1 < top2-1){
            top1++;
            arr[top1] = value;
        }
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    public void push2(int value){
        if(top1 < top2-1){
            top2--;
            arr[top2] = value;
        }
        else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    
    public int pop1(){
        if(top1>=0){
            int temp = arr[top1];
            top1--;
            return temp;
        }
        else{
            System.out.println("STack UnderFlow");
            System.exit(0);
        }
        return 0;
    }
    public int pop2(){
        if(top2<size){
            int temp = arr[top2];
            top2++;
            return temp;
        }
        else{
            System.out.println("STack UnderFlow");
            System.exit(0);
        }
        return 0;
    }

}

public class TwoStackViaArray {
    public static void main(String[] args) {
        TwoStackArray tsa = new TwoStackArray(5);
        tsa.push1(5);
        tsa.push2(10);
        tsa.push2(15);
        tsa.push1(11);
        tsa.push2(7);
        System.out.println(tsa.pop1());
        tsa.push2(40);
        System.out.println(tsa.pop2());        
    }
    
}