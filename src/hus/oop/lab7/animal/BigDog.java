package hus.oop.lab7.animal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}
