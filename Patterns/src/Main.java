public class Main {
    public static void main(String[] args) {

        int n = 4;
         //upper part
        for(int i=1; i<=n; i++){
           //first the left side part
            for(int j=1; j<=i; j++){

                System.out.print("*");
            }
             // another loop for spaces it is a middle part
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){

                System.out.print(" ");
            }
            //now the right side part
            for(int j=1; j<=i; j++ ){

                System.out.print("*");

            }

            System.out.println();

        }

           //now reverse the pattern so we get the full pattern
        //now to get the expected pattern we have to reverse the i value
        //upper part
        for(int i=n; i>=1; i--){
            //first the left side part
            for(int j=1; j<=i; j++){

                System.out.print("*");
            }

            // another loop for spaces it is a middle part
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces;j++){

                System.out.print(" ");
            }

            //now the right side part
            for(int j=1; j<=i; j++ ){

                System.out.print("*");

            }

            System.out.println();

        }

    }
}