public class DlNode {
    private DlNode next;
    private DlNode prev;
    private Object element;

    public DlNode(DlNode next, DlNode prev, Object element){
        this.next = next;
        this.prev = prev;
        this.element = element;
    }

    public DlNode getNext() {
        return next;
    }

    public void setNext(DlNode next) {
        this.next = next;
    }

    public DlNode getPrev() {
        return prev;
    }

    public void setPrev(DlNode prev) {
        this.prev = prev;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
}
