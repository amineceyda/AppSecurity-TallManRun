package g.d.a.l.t.b0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f2439j = Bitmap.Config.ARGB_8888;
    public final k a;
    public final Set<Bitmap.Config> b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public long f2440d;

    /* renamed from: e  reason: collision with root package name */
    public long f2441e;

    /* renamed from: f  reason: collision with root package name */
    public int f2442f;

    /* renamed from: g  reason: collision with root package name */
    public int f2443g;

    /* renamed from: h  reason: collision with root package name */
    public int f2444h;

    /* renamed from: i  reason: collision with root package name */
    public int f2445i;

    public interface a {
    }

    public static final class b implements a {
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i2 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i2 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f2440d = j2;
        this.a = mVar;
        this.b = unmodifiableSet;
        this.c = new b();
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            i(0);
        } else if (i2 >= 20 || i2 == 15) {
            i(this.f2440d / 2);
        }
    }

    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        i(0);
    }

    public Bitmap c(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            return h2;
        }
        if (config == null) {
            config = f2439j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public Bitmap d(int i2, int i3, Bitmap.Config config) {
        Bitmap h2 = h(i2, i3, config);
        if (h2 != null) {
            h2.eraseColor(0);
            return h2;
        }
        if (config == null) {
            config = f2439j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public synchronized void e(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        Objects.requireNonNull((m) this.a);
                        if (((long) g.d.a.r.j.d(bitmap)) <= this.f2440d) {
                            if (this.b.contains(bitmap.getConfig())) {
                                Objects.requireNonNull((m) this.a);
                                int d2 = g.d.a.r.j.d(bitmap);
                                ((m) this.a).f(bitmap);
                                Objects.requireNonNull((b) this.c);
                                this.f2444h++;
                                this.f2441e += (long) d2;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.a).e(bitmap));
                                }
                                f();
                                i(this.f2440d);
                                return;
                            }
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        StringBuilder i2 = g.a.a.a.a.i("Hits=");
        i2.append(this.f2442f);
        i2.append(", misses=");
        i2.append(this.f2443g);
        i2.append(", puts=");
        i2.append(this.f2444h);
        i2.append(", evictions=");
        i2.append(this.f2445i);
        i2.append(", currentSize=");
        i2.append(this.f2441e);
        i2.append(", maxSize=");
        i2.append(this.f2440d);
        i2.append("\nStrategy=");
        i2.append(this.a);
        Log.v("LruBitmapPool", i2.toString());
    }

    public final synchronized Bitmap h(int i2, int i3, Bitmap.Config config) {
        Bitmap b2;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        b2 = ((m) this.a).b(i2, i3, config != null ? config : f2439j);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((m) this.a);
                sb.append(m.c(g.d.a.r.j.c(i2, i3, config), config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f2443g++;
        } else {
            this.f2442f++;
            long j2 = this.f2441e;
            Objects.requireNonNull((m) this.a);
            this.f2441e = j2 - ((long) g.d.a.r.j.d(b2));
            Objects.requireNonNull((b) this.c);
            b2.setHasAlpha(true);
            b2.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((m) this.a);
            sb2.append(m.c(g.d.a.r.j.c(i2, i3, config), config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        f();
        return b2;
    }

    public final synchronized void i(long j2) {
        while (this.f2441e > j2) {
            m mVar = (m) this.a;
            Bitmap c2 = mVar.b.c();
            if (c2 != null) {
                mVar.a(Integer.valueOf(g.d.a.r.j.d(c2)), c2);
            }
            if (c2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    g();
                }
                this.f2441e = 0;
                return;
            }
            Objects.requireNonNull((b) this.c);
            long j3 = this.f2441e;
            Objects.requireNonNull((m) this.a);
            this.f2441e = j3 - ((long) g.d.a.r.j.d(c2));
            this.f2445i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.a).e(c2));
            }
            f();
            c2.recycle();
        }
    }
}
