package g.i.a.a.l.d;

import com.tencent.assistant.alive.timer.ITimerJobService;
import com.tencent.raft.raftannotation.RServiceImpl;
import g.i.a.a.l.c;

@RServiceImpl(bindInterface = {ITimerJobService.class})
public class a implements ITimerJobService {
    public void a(g.i.a.a.l.a aVar) {
        g.i.a.a.l.e.a aVar2 = (g.i.a.a.l.e.a) aVar;
        g.i.a.a.m.a.a("ITimerJobService", String.format("startTimeJob\nname:%s\nid:%s period:%s\n", new Object[]{aVar2.getName(), Integer.valueOf(aVar2.f()), 1000L}));
        c.a.a.a(aVar);
    }
}
