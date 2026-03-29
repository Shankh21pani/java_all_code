import java.util.Arrays;
public class permutation_String_arr {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','g','h'};
        backtrack(arr,0);

    }
    static void backtrack(char[] arr , int index){
        if(index == arr.length){
            System.out.println(Arrays.toString(arr));

        }
        for(int i=index; i<arr.length; i++){
            swap(arr,index, i);
            backtrack(arr,index+1);
            swap(arr,index, i);

        }
    }
    static void swap(char[] arr, int index , int i){
        char temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
