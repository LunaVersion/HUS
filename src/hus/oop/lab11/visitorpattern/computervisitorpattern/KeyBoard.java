package hus.oop.lab11.visitorpattern.computervisitorpattern;

public class KeyBoard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
