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


    @Disabled
    @Test public void testTodo(){
        fail();
    }

}
