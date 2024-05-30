package hus.oop.lab9.library;

public abstract class Item {
    private int year;
    private String title;

    public Item(int year, String title) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item[" + "title=" + title + '\'' +
                "year=" + year + ']';
    }
}
