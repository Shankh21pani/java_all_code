import java.util.ArrayList;
public class searchReturnIndex{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3,71,89,0,5,6,2};
        searchMultipleocc(arr,0,2,list);
        System.out.println(list);
    }
    static void searchMultipleocc(int[] arr, int index, int target,ArrayList<Integer> list){
        if(arr.length == index){
            return;
        }
        if(arr[index ] == target) list.add(index);
        searchMultipleocc(arr,index+1,target,list);
    }
}
