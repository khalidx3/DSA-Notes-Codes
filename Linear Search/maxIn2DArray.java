public class maxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {12,13},
            {12,45,32},
        };
        System.out.println(max(arr));

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
