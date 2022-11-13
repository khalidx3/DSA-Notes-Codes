import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println('a'+ "b");
        System.out.println((char)('a'+ 3));
        System.out.println("kunal"+ new ArrayList<>() );
        System.out.println("kunal"+ new Integer(56));

        String ans = new Integer(56) + " " + new ArrayList<>() ;
        System.out.println(ans);
    }
}
