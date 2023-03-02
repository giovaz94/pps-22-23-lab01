package lab01.tdd.step3;

import base.CircularListBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FilterableCircularListTest extends CircularListBase<FilterableCircularList> {


    @BeforeEach
    public void beforeEach() {
        this.setCircularEmptyList(new FilterableCircularListImpl());
        this.setCircularListWithElements(new FilterableCircularListImpl(List.of(1,2,3,4,5)));
    }

    @Test
    public void testSuccessfulFilter() {
        final FilterableCircularList list = fillList(20);
        Optional<?> foundElement = list.filteredNext(element -> element > 10);
        assertFalse(foundElement.isEmpty());
        assertEquals(11, foundElement.get());
    }


    @Test
    public void testMultipleSuccessfulFilter() {
        final FilterableCircularList list = fillList(20);
        list.filteredNext(element -> element > 10);
        list.filteredNext(element -> element > 10);
        Optional<?> foundElement = list.filteredNext(element -> element > 10);
        assertFalse(foundElement.isEmpty());
        assertEquals(13, foundElement.get());
    }

    @Test
    public void testUnsucessfulFilter() {
        final FilterableCircularList list = fillList(20);
        Optional<?> foundElement = list.filteredNext(element -> element > 100);
        assertTrue(foundElement.isEmpty());
    }


    @Test
    public void testEmptyListFilter() {
        assertTrue(this.getCircularEmptyList().filteredNext(element -> element < 2).isEmpty());
    }


    private FilterableCircularList fillList(final int numberOfElements) {
        final FilterableCircularList list = this.getCircularEmptyList();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        return list;
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