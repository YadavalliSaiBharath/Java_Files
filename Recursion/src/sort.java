public class sort {
    public static boolean getSort(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        //This is the reverse of the recursion
        //Recursion can be reversed to get the same code value
        /*if(arr[index] >= arr[index+1]){
             return false;
        }
              return getSort(arr,index+1);
        */
        if(arr[index] < arr[index+1]){
            return getSort(arr,index+1);
        }
        else{
            return false;
        }
    }
    public static void main (String[] args){
        int arr[] = {1,3,5};
        System.out.println(getSort(arr,0));
    }
}
