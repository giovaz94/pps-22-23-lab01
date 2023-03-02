package lab01.tdd.step3;

import base.CircularListBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterableCircularListTest extends CircularListBase<FilterableCircularList> {


    @BeforeEach
    public void beforeEach() {
        this.setCircularEmptyList(new FilterableCircularListImpl());
        this.setCircularListWithElements(new FilterableCircularListImpl(List.of(1,2,3,4,5)));
    }

}