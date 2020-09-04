import java.util.Stack;

class NearestSmallerRight{
    public void nearestSmaller(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            while(!stack.isEmpty() && stack.peek()>arr[i]){
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

public class NearestSmallerToRight {
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,2,9};
        NearestSmallerRight nsr = new NearestSmallerRight();
        nsr.nearestSmaller(arr);
    }
    
}