public class GenericMethodExercise {  
    
    // Generic method that prints an array of any type  
    public static <T> void printArray(T[] array) {  
        for (T element : array) {  
            System.out.println(element);  
        }  
    }  

    public static void main(String[] args) {  
        // Create an array of Integers  
        Integer[] intArray = {1, 2, 3, 4, 5};  
        System.out.println("Integer Array:");  
        printArray(intArray); // Call the generic method for Integer array  

        // Create an array of Strings  
        String[] stringArray = {"Apple", "Banana", "Cherry"};  
        System.out.println("\nString Array:");  
        printArray(stringArray); // Call the generic method for String array  

        // Create an array of Doubles  
        Double[] doubleArray = {1.1, 2.2, 3.3};  
        System.out.println("\nDouble Array:");  
        printArray(doubleArray); // Call the generic method for Double array  
    }  
}