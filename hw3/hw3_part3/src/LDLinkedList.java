import java.util.AbstractList;
import java.util.List;

public class LDLinkedList<E> extends AbstractList<E> implements List<E>{

    private Node<E> head =null;
    private int size = 0;
    static private LDLinkedList Removed = new LDLinkedList<>(); // Removed is a static linkedlist which stores the removed elements


    /**
     * Basic LinkedList Structure
     * @param <E>
     */
    public static class Node<E>{
        E data;
        Node next;
        Node(E item){
            data =item;
            next =null;
        }

        public Node(E item, Node<E> head) {
            data = item;
            next = head;
        }
    }

    /**
     * Add a new node to the beginning of the list
     *
     * @param item the item to be added to the list.
     */
    public void addFirst(E item) {
        head = new Node<>(item, head);
        size++;
    }
    /**
     * Add a new node after the given node
     *
     * @param node The node after which the new node is to be inserted.
     * @param item The item to be added to the list.
     */
    private void addAfter(Node<E> node, E item) {
        node.next = new Node<>(item, node.next);
        size++;
    }
    /**
     * Remove the first element from the list and return it
     *
     * @return The data that was removed.
     */
    private E removeFirst() {
        Node<E> temp = head;
        Removed.add(head.data);
        if (head != null) {
            head = head.next;
        }
        if (temp != null) {
            size--;
            return temp.data;
        } else {
            return null;
        }
    }
    /**
     * Remove the node after the given node and return the data of the removed node
     *
     * @param node The node after which the element is to be removed.
     * @return The data of the removed node.
     */
    private E removeAfter(Node<E> node) {
        Node<E> temp = node.next;
        if (temp != null) {
            node.next = temp.next;
            size--;
            Removed.add(head.data);
            return temp.data;
        } else {
            return null;
        }
    }

    /**
     * Return the node at the given index
     *
     * @param index The index of the node to be returned.
     * @return The node at the given index.
     */
    private Node<E> getNode(int index) {
        Node<E> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    /**
     * Return the data at the given index
     *
     * @param index The index of the element to retrieve.
     * @return The data field of the node at the specified index.
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        return node.data;
    }

    /**
     * Set the element at the specified index to the specified value
     *
     * @param index The index of the element to be set.
     * @param newValue The new value to be stored at the specified index.
     * @return The old value that was stored at the given index.
     */
    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Node<E> node = getNode(index);
        E result = node.data;
        node.data = newValue;
        return result;
    }

    /**
     * Add an item to the list at the specified index
     *
     * @param index The index of the item to be added.
     * @param item the item to be added
     */
    public void add(int index, E item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            addFirst(item);
        } else {
            Node<E> node = getNode(index-1);
            addAfter(node, item);
        }
    }

    /**
     * Add an item to the end of the list
     *
     * @param item The item to be added to the list.
     * @return Nothing.
     */
    public boolean add(E item) {
        add(size, item);
        return true;
    }

    /**
     * Remove the element at the specified index
     *
     * @param index The index of the element to be removed.
     * @return Nothing is being returned.
     */
    @Override
    public E remove(int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node<E> node = getNode(index-1);
            removeAfter(node);
        }
        return null;
    }


    /**
     * Return the number of elements in the list
     *
     * @return The size of the list.
     */
    @Override
    public int size() {
        return size;
    }


}
