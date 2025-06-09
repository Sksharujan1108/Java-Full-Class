import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}
