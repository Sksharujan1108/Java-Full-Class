public class question {

    void getNumber(int num1, int num2) {
        System.out.print("Number 1: " + num1 + "\n");
        System.out.print("Number 2: " + num2 + "\n");
    }

    // sum method to add two numbers
    void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.print("Sum: " + result + "\n");
    }

    // difference method to subtract two numbers
    void difference(int num1, int num2) {
        int result = num1 - num2;
        System.out.print("Difference: " + result + "\n");
    }

    // product method to multiply two numbers
    void product(int num1, int num2) {
        int result = num1 * num2;
        System.out.print("Product: " + result + "\n");
    }

    public static void main(String[] args) {
        // Create an instance of the question class
        question q = new question(); // Instance to call non-static methods
        
        // Example numbers
        int num1 = 10;
        int num2 = 5;

        // Display the numbers
        q.getNumber(num1, num2);

        // Perform operations
        q.sum(num1, num2);
        q.difference(num1, num2);
        q.product(num1, num2);
    }
}