public class Selection {
    public static void printSet(int ar[]) {
        for (int i = 0; i <ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
        //selection sorting of arrays
        public static void main (String args[]){
            int ar[] = {7, 8, 3, 2, 1};
            for (int i = 0; i < ar.length - 1; i++) {
                int smallest = i;
                for (int j = i + 1; j < ar.length; j++) {
                    if (ar[smallest] > ar[j]) {
                        smallest = j;
                    }
                }
                int temp = ar[smallest];
                ar[smallest] = ar[i];
                ar[i] = temp;
            }
            printSet(ar);
        }
    }
       /*insertion sorting was hard I didn't understand that
      But I will learn it after some time*/
           //Good luck