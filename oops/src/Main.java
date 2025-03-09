class Pen{
    String colour;
    String type;
    String brand;
    public void printInfo(){
        System.out.println("Colour = " + this.colour);
        System.out.println(this.type);
        System.out.println(this.brand);
    }
}
class Student{
   String name;
   int age;
    public void printCharacter(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class School{
     String name;

     public void printAbout(){
         System.out.println("School = " + this.name);
     }
}
public class Main {
    public static void main(String[] args) {
     Pen p1 = new Pen();
     p1.colour = "Black";
     p1.type = "Ballpoint";
     p1.brand = "OXO";

     Pen p2 = new Pen();
     p2.colour = "White";
     p2.type = "Gel";
     p2.brand = "Meow";

     Student s1 = new Student("Lucky",19);

     School sc = new School();
     sc.name = "Sister Stanislas English Memorial High School";

        p1.printInfo();
        System.out.println();
        p2.printInfo();
        System.out.println();
        s1.printCharacter();
        System.out.println();
        sc.printAbout();
    }
}