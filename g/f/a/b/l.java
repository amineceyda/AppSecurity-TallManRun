package g.f.a.b;

import g.a.a.a.a;
import g.f.a.d.i;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class l<T, ID> extends d<T, ID> implements Serializable {
    private static final long serialVersionUID = -5460708106909626233L;

    /* renamed from: i  reason: collision with root package name */
    public transient f<T> f3854i;

    public l(g<T, ID> gVar, Object obj, Object obj2, i iVar, String str, boolean z) {
        super(gVar, obj, obj2, iVar, str, z);
    }

    public boolean contains(Object obj) {
        f it = iterator();
        do {
            try {
                if (!it.hasNext()) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } while (!it.next().equals(obj));
        try {
            it.close();
        } catch (IOException unused3) {
        }
        return true;
    }

    public boolean containsAll(Collection<?> collection) {
        HashSet hashSet = new HashSet(collection);
        f it = iterator();
        while (it.hasNext()) {
            try {
                hashSet.remove(it.next());
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        boolean isEmpty = hashSet.isEmpty();
        try {
            it.close();
        } catch (IOException unused2) {
        }
        return isEmpty;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public f<T> f0(int i2) {
        try {
            g<T, ID> gVar = this.b;
            if (gVar != null) {
                f<T> V = gVar.V(e0(), i2);
                this.f3854i = V;
                return V;
            }
            throw new IllegalStateException("Internal DAO object is null.  Maybe the collection was deserialized or otherwise constructed wrongly.  Use dao.assignEmptyForeignCollection(...) or dao.getEmptyForeignCollection(...) instead");
        } catch (SQLException e2) {
            StringBuilder i3 = a.i("Could not build lazy iterator for ");
            i3.append(this.b.a());
            throw new IllegalStateException(i3.toString(), e2);
        }
    }

    public f<T> g() {
        return f0(-1);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        f it = iterator();
        try {
            boolean z = !it.hasNext();
            try {
                it.close();
            } catch (IOException unused) {
            }
            return z;
        } catch (Throwable th) {
            if (it != null) {
                try {
                    it.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public f<T> iterator() {
        return f0(-1);
    }

    public boolean remove(Object obj) {
        f it = iterator();
        do {
            try {
                if (!it.hasNext()) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } while (!it.next().equals(obj));
        it.remove();
        try {
            it.close();
        } catch (IOException unused3) {
        }
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        f it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        try {
            it.close();
        } catch (IOException unused2) {
        }
        return z;
    }

    public int size() {
        f it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                it.G();
                i2++;
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        try {
            it.close();
        } catch (IOException unused2) {
        }
        return i2;
    }

    public Object[] toArray() {
        ArrayList arrayList = new ArrayList();
        f it = iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(it.next());
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        Object[] array = arrayList.toArray();
        try {
            it.close();
        } catch (IOException unused2) {
        }
        return array;
    }

    public <E> E[] toArray(E[] eArr) {
        f it = iterator();
        ArrayList arrayList = null;
        int i2 = 0;
        while (it.hasNext()) {
            try {
                E next = it.next();
                if (i2 >= eArr.length) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        for (E add : eArr) {
                            arrayList.add(add);
                        }
                    }
                    arrayList.add(next);
                } else {
                    eArr[i2] = next;
                }
                i2++;
            } catch (Throwable th) {
                if (it != null) {
                    try {
                        it.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        try {
            it.close();
        } catch (IOException unused2) {
        }
        if (arrayList != null) {
            return arrayList.toArray(eArr);
        }
        if (i2 < eArr.length - 1) {
            eArr[i2] = null;
        }
        return eArr;
    }
}
