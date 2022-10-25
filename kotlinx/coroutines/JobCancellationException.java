package kotlinx.coroutines;

import i.o.c.h;
import j.a.y0;
import java.util.concurrent.CancellationException;

public final class JobCancellationException extends CancellationException {
    public final y0 job;

    public JobCancellationException(String str, Throwable th, y0 y0Var) {
        super(str);
        this.job = y0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!h.a(jobCancellationException.getMessage(), getMessage()) || !h.a(jobCancellationException.job, this.job) || !h.a(jobCancellationException.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        h.c(message);
        int hashCode = (this.job.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.job;
    }
}
