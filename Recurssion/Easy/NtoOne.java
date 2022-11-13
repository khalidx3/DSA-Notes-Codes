public class NtoOne {
    public static void main(String[] args) {
       fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
       
    //   for Nto1
    //    System.out.println(n);
    //    fun(n-1);

        // for 1 to N
       fun(n-1);
       System.out.println(n);
        }


}
