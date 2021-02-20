
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class DistinctPairSum {

    static int distinctPairSum(int l, int r){
        if(l == r){
            return 1;
        }
        int ans = (r-l+1)*2-1;
        return ans;
    }
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            // BufferedReader bfr = new BufferedReader(file);
            Scanner scan = new Scanner(file);
            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = scan.nextInt();
            while(T-- >0){
                int l = scan.nextInt();
                int r = scan.nextInt();
                int ans = distinctPairSum(l,r);                            
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
