import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    }
}