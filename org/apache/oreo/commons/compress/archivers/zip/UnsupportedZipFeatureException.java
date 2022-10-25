package org.apache.oreo.commons.compress.archivers.zip;

import java.io.Serializable;
import java.util.zip.ZipException;
import m.a.b.a.a.a.b.b0;

public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20161219;
    private final a reason;

    public static class a implements Serializable {
        public static final a b = new a("encryption");
        public static final a c = new a("compression method");
        private final String name;

        public a(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UnsupportedZipFeatureException(m.a.b.a.a.a.b.j0 r2, m.a.b.a.a.a.b.b0 r3) {
        /*
            r1 = this;
            java.lang.String r0 = "unsupported feature method '"
            java.lang.StringBuilder r0 = g.a.a.a.a.i(r0)
            java.lang.String r2 = r2.name()
            r0.append(r2)
            java.lang.String r2 = "' used in entry "
            r0.append(r2)
            java.lang.String r2 = r3.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException$a r2 = org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException.a.c
            r1.reason = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.oreo.commons.compress.archivers.zip.UnsupportedZipFeatureException.<init>(m.a.b.a.a.a.b.j0, m.a.b.a.a.a.b.b0):void");
    }

    public UnsupportedZipFeatureException(a aVar, b0 b0Var) {
        super("unsupported feature " + aVar + " used in entry " + b0Var.getName());
        this.reason = aVar;
    }
}
