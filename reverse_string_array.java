import java.util.Arrays;
public class reverse_string_array {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','g','h','i','j'};
//        char[] ans = new char[arr.length];
        reverse(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(char[] arr, int end,int start){
        if(start >= end/2){
            return;
        }
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr,end-1,start+1);
    }
}
