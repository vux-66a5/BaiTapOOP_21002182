package lab08.comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie1> {
    public int compare(Movie1 left, Movie1 right) {
        return left.getName().compareTo(right.getName());
    }
}
