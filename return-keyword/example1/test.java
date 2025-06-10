
public class test {

    public int  getShoap (int money) {

        int price = 10; // Example price of an item in the shop
        int balance = money - price; // Calculate the balance after buying an item
        return balance; // This return statement is optional, as the method has no return type.
    }
    public static void main(String[] args) {

        test obj = new test();

        int shopPrice = 20; // Example price of an item in the shop

        obj.getShoap(shopPrice); // Calling the getShoap method with the price of the item

        int remainingBalance = obj.getShoap(shopPrice); // Store the returned balance

        System.out.println("Remaining balance after purchase: " + remainingBalance + " rupees"); // Print the remaining balance

    }
}