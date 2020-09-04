import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class ChangePostfix{
    Queue<Integer> queue;
    Stack<Integer> stack;
    public ChangePostfix(){
        queue = new LinkedList<>();
        stack = new Stack<>();
    }


    private String reverse(String s){
        String sReverse = "";
        for(int i=s.length()-1;i>=0;i--){
            sReverse = sReverse + s.charAt(i);
        }
        return sReverse;

    }

    private int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private String infixToPostfix(String s){
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result += c;
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result = result + stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() != '('){
                    return "";
                }
                else{
                    stack.pop();
                }
            }
            else{
                while(!stack.isEmpty() && precedence(c)<= precedence(stack.peek())){
                    if(stack.peek() == '(')
                        return "";
                    result = result + stack.pop();
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            
            if(stack.peek()=='('){
                return "";
            }
            result += stack.pop();

        }
        return result;
    }
    public String infixToPrefix(String s){
        String sReverse = reverse(s);
        String postfixString = infixToPostfix(sReverse);
        sReverse = reverse(postfixString);

        return sReverse;
    }

}

public class InfixToPrefix {
    public static void main(String[] args) {
        String S = "a-b";
        ChangePostfix ctf = new ChangePostfix();
        System.out.println(ctf.infixToPrefix(S));
        
    }
    
}