public class test {

    public int sum (int a, int b) {
        // This method takes two integers a and b, calculates their sum, and returns the result.
        int result = a + b; // Calculate the sum of a and b
        return result; // Return the result of the sum
    }
    public static void main(String[] args) {

        test obj = new test();

        int a = 20; // Example price of an item in the shop
        int b = 30; // Another example price of an item in the shop

        obj.sum(a, b); // Calling the getShoap method with the price of the item

        int total = obj.sum(a, b); // Store the returned sum

        System.out.println("Total sum of " + a + " and " + b + " is: " + total); // Print the total sum
    }
}