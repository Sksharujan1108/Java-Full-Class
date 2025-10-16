class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
public class Test {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog();

        // Call the bark method from the Dog class
        dog.bark();
        
        // Call the eat method from the Animal class
        dog.eat();
    }
}