package androidx.constraintlayout.core.parser;

import g.a.a.a.a;

public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public String toString() {
        StringBuilder i2 = a.i("CLParsingException (");
        i2.append(hashCode());
        i2.append(") : ");
        i2.append(this.mReason + " (" + this.mElementClass + " at line " + this.mLineNumber + ")");
        return i2.toString();
    }
}
