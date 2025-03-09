import java.util.Scanner;

public class Main {
    /*public static void printFactorial(int n){
     if(n<=0){
         System.out.println("Invalid number!");
         return;
     }
        int factorial = 1;
     for(int i=n;i>=1;i--){

         factorial = factorial * i;
     }
        System.out.println(factorial);
        return;
    }*/
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = sc.nextInt();
        //System.out.println();
        printFactorial(n);

    }

    public static void printFactorial(int n){
        if(n<=0){
            System.out.println("Invalid number!");
            return;
        }
        int factorial = 1;
        for(int i=n;i>=1;i--){

            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
}
