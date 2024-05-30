package hus.oop.lab7.animal;

abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void greets();
}
