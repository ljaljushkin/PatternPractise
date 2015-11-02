package outside_iterator;

import java.util.Iterator;

public class MyIterator implements Iterator {

    int index = -1;
    private Aggregate owner = null;

    public MyIterator(Aggregate owner) {
        this.owner = owner;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return index++;
    }

    @Override
    public void remove() {

    }

    public boolean isDone() {
        return index >= owner.getList().length;
    }

    public int current() {
        return owner.list[index];
    }

    public void reset() {
        index = -1;
    }
}
