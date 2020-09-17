public class ReverseString {
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        String[] string = s.split("\\.");
        for(int i=string.length-1;i>=0;i--){
            if(i==0){
                System.out.print(string[i]);
            }
            else{
                System.out.print(string[i]+".");
            }
        }
    }
    
}