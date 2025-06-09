public class Laptop {
    // Laptop class with properties
    String brand;
    String color;
    String processor;
    int ram;
    int storage;
    double price;

    public static void main(String[] args) {
        // Main method to run the program
        Laptop laptopSales1 = new Laptop();

        // Setting properties of the laptop
        laptopSales1.brand = "Dell";
        laptopSales1.color = "Black";
        laptopSales1.processor = "Intel Core i7";
        laptopSales1.ram = 16; // in GB
        laptopSales1.storage = 512; // in GB
        laptopSales1.price = 1200.00; // in USD

        // Displaying the laptop details
        System.out.println("Welcome to Laptop Sales!");
        System.out.println("Brand: " + laptopSales1.brand);
        System.out.println("Color: " + laptopSales1.color);
        System.out.println("Processor: " + laptopSales1.processor);
        System.out.println("RAM: " + laptopSales1.ram + " GB");
        System.out.println("Storage: " + laptopSales1.storage + " GB");
        System.out.println("Price: $" + laptopSales1.price);
        System.out.println("Thank you for visiting!");

        // Creating another laptop object to demonstrate multiple instances
        Laptop laptopSales2 = new Laptop();
        laptopSales2.brand = "HP";
        laptopSales2.color = "Silver";
        laptopSales2.processor = "AMD Ryzen 5";
        laptopSales2.ram = 8; // in GB
        laptopSales2.storage = 256; // in GB
        laptopSales2.price = 800.00; // in USD
        // Displaying the second laptop details
        System.out.println("\nAnother Laptop Available:");
        System.out.println("Brand: " + laptopSales2.brand);
        System.out.println("Color: " + laptopSales2.color);
        System.out.println("Processor: " + laptopSales2.processor);
        System.out.println("RAM: " + laptopSales2.ram + " GB");
        System.out.println("Storage: " + laptopSales2.storage + " GB");
        System.out.println("Price: $" + laptopSales2.price);
        System.out.println("Thank you for visiting our store!");
    }
}