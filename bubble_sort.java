import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {8,2,9,10,2,3,4,7};
//        sortArray(arr,arr.length-1);
        sortArray2(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArray(int[] arr, int len){
        if(len == 0) return;

        for(int i=0; i<len; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        sortArray(arr,len-1);
    }

    // Without using any loop by taking two pointers ******* Very Important

    static void sortArray2(int[] arr, int index, int end){
        if(end == 0) return;
        if(index == end){
            sortArray2(arr,0,end-1);
            return;
        }
        if(arr[index] > arr[index+1]){
            int temp = arr[index];
            arr[index] = arr[index+1];
            arr[index+1] = temp;
        }
        sortArray2(arr,index+1,end);

    }



}
