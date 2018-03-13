public interface LinearList {
    public boolean isEmpty();
    public int size();
    public Object get(int index);
    public void remove(int index);
    public void addFirst(int index, Object theElement);
    public void addLast(int index, Object theElement);
    public void addGivenIndex(int index, Object theElement);
    public void addBeforeIndex(int index, Object theElement);
    public void addAfterIndex(int index, Object theElement);
    public void addBeforeValue(Object theElement, Object givenValue);
    public void printList();
}
