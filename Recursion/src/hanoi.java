public class hanoi {
    public static  void towerofHanoi(int n,String source,String helper,String destination){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        towerofHanoi(n-1,source,destination,helper);
        System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
        towerofHanoi(n-1,helper,source,destination);
    }
    public static void main(String[] args){
        //int n = 2;
        towerofHanoi(3,"S","H","D");
    }
}
