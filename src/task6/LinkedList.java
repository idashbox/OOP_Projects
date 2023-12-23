package task6;

public class LinkedList<E> implements List<E> {
    private Node<E> head;
    private int size;
    private static class Node<E>{
        E value;
        Node<E> next;
        public Node(E value){
            this.value = value;
            this.next = null;
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean add(E elem) {
        Node<E> newNode = new Node(elem);
        if (head == null){
            head =newNode;
        }else{
            Node<E> curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
        return true;
    }


    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public void set(int index, E elem) {
        if (index < 0 || index >= size){
            System.out.println("Nein");
        }else{
            Node<E> curr = head;
            for (int i = 0; i < index; i++){
                curr = curr.next;
            }
            curr.value = elem;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size){
            System.out.println("Nein");
            return null;
        }else{
            Node<E> curr = head;
            for (int i = 0; i < index; i++){
                curr = curr.next;
            }
            return curr.value;
        }
    }
}
