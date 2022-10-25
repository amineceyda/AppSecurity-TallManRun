package l;

import javax.annotation.Nullable;

public final class u {
    public final byte[] a;
    public int b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4984d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4985e;

    /* renamed from: f  reason: collision with root package name */
    public u f4986f;

    /* renamed from: g  reason: collision with root package name */
    public u f4987g;

    public u() {
        this.a = new byte[8192];
        this.f4985e = true;
        this.f4984d = false;
    }

    public u(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i2;
        this.c = i3;
        this.f4984d = z;
        this.f4985e = z2;
    }

    @Nullable
    public final u a() {
        u uVar = this.f4986f;
        u uVar2 = uVar != this ? uVar : null;
        u uVar3 = this.f4987g;
        uVar3.f4986f = uVar;
        this.f4986f.f4987g = uVar3;
        this.f4986f = null;
        this.f4987g = null;
        return uVar2;
    }

    public final u b(u uVar) {
        uVar.f4987g = this;
        uVar.f4986f = this.f4986f;
        this.f4986f.f4987g = uVar;
        this.f4986f = uVar;
        return uVar;
    }

    public final u c() {
        this.f4984d = true;
        return new u(this.a, this.b, this.c, true, false);
    }

    public final void d(u uVar, int i2) {
        if (uVar.f4985e) {
            int i3 = uVar.c;
            if (i3 + i2 > 8192) {
                if (!uVar.f4984d) {
                    int i4 = uVar.b;
                    if ((i3 + i2) - i4 <= 8192) {
                        byte[] bArr = uVar.a;
                        System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
                        uVar.c -= uVar.b;
                        uVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, uVar.a, uVar.c, i2);
            uVar.c += i2;
            this.b += i2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
