package f.a.a.b.z;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class b<E> implements List<E> {
    public AtomicBoolean b = new AtomicBoolean(false);
    public CopyOnWriteArrayList<E> c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public E[] f1869d;

    /* renamed from: e  reason: collision with root package name */
    public final E[] f1870e;

    public b(E[] eArr) {
        this.f1870e = eArr;
    }

    public void add(int i2, E e2) {
        this.c.add(i2, e2);
        c();
    }

    public boolean add(E e2) {
        boolean add = this.c.add(e2);
        c();
        return add;
    }

    public boolean addAll(int i2, Collection<? extends E> collection) {
        boolean addAll = this.c.addAll(i2, collection);
        c();
        return addAll;
    }

    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll = this.c.addAll(collection);
        c();
        return addAll;
    }

    public final void c() {
        this.b.set(false);
    }

    public void clear() {
        this.c.clear();
        c();
    }

    public boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.c.containsAll(collection);
    }

    public final void e() {
        if (!this.b.get()) {
            this.f1869d = this.c.toArray(this.f1870e);
            this.b.set(true);
        }
    }

    public E get(int i2) {
        e();
        return this.f1869d[i2];
    }

    public int indexOf(Object obj) {
        return this.c.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.c.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.c.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.c.listIterator();
    }

    public ListIterator<E> listIterator(int i2) {
        return this.c.listIterator(i2);
    }

    public E remove(int i2) {
        E remove = this.c.remove(i2);
        c();
        return remove;
    }

    public boolean remove(Object obj) {
        boolean remove = this.c.remove(obj);
        c();
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.c.removeAll(collection);
        c();
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.c.retainAll(collection);
        c();
        return retainAll;
    }

    public E set(int i2, E e2) {
        E e3 = this.c.set(i2, e2);
        c();
        return e3;
    }

    public int size() {
        return this.c.size();
    }

    public List<E> subList(int i2, int i3) {
        return this.c.subList(i2, i3);
    }

    public Object[] toArray() {
        e();
        return this.f1869d;
    }

    public <T> T[] toArray(T[] tArr) {
        e();
        return this.f1869d;
    }
}
