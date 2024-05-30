package hus.oop.lab9.library;

public class Dvd extends Item {
    private int duration;

    public Dvd(String title, int year, int duration) {
        super(year, title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Dvd[" + super.toString() +
                "duration=" + duration +
                ']';
    }
}
