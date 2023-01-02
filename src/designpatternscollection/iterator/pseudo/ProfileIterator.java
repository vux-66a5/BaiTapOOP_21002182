package designpatternscollection.iterator.pseudo;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}