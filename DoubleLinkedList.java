public class DoubleLinkedList {
    public static void main(String args[]){
        DLList list = new DLList();

        System.out.println(list.isEmpty());

        list.add(1, "a");

        System.out.println(list.size());

        System.out.println(list.get(1));

        list.add(2, "b");
        list.add(3, "c");
        list.add(4, "d");
        list.add(5, "e");

        System.out.println(list.size());

        list.add(2,"p");

        System.out.println(list.size());

        list.printList();

        list.remove(1);

        list.printList();
        System.out.println(list.size());

        list.remove(1);
        list.printList();
        System.out.println(list.size());

        list.remove(4);
        list.printList();
        System.out.println(list.size());

        list.remove(2);
        list.printList();
        System.out.println(list.size());

        System.out.println(list.get(1));


    }
}
