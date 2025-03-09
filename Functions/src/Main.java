import java.util.Scanner;

public class Main {
    public static int multiplyNum(int a,int b){
       int value = a*b;
        return value;
    }


    public static void main(String[] args){

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        int value = multiplyNum(a,b);
        System.out.println("The cross of two numbers is:");
        System.out.println(value);

    }
}