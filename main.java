public class main {

    public static void main(String[] args){

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<>();
        myList.addFirst(10);
        myList.addLast(30);
        myList.addLast(40);
        myList.removeLast();
        //myList.InsertMiddle(20);
        
        myList.printList();
       //System.out.println(myList)


    }
}


