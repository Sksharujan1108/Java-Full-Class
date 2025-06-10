public class School {

    void sum(int a, int b) {
        // This method takes two integers a and b, calculates their sum, and prints the result.
        int result = a + b; // Calculate the sum of a and b
        System.out.println("The sum of " + a + " and " + b + " is: " + result); // Print the result
    }

    void sum(int a, int b, int c) {
        // This method takes three integers a, b, and c, calculates their sum, and prints the result.
        int result = a + b + c; // Calculate the sum of a, b, and c
        System.out.println("The sum of " + a + ", " + b + ", and " + c + " is: " + result); // Print the result
    }

    public static void main(String[] args) {

        School obj = new School();

        int a = 10; // Example integer a
        int b = 20; // Example integer b
        int c = 30; // Example integer c
        
        obj.sum(a, b); // Calling the display method with a message

        obj.sum(a, b, c); // Calling the display method with an integer parameter
    }
}