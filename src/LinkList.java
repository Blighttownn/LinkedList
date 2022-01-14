import java.util.Collection;

public class LinkList<T> implements SimpleCollection<T> {
    private Node head;

    public LinkList() {
        head = null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public boolean more(T data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return false;

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
    }


}

