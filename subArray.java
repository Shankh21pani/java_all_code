import java.util.ArrayList;
public class subArray {
    public static void main(String[] args) {
        int[] a = {2147483647,-2147483648,-1,0};
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int len = a.length;
        for(int i=0; i< Math.pow(2,len); i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<len; j++){
                int mask = 1<<j;
                if((i & mask) !=0){
                    temp.add(a[j]);
                }
            }
            if(temp.size() >= 1 )  arr.add(temp);
//            arr.add(temp);

        }
        System.out.println(arr);
    }
}
