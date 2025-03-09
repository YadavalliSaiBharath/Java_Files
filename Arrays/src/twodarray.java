import java.util.Scanner;

public class twodarray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the numbers of the matrix:");
        //input rows
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to find:");
        int x = sc.nextInt();
        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(matrix[i][j]==x){
                    System.out.println("The number is at the "+i +" row and " +j +" column");
                }
            }
        }
    }
}
