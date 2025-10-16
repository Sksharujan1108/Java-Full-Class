class Laptop {
    String name;
    int price;
}

public class Test {
    public static void main(String[] args) {
        // Create an object of Laptop class
        Laptop laptop = new Laptop();
        
        // Assign values to the object's attributes
        laptop.name = "Dell XPS 13";
        laptop.price = 1200;
        
        // Display the object's attributes
        System.out.println("Laptop Name: " + laptop.name);
        System.out.println("Laptop Price: $" + laptop.price);
    }
}

// here run the code in the terminal
// javac Test.java
// java Test
// Output:
// Laptop Name: Dell XPS 13
// Laptop Price: $1200
// This code defines a Laptop class with attributes name and price, creates an instance of the Laptop class, assigns values to its attributes, and prints them to the console