import java.io.*;
public class ValidAnagram {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            BufferedReader bfr = new BufferedReader(file);
            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = Integer.parseInt(bfr.readLine().trim());
            while(T-- >0){
                String s = bfr.readLine();
                String t = bfr.readLine();
                int[] check = new int[26];
                boolean flag  = true;
                for(int i=0;i<s.length();i++){
                    check[s.charAt(i)-'a']++;
                }
                for(int i=0;i<t.length();i++){
                    check[t.charAt(i)-'a']--;
                    if(check[t.charAt(i)-'a'] <0){
                        flag = false;
                        break;
                    }
                }
                bw.write(flag+"\n");
            }
            bw.close();
            fw.close();
            bfr.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
