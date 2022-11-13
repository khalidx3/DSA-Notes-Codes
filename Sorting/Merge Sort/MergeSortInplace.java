import java.util.Arrays;

public class MergeSortInplace {
        public static void main(String[] args) {
            int[] arr = {5,4,3,2,1};
             merge(arr,0, arr.length);
            System.out.println(Arrays.toString(arr));
        }
    
        static void merge(int[] arr,int s, int e){
            if(e-s==1){
                return ;
            }
            int mid = (s+e)/2;
    
             merge(arr,s,mid);
            merge(arr,mid,e);
    
             mergeing(arr,s,mid,e);
            
        }
    
        private static void mergeing(int[] arr, int s, int m, int e){
            int[] mix = new int[e-s];
    
            int i = s;
            int j = m;
            int k = 0;
    
            while(i<m && j<e){
                if(arr[i]<arr[j]){
                    mix[k] = arr[j];
                    j++;
                
                }else{
                    mix[k]= arr[j];
                    j++;
                }
                k++;
            }
            //it may be posible that one of the array is not complete
            // cpy the remaining element;
            while(i<m){
                mix[k]=arr[i];
                i++;
                k++;
            }
            while(j<e){
                mix[k]=arr[i];
                j++;
                k++;
        }
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s+k2]=mix[k2];
        }
    }
}
