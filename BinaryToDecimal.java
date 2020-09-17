

class BinaryToDecimal{
    public static void main(String[] args) {
        int bin = 101;
        int decimal = 0, i=0;
        // System.out.println(Integer.parseInt(s, 2));
        while(true){
            if(bin == 0){
                break;
            }
            int temp = bin%10;
            decimal += temp*Math.pow(2, i);
            bin = bin/10;
            i++;
        }
        System.out.println(decimal);

    }
}