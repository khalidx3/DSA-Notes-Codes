public class RangeLs {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19};
        int target = 2;
        int ans = linearSearch(nums,target,1,4);
        System.out.println(ans);
    }

//Linear Search 1
    // search in the array: return the index if item found otherwise if item not found return -1

    static int linearSearch(int[] arr,int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = start; index <=end;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statment above have executed hence the target not found
        return -1;
    }
}


