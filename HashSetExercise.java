import java.util.HashSet;  

public class HashSetExercise {  
    public static void main(String[] args) {  
        // Create a HashSet to store String elements  
        HashSet<String> fruits = new HashSet<>();  

        // Adding elements to the HashSet  
        fruits.add("Apple");  
        fruits.add("Banana");  
        fruits.add("Orange");  
        fruits.add("Mango");  

        // Try adding a duplicate element  
        System.out.println("Trying to add a duplicate element 'Banana':");  
        boolean isAdded = fruits.add("Banana"); // This will return false since 'Banana' is a duplicate  
        if (!isAdded) {  
            System.out.println("Duplicate 'Banana' not added to the HashSet.");  
        }  

        // Display the elements in the HashSet  
        System.out.println("Elements in the HashSet: " + fruits);  

        // Check if the HashSet contains a specific element  
        String checkFruit = "Apple";  
        if (fruits.contains(checkFruit)) {  
            System.out.println("HashSet contains: " + checkFruit);  
        } else {  
            System.out.println("HashSet does not contain: " + checkFruit);  
        }  

        // Remove an element from the HashSet  
        fruits.remove("Orange");  
        System.out.println("After removing 'Orange', elements in the HashSet: " + fruits);  

        // Size of the HashSet  
        System.out.println("Size of the HashSet: " + fruits.size());  
    }  
}