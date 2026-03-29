import java.util.Arrays;
import java.util.HashSet;

public class permutation_string_duplicate {
    public static void main(String[] args) {
        char[] arr = {'a','b','b'};
        backtrack(arr,0);

    }
    static void backtrack(char[] arr , int index){
        if(index == arr.length){
            System.out.println(Arrays.toString(arr));

        }
        HashSet<Character> set = new HashSet<>();
        for(int i=index; i<arr.length; i++){
            if(set.contains(arr[i])) continue;
            set.add(arr[i]);
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
