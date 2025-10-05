package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        //Treeset keeps the order
        // HashSet doesn't keep order
        // HashSet is quicker

        names.add("Ana");
        names.add("Carlos");
        System.out.println(names.add("Ana"));
        System.out.println("List: " + names);
        System.out.println("Size: " + names.size());

        System.out.println("Contains 'Carlos'? " + names.contains("Carlos"));
        System.out.println("Contains 'Marcos'? " + names.contains("Marcos"));

        names.remove("Beatriz");
        System.out.println("Removed 'Beatriz': " + names);

        System.out.println("\nfor-each:");
        for (String nome : names) {
            System.out.println(" - " + nome);
        }

        names.clear();
        System.out.println(names);
    }
}