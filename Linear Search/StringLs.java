public class StringLs {

    public static void main(String[] args) {
        String name = "khalid";
        char target = 'a';

        System.out.println(search(name,target));
        
    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }

        for (char ch: str.toCharArray()) {

            if(ch == target){
                return true;
            }
        }
        return false;
    }
}


//Linear Search 2

//     public static void main(String[] args) {
//         String name = "khalid";
//         char target = 'a';

//         System.out.println(search(name,target));
        
//     }

//     static int search(String str,char target){
//         if(str.length()==0){
//             return -1;
//         }

//         for (int i = 0; i < str.length(); i++) {

//             if(target == str.charAt(i)){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

//Linear Search 3

    // public static void main(String[] args) {
    //     String name = "khalid";
    //     char target = 'a';

    //     System.out.println(search(name,target));
        
    // }

    // static boolean search(String str,char target){
    //     if(str.length()==0){
    //         return false;
    //     }

    //     for (int i = 0; i < str.length(); i++) {

    //         if(target == str.charAt(i)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
