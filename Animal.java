class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Main { 
    public static void main(String[] args) { 
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound(); 
        d.bark();  
        c.sound(); 
        c.meow();  
    }
}