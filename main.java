public class main {

    public static void main(String[] args){

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
        myList.addFirst(10);
        myList.addLast(30);
        myList.addFirst(5);
        myList.addLast(40);
        myList.addLast(50);
        myList.removeFirst();
        myList.removeLast();
        myList.deleteMiddile(30);
     ///////////////////////////////

       // myList.InsertMiddle(20);
       
        
        myList.print();
        System.out.println(myList.first());
        System.out.println(myList.last());
       //System.out.println(myList)


    }
}


