// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

public class number_permute {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permute(arr,0);
    }
    static void permute(int[] arr, int index){
        if(index == arr.length){
            System.out.println(Arrays.toString(arr));
        }
        for(int i = index; i<arr.length;i++){
            swap(arr,index,i);
            permute(arr,index+1);
            swap(arr,index,i);
        }
    }
    static void swap(int[]arr , int index , int i){
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}