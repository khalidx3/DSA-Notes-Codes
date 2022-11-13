/*
 1
 1 2
 1 2 3
 1 2 3 4
 */
public class Pattern4 {
    public static void main(String[] args) {
        pattern(4);
    }

static void pattern(int n){
    for (int row = 1; row <= n; row++) {
        //for every row, run the col
        for(int col=1; col<=row;col++){
            System.out.print(col + " ");
        }
        //when one row is printed we need to print a new line
        System.out.println();
    }
}
}