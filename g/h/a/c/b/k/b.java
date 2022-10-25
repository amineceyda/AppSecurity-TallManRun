package g.h.a.c.b.k;

import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import g.h.a.c.a.l;
import g.h.a.c.a.m;
import g.h.a.c.a.n;
import g.h.a.c.a.p;
import g.h.a.c.a.r.d;
import i.o.c.h;

public final class b implements d {
    public final View b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4076d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4077e = true;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f4078f = new a(this);

    /* renamed from: g  reason: collision with root package name */
    public long f4079g = 300;

    /* renamed from: h  reason: collision with root package name */
    public long f4080h = 3000;

    public static final class a implements Animator.AnimatorListener {
        public final /* synthetic */ float a;
        public final /* synthetic */ b b;

        public a(float f2, b bVar) {
            this.a = f2;
            this.b = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            h.e(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            h.e(animator, "animator");
            if (this.a == 0.0f) {
                this.b.b.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            h.e(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            h.e(animator, "animator");
            if (this.a == 1.0f) {
                this.b.b.setVisibility(0);
            }
        }
    }

    public b(View view) {
        h.e(view, "targetView");
        this.b = view;
    }

    public final void a(float f2) {
        if (this.f4076d) {
            boolean z = false;
            this.f4077e = !(f2 == 0.0f);
            if (f2 == 1.0f) {
                z = true;
            }
            if (!z || !this.c) {
                Handler handler = this.b.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(this.f4078f);
                }
            } else {
                Handler handler2 = this.b.getHandler();
                if (handler2 != null) {
                    handler2.postDelayed(this.f4078f, this.f4080h);
                }
            }
            this.b.animate().alpha(f2).setDuration(this.f4079g).setListener(new a(f2, this)).start();
        }
    }

    public void b(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
    }

    public void e(p pVar, m mVar) {
        h.e(pVar, "youTubePlayer");
        h.e(mVar, "playbackRate");
    }

    public void f(p pVar) {
        h.e(pVar, "youTubePlayer");
    }

    public void g(p pVar, String str) {
        h.e(pVar, "youTubePlayer");
        h.e(str, "videoId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r4 != 4) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(g.h.a.c.a.p r4, g.h.a.c.a.o r5) {
        /*
            r3 = this;
            java.lang.String r0 = "youTubePlayer"
            i.o.c.h.e(r4, r0)
            java.lang.String r4 = "state"
            i.o.c.h.e(r5, r4)
            int r4 = r5.ordinal()
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L_0x001d
            r0 = 3
            if (r4 == r0) goto L_0x001a
            r0 = 4
            if (r4 == r0) goto L_0x001d
            goto L_0x001f
        L_0x001a:
            r3.c = r1
            goto L_0x001f
        L_0x001d:
            r3.c = r2
        L_0x001f:
            int r4 = r5.ordinal()
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r4) {
                case 0: goto L_0x0055;
                case 1: goto L_0x004f;
                case 2: goto L_0x0055;
                case 3: goto L_0x0029;
                case 4: goto L_0x0029;
                case 5: goto L_0x004f;
                case 6: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0058
        L_0x0029:
            r3.f4076d = r1
            g.h.a.c.a.o r4 = g.h.a.c.a.o.PLAYING
            if (r5 != r4) goto L_0x0040
            android.view.View r4 = r3.b
            android.os.Handler r4 = r4.getHandler()
            if (r4 != 0) goto L_0x0038
            goto L_0x0058
        L_0x0038:
            java.lang.Runnable r5 = r3.f4078f
            long r0 = r3.f4080h
            r4.postDelayed(r5, r0)
            goto L_0x0058
        L_0x0040:
            android.view.View r4 = r3.b
            android.os.Handler r4 = r4.getHandler()
            if (r4 != 0) goto L_0x0049
            goto L_0x0058
        L_0x0049:
            java.lang.Runnable r5 = r3.f4078f
            r4.removeCallbacks(r5)
            goto L_0x0058
        L_0x004f:
            r3.a(r0)
            r3.f4076d = r2
            goto L_0x0058
        L_0x0055:
            r3.a(r0)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a.c.b.k.b.h(g.h.a.c.a.p, g.h.a.c.a.o):void");
    }

    public void j(p pVar) {
        h.e(pVar, "youTubePlayer");
    }

    public void l(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
    }

    public void p(p pVar, n nVar) {
        h.e(pVar, "youTubePlayer");
        h.e(nVar, "error");
    }

    public void r(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
    }

    public void s(p pVar, l lVar) {
        h.e(pVar, "youTubePlayer");
        h.e(lVar, "playbackQuality");
    }
}
