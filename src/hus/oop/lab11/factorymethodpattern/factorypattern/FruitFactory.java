package hus.oop.lab11.factorymethodpattern.factorypattern;

public class FruitFactory {
    public Fruit provideFruit(String type){
        if(type==null){
            return null;
        }else if(type.equalsIgnoreCase("APPLE")){
            return new Apple();
        }else if(type.equalsIgnoreCase("BANANA")){
            return new Banana();
        }else if(type.equalsIgnoreCase("ORANGE")){
            return new Orange();
        }
        return null;
    }
}
