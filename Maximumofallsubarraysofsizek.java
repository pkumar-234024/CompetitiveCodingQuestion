/*package whatever //do not write package name here */

import java.util.*;
class MaximumSubarray{
    public void subarry(int[] arr, int k){
        int n = arr.length;
        Deque<Integer> dq = new LinkedList<>();
        int i=0;
        for(;i<k;i++){
           
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.removeLast();
            }
          
            dq.addLast(i);
        }

        for(;i<n;i++){
            System.out.print(arr[dq.peekFirst()]);
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            
            while(!dq.isEmpty() && arr[dq.peekLast()] < arr[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peekFirst()]);

    }
}

class Maximumofallsubarraysofsizek {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
        while(t-- > 0){
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scan.nextInt();
            MaximumSubarray ms = new MaximumSubarray();
            ms.subarry(arr, k);
        }
	}
}
}