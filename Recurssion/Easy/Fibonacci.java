public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int fib(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fib(n-1)+(n-2);
    }
}
