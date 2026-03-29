import java.util.ArrayList;
import java.util.Arrays;
public class string_permutation {
    public static void main(String[] args) {
        String s = "ABC";
        boolean[] arr = new boolean[s.length()];
        Arrays.fill(arr,false);
        ArrayList<String> list = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        backtrack(s,arr,path,list);
        System.out.println(list);


    }
    static void backtrack(String s,boolean[] used,StringBuilder path ,ArrayList<String> result){
        if(path.length() == s.length()){
            result.add(path.toString());
            return;
        }
        for(int i=0; i<s.length();i++){
            if(used[i]) continue;
            used[i] = true;
            path.append(s.charAt(i));

            backtrack(s,used,path,result);

            path.deleteCharAt(path.length()-1);
            used[i] = false;
        }
    }
}
