package g.i.b.f.k;

import g.i.b.f.h.e;
import g.i.b.f.k.d;
import java.util.Iterator;
import java.util.Objects;

public final class c implements Runnable {
    public final /* synthetic */ d.b b;
    public final /* synthetic */ d c;

    public c(d dVar, d.b bVar) {
        this.c = dVar;
        this.b = bVar;
    }

    public final void run() {
        switch (d.a.b[this.b.ordinal()]) {
            case 1:
                d dVar = this.c;
                e b2 = e.b();
                e eVar = dVar.f4296g;
                Objects.requireNonNull(b2);
                synchronized (dVar.c) {
                    Iterator<g.i.b.f.c> it = dVar.c.iterator();
                    while (it.hasNext()) {
                        g.i.b.f.c next = it.next();
                        if (next != null) {
                            next.onTaskPendingMainloop(dVar.f4296g);
                        }
                    }
                }
                return;
            case 2:
                d dVar2 = this.c;
                e b3 = e.b();
                e eVar2 = dVar2.f4296g;
                b3.k();
                synchronized (dVar2.c) {
                    Iterator<g.i.b.f.c> it2 = dVar2.c.iterator();
                    while (it2.hasNext()) {
                        g.i.b.f.c next2 = it2.next();
                        if (next2 != null) {
                            next2.onTaskStartedMainloop(dVar2.f4296g);
                        }
                    }
                }
                return;
            case 3:
                d dVar3 = this.c;
                e.b().onTaskDetectedMainloop(dVar3.f4296g);
                synchronized (dVar3.c) {
                    Iterator<g.i.b.f.c> it3 = dVar3.c.iterator();
                    while (it3.hasNext()) {
                        g.i.b.f.c next3 = it3.next();
                        if (next3 != null) {
                            next3.onTaskDetectedMainloop(dVar3.f4296g);
                        }
                    }
                }
                return;
            case 4:
                d dVar4 = this.c;
                e.b().onTaskReceivedMainloop(dVar4.f4296g);
                synchronized (dVar4.c) {
                    Iterator<g.i.b.f.c> it4 = dVar4.c.iterator();
                    while (it4.hasNext()) {
                        g.i.b.f.c next4 = it4.next();
                        if (next4 != null) {
                            next4.onTaskReceivedMainloop(dVar4.f4296g);
                        }
                    }
                }
                return;
            case 5:
                d dVar5 = this.c;
                e.b().onTaskPausedMainloop(dVar5.f4296g);
                synchronized (dVar5.c) {
                    Iterator<g.i.b.f.c> it5 = dVar5.c.iterator();
                    while (it5.hasNext()) {
                        g.i.b.f.c next5 = it5.next();
                        if (next5 != null) {
                            next5.onTaskPausedMainloop(dVar5.f4296g);
                        }
                    }
                }
                return;
            case 6:
                d dVar6 = this.c;
                e.b().onTaskFailedMainloop(dVar6.f4296g);
                synchronized (dVar6.c) {
                    Iterator<g.i.b.f.c> it6 = dVar6.c.iterator();
                    while (it6.hasNext()) {
                        g.i.b.f.c next6 = it6.next();
                        if (next6 != null) {
                            next6.onTaskFailedMainloop(dVar6.f4296g);
                        }
                    }
                }
                return;
            case 7:
                d dVar7 = this.c;
                e.b().onTaskCompletedMainloop(dVar7.f4296g);
                synchronized (dVar7.c) {
                    Iterator<g.i.b.f.c> it7 = dVar7.c.iterator();
                    while (it7.hasNext()) {
                        g.i.b.f.c next7 = it7.next();
                        if (next7 != null) {
                            next7.onTaskCompletedMainloop(dVar7.f4296g);
                        }
                    }
                }
                return;
            default:
                return;
        }
    }
}
