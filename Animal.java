public interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow
        myCow.makeSound(); // Outputs: Moo
    }
}
