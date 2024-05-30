package hus.oop.lab7.animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
}
