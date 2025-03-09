public class overload {
    public static void main(String[] args) {

        int x = lucky(5, 18, 2);

        System.out.println(x);
    }
    static int lucky(int a, int b) {
        System.out.println("This is the first method of overload!");
        return a + b;
    }
    static int lucky(int a, int b, int c) {
        System.out.println("This is the Second method of overload!");
        return a+b+c ;
    }
    static int lucky(int a, int b, int c, int d) {
        System.out.println("This is the Third method of overload!");
        return a+b+c+d ;
    }
}