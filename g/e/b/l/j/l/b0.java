package g.e.b.l.j.l;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class b0<E> implements List<E>, RandomAccess {
    public final List<E> b;

    public b0(List<E> list) {
        this.b = Collections.unmodifiableList(list);
    }

    public void add(int i2, E e2) {
        this.b.add(i2, e2);
    }

    public boolean add(E e2) {
        return this.b.add(e2);
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        return this.b.addAll(i2, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.b.addAll(collection);
    }

    public void clear() {
        this.b.clear();
    }

    public boolean contains(Object obj) {
        return this.b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.b.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this.b.equals(obj);
    }

    public E get(int i2) {
        return this.b.get(i2);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public int indexOf(Object obj) {
        return this.b.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.b.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.b.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.b.listIterator();
    }

    public ListIterator<E> listIterator(int i2) {
        return this.b.listIterator(i2);
    }

    public E remove(int i2) {
        return this.b.remove(i2);
    }

    public boolean remove(Object obj) {
        return this.b.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.b.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.b.retainAll(collection);
    }

    public E set(int i2, E e2) {
        return this.b.set(i2, e2);
    }

    public int size() {
        return this.b.size();
    }

    public List<E> subList(int i2, int i3) {
        return this.b.subList(i2, i3);
    }

    public Object[] toArray() {
        return this.b.toArray();
    }

    public <T> T[] toArray(T[] tArr) {
        return this.b.toArray(tArr);
    }
}
