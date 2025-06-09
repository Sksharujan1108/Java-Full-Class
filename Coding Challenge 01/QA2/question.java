import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scan.nextLine();

        System.out.print("Enter your Age: ");
        int age = scan.nextInt();
        scan.nextLine(); // consume newline left-over
        
        System.out.print("Enter your Address: ");
        String address = scan.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your address is: " + address);
    }
}