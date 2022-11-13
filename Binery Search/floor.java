public class floor {
    public static void main(String[] args) {
        int[] arr = {-23,-21,-11,-3,0,1,4,5,14};
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    //return index
    //return -1 if it does not exist
    public static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            //find the middle number
            int mid = start + (end - start)/2;

            if(target>arr[mid]){
                start=mid+1;
                
            }else if(target <arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return end;
        
    }
}
