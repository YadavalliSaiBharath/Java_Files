public class Car {
    private String game;
    private String player;
    private int position;
    Car(String game,String player,int position){

        this.game = game; //we no longer need this as we set them at the setter function
        this.setPlayer(player);
        //this.player = player; //we no longer need this as we set them at the setter function
        this.position = position;
    }
    public String getGame(){
        return game;
    }
    public String getPlayer(){
        return player;
    }
    public int getPosition(){
        return position;
    }
    public void setPlayer(String player){
        this.player = player;
    }
}
