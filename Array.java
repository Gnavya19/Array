public class Array {
    public static void main(String[] args) { 
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        numbers[2] = 35;
        System.out.println("\nUpdated array:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("\nThe length of the array is: " + numbers.length);
}
}