package lab13.designpatterns.iterator.pseudocode;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}