import java.util.ArrayList;
public class subarrayRecursion {
    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> list = new ArrayList<>();
        solve(s,0,"",list);
        System.out.println(list);
    }
//    static void solve(String s, int index, String sub){
//        if(index == s.length()){
//            System.out.println(sub);
//            return;
//        }
//        solve(s,index+1,sub+s.charAt(index));
//        solve(s,index+1,sub);
//    }
    static void solve(String s, int index, String sub,ArrayList<String> list){
        if(index == s.length()){
            list.add(sub);
//            System.out.println(sub);
            return;
        }
        solve(s,index+1,sub+s.charAt(index),list);
        solve(s,index+1,sub,list);
    }

}
