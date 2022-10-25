package com.tencent.trpcprotocol.projecta.common.preregister.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class PreRegister extends d {
    private static volatile PreRegister[] _emptyArray;
    public String discount;
    public String gpDetailUrl;
    public String officialUrl;
    public long preRegisterCount;
    public OpenConfig preRegisterOpenConfig;
    public String releaseDate;

    public PreRegister() {
        clear();
    }

    public static PreRegister[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new PreRegister[0];
                }
            }
        }
        return _emptyArray;
    }

    public static PreRegister parseFrom(a aVar) throws IOException {
        return new PreRegister().mergeFrom(aVar);
    }

    public static PreRegister parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (PreRegister) d.mergeFrom(new PreRegister(), bArr);
    }

    public PreRegister clear() {
        this.releaseDate = "";
        this.discount = "";
        this.officialUrl = "";
        this.preRegisterCount = 0;
        this.gpDetailUrl = "";
        this.preRegisterOpenConfig = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.releaseDate.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.releaseDate);
        }
        if (!this.discount.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.discount);
        }
        if (!this.officialUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.officialUrl);
        }
        long j2 = this.preRegisterCount;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(4, j2);
        }
        if (!this.gpDetailUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.gpDetailUrl);
        }
        OpenConfig openConfig = this.preRegisterOpenConfig;
        return openConfig != null ? computeSerializedSize + CodedOutputByteBufferNano.g(6, openConfig) : computeSerializedSize;
    }

    public PreRegister mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.releaseDate = aVar.o();
            } else if (p == 18) {
                this.discount = aVar.o();
            } else if (p == 26) {
                this.officialUrl = aVar.o();
            } else if (p == 32) {
                this.preRegisterCount = aVar.n();
            } else if (p == 42) {
                this.gpDetailUrl = aVar.o();
            } else if (p == 50) {
                if (this.preRegisterOpenConfig == null) {
                    this.preRegisterOpenConfig = new OpenConfig();
                }
                aVar.g(this.preRegisterOpenConfig);
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.releaseDate.equals("")) {
            codedOutputByteBufferNano.C(1, this.releaseDate);
        }
        if (!this.discount.equals("")) {
            codedOutputByteBufferNano.C(2, this.discount);
        }
        if (!this.officialUrl.equals("")) {
            codedOutputByteBufferNano.C(3, this.officialUrl);
        }
        long j2 = this.preRegisterCount;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(4, j2);
        }
        if (!this.gpDetailUrl.equals("")) {
            codedOutputByteBufferNano.C(5, this.gpDetailUrl);
        }
        OpenConfig openConfig = this.preRegisterOpenConfig;
        if (openConfig != null) {
            codedOutputByteBufferNano.w(6, openConfig);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
