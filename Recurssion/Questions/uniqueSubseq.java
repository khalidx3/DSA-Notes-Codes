import java.util.HashSet;

public class uniqueSubseq {
    public static void sub(String str, int idx, String newString,HashSet<String>set) {
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        //to be
        char currchar = str.charAt(idx);
        sub(str, idx+1, newString+currchar,set);
        //not to be
        sub(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        sub(str, 0, "",set);
    }
}
