package hus.oop.lab11.abstractfactorypattern.usingobserverpattern;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
