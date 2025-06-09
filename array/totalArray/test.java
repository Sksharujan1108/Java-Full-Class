import java.util.Scanner;

class test {
    public static void main(String[] args) {

        // Get The 5 Numbers
        Scanner scan = new Scanner(System.in);
        // Create an array of integers
        int[] numbers = new int[5];

        // For loop to get 5 numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        // Calculate the total of the array
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        // Print the total
        System.out.println("The total of the array is: " + total);
    }
}