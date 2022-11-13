public class FindSmallestLetter744 {
    public static void main(String[] args) {
        int[] letters = {'c','f','j'};
        int target = 'a';
        int ans = binarySearch(letters, target);
        System.out.println(ans);
    }

    //return index
    //return -1 if it does not exist
    public static int binarySearch(int[] letters , int target) {
        int start = 0;
        int end = letters.length -1;

        while(start<=end){
            //find the middle number
            int mid = start + (end - start)/2;

            if(target>letters[mid]){
                start=mid+1;
                
            }else if(target <letters[mid]){
                end = mid-1;
            }
        }
        return letters[start%letters.length];
        
    }
}
