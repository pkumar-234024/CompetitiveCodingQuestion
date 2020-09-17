import java.util.Stack;

class LargestArea{
    public int largestArea(int[] arr){
        int max = 0;
        if(arr == null){
            return -1;
        }
        if(arr.length == 1){
            return arr[0];
        }
        int i=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        for(i=1;i<arr.length;i++){
            if(arr[i]>= arr[stack.peek()]){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && arr[i]<= arr[stack.peek()]){
                    int temp = arr[stack.pop()];
                    if(stack.isEmpty()){
                        max = Math.max(max, temp*i);
                    }else{
                        max = Math.max(max, temp*(i-stack.peek()-1));
                    }
                }
                stack.push(i);
            }   
        }
        if(!stack.isEmpty()){
            i = arr.length;
            while(!stack.isEmpty()){
                int temp = arr[stack.pop()];
                if(stack.isEmpty()){
                    max = Math.max(max, temp*i);
                }else{
                    max = Math.max(max, temp*(i-stack.peek()-1));
                }
            }

        }


        return max;

    }
}


class LargestAreaHistogram{
    public static void main(String[] args) {
        int[] arr = {2, 1,5 ,6, 2, 3};
        LargestArea la = new LargestArea();
        System.out.println(la.largestArea(arr));
    }
}