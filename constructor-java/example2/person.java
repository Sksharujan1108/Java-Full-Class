public class person {

     String name;
     int age;

    // Constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create object using constructor
        person p = new person("Saru", 25);
        // Display the person's details
        p.display();
    }
}