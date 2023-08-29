public class SinglyLinkedList<E> {

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {

            element = e;
            next = n;
        }

        puplic E getElement(){
            return element;
        }

        public Node<E> getNext(){
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList(){}
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0 ;
    }
    public E first(){
        if(isEmpty()) return null;
        return head.getElement;
    }
    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }
    

}