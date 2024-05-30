package hus.oop.lab6.SuperClassAnimal;

public class Dog extends Mammal {
    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Gau Gau");
    }
    public String toString(){
        return "Dog[ + " + super.toString() + "]";
    }
}
