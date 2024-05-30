package hus.oop.lab11.iteratorpattern.iteratorpatternexam;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        productCatalog.addProduct("Egg");
        productCatalog.addProduct("Milk");
        productCatalog.addProduct("Pancake");
        productCatalog.addProduct("Bread");
        productCatalog.addProduct("Beef");
        productCatalog.addProduct("Pork");
        productCatalog.print();
        Iterator iterator = productCatalog.getIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println("Catalog has next product: " + iterator.hasNext());
        iterator.remove();
        System.out.println(iterator.next());
        productCatalog.print();
    }
}
