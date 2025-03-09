public class reverse {
    public static void RevStr(String str , int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        RevStr(str,i-1);
    }
    public static void main(String[] args){
        String str = "Lucky";
        RevStr(str,str.length()-1);
    }
}
         // time complexity O(n)