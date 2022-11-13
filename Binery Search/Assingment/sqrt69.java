package Assingment;

public class sqrt69 {
    public static void main(String[] args) {
        
    }
    public int mySqrt(int x) {
        int start = 1;
       int end = x;
       while(start <= end){
           int mid = start + (end - start)/2;
           if(mid * mid == x){
               return mid;
           }
           else if(mid * mid > x){
               end = mid - 1;
           }
           else{
               start = mid + 1;
           }
       }
       return end;
}
}