package g.e.a.a.e.d;

import android.util.SparseArray;

public enum u {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: h  reason: collision with root package name */
    public static final SparseArray<u> f2752h = null;
    private final int value;

    /* access modifiers changed from: public */
    static {
        u uVar;
        u uVar2;
        u uVar3;
        u uVar4;
        u uVar5;
        u uVar6;
        SparseArray<u> sparseArray = new SparseArray<>();
        f2752h = sparseArray;
        sparseArray.put(0, uVar);
        sparseArray.put(1, uVar2);
        sparseArray.put(2, uVar3);
        sparseArray.put(3, uVar4);
        sparseArray.put(4, uVar5);
        sparseArray.put(-1, uVar6);
    }

    /* access modifiers changed from: public */
    u(int i2) {
        this.value = i2;
    }
}
