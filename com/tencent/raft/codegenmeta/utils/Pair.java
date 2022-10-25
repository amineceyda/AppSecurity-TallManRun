package com.tencent.raft.codegenmeta.utils;

import g.a.a.a.a;

public class Pair<A, B> {
    public final A fst;
    public final B snd;

    public Pair(A a, B b) {
        this.fst = a;
        this.snd = b;
    }

    private boolean equalsImp(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <A, B> Pair<A, B> of(A a, B b) {
        return new Pair<>(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return equalsImp(this.fst, pair.fst) && equalsImp(this.snd, pair.snd);
        }
    }

    public int hashCode() {
        A a = this.fst;
        if (a == null) {
            B b = this.snd;
            if (b == null) {
                return 0;
            }
            return b.hashCode() + 1;
        }
        B b2 = this.snd;
        int hashCode = a.hashCode();
        return b2 == null ? hashCode + 2 : (hashCode * 17) + this.snd.hashCode();
    }

    public String toString() {
        StringBuilder i2 = a.i("Pair[");
        i2.append(this.fst);
        i2.append(",");
        i2.append(this.snd);
        i2.append("]");
        return i2.toString();
    }
}
