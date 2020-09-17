/*package whatever //do not write package name here */

import java.util.*;

class ParenthesisChecker {
    
    static void parenthesisCheck(String s){
        if(s == null){
            return ;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char C = s.charAt(i);
            if(C == '(' || C == '{' || C == '['){
                stack.push(C);
            }
            if(!stack.isEmpty()){
                if(C == ')' && stack.peek() == '('){
                    stack.pop();
                }
                if(C == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                if(C == ']' && stack.peek() == '['){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balenced");
        }else{
            System.out.println(" Not Balenced");
        }
    }
    
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		    String s = scan.next();
		    parenthesisCheck(s);
		}
	}
}