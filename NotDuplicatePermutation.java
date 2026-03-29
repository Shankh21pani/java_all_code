import java.util.Arrays;
import java.util.ArrayList;
public class NotDuplicatePermutation {
    public static void main(String[] args) {
        int[] arr = {1,1,3};
        Arrays.sort(arr);
        boolean[] bool = new boolean[arr.length];
        Arrays.fill(bool,false);
        ArrayList<Integer> list = new ArrayList<>();
        pickPermute(arr,list,bool);

    }
    //    by using pick & backtracking
    static void pickPermute(int[] arr, ArrayList<Integer> list,boolean[] used){
        if(arr.length == list.size()){
            System.out.println(list);
        }
        for(int i=0; i<arr.length; i++){
            if(i>0 && arr[i] == arr[i-1] && !used[i-1]) continue;
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

