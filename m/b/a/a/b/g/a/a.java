package m.b.a.a.b.g.a;

public final class a {
    public final long a;
    public final String b;
    public final boolean[] c;

    public a(long j2, String str, int i2) {
        this.a = j2;
        this.b = str;
        this.c = new boolean[i2];
    }

    public void a(long j2, String str, int i2) throws IllegalStateException {
        if (this.a != j2) {
            throw new IllegalStateException(String.format("Different ids (%016x and %016x).", new Object[]{Long.valueOf(this.a), Long.valueOf(j2)}));
        } else if (!this.b.equals(str)) {
            throw new IllegalStateException(String.format("Different class names %s and %s for id %016x.", new Object[]{this.b, str, Long.valueOf(j2)}));
        } else if (this.c.length != i2) {
            throw new IllegalStateException(String.format("Incompatible execution data for class %s with id %016x.", new Object[]{str, Long.valueOf(j2)}));
        }
    }

    public String toString() {
        return String.format("ExecutionData[name=%s, id=%016x]", new Object[]{this.b, Long.valueOf(this.a)});
    }
}
