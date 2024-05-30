package hus.oop.lab11.abstractfactorypattern.usingobserverpattern;

public class RoundedRectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle:draw() method.");
    }
}
