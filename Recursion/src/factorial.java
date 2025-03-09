public class factorial {
    public static int calFac(int n){
        if(n==1 || n==0){
            return 1;
        }
        int a = calFac(n-1);
        int b = n * a;
        return b;
    }
    public static void main(String[] args){
        int ans = calFac(5);
        System.out.println(ans);
    }
}
