package task6;

public class FixedQueue<E> implements Queue<E>{
    private Object[] queue;
    private int size;
    private int head;
    private int tail;

    public FixedQueue(int size){
        if (size <= 0){
            System.out.println("Nein");
        }
        queue = new Object[size];
        this.size = 0;
        head = 0;
        tail = -1;

    }
    @Override
    public int size() {
        return size;
    }

    @Override
     public E pool() {
        if (size == 0){
            return null;
        }
        E elem = (E) queue[head];
        head = (head + 1) % queue.length;
        size--;
        return elem;
    }

    @Override
    public E peek() {
        if (size == 0){
            return null;
        }
        return (E) queue[head];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(E elem) {
        if (size == queue.length){
            return false;
        }
        tail = (tail + 1) % queue.length;
        queue[tail] = elem;
        size++;
        return true;
    }
}
