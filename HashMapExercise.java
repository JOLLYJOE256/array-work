import java.util.HashMap;  

public class HashMapExercise {  
    public static void main(String[] args) {  
        // Create a HashMap to store String keys and Integer values  
        HashMap<String, Integer> studentScores = new HashMap<>();  

        // Adding key-value pairs to the HashMap  
        studentScores.put("Alice", 85);  
        studentScores.put("Bob", 92);  
        studentScores.put("Charlie", 78);  
        studentScores.put("Diana", 95);  

        // Accessing and printing the value associated with a specific key  
        System.out.println("Score of Alice: " + studentScores.get("Alice"));  

        // Display all key-value pairs in the HashMap  
        System.out.println("Student Scores:");  
        for (String student : studentScores.keySet()) {  
            System.out.println(student + ": " + studentScores.get(student));  
        }  

        // Check if a key exists in the HashMap  
        String studentToCheck = "Bob";  
        if (studentScores.containsKey(studentToCheck)) {  
            System.out.println(studentToCheck + " exists in the HashMap with a score of " + studentScores.get(studentToCheck));  
        } else {  
            System.out.println(studentToCheck + " does not exist in the HashMap.");  
        }  

        // Remove a key-value pair from the HashMap  
        studentScores.remove("Charlie");  
        System.out.println("After removing Charlie, Student Scores:");  
        for (String student : studentScores.keySet()) {  
            System.out.println(student + ": " + studentScores.get(student));  
        }  

        // Size of the HashMap  
        System.out.println("Total number of students: " + studentScores.size());  
    }  
}
