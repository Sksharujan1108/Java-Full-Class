public class addition {

    int a = 10;
    int b = 20;

    int apple_price = 30;
    int apple_count = 5;

    // This method is not static, so it cannot be called from a static context
    void totol() {
        System.out.println("Total: " + (a + b));
    }

    // This method is static, so it can be called without creating an instance of the class
    void totalApplePrice() {
        System.out.println("Total Apple Price: " + (apple_price * apple_count));
    }

    public static void main(String[] args) {

        addition obj = new addition(); // Create an instance of the addition class
        obj.totol(); // Call the non-static method using the instance

        obj.totalApplePrice(); // Call the static method using the instance
    }
}