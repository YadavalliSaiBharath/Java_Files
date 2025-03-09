import java.util.HashSet;
public class hash {
    public static void subsequence(String str,int idx,String newString,HashSet<String> Set){
        if(idx == str.length()){
            if(Set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                Set.add(newString);
                return;
            }
        }
        char currchar = str.charAt(idx);

        subsequence(str,idx+1,newString+currchar,Set);

        subsequence(str,idx+1,newString,Set);
    }
    public static void main(String[] args){
        String str = "aaa";
        HashSet<String> Set = new HashSet<>();
        subsequence(str,0,"",Set);
    }
}
