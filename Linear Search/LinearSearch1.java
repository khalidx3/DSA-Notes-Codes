public class LinearSearch1{
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19};
        int target = 19;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }

//Linear Search 1
    // search in the array: return the index if item found otherwise if item not found return -1

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop
        for(int index = 0; index <arr.length;index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statment above have executed hence the target not found
        return -1;
    }
}

//Linear Search 2

    //search the target and return the element 

//     static int linearSearch2(int[] arr,int target){
//         if(arr.length == 0){
//             return -1;
//         }

//         //run a enhanced for loop
//         for(int element: arr){
//             //check for every index if it is = target
//             if(element==target){
//                 return element;
//             }
//         }
//         //this line will execute if none of the return statment above have executed hence the target not found
//         return Integer.MAX_VALUE; //-1 may be the element
//     }
// }

// //Linear Search 3
//     //search the target and return true or false 
//     static boolean linearSearch3(int[] arr,int target){
//         if(arr.length == 0){
//             return false;
//         }

//         //run a for loop
//         for(int index = 0; index <arr.length;index++){
//             int element = arr[index];
//             if(element==target){
//                 return true;
//             }
//         }
//         //this line will execute if none of the return statment above have executed hence the target not found
//         return false; //-1 may be the element
//     }
// }



   