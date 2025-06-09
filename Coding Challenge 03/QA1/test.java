import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Score: ");
        int score = scan.nextInt();

        if (score > 70) {
            System.out.println("Excellent Performance");
        } else if (score >= 50 && score <= 70) {
            System.out.println("Good Job");
        } else {
            System.out.println("Keep Trying");
        }
    }
}
