public class subsequence{
    public static void sub(String str, int idx, String newString) {
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        //to be
        char currchar = str.charAt(idx);
        sub(str, idx+1, newString+currchar);
        //not to be
        sub(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        sub(str, 0, "");
    }
}