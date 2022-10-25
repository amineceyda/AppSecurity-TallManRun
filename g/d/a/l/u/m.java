package g.d.a.l.u;

import g.d.a.r.g;
import g.d.a.r.j;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class m<A, B> {
    public final g<b<A>, B> a;

    public class a extends g<b<A>, B> {
        public a(m mVar, long j2) {
            super(j2);
        }

        public void c(Object obj, Object obj2) {
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            Queue<b<?>> queue = b.f2553d;
            synchronized (queue) {
                queue.offer(bVar);
            }
        }
    }

    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<b<?>> f2553d = new ArrayDeque(0);
        public int a;
        public int b;
        public A c;

        static {
            char[] cArr = j.a;
        }

        public static <A> b<A> a(A a2, int i2, int i3) {
            b<A> poll;
            Queue<b<?>> queue = f2553d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.c = a2;
            poll.b = i2;
            poll.a = i3;
            return poll;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c);
        }

        public int hashCode() {
            return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
        }
    }

    public m(long j2) {
        this.a = new a(this, j2);
    }
}
