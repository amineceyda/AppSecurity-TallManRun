package l;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import javax.annotation.Nullable;

public final class r extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Socket f4981k;

    public r(Socket socket) {
        this.f4981k = socket;
    }

    public IOException l(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.f4981k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
            r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
            goto L_0x0033
        L_0x0008:
            r1 = move-exception
            boolean r2 = l.q.a(r1)
            if (r2 == 0) goto L_0x0019
            java.util.logging.Logger r2 = l.q.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0024
        L_0x0019:
            throw r1
        L_0x001a:
            r1 = move-exception
            java.util.logging.Logger r2 = l.q.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0024:
            r4.append(r0)
            java.net.Socket r0 = r5.f4981k
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.r.m():void");
    }
}
