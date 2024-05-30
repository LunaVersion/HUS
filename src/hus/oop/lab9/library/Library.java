package hus.oop.lab9.library;

public class Library {
    private final Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longest = rents[0];
        for (int i = 1; i < rents.length - 1; i++) {
            if ((rents[i].getEnd().getTime() - rents[i].getBegin().getTime())
                    > (longest.getEnd().getTime() - longest.getBegin().getTime())) {
                longest = rents[i];
            }
        }
        return longest;
    }
}
