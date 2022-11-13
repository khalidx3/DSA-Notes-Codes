public class duplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(main(arr));
    }
    static int main(int[] arr ){
        int unique = 0;
        for (int i : arr) {
            unique ^=i;
        }
        return unique;
    }
}
