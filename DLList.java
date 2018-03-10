public class DLList implements LinearList {
    private DlNode head;
    private DlNode last;
    private DlNode current;
    private int size;

    public DLList(){
        head = null;
        last = null;
        current = head;
        size = 0;
    }

    private void setCurrent(int index){
        current = head;
        for(int i=1;i<index;i++){
            current = current.getNext();
        }

    }

    @Override
    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if(size > 0){
            setCurrent(index);

            if(current == head){
                head = current.getNext();
                head.setPrev(null);
            }else if(current == last){
                last = current.getPrev();
                last.setNext(null);
            }else{
                DlNode prevNode = current.getPrev();
                DlNode nextNode = current.getNext();
                current = nextNode;
                nextNode.setPrev(prevNode);
                prevNode.setNext(nextNode);
            }

            current = null;
            size--;
        }
    }

    @Override
    public void add(int index, Object theNode) {
        // add a node in an empty list
        if(size == 0){

            DlNode newNode = new DlNode(null, null, theNode);

            newNode.setPrev(null);
            newNode.setNext(null);
            head = newNode;
            last = newNode;
            size++;
        }
        else {

            if(index == 1){
                // add a node at the head
                DlNode newNode = new DlNode(null, null, theNode);

                newNode.setNext(head);
                newNode.setPrev(null);
                head.setPrev(newNode);
                head = newNode;
                size++;
            }else if(index == (size+1)){
                // add a node at the end
                DlNode newNode = new DlNode(null, null, theNode);

                newNode.setNext(null);
                newNode.setPrev(last);
                last.setNext(newNode);
                last = newNode;
                size++;
            }else{
                // add in the middle of the list
                DlNode newNode = new DlNode(null,null,theNode);

                setCurrent(index);
                newNode.setNext(current);

                DlNode prevNode = current.getPrev();
                newNode.setPrev(prevNode);
                current.setPrev(newNode);
                prevNode.setNext(newNode);
                current = newNode;
                size++;

            }
        }
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return current.getElement().toString();
    }

    @Override
    public void printList() {
        current = head;
        System.out.println(current.getElement().toString());
        for(int i=1;i<size;i++){
            current = current.getNext();
            System.out.println(current.getElement().toString());
        }
    }
}
