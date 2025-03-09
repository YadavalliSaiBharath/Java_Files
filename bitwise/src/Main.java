import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the operation in form of 1 or 0:");
        int oper = sc.nextInt(); // operation
        int n = 5;
        int pos = 1; //position of bit
        int bitMask = 1<<pos;
        if(oper == 1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
           int newBitmask = ~(bitMask);
            int newNumber = newBitmask & n;
            System.out.println(newNumber);
        }
    }
}
