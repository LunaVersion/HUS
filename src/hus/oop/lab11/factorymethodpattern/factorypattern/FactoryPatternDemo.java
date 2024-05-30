package hus.oop.lab11.factorymethodpattern.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.provideFruit("APPLE");
        apple.productJuice();
        Fruit banana = fruitFactory.provideFruit("BANANA");
        banana.productJuice();
        Fruit orange = fruitFactory.provideFruit("ORANGE");
        orange.productJuice();
    }
}
