import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Income: ");
        int mark = scan.nextInt();

        if (mark > 7000) {
            System.out.println("ScholarShip Is Available");
        } else {
            System.out.println("Not Eligible ScholarShip");
        }
    }
}
