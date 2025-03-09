public class end {
    public static void moveAllx(String str, int count,int idx,String newString){
            if(idx == str.length()) {
                for (int i = 0; i < count; i++) {
                    newString += 'x';
                }
                System.out.println(newString);
                return;
            }
            char currentchar = str.charAt(idx);
        if(currentchar == 'x'){
            count++;
            moveAllx(str,count,idx+1,newString);
        }
        else{
            newString += currentchar;
            moveAllx(str,count,idx+1,newString);
        }
    }
    public static void main(String[] args){
        String str = "axbcxxd";
        moveAllx(str,0,0,"");
    }
}
