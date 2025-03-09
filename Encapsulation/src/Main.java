public class Main {
    public static void main(String[] args) {

        Car car = new Car("Valorant","Aspas Goat",1);

        //car.setPlayer("Aspas Goat for real");
        System.out.println(car.getGame());
        System.out.println(car.getPlayer());
        System.out.println(car.getPosition());

        car.setPlayer("Aspas Goat for real");
        System.out.println();
        System.out.println(car.getPlayer());

    }
}