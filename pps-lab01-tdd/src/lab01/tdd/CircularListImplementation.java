package lab01.tdd;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class CircularListImplementation implements CircularList {


    private final List<Integer> innerList;

    public CircularListImplementation() {
        this.innerList = new LinkedList<>();
    }

    @Override
    public void add(int element) {
        this.innerList.add(element);
    }

    @Override
    public int size() {
        return this.innerList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.innerList.isEmpty();
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
