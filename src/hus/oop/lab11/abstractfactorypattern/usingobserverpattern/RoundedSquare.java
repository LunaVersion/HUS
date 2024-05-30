package hus.oop.lab11.abstractfactorypattern.usingobserverpattern;

public class RoundedSquare implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare:draw() method.");
    }
}
