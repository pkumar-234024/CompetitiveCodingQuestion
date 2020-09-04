import java.util.Stack;

class NearestGreaterleft{
    public void nearestGreaterLeft(int[] arr){
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.println(arr[0]+" <-- "+ -1);
        for(int i=1;i<arr.length;i++){

            while (stack.empty() == false && stack.peek() < arr[i]) 
            stack.pop();


            if (stack.empty() == true)  
                System.out.print("-1, "); 
            else
                System.out.print(stack.peek() + ", "); 
  
            stack.push(arr[i]);
        }
    }
}
public class NearestGreaterToLeft {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 20, 40, 12, 30 };
        NearestGreaterleft ngl = new NearestGreaterleft();
        ngl.nearestGreaterLeft(arr);






        // System.out.println(arr[0]+" <-- "+ -1);
        // for(int i=1;i<arr.length;i++){
        //     int j;
        //     for(j=i-1;j>=0;j--){
        //         if(arr[i]<arr[j]){
        //             System.out.println(arr[j]+" <-- "+ arr[i]);
        //             break;
        //         }
        //     }
        //     if(j < 0){
        //         System.out.println(arr[i]+" <-- "+ -1);
        //     }
        // }
        
    }
    
}