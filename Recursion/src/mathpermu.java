public class mathpermu {
    public static void printPerm(String str,String permutation){
        if(str.isEmpty()){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currchar = str.charAt(i);

            String newstr = str.substring(0,i) + str.substring(i+1);
            printPerm(newstr,permutation+currchar);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        printPerm(str,"");
    }
}
//time complexity O(n!)