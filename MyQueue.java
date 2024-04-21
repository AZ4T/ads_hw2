import java.util.NoSuchElementException;

public class MyQueue<T extends Comparable<T>> {
    private final MyLinkedList<T> queue;

    public MyQueue() {
        queue = new MyLinkedList<>();
    }

    public boolean IsEmpty() {
        return queue.size == 0;
    }

    public int size() {
        return queue.size();
    }
}
