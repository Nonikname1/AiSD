package samples;

public class LinkNode<T> {
    private T value;
    private LinkNode<T> next;

    public LinkNode(T value) {
        this.value = value;
    }
    /*
     * getters
     * setters
     *  */

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LinkNode<T> getNext() {
        return next;
    }

    public void setNext(LinkNode<T> next) {
        this.next = next;
    }
}
