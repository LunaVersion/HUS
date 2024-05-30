package hus.oop.lab7.animal;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Luna");
        animal1.greets();

        Cat LUNA = (Cat) animal1;
        LUNA.greets();

        Animal animal2 = new Dog("MiniK");
        Dog miniK = (Dog) animal2;
        Dog anotherDog = new Dog("Mic");
        miniK.greets();
        miniK.greets(anotherDog);

        Animal animal3 = new BigDog("Bong");

        Dog bigDog = new BigDog("Dog");
        bigDog.greets();
        bigDog.greets(anotherDog);
    }
}
