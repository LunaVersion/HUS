package hus.oop.lab6.SuperClassAnimal;

public class Mammal extends Animal{
    public Mammal(String name){
        super(name);
    }
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
