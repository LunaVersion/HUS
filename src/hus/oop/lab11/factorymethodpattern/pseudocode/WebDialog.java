package hus.oop.lab11.factorymethodpattern.pseudocode;

public class WebDialog extends Dialog{
    public Button createButton(){
        return new HTMLButton();
    }
}
