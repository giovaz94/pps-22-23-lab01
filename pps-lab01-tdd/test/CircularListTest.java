import lab01.tdd.CircularList;
import lab01.tdd.CircularListImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {


    public static final int NUMBER_OF_ELEMENTS = 20;
    private CircularList circularList;

    @BeforeEach
    public void beforeEach() {
        this.circularList = new CircularListImplementation();
    }

    @Test
    public void testInitialState() {
        assertEquals(0, this.circularList.size());
        assertTrue(this.circularList.isEmpty());
        assertTrue(this.circularList.next().isEmpty());
        assertTrue(this.circularList.previous().isEmpty());
    }



    @Test
    public void testAddElement() {
        this.circularList.add(1);

        assertEquals(1, this.circularList.size());
        assertFalse(this.circularList.isEmpty());
    }

    @Test
    public void testSize() {
        this.circularList.add(1);
        assertEquals(1, this.circularList.size());
        this.circularList.add(1);
        assertEquals(2, this.circularList.size());
        for(int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            this.circularList.add(i);
        }
        assertEquals(22, this.circularList.size());
    }


    @Disabled
    @Test public void testTodo(){
        fail();
    }

}
