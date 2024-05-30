package hus.oop.lab4.advancedbook;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price){
        this.name = name;
        this.authors = author;
        this.price = price;
        qty = 0;
    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book[name="+name+",\nauthor={Author[name="+authors[0].getName()+",email="+authors[0].getEmail()+",gender="+authors[0].getGender()+"],\nAuthor[name="+authors[1].getName()+",email="+authors[1].getEmail()+",gender="+authors[1].getGender()+"]}"+",\nprice="+price+",qty="+qty+"]";
    }
    public String getAuthorNames(){
        return "authorName1,authorName2";
    }
}
