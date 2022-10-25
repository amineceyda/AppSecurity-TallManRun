package kotlinx.coroutines.flow.internal;

import j.a.s1.a;
import java.util.concurrent.CancellationException;

public final class AbortFlowException extends CancellationException {
    private final a<?> owner;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
