package lab08.comparator;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie1> {
    public int compare(Movie1 left, Movie1 right) {
        {
            if (left.getRating() < right.getRating()) return -1;
            if (left.getRating() > right.getRating()) return 1;
            else return 0;
        }
    }
}
