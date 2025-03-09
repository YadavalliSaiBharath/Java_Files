import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        //Stack is a LIFO

        Stack<String> stack = new Stack<String>();

       // System.out.println(stack.isEmpty());

        stack.push("Lucky");
        stack.push("Aspas");
        stack.push("Messi");

        //stack.peek();
        System.out.println(stack.search("Lucky"));


        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.isEmpty());

        //System.out.println(stack.search("Aspas"));

    }
}
