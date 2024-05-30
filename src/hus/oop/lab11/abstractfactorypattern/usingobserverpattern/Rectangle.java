package hus.oop.lab11.abstractfactorypattern.usingobserverpattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:draw() method.");
    }
}
