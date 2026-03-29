import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int hold = 0;
            for(int j=1; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    hold = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[hold];
            arr[hold] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
