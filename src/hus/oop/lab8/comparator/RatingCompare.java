package hus.oop.lab8.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return (int) Math.round(left.getRating() - right.getRating());
    }
}
