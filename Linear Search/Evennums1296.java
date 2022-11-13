public class Evennums1296 {
        public static void main (String[] args){
            int[] nums = {23,24,22,21,43,321,222,111};
          System.out.println(findNumbers(nums));
        }
        public static int findNumbers(int[] nums) {
           int count = 0;
            for(int num : nums){
                if(even(num)){
                    count++;
                }
            }
            return count;
        }
        //Divisible by two or not
        static boolean even(int nums){
            int numberOfDigits = digits(nums);
            return numberOfDigits % 2 == 0;
        }

        //count number of digits in a number
        static int digits(int nums){
            int count = 0;
            while(nums>0){
                count++;
                nums = nums/10;
                
            }
            return count;
        }
    
}
