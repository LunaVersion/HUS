package hus.oop.lab11.factorymethodpattern.pseudocode;

public class Application {
    private Dialog dialog;
    public void initialize() throws Exception {
        String config = System.getProperty("os.name");
        if (config.contains("Windows")) {
            dialog = new WindowsDialog();
        } else if (config.contains("Web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("Error! Unknown operating system.");
        }
    }

    public void main(String[] args) throws Exception{
        this.initialize();
        dialog.render();
    }
}
