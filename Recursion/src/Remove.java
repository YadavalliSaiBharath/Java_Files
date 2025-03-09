public class Remove {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentchar = str.charAt(idx);
        if(map[currentchar - 'a'] /*== true*/){
            removeDuplicates(str,idx+1,newString);
        }
        else{
            newString += currentchar;
            map[currentchar - 'a'] = true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String[] args){
        String str = "abbccda";
        removeDuplicates(str,0,"");
    }
}
