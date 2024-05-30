package hus.oop.lab6.SuperClassAnimal;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Mun");
        dog.greets();
        System.out.println(dog.toString());

        Animal animal = new Animal("Dog");
        System.out.println(animal.toString());

        Mammal mammal = new Mammal("Mammal");
        mammal.toString();

        Cat cat = new Cat("Luna");
        cat.greets();
        System.out.println(cat.toString());

    }
}
