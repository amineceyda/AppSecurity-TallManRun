package com.tencent.trpcprotocol.projecta.common.socialinfo.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class SocialInfo extends d {
    private static volatile SocialInfo[] _emptyArray;
    public String nickName;
    public String provider;

    public SocialInfo() {
        clear();
    }

    public static SocialInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SocialInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SocialInfo parseFrom(a aVar) throws IOException {
        return new SocialInfo().mergeFrom(aVar);
    }

    public static SocialInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SocialInfo) d.mergeFrom(new SocialInfo(), bArr);
    }

    public SocialInfo clear() {
        this.nickName = "";
        this.provider = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.nickName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.nickName);
        }
        return !this.provider.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(2, this.provider) : computeSerializedSize;
    }

    public SocialInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.nickName = aVar.o();
            } else if (p == 18) {
                this.provider = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.nickName.equals("")) {
            codedOutputByteBufferNano.C(1, this.nickName);
        }
        if (!this.provider.equals("")) {
            codedOutputByteBufferNano.C(2, this.provider);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
