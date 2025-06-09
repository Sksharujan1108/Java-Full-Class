import java.util.Scanner;

class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Tamil Mark: ");
        int tamil = scan.nextInt();

        System.out.print("Enter The Maths Mark: ");
        int maths = scan.nextInt();

        System.out.print("Enter The English Mark: ");
        int english = scan.nextInt();

        System.out.print("Enter The ICT Mark: ");
        int ict = scan.nextInt();

        System.out.print("Enter The Science Mark: ");
        int science = scan.nextInt();

        int total = (tamil + maths + english + ict + science);
        float avarage = total / 5;

        if (avarage >= 35) {
            System.out.println("You have passed the exam");
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + avarage);
        } else {
            System.out.println("You have failed the exam");
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + avarage);
        }
    }
}
