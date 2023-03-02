package lab01.tdd.step2;

import base.CircularListBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CircularListWithIteratorsTest extends CircularListBase<CircularListWithIterators> {


    @BeforeEach
    void setUp() {
        this.setCircularEmptyList(new CircularListWithIteratorsImpl());
        this.setCircularListWithElements(new CircularListWithIteratorsImpl(List.of(1,2,3,4)));
    }

    @Test
    public void testForwardIterator() {
        final Iterator<?> forwardIterator = this.getCircularListWithElements().forwardIterator();
        final int size = this.getCircularListWithElements().size();
        for (int i = 1; i < size; i++) {
            testIterator(forwardIterator, i + 1);
        }
        testIterator(forwardIterator, 1);
    }


    private void testIterator(Iterator<?> iterator, int value) {
        assertTrue(iterator.hasNext());
        assertEquals(value, iterator.next());
    }
}