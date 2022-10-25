package g.e.a.b.b.f;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import g.e.a.b.b.f.b;
import java.util.Objects;

public final class v extends h {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f2872g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(b bVar, int i2) {
        super(bVar, i2, (Bundle) null);
        this.f2872g = bVar;
    }

    public final void d(ConnectionResult connectionResult) {
        Objects.requireNonNull(this.f2872g);
        ((b.d) this.f2872g.f2852i).a(connectionResult);
        Objects.requireNonNull(this.f2872g);
        System.currentTimeMillis();
    }

    public final boolean e() {
        ((b.d) this.f2872g.f2852i).a(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
