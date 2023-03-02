package lab01.tdd.step1;

import base.CircularListBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest extends CircularListBase<CircularList> {

    @BeforeEach
    public void beforeEach() {
        this.setCircularEmptyList(new CircularListImpl());
        this.setCircularListWithElements(new CircularListImpl(List.of(1,2,3,4,5)));
    }

    @Test
    public void testNextElementInEmptyList() {
        assertTrue(this.getCircularEmptyList().next().isEmpty());
    }

    @Test
    public void testNextElement() {
        for(int i = 1; i < this.getCircularListWithElements().size(); i++) {
            checkElement(this.getCircularListWithElements().next(), i + 1);
        }
        checkElement(this.getCircularListWithElements().next(), 1);
    }

    @Test
    public void testPreviousElementInEmptyList() {
        assertTrue(this.getCircularEmptyList().previous().isEmpty());
    }

    @Test
    public void testPreviousElement() {
        for (int i = 0; i < this.getCircularListWithElements().size(); i++) {
            checkElement(this.getCircularListWithElements().previous(),this.getCircularListWithElements().size() - i);
        }
    }

    @Test
    public void testReset() {
        for (int i = 0; i < 3; i++) {
            this.getCircularListWithElements().next();
        }
        this.getCircularListWithElements().reset();
        checkElement(this.getCircularListWithElements().next(), 2);
        checkElement(this.getCircularListWithElements().previous(), 1);
    }

    private void checkElement(final Optional<Integer> element, final int valueToCheck) {
        assertFalse(element.isEmpty());
        assertEquals(valueToCheck, element.get());
    }
}
