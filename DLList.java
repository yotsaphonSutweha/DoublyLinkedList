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

    private void setCurrentByValue(Object value){
        current = head;
        for(int i=1;i<size;i++){
            if(!current.getElement().toString().equals(value.toString())){
                current = current.getNext();
            }else{
                break;
            }
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
    public void addFirst(int index, Object theNode) {
        if(size == 0){
            // add a node in an empty list
            DlNode newNode = new DlNode(null, null, theNode);
            newNode.setPrev(null);
            newNode.setNext(null);
            head = newNode;
            last = newNode;
            size++;
        }
        else{
            // add a node at the head
            DlNode newNode = new DlNode(null, null, theNode);
            newNode.setNext(head);
            newNode.setPrev(null);
            head.setPrev(newNode);
            head = newNode;
            size++;
        }
    }

    public void addLast(int index, Object theNode){
        if(index == (size+1)){
            // add a node at the end
            DlNode newNode = new DlNode(null, null, theNode);

            newNode.setNext(null);
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
            size++;
        }
    }

    public void addGivenIndex(int index, Object theNode){
        // add node at the given index
        setCurrent(index);
        if(index < size) {
            DlNode newNode = new DlNode(null, null, theNode);
            newNode.setNext(current);
            DlNode prevNode = current.getPrev();
            newNode.setPrev(prevNode);
            current.setPrev(newNode);
            prevNode.setNext(newNode);
            current = newNode;
            size++;
        }else{
            addLast(index,theNode);
        }
    }

    public void addBeforeIndex(int index, Object theNode){
        // add node before the given index
        if (index <= 0) {
            addFirst(index, theNode);
        }else{
            setCurrent(index);
            DlNode newNode = new DlNode(null, null, theNode);
            DlNode prevNode = current.getPrev();
            newNode.setPrev(prevNode);
            newNode.setNext(current);
            current.setPrev(newNode);
            prevNode.setNext(newNode);
            size++;
        }
    }

    @Override
    public void addBeforeValue(Object theNode, Object givenValue) {
        // add node before given value
        setCurrentByValue(givenValue);
        DlNode newNode = new DlNode(null, null, theNode);
        DlNode prevNode = current.getPrev();
        newNode.setNext(current);
        newNode.setPrev(prevNode);
        prevNode.setNext(newNode);
        current.setPrev(newNode);
        size++;

    }

    @Override
    public void addAfterIndex(int index, Object theNode) {
        // add node after the given index
        if(index > size && index < (size+2)){
            addLast(index,theNode);
        }else{
            setCurrent(index);
            DlNode newNode = new DlNode(null, null, theNode);
            DlNode nextNode = current.getNext();
            newNode.setNext(nextNode);
            newNode.setPrev(current);
            current.setNext(newNode);
            nextNode.setPrev(newNode);
            size++;
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
