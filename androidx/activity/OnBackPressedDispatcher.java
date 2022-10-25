package androidx.activity;

import e.a.b;
import e.k.e;
import e.k.f;
import e.k.h;
import e.k.i;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements f, e.a.a {
        public final e b;
        public final b c;

        /* renamed from: d  reason: collision with root package name */
        public e.a.a f21d;

        public LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.b = eVar;
            this.c = bVar;
            eVar.a(this);
        }

        public void cancel() {
            i iVar = (i) this.b;
            iVar.d("removeObserver");
            iVar.a.i(this);
            this.c.b.remove(this);
            e.a.a aVar = this.f21d;
            if (aVar != null) {
                aVar.cancel();
                this.f21d = null;
            }
        }

        public void d(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.c;
                onBackPressedDispatcher.b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.b.add(aVar2);
                this.f21d = aVar2;
            } else if (aVar == e.a.ON_STOP) {
                e.a.a aVar3 = this.f21d;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == e.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements e.a.a {
        public final b b;

        public a(b bVar) {
            this.b = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.b);
            this.b.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
