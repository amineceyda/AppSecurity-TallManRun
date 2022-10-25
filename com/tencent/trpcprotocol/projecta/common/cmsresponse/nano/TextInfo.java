package com.tencent.trpcprotocol.projecta.common.cmsresponse.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class TextInfo extends d {
    private static volatile TextInfo[] _emptyArray;
    public String bgColor;
    public String position;
    public String text;

    public TextInfo() {
        clear();
    }

    public static TextInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new TextInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static TextInfo parseFrom(a aVar) throws IOException {
        return new TextInfo().mergeFrom(aVar);
    }

    public static TextInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (TextInfo) d.mergeFrom(new TextInfo(), bArr);
    }

    public TextInfo clear() {
        this.text = "";
        this.bgColor = "";
        this.position = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.text.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.text);
        }
        if (!this.bgColor.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.bgColor);
        }
        return !this.position.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(3, this.position) : computeSerializedSize;
    }

    public TextInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.text = aVar.o();
            } else if (p == 18) {
                this.bgColor = aVar.o();
            } else if (p == 26) {
                this.position = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.text.equals("")) {
            codedOutputByteBufferNano.C(1, this.text);
        }
        if (!this.bgColor.equals("")) {
            codedOutputByteBufferNano.C(2, this.bgColor);
        }
        if (!this.position.equals("")) {
            codedOutputByteBufferNano.C(3, this.position);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
