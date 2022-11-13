/*
 * 
 * * 
 * * *
 * * * *
 * * *
 * *
 * 
 */
public class Pattern5 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        for (int row = 1; row <2*n; row++) {
            int totalColsInRow = row > n ? 2 * n-row-1 : row;
            //for every row, run the col
            for(int col=1; col<=totalColsInRow;col++){
                System.out.print("* ");
            }
            //when one row is printed we need to print a new line
            System.out.println();
        }

    }
    // static void pattern(int n){
    //     for (int row = 1; row <= n; row++) {
    //         //for every row, run the col
    //         for(int col=1; col<=row;col++){
    //             System.out.print("* ");
    //         }
    //         //when one row is printed we need to print a new line
    //         System.out.println();
    //     }
    //     for (int row = n; row >=1; row--) {
    //         //for every row, run the col
    //         for(int col=1; col<row;col++){
    //             System.out.print("* ");
    //         }
    //         //when one row is printed we need to print a new line
    //         System.out.println();
    //     }

    // }
}
