package lab01.tdd.step2;

import lab01.tdd.step1.CircularList;

import java.util.Iterator;

public interface CircularListWithIterators extends CircularList {

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
