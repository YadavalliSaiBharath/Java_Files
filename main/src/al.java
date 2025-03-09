import java.util.ArrayList;

public class al {
    public static void main(String[] args){


        ArrayList<String> food = new ArrayList<String>();

        food.add("Dosa");
        food.add("Puri");
        food.add("Idli");

        food.set(0,"Vada");
       // food.set(2,"pongal");
        //food.clear();
       // food.remove(1);



        for(int i=0; i<food.size(); i++){

            System.out.println(food.get(i));
        }
    }
}
