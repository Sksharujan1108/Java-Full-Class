public class School {

    void display() {
        System.out.println("Hello, welcome to the school!");
    }

    void display(int a) {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        School obj = new School();
        
        obj.display(); // Calling the display method with a message

        obj.display(5); // Calling the display method with an integer parameter
    }
}