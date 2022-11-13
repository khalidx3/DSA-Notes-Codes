package Assingment;

public class searchPosition35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
     int end = nums.length - 1 ;
     if(nums[end] < target ){
         return end + 1;  // to take care of the edge cases
     }
     while(start <= end){
         int mid = start + (end - start)/2 ;
         if(nums[mid]< target){
             start = mid + 1;
         }
         else if (nums[mid]> target){
             end = mid - 1;
         }
         else{
             return mid ; 
         }
     }
     return start;
 }
}
 

