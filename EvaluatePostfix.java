import java.util.Stack;

class Evaluate{
    public int evaluate(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }
            else{
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch(c){
                    case '+':
                        stack.push(val2+val1);
                        break;
                    case '-':
                        stack.push(val2-val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                    case '/':
                        stack.push(val2/val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}

class EvaluatePostfix{
    public static void main(String[] args) {
        String S = "231*+9-";
        Evaluate ep = new Evaluate();
        System.out.println(ep.evaluate(S));
    }
}