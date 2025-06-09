public class store {

    void getChocolate (int money) {
        System.out.println("With " + money + " rupees, you can buy chocolates.");
    }

    void getPower(int money) {
        System.out.println("With " + money + " rupees, you can buy power.");
    }

    public static void main(String[] args) {

        store obj = new store();
        obj.getChocolate(40); // Calling the display method with a message
        obj.getPower(100); // Calling the display method with a message
        
        // You can call the methods with different amounts of money
        obj.getChocolate(20);
        obj.getPower(50);

        obj.getChocolate(80);
        obj.getPower(200);
    }
}