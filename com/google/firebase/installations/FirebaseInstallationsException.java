package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    private final a status;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.status = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.status = aVar;
    }
}
