import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,5,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int start, int end){
        if(start >= end ) return;
        int mid = start + (end-start) /2;
        sort(arr, start, mid);
        sort(arr,mid+1,end);

        merging(arr,start, end ,mid);
    }
    static void merging(int[] arr, int start, int end,int mid){
        int n = mid - start+1;
        int m = end - mid;
        int[] l = new int[n];
        int[] r = new int[m];
        for(int i=0; i<n; i++) l[i] = arr[i+start];
        for(int j = 0; j < m; j++) r[j] = arr[mid+1+j];
        int i =0; int j =0; int k= start;
        while(i<n && j<m){
            if(l[i] <= r[j]){
                arr[k] = l[i];
                i++;
            }
            else{
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while(i < n){
            arr[k] = l[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
