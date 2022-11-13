import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = merge(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge(Arrays.copyOfRange(arr,mid , arr.length));

        return mergeing(left,right);
        
    }

    private static int[] mergeing(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[j];
                j++;
            
            }else{
                mix[k]= second[j];
                j++;
            }
            k++;
        }
        //it may be posible that one of the array is not complete
        // cpy the remaining element;
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=first[i];
            j++;
            k++;
    }
    return mix;
}
}