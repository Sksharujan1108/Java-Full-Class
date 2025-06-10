import java.util.Scanner;

class Find {

    void evenorodd  (int num) {
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter The Number: ");
        int num = scan.nextInt();

        Find obj = new Find();
        obj.evenorodd(num);
    }
}
