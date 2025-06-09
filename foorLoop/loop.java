import java.util.Scanner;

class loop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Name: ");
        // Read the name input from the user
        String name = scan.nextLine();

        // Loop through each character in the name
        for(int i = 0; i < 5; i++) {
            // Print the character at the current index
            System.out.println(name);
        }
    }
}
