import java.util.Stack;

class NearestGreatest
{
    public void nearestGreaterRight(int[] arr){
        int l = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<l;i++){

            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            while(!stack.isEmpty() && stack.peek()< arr[i]){
                System.out.println(stack.peek()+" --> "+arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.peek()+" --> "+ -1);
            stack.pop();
        }
    }
}

public class NearestGreaterRight {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        NearestGreatest s = new NearestGreatest();
        s.nearestGreaterRight(arr);
    }
}