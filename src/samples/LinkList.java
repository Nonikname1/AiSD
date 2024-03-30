package samples;

public class LinkList<T> {
    private LinkNode<T> root;

    public LinkList(LinkNode<T> root) {
        this.root = root;
    }

    /**
     * Äîáàâèòü ýëåìåíò â êîíåö ñïèñêà
     *
     * @param el ýëåìåíò
     */
    public void add(LinkNode<T> el) {
    }

    /**
     * Ïîëó÷èòü ðàçìåð ñïèñêà
     *
     * @return ðàçìåð ñïèñêà
     */
    public int size() {
        int n = 0;
        LinkNode<T> current = root;
        while (current != null) {
            current = current.getNext();
            n++;
        }
        return n;
    }

    /**
     * Ïîëó÷èòü ýëåìåíò ïî èíäåêñó
     *
     * @param ind èíäåêñ ýëåìåíòà
     * @return ýëåìåíò ñïèñêà
     */
    public LinkNode<T> get(int ind) {
        return null;
    }

    /**
     * Óäàëèòü ýëåìåíò ïî èíäåêñó
     *
     * @param ind èíäåêñ
     */
    public void remove(int ind) {
        Utils.checkCorrectIndex(ind, size());
        LinkNode<T> current = root;
        LinkNode<T> prev = null;
        int currentPosition = 0;

        // èñêîìûé ýëåìåíò
        while (currentPosition != ind) {
            prev = current;
            if (current.getNext() != null) {
                current = current.getNext();
            } else {
                throw new IllegalArgumentException();
            }
            currentPosition++;
        }

        if (prev == null) {
            // èçìåíèòü êîðåíü
            root = current.getNext();
        } else {
            prev.setNext(current.getNext());
        }
    }
}
