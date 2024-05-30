package hus.oop.lab11.abstractfactorypattern.pseudocode;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WinButton();
    }
    @Override
    public Checkbox createCheckbox(){
        return new WinCheckbox();
    }
}
