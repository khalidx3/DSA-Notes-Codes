import java.util.ArrayList;

public class findTheIndex {
public static void main(String[] args) {
    int[] arr= {1,2,3,4,4,5};
    // ArrayList<Integer> ans = find(arr,4,0,new ArrayList<>());
    // System.out.println(ans);
    System.out.println(find2(arr, 4, 0));
}   

static ArrayList<Integer> find(int[] arr, int target, int index,ArrayList<Integer>list){
    if(index==arr.length){
        return list;
    }
    if(arr[index]==target){
        list.add(index);
    }
    return find(arr,target,index+1,list);
}

// Anothere approch
static ArrayList<Integer> find2 (int[] arr, int target, int index){
    ArrayList<Integer>list = new ArrayList<>();
    
    if(index==arr.length){
        return list;
    }

    //this will contain answer for that function call only
    if(arr[index]==target){
        list.add(index);
    }
    ArrayList<Integer> ansfromBelowCalls= find2(arr,target,index+1);
    list.addAll(ansfromBelowCalls);

    return list;

}

}
