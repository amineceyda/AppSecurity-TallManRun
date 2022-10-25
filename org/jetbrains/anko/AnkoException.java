package org.jetbrains.anko;

import i.o.c.h;

public class AnkoException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnkoException() {
        super("");
        h.f("", "message");
    }
}
