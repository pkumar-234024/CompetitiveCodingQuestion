import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.HashSet;
import java.util.Set;

public class ConsistenetString {

    public static int countConsistentStrings(String allowed, String[] words) {
        if(words == null){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for(String s : words){
            int i=0;
            for(i=0;i<s.length();i++){
                if(!set.contains(s.charAt(i))){
                    break;
                }
            }
            if(i==s.length()){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            System.out.println(System.getProperty("user.dir"));
            BufferedReader bfr = new BufferedReader(file);

            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = Integer.parseInt(bfr.readLine());
            while(T-- >0){
               String allowed = bfr.readLine();
               String[] words = bfr.readLine().split(" ");
                              
               int ans = countConsistentStrings(allowed, words);
               bw.write(ans+"\n");
            }
            bw.close();
            fw.close();
            bfr.close();
            file.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
