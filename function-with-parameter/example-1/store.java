public class store {

    void display (String mgs) {
        System.out.println(mgs);
    }

    public static void main(String[] args) {

        store obj = new store();
        obj.display("Hello, welcome to the store!"); // Calling the display method with a message
    }
}