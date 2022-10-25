package f.a.a.b.t;

public class a {
    public long a = 20;
    public long b;

    public a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.a;
        if (j2 < 327680) {
            this.a = 4 * j2;
        }
        this.b = currentTimeMillis + j2;
    }

    public boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis <= this.b) {
            return true;
        }
        long j2 = this.a;
        if (j2 < 327680) {
            this.a = 4 * j2;
        }
        this.b = currentTimeMillis + j2;
        return false;
    }
}
