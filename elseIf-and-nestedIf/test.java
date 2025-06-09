import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The English Mark: ");
        int mark = scan.nextInt();

        if (mark > 75) {
            System.out.println("Super Class");
        } else if (mark > 60) {
            System.out.println("Good Class");
        } else if (mark > 35) {
            System.out.println("Pass Class");
        } else {
            System.out.println("Fail Class");
        }
    }
}
