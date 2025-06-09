import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }

        // Show the array numbers in a loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
        }
    }
}
