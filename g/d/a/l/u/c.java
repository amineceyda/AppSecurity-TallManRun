package g.d.a.l.u;

import android.util.Log;
import g.d.a.l.d;
import g.d.a.l.n;
import g.d.a.r.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c implements d<ByteBuffer> {
    public boolean a(Object obj, File file, n nVar) {
        try {
            a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e2);
            }
            return false;
        }
    }
}
