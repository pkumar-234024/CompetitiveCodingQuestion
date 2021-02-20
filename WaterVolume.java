import java.io.*;
// import java.util.*;
public class WaterVolume {

    private static int waterVolume(int[] arr, int n){
        if(arr == null){
            return 0;
        }
        int f = 0;
        int l = n-1;
        int area = 0;
        while(f<l){
            area = Math.max(area, Math.min(arr[f],arr[l])*(l-f));
            if(arr[f]<arr[l]){
                f++;
            }else{
                l--;
            }
        }
        return area;
    }
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            BufferedReader bfr = new BufferedReader(file);
            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = Integer.parseInt(bfr.readLine().trim());
            while(T-- >0){
               String str[] = bfr.readLine().trim().split(",");
               int[] arr = new int[str.length];
               for(int i=0;i<str.length;i++){
                    arr[i] = Integer.parseInt(str[i]);
               }
               bw.write(waterVolume(arr, arr.length)+"\n");
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
