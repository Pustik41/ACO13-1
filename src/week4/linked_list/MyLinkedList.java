package week4.linked_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by gorobec on 18.06.16.
 */
public class MyLinkedList implements List {
    private Node head;
    private Node tail;
    private int size;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if(head == null){
            head = tail = new Node(o);
            size++;
            return true;
        }

        Node newNode = new Node(tail, o);
        tail.setNext(newNode);
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }
//todo Exception
    @Override
    public Object get(int index) {
        if(index >= size || index < 0) {
            System.err.println("IndexOutOfBound!!!");
            return null;
        }
        Node iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.getNext();
        }

        return iter.getValue();
    }

    @Override
    public Object set(int index, Object element) {

        if(index >= size || index < 0) {
            System.err.println("IndexOutOfBound!!!");
            return null;
        }
        Node iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.getNext();
        }

        Object toReturn = iter.getValue();

        iter.setValue(element);

        return toReturn;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
