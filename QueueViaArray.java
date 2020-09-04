

class QueueArray{
    int arr[];
    int size;
    public QueueArray(int n){
        arr = new int[n];
        size = -1;
    }

    public void add(int value){
        size++;
        arr[size] = value;
    }
    public int remove(){
        int temp = arr[0];
        for(int k=0;k<size-1-1;k++){
            arr[k]= arr[k+1];
        }
        return temp;
    }

}

public class QueueViaArray {
    public static void main(String[] args) {
        
    }
}