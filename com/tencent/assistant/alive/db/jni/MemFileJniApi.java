package com.tencent.assistant.alive.db.jni;

import com.tencent.raft.measure.utils.MeasureConst;
import g.i.a.a.m.a;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

public class MemFileJniApi {
    public long a;

    static {
        try {
            System.loadLibrary("daemon_acc_v2.1.5");
        } catch (UnsatisfiedLinkError e2) {
            a.b(e2);
            e2.printStackTrace();
        }
    }

    public MemFileJniApi(String str) {
        File file = new File(str);
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.length() == 0) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(ByteBuffer.allocate(MeasureConst.DEFAULT_REPORT_DELAY_TIME).array());
                fileOutputStream.flush();
                fileOutputStream.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.a = init(str);
        StringBuilder i2 = g.a.a.a.a.i("nativeFileHandle:");
        i2.append(this.a);
        a.a("MemFileJniApi", i2.toString());
    }

    public static native long init(String str);

    public static native String readString(long j2);

    public static native boolean writeBool(long j2, boolean z);

    public static native boolean writeString(long j2, String str);

    public String a() {
        String readString = readString(this.a);
        a.a("MemFileJniApi", "readString:" + readString);
        return readString;
    }
}
