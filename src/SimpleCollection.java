import java.util.Collection;

public interface SimpleCollection<T> {
        int size();

        boolean isEmpty();

        boolean contains(T o);

        void print();

        //T[] toArray(); // optional

        boolean add(T t);

        boolean more(T t);

        boolean remove(T o);

        boolean addAll(Collection<T> c); // optional

        boolean removeAll(Collection<T> c); // optional

        void clear();
    }

