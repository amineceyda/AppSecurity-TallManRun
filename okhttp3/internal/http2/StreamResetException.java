package okhttp3.internal.http2;

import java.io.IOException;
import k.h0.i.a;

public final class StreamResetException extends IOException {
    public final a errorCode;

    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        this.errorCode = aVar;
    }
}
