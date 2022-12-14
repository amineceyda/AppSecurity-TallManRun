package g.d.a.i;

import com.tencent.raft.measure.utils.MeasureConst;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public final class c {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName(MeasureConst.CHARSET_UTF8);
    }

    public static void a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (i2 < length) {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (file2.delete()) {
                    i2++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
