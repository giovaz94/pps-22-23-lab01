package lab01.tdd.step3;

import lab01.tdd.CircularList;

import java.util.Optional;
import java.util.function.Predicate;

public interface FilterableCircularList extends CircularList {
    Optional<Integer> filteredNext(Predicate<Integer> condition);
}


