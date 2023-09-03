public class main {

    public static void main(String[] args){

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
        myList.addFirst(10);
        myList.addLast(30);
        myList.addFirst(5);
        myList.addLast(40);
        myList.removeLast();
       // myList.deleteMiddile(10);
        // myList.InsertMiddle(3);
       
        
        myList.print();
        System.out.println(myList.first());
        System.out.println(myList.last());
       //System.out.println(myList)


    }
}


