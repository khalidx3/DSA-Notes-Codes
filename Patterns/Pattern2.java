/*
 * * * * *
 * * * * * 
 * * * * *
 * * * * *
 * * * * *
 */
public class Pattern2 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for(int col=1; col<=n;col++){
                System.out.print("* ");
            }
            //when one row is printed we need to print a new line
            System.out.println();
        }
    }
 }

