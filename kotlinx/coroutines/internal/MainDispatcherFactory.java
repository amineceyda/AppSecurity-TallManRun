package kotlinx.coroutines.internal;

import j.a.f1;
import java.util.List;

public interface MainDispatcherFactory {
    f1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
