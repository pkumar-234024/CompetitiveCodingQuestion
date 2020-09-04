import java.util.Stack;

class ToPostfix{
    public ToPostfix(){

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

    public String infixToPostfix(String s){
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

}


public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "a+b-c";
        ToPostfix tp = new ToPostfix();
        System.out.println(tp.infixToPostfix(s));
    }
    
}