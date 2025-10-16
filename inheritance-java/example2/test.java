class dad {
    int money = 1000;
}

class son extends dad {

}

public class test {

    public static void main(String[] args) {
        // Create an object of the son class
        son s = new son();
        
        System.out.println("Money: " + s.money);

    }

}