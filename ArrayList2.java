import java.util.ArrayList;  

public class ArrayList2 {  
    public static void main(String[] args) {  
        // Create an ArrayList to store Integer elements  
        ArrayList<Integer> numbers = new ArrayList<>();  

        // Adding elements to the ArrayList  
        numbers.add(10);  
        numbers.add(20);  
        numbers.add(30);  
        numbers.add(40);  
        numbers.add(50);  

        // Display the elements in the ArrayList  
        System.out.println("Elements in the ArrayList: " + numbers);  

        // Loop through the ArrayList and print each element  
        System.out.println("Displaying elements using a loop:");  
        for (Integer number : numbers) {  
            System.out.println(number);  
        }  

        // Accessing an element by index  
        int firstElement = numbers.get(0);  
        System.out.println("First element: " + firstElement);  

        // Size of the ArrayList  
        System.out.println("Size of the ArrayList: " + numbers.size());  

        // Removing an element from the ArrayList  
        numbers.remove(2); // Removes the element at index 2 (i.e., 30)  
        System.out.println("Elements after removing the third element: " + numbers);  
    }  
}