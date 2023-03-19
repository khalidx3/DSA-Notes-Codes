public class Firstandlast {
    public static int first = -1;
    public static int second = -1;
    public static void occurance(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(second);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar==element){
            if(first==-1){
                first=idx;
            }else{
                second = idx;
            }

        }
        occurance(str, idx+1, element);

    }
    public static void main(String[] args) {
        String str ="abaacdaefaah";
        occurance(str, 0, 'a');
    }
}

