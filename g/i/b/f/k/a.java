package g.i.b.f.k;

import android.text.TextUtils;
import com.tencent.beacon.base.net.adapter.AbstractNetAdapter;
import g.i.b.e.b.e;
import g.i.b.e.h.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class a {
    public long a;
    public long b;
    public volatile long c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4278d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f4279e;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f4280f;

    /* renamed from: g  reason: collision with root package name */
    public List<g.i.b.f.k.g.a> f4281g;

    /* renamed from: h  reason: collision with root package name */
    public List<g.i.b.f.k.g.a> f4282h;

    /* renamed from: i  reason: collision with root package name */
    public String f4283i;

    /* renamed from: j  reason: collision with root package name */
    public String f4284j;

    /* renamed from: k  reason: collision with root package name */
    public volatile long f4285k;

    /* renamed from: l  reason: collision with root package name */
    public volatile int f4286l;

    public a(String str) {
        boolean z;
        this.a = -1;
        this.b = 0;
        this.c = 0;
        this.f4278d = false;
        this.f4279e = 0;
        this.f4280f = 0;
        this.f4281g = new LinkedList();
        this.f4282h = new LinkedList();
        this.f4283i = "";
        this.f4284j = "";
        this.f4285k = 0;
        this.f4286l = 0;
        this.f4278d = false;
        try {
            if (TextUtils.isEmpty(str)) {
                this.b = d();
            } else {
                try {
                    String[] split = str.split("\\|");
                    if (split == null) {
                        return;
                    }
                    if (split.length != 0) {
                        if (split[0].equals("3.0")) {
                            if (split.length >= 7) {
                                try {
                                    this.a = Long.parseLong(split[1]);
                                    this.c = Long.parseLong(split[2]);
                                    this.f4279e = Long.parseLong(split[3]);
                                    this.f4280f = Long.parseLong(split[4]);
                                    String[] split2 = split[5].split(";");
                                    int length = split2.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            z = false;
                                            break;
                                        }
                                        g.i.b.f.k.g.a aVar = new g.i.b.f.k.g.a(this, split2[i2]);
                                        if (!aVar.a) {
                                            this.f4281g.clear();
                                            z = true;
                                            break;
                                        }
                                        this.f4281g.add(aVar);
                                        i2++;
                                    }
                                    if (!z) {
                                        if (split.length >= 9) {
                                            k(split[7]);
                                            l(split[8]);
                                        }
                                        if (split.length < 11 || !h(split)) {
                                            this.b = d();
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } catch (NumberFormatException e2) {
                                    e2.printStackTrace();
                                    b.e("TaskDivider", "parseLong for totalLen fail.", e2);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            this.f4278d = true;
        } catch (Exception e3) {
            this.f4278d = false;
            e3.printStackTrace();
        }
    }

    public boolean a(g.i.b.f.k.g.a aVar) {
        if (aVar.b != -1) {
            b.i("TaskDivider", "addRealSection of id " + aVar.b + " should not happen!!!");
            return false;
        }
        synchronized (this.f4281g) {
            int i2 = aVar.c;
            if (i2 == -1) {
                if (this.f4281g.size() != 0) {
                    b.h("TaskDivider", "first section, list size should be 0!!!");
                    return false;
                }
                aVar.b = 0;
                aVar.f4366g = this.a;
                this.f4281g.add(aVar);
                return true;
            } else if (i2 >= this.f4281g.size()) {
                b.i("TaskDivider", "parent id:" + aVar.c + " wrong!!!");
                return false;
            } else {
                g.i.b.f.k.g.a aVar2 = null;
                for (g.i.b.f.k.g.a next : this.f4281g) {
                    if (next.b == aVar.c) {
                        if (next.f4365f >= next.f4366g) {
                            return false;
                        }
                        long j2 = next.f4365f;
                        int i3 = e.f4112g;
                        int i4 = 1048576;
                        if (i3 != 2) {
                            if (i3 == 3) {
                                i4 = 524288;
                            }
                        }
                        if (j2 + ((long) i4) > aVar.f4363d) {
                            return false;
                        }
                        aVar2 = next;
                    } else if (next.f4366g > aVar.f4363d && next.f4363d < aVar.f4366g) {
                        return false;
                    }
                }
                if (aVar2 == null) {
                    return false;
                }
                aVar.b = this.f4281g.size();
                aVar2.f4366g = aVar.f4363d;
                this.f4281g.add(aVar);
                return true;
            }
        }
    }

    public void b(g.i.b.f.k.g.a aVar) {
        if (aVar.f4366g != -1 && aVar.f4363d < aVar.f4366g) {
            synchronized (this.f4282h) {
                g.i.b.f.k.g.a aVar2 = null;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f4282h.size()) {
                        break;
                    }
                    g.i.b.f.k.g.a aVar3 = this.f4282h.get(i3);
                    if (aVar3.f4363d == aVar.f4363d) {
                        i2 = i3;
                        aVar2 = aVar3;
                        break;
                    }
                    i3++;
                }
                if (aVar2 != null) {
                    if (aVar.f4366g <= aVar2.f4366g) {
                        aVar = aVar2;
                    }
                    aVar.b = aVar2.b;
                    aVar.c = aVar2.c;
                    this.f4282h.remove(i2);
                    this.f4282h.add(i2, aVar);
                    return;
                }
                int i4 = AbstractNetAdapter.READ_TIMEOUT;
                int size = this.f4282h.size();
                if (size > 0) {
                    i4 = this.f4282h.get(size - 1).b + 1;
                }
                aVar.c = i4;
                aVar.b = i4;
                this.f4282h.add(aVar);
            }
        }
    }

    public final long c() {
        long j2;
        long j3;
        long j4;
        synchronized (this.f4281g) {
            j2 = 0;
            for (g.i.b.f.k.g.a next : this.f4281g) {
                j2 += next.f4364e - next.f4363d;
            }
        }
        synchronized (this.f4282h) {
            j3 = 0;
            for (g.i.b.f.k.g.a next2 : this.f4282h) {
                j3 += next2.f4366g - next2.f4363d;
            }
            j4 = 0;
            for (g.i.b.f.k.g.a next3 : this.f4282h) {
                j4 += next3.f4364e - next3.f4363d;
            }
        }
        long j5 = (j2 - j3) + j4;
        if (j5 > 0) {
            return j5;
        }
        return 0;
    }

    public final long d() {
        long j2;
        synchronized (this.f4281g) {
            j2 = 0;
            for (g.i.b.f.k.g.a next : this.f4281g) {
                j2 += next.f4364e - next.f4363d;
            }
        }
        synchronized (this.f4282h) {
            for (g.i.b.f.k.g.a next2 : this.f4282h) {
                j2 += next2.f4364e - next2.f4363d;
            }
        }
        return j2;
    }

    public g.i.b.f.k.g.a e() {
        g.i.b.f.k.g.a aVar;
        g.i.b.f.k.g.a aVar2;
        synchronized (this.f4281g) {
            aVar = null;
            if (this.f4281g.size() == 0) {
                aVar = new g.i.b.f.k.g.a(this, 0, 0, 0, -1);
            } else {
                g.i.b.f.k.g.a aVar3 = this.f4281g.get(0);
                Iterator<g.i.b.f.k.g.a> it = this.f4281g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar2 = null;
                        break;
                    }
                    aVar2 = it.next();
                    if (!aVar2.f4367h && aVar2.a(this.a) > 0) {
                        break;
                    } else if (aVar2.a(this.a) > aVar3.a(this.a)) {
                        aVar3 = aVar2;
                    }
                }
                if (aVar2 == null) {
                    long a2 = aVar3.a(this.a);
                    long j2 = aVar3.f4365f;
                    int i2 = e.f4112g;
                    int i3 = 1048576;
                    if (i2 != 2) {
                        if (i2 == 3) {
                            i3 = 524288;
                        }
                    }
                    if (a2 > ((long) (i3 * 2))) {
                        long j3 = j2 + (a2 / 2);
                        g.i.b.f.k.g.a aVar4 = new g.i.b.f.k.g.a(this, j3, j3, j3, aVar3.f4366g);
                        aVar4.c = aVar3.b;
                        aVar = aVar4;
                    }
                } else {
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                aVar.f4367h = true;
            }
        }
        b.c("TaskDivider", "nextSection: " + aVar.toString());
        return aVar;
    }

    public long f() {
        long j2;
        long j3;
        long j4;
        synchronized (this.f4281g) {
            j2 = 0;
            for (g.i.b.f.k.g.a next : this.f4281g) {
                j2 += next.f4365f - next.f4363d;
            }
        }
        synchronized (this.f4282h) {
            j3 = 0;
            for (g.i.b.f.k.g.a next2 : this.f4282h) {
                j3 += next2.f4366g - next2.f4363d;
            }
            j4 = 0;
            for (g.i.b.f.k.g.a next3 : this.f4282h) {
                j4 += next3.f4365f - next3.f4363d;
            }
        }
        long j5 = (j2 - j3) + j4;
        if (j5 > 0) {
            return j5;
        }
        return 0;
    }

    public g.i.b.f.k.g.a g(int i2) {
        synchronized (this.f4281g) {
            try {
                for (g.i.b.f.k.g.a next : this.f4281g) {
                    if (next.b == i2) {
                        return next;
                    }
                }
            } catch (Exception e2) {
                b.b("TaskDivider", e2);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        synchronized (this.f4282h) {
            try {
                for (g.i.b.f.k.g.a next2 : this.f4282h) {
                    if (next2.b == i2) {
                        return next2;
                    }
                }
            } catch (Exception e3) {
                b.b("TaskDivider", e3);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        b.i("TaskDivider", "getSection fail. sectionId:" + i2 + ", divider:" + m());
        return null;
    }

    public final boolean h(String[] strArr) {
        for (String aVar : strArr[9].split(";")) {
            g.i.b.f.k.g.a aVar2 = new g.i.b.f.k.g.a(this, aVar);
            if (aVar2.a) {
                this.f4282h.add(aVar2);
            } else {
                this.f4282h.clear();
            }
        }
        try {
            String[] split = strArr[10].split(";");
            this.f4285k = Long.parseLong(split[0]);
            this.f4286l = Integer.parseInt(split[1]);
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    public boolean i() {
        long f2 = f();
        return f2 > 0 && f2 == this.a;
    }

    public void j(long j2, int i2) {
        if (this.f4285k != 0 && this.f4285k > j2) {
            j2 = this.f4285k;
        }
        this.f4285k = j2;
        if (this.f4286l != 0 && this.f4286l > i2) {
            i2 = this.f4286l;
        }
        this.f4286l = i2;
    }

    public void k(String str) {
        if (TextUtils.isEmpty(str) || str.equals("null")) {
            this.f4283i = "";
        } else {
            this.f4283i = str.replace("|", "");
        }
    }

    public void l(String str) {
        if (TextUtils.isEmpty(str) || str.equals("null")) {
            this.f4284j = "";
        } else {
            this.f4284j = str.replace("|", "");
        }
    }

    public String m() {
        StringBuilder sb = new StringBuilder("3.0");
        sb.append("|");
        sb.append(this.a);
        sb.append("|");
        sb.append(this.c);
        sb.append("|");
        sb.append(this.f4279e);
        sb.append("|");
        sb.append(this.f4280f);
        sb.append("|");
        synchronized (this.f4281g) {
            for (g.i.b.f.k.g.a c2 : this.f4281g) {
                sb.append(c2.c());
                sb.append(";");
            }
            if (this.f4281g.size() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append("|");
        sb.append("null");
        sb.append("|");
        sb.append(TextUtils.isEmpty(this.f4283i) ? "null" : this.f4283i);
        sb.append("|");
        sb.append(TextUtils.isEmpty(this.f4284j) ? "null" : this.f4284j);
        sb.append("|");
        synchronized (this.f4282h) {
            for (g.i.b.f.k.g.a c3 : this.f4282h) {
                sb.append(c3.c());
                sb.append(";");
            }
            if (this.f4282h.size() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append("|");
        sb.append(this.f4285k + ";" + this.f4286l);
        return sb.toString();
    }

    public String toString() {
        return m();
    }
}
