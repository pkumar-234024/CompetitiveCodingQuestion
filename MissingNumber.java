
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class MissingNumber {
    static int missingNumber(int array[], int n) {
        // Your Code Here
        if(array.length == 0){
            return 0;
        }
        int xor_array = 0, xor_n = 0;

        // xor of all array elements
        for (int i = 0; i < n - 1; i++){
            xor_array = xor_array ^ array[i];
            System.out.print(xor_array+" ");
        }
        System.out.println();
        // xor of n natural numbers
        for (int i = 1; i <= n; i++){
            xor_n = xor_n ^ i;
            System.out.print(xor_n+" ");
        }
        System.out.println();

        return xor_n ^ xor_array;
        
    }
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            BufferedReader bfr = new BufferedReader(file);
            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = Integer.parseInt(bfr.readLine().trim());
            while(T-- >0){
               int n = Integer.parseInt(bfr.readLine().trim());
               String[] str = bfr.readLine().trim().split(" ");
               int[] array = new int[n-1];
               for(int i=0;i<n-1;i++){
                   array[i] = Integer.parseInt(str[i]);
               }
               int ans = missingNumber(array, n);
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
