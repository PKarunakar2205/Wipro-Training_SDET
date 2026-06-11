package Collections;
import java.util.LinkedList;

public class Animal {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");

        System.out.println("Original List: " + animals);

        animals.removeFirst();
        System.out.println("After removing first: " + animals);

        animals.removeLast();
        System.out.println("After removing last: " + animals);

        animals.remove("Lion");
        System.out.println("After removing 'Lion': " + animals);
    }
}
