import javax.swing.event.SwingPropertyChangeSupport;

public class FindMin {
    public static void main(String[] args) {
        int[] arr= {1,4,5,3,6,23,55};
    System.out.println(min(arr));
    }

    //assume arr.length !=0
    //return thr min value in the array

    static int min(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }

}
