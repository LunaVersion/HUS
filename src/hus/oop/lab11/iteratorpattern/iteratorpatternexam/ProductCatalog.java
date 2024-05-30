package hus.oop.lab11.iteratorpattern.iteratorpatternexam;

public class ProductCatalog implements Iterable{
    private String[] catalog;
    private int length;

    public ProductCatalog() {
        this.catalog = new String[100];
        this.length = 0;
    }

    public String getProduct(int index) {
        return catalog[index];
    }

    public int getLength() {
        return length;
    }


    public void setLength(int length) {
        this.length = length;
    }

    public String[] getCatalog() {
        return catalog;
    }

    public void setCatalog(String[] catalog) {
        this.catalog = catalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this);
    }
    public void addProduct(String product) {
        this.catalog[length] = product;
        this.length++;
    }

    public void print() {
        System.out.print("ProductCatalog:");
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(catalog[i]);

            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
