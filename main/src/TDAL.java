import java.util.ArrayList;

public class TDAL {
    public static void main(String[] args){

        ArrayList<ArrayList<String>> hobbyList = new ArrayList<>();

        ArrayList<String> DramaList = new ArrayList<>();
        DramaList.add("Fight for my way");
        DramaList.add("Snowdrop");
        DramaList.add("Goblin");

        ArrayList<String> AnimeList = new ArrayList<>();
        AnimeList.add("Attack on Titan");
        AnimeList.add("Demon slayer");
        AnimeList.add("JJK");

        ArrayList<String> StremerList = new ArrayList<>();
        StremerList.add("Fa2");
        StremerList.add("Tbone");
        StremerList.add("Samay raina");

        hobbyList.add(DramaList);
        hobbyList.add(AnimeList);
        hobbyList.add(StremerList);

        //System.out.println(hobbyList);
        System.out.println(hobbyList.get(0).get(0));


    }
}
