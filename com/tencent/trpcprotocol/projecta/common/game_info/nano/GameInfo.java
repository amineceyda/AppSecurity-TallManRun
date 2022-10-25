package com.tencent.trpcprotocol.projecta.common.game_info.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class GameInfo extends d {
    private static volatile GameInfo[] _emptyArray;
    public long endTime;
    public String gifUrl;
    public String iconUrl;
    public String name;
    public String provider;
    public long startTime;
    public String targetUrl;

    public GameInfo() {
        clear();
    }

    public static GameInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GameInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GameInfo parseFrom(a aVar) throws IOException {
        return new GameInfo().mergeFrom(aVar);
    }

    public static GameInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GameInfo) d.mergeFrom(new GameInfo(), bArr);
    }

    public GameInfo clear() {
        this.name = "";
        this.iconUrl = "";
        this.gifUrl = "";
        this.targetUrl = "";
        this.startTime = 0;
        this.endTime = 0;
        this.provider = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.name);
        }
        if (!this.iconUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.iconUrl);
        }
        if (!this.gifUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.gifUrl);
        }
        if (!this.targetUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.targetUrl);
        }
        long j2 = this.startTime;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(5, j2);
        }
        long j3 = this.endTime;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(6, j3);
        }
        return !this.provider.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(7, this.provider) : computeSerializedSize;
    }

    public GameInfo mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.name = aVar.o();
            } else if (p == 18) {
                this.iconUrl = aVar.o();
            } else if (p == 26) {
                this.gifUrl = aVar.o();
            } else if (p == 34) {
                this.targetUrl = aVar.o();
            } else if (p == 40) {
                this.startTime = aVar.n();
            } else if (p == 48) {
                this.endTime = aVar.n();
            } else if (p == 58) {
                this.provider = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(1, this.name);
        }
        if (!this.iconUrl.equals("")) {
            codedOutputByteBufferNano.C(2, this.iconUrl);
        }
        if (!this.gifUrl.equals("")) {
            codedOutputByteBufferNano.C(3, this.gifUrl);
        }
        if (!this.targetUrl.equals("")) {
            codedOutputByteBufferNano.C(4, this.targetUrl);
        }
        long j2 = this.startTime;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(5, j2);
        }
        long j3 = this.endTime;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(6, j3);
        }
        if (!this.provider.equals("")) {
            codedOutputByteBufferNano.C(7, this.provider);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
