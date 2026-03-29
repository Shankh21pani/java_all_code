import java.util.ArrayList;


//Apporach to  do without recursion :-
public class pascalTriangle {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
        int num = 3;
        for(int i=0; i<=num; i++){
            ArrayList<Integer> list = new ArrayList<>();
            if(i!=0) list.add(1);
            for(int j=1; j<i; j++){
                list.add(list2d.get(i-1).get(j-1) + list2d.get(i-1).get(j));

            }
            list.add(1);
            list2d.add(list);
        }
        System.out.println(list2d);
    }
}

//Let's Do with Recursion :-

