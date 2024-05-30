package hus.oop.lab11.abstractfactorypattern.usingabstractfactory;

public class Demo {
    public static void main(String[] args) {
        Computer newPC = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", ""));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
        System.out.println("AbstractFactory PC Config:"+newPC);
        System.out.println("AbstractFactory Server Config:"+server);
    }
}
