package g.e.b.l.j.j;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

public class k {
    public static final AtomicLong a = new AtomicLong(0);
    public static String b;

    public k(k0 k0Var) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a2 = a(time % 1000);
        byte[] a3 = a(a.incrementAndGet());
        byte[] a4 = a((long) Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a2[0], a2[1], a3[0], a3[1], a4[0], a4[1]};
        String l2 = l.l(k0Var.c());
        String i2 = l.i(bArr);
        Locale locale = Locale.US;
        b = String.format(locale, "%s%s%s%s", new Object[]{i2.substring(0, 12), i2.substring(12, 16), i2.subSequence(16, 20), l2.substring(0, 12)}).toUpperCase(locale);
    }

    public static byte[] a(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j2));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return b;
    }
}
