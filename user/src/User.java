import java.util.Scanner;

public class User {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
      //  String name = scan.nextLine();
        System.out.println("What is your name:");
        String name = scan.nextLine();
        System.out.println("How old are you:");
        int age = scan.nextInt();

        System.out.println("Hello "+name);
        System.out.println("Yor are "+age+" years old");

    }

}
