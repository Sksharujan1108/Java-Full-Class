import java.util.Scanner;

class test {
    public static void main(String[] args) {

        int countNum = 0;

        // Loop through numbers from 0 to 10
        for (int i = 0; i <= 10; i++) {
            // Check if the number is even or odd
            if (i % 2 == 0) {
                // System.out.println("The number " + i + " is Even");
                countNum++;
            }
        }
        // Print total count of even numbers
        System.out.println("The count of even numbers is: " + countNum);
    }
}
