import java.util.Scanner;

class CompareNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        // Using ternary operator to find the greater number
        int greater = (num1 > num2) ? num1 : num2;

        System.out.println("The greater number is: " + greater);
    }
}