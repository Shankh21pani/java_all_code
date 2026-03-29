import java.util.ArrayList;
public class subsequence_Of_String {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String str = "ABC";
        giveSeq(str,"",0,list);
        System.out.println(list);
    }
    static void giveSeq(String str,String seq,int index,ArrayList<String> list){
        if(index == str.length()){
            list.add(seq);
            return;
        }
        giveSeq(str,seq+str.charAt(index),index+1,list);
        giveSeq(str,seq,index+1,list);
    }

}
