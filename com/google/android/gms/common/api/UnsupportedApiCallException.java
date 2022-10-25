package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    public String getMessage() {
        String valueOf = String.valueOf(this.zza);
        valueOf.length();
        return "Missing ".concat(valueOf);
    }
}
