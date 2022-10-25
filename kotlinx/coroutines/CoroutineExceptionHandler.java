package kotlinx.coroutines;

import i.m.f;

public interface CoroutineExceptionHandler extends f.a {
    public static final /* synthetic */ int O = 0;

    public static final class a implements f.b<CoroutineExceptionHandler> {
        public static final /* synthetic */ a a = new a();
    }

    void handleException(f fVar, Throwable th);
}
