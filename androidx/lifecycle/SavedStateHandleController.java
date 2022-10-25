package androidx.lifecycle;

import e.k.e;
import e.k.f;
import e.k.h;
import e.k.i;
import e.k.q;
import e.k.s;
import e.k.y;
import e.k.z;
import e.p.a;
import e.p.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class SavedStateHandleController implements f {
    public final String b;
    public boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    public final q f241d;

    public static final class a implements a.C0053a {
        public void a(c cVar) {
            if (cVar instanceof z) {
                y viewModelStore = ((z) cVar).getViewModelStore();
                e.p.a savedStateRegistry = cVar.getSavedStateRegistry();
                Objects.requireNonNull(viewModelStore);
                Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.h(viewModelStore.a.get((String) it.next()), savedStateRegistry, cVar.getLifecycle());
                }
                if (!new HashSet(viewModelStore.a.keySet()).isEmpty()) {
                    savedStateRegistry.c(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, q qVar) {
        this.b = str;
        this.f241d = qVar;
    }

    public static void h(s sVar, e.p.a aVar, e eVar) {
        Object obj;
        Map<String, Object> map = sVar.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = sVar.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.c) {
            savedStateHandleController.i(aVar, eVar);
            j(aVar, eVar);
        }
    }

    public static void j(final e.p.a aVar, final e eVar) {
        e.b bVar = ((i) eVar).b;
        if (bVar != e.b.INITIALIZED) {
            if (!(bVar.compareTo(e.b.STARTED) >= 0)) {
                eVar.a(new f() {
                    public void d(h hVar, e.a aVar) {
                        if (aVar == e.a.ON_START) {
                            i iVar = (i) e.this;
                            iVar.d("removeObserver");
                            iVar.a.i(this);
                            aVar.c(a.class);
                        }
                    }
                });
                return;
            }
        }
        aVar.c(a.class);
    }

    public void d(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.c = false;
            i iVar = (i) hVar.getLifecycle();
            iVar.d("removeObserver");
            iVar.a.i(this);
        }
    }

    public void i(e.p.a aVar, e eVar) {
        if (!this.c) {
            this.c = true;
            eVar.a(this);
            aVar.b(this.b, this.f241d.f1524d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
