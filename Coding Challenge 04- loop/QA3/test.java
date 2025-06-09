import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What Is  The Of Traffic Light: ");
        String color = scan.nextLine();

        // is used to compare two strings while ignoring(equalsIgnoreCase) uppercase or lowercase letters.
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Get Ready");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Color");
        }
    }
}
