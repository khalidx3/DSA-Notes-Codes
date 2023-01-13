public class maze1{
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int r ,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r-1, c);
        int left = count(r, c-1);
        return left+right;
    }
}