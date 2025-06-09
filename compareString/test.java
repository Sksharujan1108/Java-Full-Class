import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the RCB result: ");
        String RCB = scan.nextLine();

        if (RCB.equals("win")) {
            System.out.println("Esala cup namthu");
        } else {
            System.out.println("Loss");
        }
    }
}