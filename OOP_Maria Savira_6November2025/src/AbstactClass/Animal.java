package AbstactClass;

// Abstract class Animal sebagai superclass
public abstract class Animal {
    // Abstract method (harus diimplementasikan oleh subclass)
    public abstract String makeSound(String name);
}

// Subclass Dog yang meng-override method makeSound()
class Dog extends Animal {
    @Override
    public String makeSound(String name) {
        return name + " says Woof!";
    }
}

// Subclass Cat yang meng-override method makeSound()
class Cat extends Animal {
    @Override
    public String makeSound(String name) {
        return name + " says Meow!";
    }
}
