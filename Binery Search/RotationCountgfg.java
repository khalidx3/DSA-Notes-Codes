public class RotationCountgfg{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2};
        System.out.println(countRotations(arr));
    }
    public static int countRotations(int[] arr){
        int pivot = findPivot(arr);
        //not rotated
       
            return pivot +1; //returns 0;
    }
    //for non-duplicate
    static int findPivot(int[] arr ){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid>start && arr[mid]<arr[mid-1]){
                    return mid - 1;
                }
                // below statment for not duplicate
                if( arr[mid]<=arr[start]){
                    end = mid - 1;
                }
                else{
                    start = start + 1;
                }
                
                //below statment for duplicate
                //if elements at middle,start,end are equal then just skip the duplicate
                // if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //     //skip the duplicate
                //     //NOTE: what if these elements at start and end were the pivot?
                //     if(arr[start]>arr[start+1]){
                //         return start;
                //     }
                //     start++;

                //     //check whether end is pivot
                //     if(arr[end]<arr[end-1]){
                //         return end-1;
                //     }
                //     end --;
                // }
                // //left side is sorted, so pivot should be in right
                // else if(arr[start]<arr[mid] || (arr[start]==arr[mid]&& arr[mid]>arr[end])){
                //     start = mid +1;
                // }
                // else{
                //     end = mid - 1;
                // }
        }
        return -1;
    }
    
    //for duplicates
    static int findPivotDuplicate(int[] arr ){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return mid;
                }
                if(mid>start && arr[mid]<arr[mid-1]){
                    return mid - 1;
                }
                // below statment for not duplicate
                // if( arr[mid]<=arr[start]){
                //     end = mid - 1;
                // }
                // else{
                //     start = start + 1;
                // }
                
                //below statment for duplicate
                //if elements at middle,start,end are equal then just skip the duplicate
                if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                    //skip the duplicate
                    //NOTE: what if these elements at start and end were the pivot?
                    if(arr[start]>arr[start+1]){
                        return start;
                    }
                    start++;

                    //check whether end is pivot
                    if(arr[end]<arr[end-1]){
                        return end-1;
                    }
                    end --;
                }
                //left side is sorted, so pivot should be in right
                else if(arr[start]<arr[mid] || (arr[start]==arr[mid]&& arr[mid]>arr[end])){
                    start = mid +1;
                }
                else{
                    end = mid - 1;
                }
        }
        return -1;
    }
}