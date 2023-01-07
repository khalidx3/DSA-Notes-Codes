public class stringskip {
    public static void main(String[] args) {
        System.out.println(skipApple("absdapplecd"));
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return " ";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
}
