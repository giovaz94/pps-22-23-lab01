package lab01.tdd.step3;

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

        final int lastIndex = this.index;
        do {
            Optional<Integer> element = this.next();
            if(element.isPresent() && condition.test(element.get())) {
                return element;
            }
        } while (lastIndex != this.index);
        return Optional.empty();
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

    public Optional<Integer> next() {
        if(this.isEmpty()) {
            return Optional.empty();
        } else {
            this.index = this.index + 1 >= this.size() ?  0 : this.index + 1;
            return Optional.of(this.innerList.get(this.index));
        }
    }

    @Override
    public Optional<Integer> previous() {
        if(this.isEmpty()) {
            return Optional.empty();
        } else {
            this.index = this.index == 0 ? this.size() - 1 : this.index - 1;
            return Optional.of(this.innerList.get(index));
        }
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
