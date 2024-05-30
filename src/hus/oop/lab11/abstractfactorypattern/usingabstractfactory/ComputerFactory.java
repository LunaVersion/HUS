package hus.oop.lab11.abstractfactorypattern.usingabstractfactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
