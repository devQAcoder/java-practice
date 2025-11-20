package OOPs.Polymorphism;

public class DynamicOrRuntime {

    void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends DynamicOrRuntime {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends DynamicOrRuntime {
    void makeSound() {
        System.out.println("Meow");
    }


public static void main(String[] args) {


    DynamicOrRuntime parentClass = new DynamicOrRuntime();
    DynamicOrRuntime myDog = new Dog();
    DynamicOrRuntime myCat = new Cat();

    myDog.makeSound(); // Bark
    myCat.makeSound(); // Meow
    parentClass.makeSound(); // Some generic sound

    }
}
