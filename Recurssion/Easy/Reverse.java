public class Reverse {
    public static void main(String[] args) {
        System.out.println(palin(1234));
    }
    static int rev(int n ){
        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return (int) (rem * Math.pow (10,digits-1) + helper(n/10, digits-1));
    }
    static boolean palin(int n){
        return n == rev(n);

    }
}
