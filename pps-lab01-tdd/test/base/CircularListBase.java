package base;

import lab01.tdd.step1.CircularList;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircularListBase<T extends CircularList> {

    public static final int NUMBER_OF_ELEMENTS = 20;
    private T circularEmptyList;
    private T circularListWithElements;

    public T getCircularEmptyList() {
        return Objects.requireNonNull(circularEmptyList);
    }

    public void setCircularEmptyList(final T circularEmptyList) {
        this.circularEmptyList = Objects.requireNonNull(circularEmptyList);
    }

    public T getCircularListWithElements() {
        return Objects.requireNonNull(circularListWithElements);
    }

    public void setCircularListWithElements(final T circularListWithElements) {
        this.circularListWithElements = Objects.requireNonNull(circularListWithElements);
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
}
