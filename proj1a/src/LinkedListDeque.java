import java.util.List;

public class LinkedListDeque<T> implements Deque<T> {
    public class Node {
        public int item;
        public Node next;
        public Node before;
        public Node(int i, Node n, Node b) {
            item = i;
            next = n;
            before = b;
        }
    }
    @Override
    public void addFirst(T x) {

    }

    @Override
    public void addLast(T x) {

    }

    @Override
    public List<T> toList() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
    public LinkedListDeque() {
        
    }
}
