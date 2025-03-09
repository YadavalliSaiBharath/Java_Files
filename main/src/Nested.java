import java.util.Scanner;

public class Nested {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = 5; //rows,columns;
        //String symbol;


        for(int i=1; i<=n; i++){

            System.out.println();
            for(int j=1; j<=i; j--) {

                System.out.print(j);
            }
        }

    }
}
