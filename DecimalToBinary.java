

public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;
        int bin = 0;
        while(num>0){
            int temp = num%2;
        System.out.println(temp);

            bin += temp+(bin*10);
            num = num/2;
        }
        System.out.println(bin);
    }
    
}
