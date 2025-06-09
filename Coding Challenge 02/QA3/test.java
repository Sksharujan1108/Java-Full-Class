import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int number = scan.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        } else {
            System.out.println("The number is not divisible by both 3 and 5");
        }
    }
}
