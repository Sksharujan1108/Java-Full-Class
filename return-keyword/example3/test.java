public class test {

    public String getName (String name) {
        // This method takes a string name and returns it.
        String myName = name;
        return myName; // Return the name
    }
    public static void main(String[] args) {

        test obj = new test();

        String name = "John Doe"; // Example name

        obj.getName(name); // Calling the getName method with the name

        String myName = obj.getName(name); // Store the returned name

        System.out.println("The name is: " + myName); // Print the name
    }
}