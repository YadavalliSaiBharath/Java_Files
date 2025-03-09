public class Subsq {
    public static void subSequence(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);

        //if the character wants to be addded
        subSequence(str,idx+1,newString+currchar);

        //if not
        subSequence(str,idx+1,newString);
    }
    public static void main(String[] args){
        String str = "abc";
        subSequence(str,0,"");
    }
}
