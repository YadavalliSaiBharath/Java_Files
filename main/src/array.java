public class array {
    public static void main(String[] args){


       int[][] cars = new int[3][3];

        cars[0][0] = 1;
        cars[0][1] = 2;
        cars[0][2] = 3;
        cars[1][0] = 4;
        cars[1][1] = 5;
        cars[1][2] = 6;
        cars[2][0] = 7;
        cars[2][1] = 8;
        cars[2][2] = 9;

        for(int i=0; i< cars.length; i++){

            System.out.println();
            for(int j=0; j< cars[i].length; j++){

                System.out.print(cars[i][j]+" ");
            }
        }


    }
}
