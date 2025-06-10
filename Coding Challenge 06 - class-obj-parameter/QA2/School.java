import java.util.Scanner;

public class School {

    String passorfail(int mark) {
        int result = 40;
        if (mark >= result) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Mark: ");
        int totalMark = scan.nextInt();

        School obj = new School();

        String output = obj.passorfail(totalMark);

        // Print the returned value
        System.out.println("You " + output);
    }
}
