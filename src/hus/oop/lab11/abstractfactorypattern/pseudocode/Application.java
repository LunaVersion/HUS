package hus.oop.lab11.abstractfactorypattern.pseudocode;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }
    public void createUI() {
        this.button = factory.createButton();
    }
    public void paint(){
        button.paint();
    }
}
