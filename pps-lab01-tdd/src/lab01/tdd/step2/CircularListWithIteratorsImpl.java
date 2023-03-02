package lab01.tdd.step2;

import lab01.tdd.CircularListImpl;

import java.util.*;

public class CircularListWithIteratorsImpl implements CircularListWithIterators {


    private List<Integer> innerList;

    public CircularListWithIteratorsImpl(List<Integer> list) {
        this.innerList = new LinkedList<>(list);
    }

    public CircularListWithIteratorsImpl() {
        this(List.of());
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
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<Integer> previous() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Integer> forwardIterator() {

        return new Iterator<>() {

            int index = 0;

            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Integer next() {
                if(CircularListWithIteratorsImpl.this.isEmpty()) {
                    throw new NoSuchElementException();
                }
                this.index = this.index == CircularListWithIteratorsImpl.this.size() - 1 ? 0 : this.index + 1;
                return CircularListWithIteratorsImpl.this.innerList.get(index);
            }
        };
    }

    @Override
    public Iterator backwardIterator() {
        return null;
    }
}
