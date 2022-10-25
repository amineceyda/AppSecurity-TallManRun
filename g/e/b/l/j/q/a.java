package g.e.b.l.j.q;

public class a implements d {
    public final d[] a;
    public final b b;

    public a(int i2, d... dVarArr) {
        this.a = dVarArr;
        this.b = new b(i2);
    }

    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.a) {
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? this.b.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
