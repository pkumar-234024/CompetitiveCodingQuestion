import java.util.Stack;

/**
 * CelebrityProblem
 */

class Solution {
    public int findCelebrity(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            stack.push(i);
        }
        while(stack.size()>1){
            int i,j;
            i = stack.pop();
            j = stack.pop();
            if(arr[i][j] == 1){
                // if i knows j -> i is not acelebrity
                stack.push(j);
            }
            else{
                // if j knows i-> j is not celerity
                stack.push(i);
            }
        }
        int pot = stack.pop();
        for(int i=0;i<arr.length;i++){
            if(i != pot){
                if(arr[pot][i] == 1 || arr[i][pot] == 0){
                    return -1;
                }
            }
        }
        return pot;
    }
}
public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,1,0},
            {1,0,1,0},
            {0,0,0,0},
            {1,0,1,1}
        };
        Solution s = new Solution();
        System.out.println(s.findCelebrity(arr));
    }
}