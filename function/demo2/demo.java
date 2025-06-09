public class demo {

    static void greeting() {
        System.out.println("Hello, welcome to the demo!");
        dummy(); // This will work because dummy is static
    }
    static void dummy() {
        System.out.println("This is a dummy method");
    }

    public static void main(String[] args) {

        greeting(); // This will cause an error because greeting is not static
    }
}