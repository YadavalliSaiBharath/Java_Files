import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //int numbers[] = new int[size];
        //input
        System.out.println("Enter the numbers:");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
       //output
        System.out.println("Enter the number you want to search:");
        int x = sc.nextInt();
        for(int i=0; i< numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("The number is at the index of "+i);
            }

        }

    }
}