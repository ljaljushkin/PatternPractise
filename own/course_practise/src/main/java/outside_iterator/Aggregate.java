package outside_iterator;

import java.util.Iterator;

public class Aggregate implements Iterable {

    private int[] list;

    public int[] getList() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    public Iterator createIterator() {
        return new MyIterator(this);
    }
}
