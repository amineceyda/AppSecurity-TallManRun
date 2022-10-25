package com.tencent.beacon.a.c;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class d implements FileFilter {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
