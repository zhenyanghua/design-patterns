import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

// Stack
public class FixedStack<T> {
    private int maxSize;
    private Deque<T> deque;

    public FixedStack(final int maxSize) {
        this.maxSize = maxSize;
        this.deque = new ArrayDeque<>();
    }

    public int size() {
        return this.deque.size();
    }

    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    public T pop() {
        T o = this.deque.peekLast();

        if (o != null) {
            this.deque.remove(o);
        }

        return o;
    }

    public boolean contains(final Object o) {
        return this.deque.contains(o);
    }

    public Iterator<T> iterator() {
        return this.deque.iterator();
    }

    public boolean add(final T t) {
        if (this.deque.size() == maxSize) {
            this.deque.removeFirst();
        }
        return this.deque.add(t);
    }

    public boolean remove(final Object o) {
        return this.deque.remove(o);
    }

    public void clear() {
        this.deque.clear();
    }

    public Spliterator<T> spliterator() {
        return this.deque.spliterator();
    }

    public Stream<T> stream() {
        return this.deque.stream();
    }

}
