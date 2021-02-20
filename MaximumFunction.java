import java.io.*;
import java.util.Arrays;

public class MaximumFunction {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            BufferedReader bfr = new BufferedReader(file);
            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int t = Integer.parseInt(bfr.readLine().trim());
            while(t-- >0){
                int n = Integer.parseInt(bfr.readLine().trim());
                String[] s = bfr.readLine().trim().split(" ");
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = Integer.parseInt(s[i]);
                }
                Arrays.sort(arr);
                int x = arr[0];
                int y = arr[1];
                int z = arr[n-1];

                int max = Math.abs(x-y)+Math.abs(y-z)+Math.abs(z-x);
                bw.write(max+"\n");
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
