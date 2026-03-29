import java.util.ArrayList;

public class subsetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>();
        findSubset(arr,0,list);
    }
    static void findSubset(int[] arr,int index,ArrayList<Integer> list){
        if(index == arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        findSubset(arr,index+1,list);
        list.remove(list.size()-1);
        findSubset(arr,index+1,list);
    }
}
