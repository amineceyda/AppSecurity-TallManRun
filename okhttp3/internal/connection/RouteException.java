package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.h0.c;

public final class RouteException extends RuntimeException {
    private IOException firstException;
    private IOException lastException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstException = iOException;
        this.lastException = iOException;
    }

    public void a(IOException iOException) {
        IOException iOException2 = this.firstException;
        Method method = c.p;
        if (method != null) {
            try {
                method.invoke(iOException2, new Object[]{iOException});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.lastException = iOException;
    }

    public IOException b() {
        return this.firstException;
    }

    public IOException c() {
        return this.lastException;
    }
}
