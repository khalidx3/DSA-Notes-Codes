public class toh{
    
    public static void towerofhanoi(int n, String src,String helper,String dest){
        if(n==1){
            System.out.println("transferd"+n+"from"+src+"to"+dest);
            return;
        }
        towerofhanoi(n-1,src,dest,helper);
        System.out.println("transferd"+n+"from"+src+"to"+dest);
        towerofhanoi(n-1,helper,src,dest);


    }
    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, "A", "B", "C");
    }
}