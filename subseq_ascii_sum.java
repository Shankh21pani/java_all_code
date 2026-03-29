import java.util.ArrayList;
public class subseq_ascii_sum {
    public static void main(String[] args) {
        String str = "ABC";
        ArrayList<String> list = new ArrayList<>();
        findSum(str,0,list,0);
        System.out.println(list);
    }
    static void findSum(String str,int sum,ArrayList<String> list,int index){
        if(index == str.length()){
            list.add(sum+"");
            return;
        }

        findSum(str,sum+(str.charAt(index)+0),list,index+1);
        findSum(str,sum,list,index+1);
    }
}
