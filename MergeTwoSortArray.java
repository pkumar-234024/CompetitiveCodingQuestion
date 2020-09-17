import java.util.Arrays;
import java.lang.System;
class MergeTwoSortArray{

    static void mergeTwoSort(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        for(int i=n-1;i>=0;i--){
            int j, last = arr1[m-1];
            for(j=m-2;j>=0;j--){
                arr1[j+1] = arr1[j];
            }
            if(j!=m-2 || last> arr2[i]){
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }




    public static void main(String[] args) {
        int[] arr1 = {1,3,7, 9, 11};
        int[] arr2 = {2,4,6,8,10,12,14};
        mergeTwoSort(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        
    }
}