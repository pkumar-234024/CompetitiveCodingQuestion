
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    static boolean checkParanthesis(String s){
        if(s == null){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char C = s.charAt(i);
            if(C == '(' || C == '{' || C == '['){
                stack.push(C);
            }
            else if(stack.isEmpty()){
                return false;
            }
            char check;
            switch(C){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '['){
                        return false;
                    }
                break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '['){
                        return false;
                    }
                break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{'){
                        return false;
                    }
                break;
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            Scanner scan = new Scanner(file);

            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = scan.nextInt();
            while(T-- >0){
                String s = scan.next();
                               
                String ans = Boolean.toString(checkParanthesis(s));
                bw.write(ans+"\n");
            }
            bw.close();
            fw.close();
            scan.close();
            file.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
