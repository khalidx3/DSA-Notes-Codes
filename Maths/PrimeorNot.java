public class PrimeorNot{
    public static void main(String[] args) {
        int n = 13;
        for (int i= 2; i<n; i++){
            if(n % i==0){
                System.out.println("Not Prime");
        }else{
        System.out.println("Prime");
        }
    }
}
}