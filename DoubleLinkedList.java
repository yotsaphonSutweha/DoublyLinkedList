public class DoubleLinkedList {
    public static void main(String args[]){
        DLList dList = new DLList();

//        System.out.println(list.isEmpty());
//
//        list.addFirst(1, "a");
//
//        System.out.println(list.size());
//
//        System.out.println(list.get(1));
//
//        dList.addLast(2, "b");
//        dList.addLast(3, "c");
//        dList.addLast(4, "d");
//        dList.addLast(5, "e");
//
//        System.out.println(dList.size() +"\n");
//
//        list.addGivenIndex(2,"p");
//
//        System.out.println(dList.size() + "\n");
//
//        dList.printList();
//
//        dList.remove(1);
//        System.out.println("\n");
//
//        dList.printList();
//
//        System.out.println(dList.size() + "\n");
//
//
//        dList.remove(1);
//        dList.printList();
//        System.out.println(dList.size() + "\n");
//
//        dList.remove(4);
//        dList.printList();
//        System.out.println(dList.size() + "\n");
//
//        dList.remove(2);
//        dList.printList();
//        System.out.println(dList.size() + "\n");
//
//        System.out.println(dList.get(1) + "\n");
//
//        dList.printList();


        dList.addFirst(1, "a");
        dList.addLast(2, "b");
        dList.addLast(3, "c");
        dList.addLast(4, "d");
        dList.addLast(5, "e");

//        list.printList();

        dList.addBeforeIndex(5, "Y");
        dList.addAfterIndex(1,"L");
        dList.addAfterIndex(8,"T");
//        System.out.println("\n");

        dList.printList();

        dList.addBeforeValue("O", "Y");
        System.out.println("\n");
        dList.printList();
    }
}
