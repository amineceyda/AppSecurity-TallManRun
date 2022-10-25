package g.e.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.a.a.a.a;
import g.e.a.b.b.h.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public abstract class d {
    public volatile int cachedSize = -1;

    public static final <T extends d> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final <T extends d> T mergeFrom(T t, byte[] bArr, int i2, int i3) throws InvalidProtocolBufferNanoException {
        try {
            a aVar = new a(bArr, i2, i3);
            t.mergeFrom(aVar);
            aVar.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e2) {
            throw e2;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(d dVar, d dVar2) {
        int serializedSize;
        if (dVar == dVar2) {
            return true;
        }
        if (dVar == null || dVar2 == null || dVar.getClass() != dVar2.getClass() || dVar2.getSerializedSize() != (serializedSize = dVar.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(dVar, bArr, 0, serializedSize);
        toByteArray(dVar2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(d dVar, byte[] bArr, int i2, int i3) {
        try {
            CodedOutputByteBufferNano codedOutputByteBufferNano = new CodedOutputByteBufferNano(bArr, i2, i3);
            dVar.writeTo(codedOutputByteBufferNano);
            if (codedOutputByteBufferNano.a.remaining() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static final byte[] toByteArray(d dVar) {
        int serializedSize = dVar.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(dVar, bArr, 0, serializedSize);
        return bArr;
    }

    public d clone() throws CloneNotSupportedException {
        return (d) super.clone();
    }

    public int computeSerializedSize() {
        return 0;
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int computeSerializedSize = computeSerializedSize();
        this.cachedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public abstract d mergeFrom(a aVar) throws IOException;

    public String toString() {
        String str;
        StringBuilder sb;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            e.n((String) null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e2) {
            sb = a.i("Error printing proto: ");
            str = e2.getMessage();
            sb.append(str);
            return sb.toString();
        } catch (InvocationTargetException e3) {
            sb = a.i("Error printing proto: ");
            str = e3.getMessage();
            sb.append(str);
            return sb.toString();
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
    }
}
