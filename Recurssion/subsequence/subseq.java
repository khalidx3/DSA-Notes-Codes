public class subseq{
    public static void main(String[] args) {
        subse(" ", "abc");
    }
static void subse(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }

    char ch= up.charAt(0);
    subse(p+ch, up.substring(1));
    subse(p, up.substring(1));
    

}
}