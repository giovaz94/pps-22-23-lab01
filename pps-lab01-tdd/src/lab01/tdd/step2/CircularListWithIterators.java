package lab01.tdd.step2;

import java.util.Iterator;

public interface CircularListWithIterators {

    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * Provides the current size of the list
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Create an Iterator which yields next elements, circularly
     * @return a new java.util.Iterator
     */
    Iterator forwardIterator();

    /**
     * Create an Iterator which yields previous elements, circularly
     * @return a new java.util.Iterator,
     */
    Iterator backwardIterator();

}
