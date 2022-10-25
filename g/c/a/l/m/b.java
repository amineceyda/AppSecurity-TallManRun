package g.c.a.l.m;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.beacon.pack.AbstractJceStruct;
import g.c.a.l.k;
import java.io.File;
import java.io.FileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class b {
    public static final Logger a = LoggerFactory.getLogger("V1CommentUtils");

    public static String a(Context context) {
        k kVar = k.a;
        String b = k.b(context.getApplicationContext());
        if (TextUtils.isEmpty(b)) {
            a.info("Get V1 comment path is empty.");
            return "";
        }
        String str = null;
        try {
            File file = new File(b);
            int length = (int) file.length();
            FileInputStream fileInputStream = new FileInputStream(file);
            int min = Math.min(length, 8192);
            byte[] bArr = new byte[min];
            fileInputStream.skip((long) (length - min));
            int read = fileInputStream.read(bArr);
            if (read > 0) {
                str = b(bArr, read);
            }
            fileInputStream.close();
        } catch (Exception e2) {
            a.warn("Extract zip comment exception", (Throwable) e2);
        }
        return str;
    }

    public static String b(byte[] bArr, int i2) {
        byte[] bArr2 = {80, 75, 5, 6};
        int min = Math.min(bArr.length, i2);
        for (int i3 = (min - 4) - 22; i3 >= 0; i3--) {
            boolean z = false;
            int i4 = 0;
            while (true) {
                if (i4 >= 4) {
                    z = true;
                    break;
                } else if (bArr[i3 + i4] != bArr2[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (z) {
                int i5 = i3 + 22;
                int i6 = (bArr[i5] * AbstractJceStruct.BYTE) + bArr[i3 + 20];
                int i7 = (min - i3) - 22;
                Logger logger = a;
                logger.info("ZIP comment found at buffer position " + i5 + " with len=" + i6 + ", good!");
                if (i6 != i7) {
                    logger.info("WARNING! ZIP comment size mismatch: directory says len is " + i6 + ", but file ends after " + i7 + " bytes!");
                }
                return new String(bArr, i5, Math.min(i6, i7)).trim();
            }
        }
        a.info("ERROR! ZIP comment NOT found!");
        return null;
    }
}
