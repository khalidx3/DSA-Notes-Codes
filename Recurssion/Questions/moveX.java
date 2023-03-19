public class moveX {
    public static void move(String str, int idx, int count , String newString){
        if(idx==str.length()){
            for (int i = 0; i < count; i++) {
                newString+= 'x';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar=='x'){
            count++;
            move(str, idx+1, count, newString);
        }else{
            newString+=currchar;
            move(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        move(str, 0, 0, "");
    }
    
}
