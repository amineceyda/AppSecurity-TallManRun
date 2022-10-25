package com.google.firebase;

import g.c.b.b.f;

public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        f.l(str, "Detail message must not be empty");
    }
}
