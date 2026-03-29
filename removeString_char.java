

public class removeString_char {
    public static void main(String[] args) {
        String str = "abbadffakr";
        System.out.println(deleteChar(str,"",0,str.length()-1));
        System.out.println(skip("fadhytjklda"));
        System.out.println(skipStr("hello white orange ok eat orange with red chili sausce orange"));
    }
    static String deleteChar(String str,String store,int start,int end){
        if(start == end) return store;
        char ch = str.charAt(start);
        if(ch == 'a') return deleteChar(str,store,start+1,end);
        return deleteChar(str,store+ch,start+1,end);

    }
    static String skip(String str ){
        if(str.isEmpty()) return "";
        char ch = str.charAt(0);
        if(ch == 'a') return skip(str.substring(1));
        return ch +  skip(str.substring(1));
    }
    // remove string starts with
    static String skipStr(String str){
        if(str.isEmpty()) return "";
        if(str.startsWith("orange")) return skipStr(str.substring(6));
        char ch = str.charAt(0);
        return ch + skipStr(str.substring(1));
    }

}
