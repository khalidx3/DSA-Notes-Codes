public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3,2,18};
        int target= 18;
        System.out.println(find(arr,target,0));
    }
    static int find(int[] arr, int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return find(arr, target, index+1);
        }
    }
}
