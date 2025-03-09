public class finding {
    public static int first = -1;
    public static int last = -1;
    public static void findchar(String str,int index,char element){
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(index);
        if(current==element){
            if(first == -1){
                first = index;
            }
            else{
                last = index;
            }
        }
        findchar(str,index+1,element);
    }
    public static void main(String[] args){
            String str = "baabcjbacavja";
            findchar(str,0,'a');
    }
}
