package lab01.tdd.step3;

import lab01.tdd.CircularListImpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FilterableCircularListImpl implements FilterableCircularList {

    private final List<Integer> innerList;

    private int index;

    public FilterableCircularListImpl (List<Integer> list) {
        this.innerList = new LinkedList<>(list);
        this.index = 0;
    }

    public FilterableCircularListImpl () {
        this(List.of());
    }


    @Override
    public Optional<Integer> filteredNext(Predicate<Integer> condition) {
        return Optional.empty();
    }

    @Override
    public void add(int element) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Optional<Integer> next() {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> previous() {
        return Optional.empty();
    }

    @Override
    public void reset() {

    }
}
