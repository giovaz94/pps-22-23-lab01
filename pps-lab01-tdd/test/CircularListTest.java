import lab01.tdd.CircularList;
import lab01.tdd.CircularListImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {


    public static final int NUMBER_OF_ELEMENTS = 20;
    private CircularList circularEmptyList;
    private CircularList circularListWithElements;

    @BeforeEach
    public void beforeEach() {
        this.circularEmptyList = new CircularListImplementation();
        this.circularListWithElements = new CircularListImplementation(new LinkedList<>(List.of(1,2,3,4,5)));
    }

    @Test
    public void testInitialState() {
        assertEquals(0, this.circularEmptyList.size());
        assertTrue(this.circularEmptyList.isEmpty());
    }

    @Test
    public void testAddElement() {
        this.circularEmptyList.add(1);
        assertEquals(1, this.circularEmptyList.size());
        assertFalse(this.circularEmptyList.isEmpty());
    }

    @Test
    public void testSize() {
        this.circularEmptyList.add(1);
        assertEquals(1, this.circularEmptyList.size());
        this.circularEmptyList.add(1);
        assertEquals(2, this.circularEmptyList.size());
        for(int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            this.circularEmptyList.add(i);
        }
        assertEquals(22, this.circularEmptyList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(this.circularEmptyList.isEmpty());
        assertFalse(this.circularListWithElements.isEmpty());
    }

    @Test
    public void testNextElementInEmptyList() {
        assertTrue(this.circularEmptyList.next().isEmpty());
    }

    @Test
    public void testNextElement() {
        for(int i = 1; i < this.circularListWithElements.size(); i++) {
            checkNextElement(this.circularListWithElements.next(), i + 1);
        }
        checkNextElement(this.circularListWithElements.next(), 1);
    }

    private void checkNextElement(final Optional<Integer> nextElement, final int valueToCheck) {
        assertFalse(nextElement.isEmpty());
        assertEquals(valueToCheck, nextElement.get());
    }

    @Test
    public void testPreviousElementInEmptyList() {
        assertTrue(this.circularEmptyList.previous().isEmpty());
    }
}
