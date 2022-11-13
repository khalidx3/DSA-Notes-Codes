public class RichestCustomer1672 {
    public static void main(String[] args) {
        int[][] arr ={

            {1,2,3},
            {1,2,3}
        };
        System.out.println(maximumWealth(arr));
    }
    private static int maximumWealth(int[][] accounts) {
        //person=row
        //account = col;

        int ans = Integer.MIN_VALUE;
        for(int person = 0; person<accounts.length;person++){
            // When you start a new col, take a new sum for that row 
            int sum = 0;
            for(int account = 0; account< accounts[person].length;account++){
                sum += accounts[person][account];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
        
    }
}
