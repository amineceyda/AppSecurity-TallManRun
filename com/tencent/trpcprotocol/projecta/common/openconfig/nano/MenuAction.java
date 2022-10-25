package com.tencent.trpcprotocol.projecta.common.openconfig.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class MenuAction extends d {
    private static volatile MenuAction[] _emptyArray;
    public String title;
    public String url;

    public MenuAction() {
        clear();
    }

    public static MenuAction[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new MenuAction[0];
                }
            }
        }
        return _emptyArray;
    }

    public static MenuAction parseFrom(a aVar) throws IOException {
        return new MenuAction().mergeFrom(aVar);
    }

    public static MenuAction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (MenuAction) d.mergeFrom(new MenuAction(), bArr);
    }

    public MenuAction clear() {
        this.title = "";
        this.url = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.title);
        }
        return !this.url.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(2, this.url) : computeSerializedSize;
    }

    public MenuAction mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.title = aVar.o();
            } else if (p == 18) {
                this.url = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(1, this.title);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(2, this.url);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
