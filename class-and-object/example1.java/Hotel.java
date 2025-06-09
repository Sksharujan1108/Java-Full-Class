public class Hotel {
    // Hotel class to represent a hotel with its details
    int tea = 50;
    int coffee = 60;
    int sandwich = 100;
    int burger = 150;

    public static void main(String[] args) {
        // Main method to run the program
        Hotel server1 = new Hotel();

        System.out.println("Welcome to the Hotel!");
        System.out.println("Tea: " + server1.tea + " Rs");
        System.out.println("Coffee: " + server1.coffee + " Rs");

        Hotel server2 = new Hotel();
        System.out.println("Sandwich: " + server2.sandwich + " Rs");
        System.out.println("Burger: " + server2.burger + " Rs");
    }
}