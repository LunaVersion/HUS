package hus.oop.lab11.visitorpattern.computervisitorpattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
