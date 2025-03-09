public class insertionSort {
    public static void main(String[] args) {
        int arr[]  = { 1,2, 5, 3, 4};
        InsertionSort(arr);
        for(int result : arr){
            System.out.print(result+" ");
        }
    }
    public static void InsertionSort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j = j - 1;
            }
        }
    }
}
