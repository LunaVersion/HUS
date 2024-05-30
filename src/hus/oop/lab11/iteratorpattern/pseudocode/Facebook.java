package hus.oop.lab11.iteratorpattern.pseudocode;

public class Facebook implements SocialNetwork{
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");    }

    public Profile[] socialGraphRequest(String profileId, String type) {
        return null;
    }
}
