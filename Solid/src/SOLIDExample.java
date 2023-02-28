interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
    }
}

class Mouse implements Animal {
    public void eat() {
    }
}

class AnimalFeeder {
    public void feed(Animal animal) {
        animal.eat();
    }
}

public class SOLIDExample {
    public static void main(String[] args) {
        AnimalFeeder feeder = new AnimalFeeder();
        Animal dog = new Dog();
        Animal mouse = new Mouse();
        feeder.feed(dog);
        feeder.feed(mouse);
    }
}