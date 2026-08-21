abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.eat();
    }
}