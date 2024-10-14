import java.util.ArrayList;  

public class ArrayList1 {  
    public static void main(String[] args) {  
        // Create an ArrayList to hold String elements  
        ArrayList<String> colors = new ArrayList<>();  

        // Add elements to the ArrayList  
        colors.add("Red");  
        colors.add("Green");  
        colors.add("Blue");  
        colors.add("Yellow");  

        // Access and print an element  
        System.out.println("First color: " + colors.get(0)); // Accessing the first element  

        // Remove an element by value  
        colors.remove("Green");  
        System.out.println("After removing Green: " + colors);  

        // Remove an element by index  
        colors.remove(1); // Removes "Blue"  
        System.out.println("After removing color at index 1: " + colors);  

        // Print the size of the ArrayList  
        System.out.println("Number of colors: " + colors.size());  
    }  
}