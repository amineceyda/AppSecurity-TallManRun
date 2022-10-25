package com.tencent.qmsp.sdk.f;

import java.io.File;

public class d {
    public static void a(String str, boolean z) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                if (file.isFile()) {
                    file.delete();
                    return;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File absolutePath : listFiles) {
                        a(absolutePath.getAbsolutePath(), z);
                    }
                    if (!z) {
                        file.delete();
                    }
                }
            }
        }
    }
}
