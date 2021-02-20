import java.io.*;
import java.util.HashMap;
public class StringCounting {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("E://jp//mycode//input.txt");
            BufferedReader bfr = new BufferedReader(file);
            FileWriter fw = new FileWriter("E://jp//mycode//output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int T = Integer.parseInt(bfr.readLine().trim());
            while(T-- >0){
                int n = Integer.parseInt(bfr.readLine().trim());
                String[] s = bfr.readLine().trim().split(" ");
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = Integer.parseInt(s[i]);
                }
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int val : arr){
                    if(map.containsKey(val)){
                        map.put(val, map.get(val)+1);
                    }else{
                        map.put(val, 1);
                    }
                }
                int count = 0;
                int ans = 0;
                for(int var : map.keySet()){
                    if(count == 0){
                        count++;
                        continue;
                    }else{
                        ans += map.get(var);
                    }
                }
                bw.write(map.toString()+"\n");
                bw.write(ans+"\n");
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
