package task6;

public interface List <E>{
    int size();
    boolean isEmpty();
    boolean add(E elem);
    void clear();
    void set(int index, E elem);
    E get(int index);
}
