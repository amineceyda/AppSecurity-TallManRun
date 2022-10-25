package com.tencent.assistant.alive.lifecycle;

import com.tencent.raft.raftannotation.RService;
import g.i.a.a.a.b;

@RService(process = {"ALL"}, scope = "Singleton")
public interface IAppLifeCycleService {
    void a();

    void b(b bVar);

    void onWindowFocusChanged(boolean z);
}
