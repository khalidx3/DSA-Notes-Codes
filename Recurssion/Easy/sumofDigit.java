public class sumofDigit {
    public static void main(String[] args) {
        System.out.println(fact(1342));
    }

    static int fact(int n){
        if(n%10==n){
            return n;
        }
        return fact(n/10) + (n%10);
    }
}

