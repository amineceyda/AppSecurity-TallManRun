package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int i2, String str) {
        super(str);
        this.zza = i2;
    }
}
