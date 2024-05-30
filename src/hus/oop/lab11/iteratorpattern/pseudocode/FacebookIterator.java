package hus.oop.lab11.iteratorpattern.pseudocode;

import java.util.Arrays;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String profileId, type;
    private int currentPosition;
    private Profile[] cache = new Profile[currentPosition];

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit(){
        if (cache == null){
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    @Override
    public Profile getNext() {
        if(hasMore()){
            currentPosition++ ;
        }
        return cache[currentPosition];
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }

    @Override
    public String toString() {
        return "FacebookIterator{" +
                "facebook=" + facebook +
                ", profileId='" + profileId + '\'' +
                ", type='" + type + '\'' +
                ", currentPosition=" + currentPosition +
                ", cache=" + Arrays.toString(cache) +
                '}';
    }
}
