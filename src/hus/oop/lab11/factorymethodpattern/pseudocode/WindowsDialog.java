package hus.oop.lab11.factorymethodpattern.pseudocode;

public class WindowsDialog extends Dialog{
    public Button createButton(){
        return new WindowsButton();
    }
}
