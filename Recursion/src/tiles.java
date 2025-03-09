public class tiles {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // for horizontal placements
        int horPlacements = placeTiles(n-1,m);
        // for vertical placements
        int verPlacements = placeTiles(n-m,m);

        return horPlacements + verPlacements;
    }
    public static void main(String[] args){
        int n=4,m=2;
        System.out.println(placeTiles(n,m));

    }
}
// recursion last problem is still pending try to complete it after some time