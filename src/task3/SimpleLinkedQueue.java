package task3;

import task2.SimpleLinkedList;

public class SimpleLinkedQueue<T> extends SimpleLinkedList<T> implements SimpleQueue<T>{
    @Override
    public void add(T value) {
        addLast(value);
    }

    @Override
    public T remove() throws Exception {
        return removeFirst();
    }

    @Override
    public T element() throws Exception {
        return getFirst();
    }
}
