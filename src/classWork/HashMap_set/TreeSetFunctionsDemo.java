package classWork.HashMap_set;

import java.util.TreeSet;

public class TreeSetFunctionsDemo {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();

        // Add elements
        students.add("Raghav");
        students.add("Anjali");
        students.add("Bhavesh");
        students.add("Karan");
        students.add("Zoya");

        // Duplicate won't be added
        students.add("Raghav");

        System.out.println("TreeSet: " + students); // Sorted order

        // Check existence
        System.out.println("Contains 'Karan'? " + students.contains("Karan"));

        // Size of TreeSet
        System.out.println("Size: " + students.size());

        // Remove an element
        students.remove("Bhavesh");
        System.out.println("After removing 'Bhavesh': " + students);

        // Clear all elements
        TreeSet<String> tempSet = new TreeSet<>(students);
        tempSet.clear();
        System.out.println("Cleared TreeSet: " + tempSet);

        // Check if empty
        System.out.println("Is TreeSet empty? " + tempSet.isEmpty());

        // Navigational methods
        System.out.println("First: " + students.first());     // Smallest
        System.out.println("Last: " + students.last());       // Largest
        System.out.println("Higher than 'Karan': " + students.higher("Karan"));
        System.out.println("Lower than 'Karan': " + students.lower("Karan"));
        System.out.println("Ceiling of 'Karan': " + students.ceiling("Karan"));
        System.out.println("Floor of 'Karan': " + students.floor("Karan"));

        // Polling (removes and returns)
        System.out.println("Poll First: " + students.pollFirst());
        System.out.println("Poll Last: " + students.pollLast());
        System.out.println("After polling: " + students);

        // Iteration
        System.out.println("Ascending order:");
        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Descending order:");
        for (String name : students.descendingSet()) {
            System.out.println(name);
        }
    }
}