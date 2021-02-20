import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JumpsOnCloud {

    static int jumpsCloud(int[] c){
        int count=-1;
        int n = c.length;
        for(int i=0;i<n;i++){
            if(i<n-2 && c[i+2] == 0){
                i++;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            Scanner scan = new Scanner(file);

            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = scan.nextInt();
            while(T-- >0){
                int n = scan.nextInt();
                int check = scan.nextInt();
                int[] c = new int[n];
                for(int i=0;i<n;i++){
                    c[i] = scan.nextInt();
                }
                int ans = jumpsCloud(c);
                
                bw.write((ans == check)+"  "+ans+"\n");
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
