package hus.oop.lab11.iteratorpattern.pseudocode;

public class PseudocodeDemo {
    public static void main(String[] args) {
        Facebook newFacebook = new Facebook();
        FacebookIterator facebook = new FacebookIterator(newFacebook,"huongle9894","friends");
        newFacebook.createFriendsIterator("MiniK");
        System.out.println(facebook);
    }
}
