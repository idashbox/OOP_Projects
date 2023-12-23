package task6;

public interface Queue <E>{
    int size();
    E pool();
    E peek();
    boolean isEmpty();
    boolean add(E e);
}
