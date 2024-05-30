package hus.oop.lab11.iteratorpattern.pseudocode;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message){
        while (iterator.hasMore()){
            Profile profile = iterator.getNext();
        }

    }
}
