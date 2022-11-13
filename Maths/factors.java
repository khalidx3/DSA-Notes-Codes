import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
      
        fact(20);
    }
    //o(n)
    // static void fact(int n){
    //     for (int i = 1; i <=n; i++) {
    //         if(n % i==0){
    //             System.out.println(i+" ");
    //         }
            
    //     }
    // }


        //O(sqrt(n))
    // static void fact(int n){
    //     for (int i = 1; i <= Math.sqrt(n); i++) {
    //         if(n % i==0){
    //             if(n/i==i){
    //                 System.out.print(i);
    //             }else{
    //             System.out.print(i+" "+n/i + " ");
    //             }
    //         }
            
    //     }


        // space and timecomp O(sqrt(n))
    static void fact(int n){
        ArrayList<Integer>list= new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }else{
                System.out.print(i+" ");
                list.add(n/i);
                }
            }
            
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get (i)+" ");
        }
    }
}
