package hus.oop.lab11.iteratorpattern.iteratorpatternexam;

public class ProductIterator implements Iterator{

    private ProductCatalog productCatalog;
    private int currentPosition = 0;
    public ProductIterator(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < productCatalog.getLength();
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object product = productCatalog.getProduct(currentPosition);
        currentPosition++;
        return product;
    }

    @Override
    public void remove() {
        String[] newArray = new String[productCatalog.getLength() - 1];

        System.arraycopy(productCatalog.getCatalog(), 0, newArray, 0, currentPosition);
        System.arraycopy(productCatalog.getCatalog(), currentPosition + 1, newArray, currentPosition, newArray.length - currentPosition);
        productCatalog.setCatalog(newArray);
        productCatalog.setLength(productCatalog.getLength()-1);
    }
}
