public class SinglyLinkedList<E extends Comparable<E>>{

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {

            element = e;
            next = n;
        }

        public E getElement(){
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
        return (E)head.getElement();
    }
    public E last(){
        if(isEmpty()) return null;
        return (E)tail.getElement();
    }

    //////////////////////////////////
    public void addFirst(E e){
        head = new Node<>(e, head);
        if (size == 0){
            tail = head;
           
        }
         size ++;

    }

    /*public void InsertMiddle( E e){

        Node<E> newest = new Node<>(e,null);
        if(isEmpty()){
            head = newest;
        }else if(newest.getElement().compareTo( head.getElement()) < 0 ){
            addFirst(e);
        }else{
            Node<E> c = head;
            while(c != null){
                if(newest.getElement().compareTo( c.getNext().getElement()) > 0){
                    c = c.getNext();
                    
                    

                }
                 

            }
             newest.setNext(c.getNext());
             c.setNext(newest);
             size++;
        }

       

    }*/

    public void print() {
        Node<E> c = head;
        while (c != null) {
            System.out.print(c.getElement() + " ");
            c = c.getNext();
        }
        System.out.println();
    }
    
    public void addLast(E e){
        Node<E> newest = new Node<>(e,null);
        if(isEmpty()){
            head = newest;
        }else{
            tail.setNext(newest);
            tail = newest;
            
        }
        size++;

    }

    public E removeFirst(){
        if(isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size --;
        if(size == 0){
         tail = null;
        }
        return answer;
    }
    public void removeLast() {
        if (isEmpty()) {
            return;
        } else if (head.getNext() == null) {
            head = null;
            tail = null;
        } else {
            Node<E> c = head;
            while (c.getNext().getNext() != null) {
                c = c.getNext();
            }
            c.setNext(null);
            tail = c;
        }
        size--;
    }

     public void deleteMiddile(E key){

        if( head == null){
            return;
        }
        Node<E> temp = null;
        
        if(head.getElement() == key){
            temp = head;
            head = head.getNext();
            temp = null;
           
        }
        else{
             Node<E> c = head;
            while(c.getNext().getElement()!= key){
                c = c.getNext();
            }
             
            if(c.getNext() != null){
                temp = c.getNext();
                c.setNext(temp.getNext());
            }
        }

    }


}