import java.util.Arrays;
import java.util.ArrayList;
public class number_Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        findPermutation(arr,0);
        boolean[] bool = new boolean[arr.length];
        Arrays.fill(bool,false);
        ArrayList<Integer> list = new ArrayList<>();
        pickPermute(arr,list,bool);
    }

//    by using swap & backtracking
    static void findPermutation(int[] arr, int index ){
        if(index == arr.length){
            System.out.println(Arrays.toString(arr));
        }
        for(int i=index; i<arr.length; i++){
            swap(arr, index,i);
            findPermutation(arr, index+1);
            swap(arr,index,i);
        }
    }
    static void swap(int[] arr, int index, int i){
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }


//    by using pick & backtracking
    static void pickPermute(int[] arr, ArrayList<Integer> list,boolean[] used){
        if(arr.length == list.size()){
            System.out.println(list);
        }
        for(int i=0; i<arr.length; i++){
            if(!used[i]){
                list.add(arr[i]);
                used[i] = true;
                pickPermute(arr,list,used);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }

    }
}
