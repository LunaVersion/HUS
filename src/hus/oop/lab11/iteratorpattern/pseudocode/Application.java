package hus.oop.lab11.iteratorpattern.pseudocode;

public class Application {
    SocialNetwork network;
    SocialSpammer spammer;
    public void config(){
            this.network = new Facebook();
    }
    public void sendSpamToFriends(Profile profile){
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message.");
    }
    public void sendSpamToCoworkers(Profile profile){
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message.");
    }
}
