import java.util.ArrayList;
public class question {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(arr,0,temp,list);
        System.out.println(list);
    }
    static void solve(int[] arr , int index ,ArrayList<Integer> subset ,ArrayList<ArrayList<Integer>> list){
        if(index == arr.length){
            list.add(new ArrayList<>(subset));
            return;
        }
        subset.add(arr[index]);
        solve(arr,index+1,subset,list);
        subset.remove(subset.size()-1);
        solve(arr,index+1,subset,list);

    }
}
