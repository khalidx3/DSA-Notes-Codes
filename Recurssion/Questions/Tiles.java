public class Tiles {
    public static int PrintTiles(int n, int m) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //for vertically
        int verticalPlacement= PrintTiles( n-m, m);

        //for horizontal 
        int horizontalPlacement = PrintTiles(n-1, m);
        return verticalPlacement + horizontalPlacement;
        
    }
    public static void main(String[] args) {
        int n = 4, m=2;
        System.out.println(PrintTiles(n, m));
    }
}
