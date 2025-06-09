class test {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) { // Start from 5, go down to 1
            for (int j = 1; j <= i; j++) { // Print * for each value of i
                System.out.print("*");
            }
            System.out.println(); // Move to next line after inner loop
        }
    }
}