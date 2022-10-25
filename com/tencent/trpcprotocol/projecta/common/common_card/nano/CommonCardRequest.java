package com.tencent.trpcprotocol.projecta.common.common_card.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class CommonCardRequest extends d {
    private static volatile CommonCardRequest[] _emptyArray;
    public String categoryId;
    public String developerId;
    public long developerUserId;
    public String packageName;
    public long pageIndex;
    public long pageSize;
    public String tagName;
    public String topicId;

    public CommonCardRequest() {
        clear();
    }

    public static CommonCardRequest[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CommonCardRequest[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CommonCardRequest parseFrom(a aVar) throws IOException {
        return new CommonCardRequest().mergeFrom(aVar);
    }

    public static CommonCardRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CommonCardRequest) d.mergeFrom(new CommonCardRequest(), bArr);
    }

    public CommonCardRequest clear() {
        this.pageIndex = 0;
        this.pageSize = 0;
        this.topicId = "";
        this.packageName = "";
        this.categoryId = "";
        this.developerId = "";
        this.developerUserId = 0;
        this.tagName = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j2 = this.pageIndex;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(1, j2);
        }
        long j3 = this.pageSize;
        if (j3 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(2, j3);
        }
        if (!this.topicId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.topicId);
        }
        if (!this.packageName.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.packageName);
        }
        if (!this.categoryId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(5, this.categoryId);
        }
        if (!this.developerId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(6, this.developerId);
        }
        long j4 = this.developerUserId;
        if (j4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(7, j4);
        }
        return !this.tagName.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(8, this.tagName) : computeSerializedSize;
    }

    public CommonCardRequest mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.pageIndex = aVar.n();
            } else if (p == 16) {
                this.pageSize = aVar.n();
            } else if (p == 26) {
                this.topicId = aVar.o();
            } else if (p == 34) {
                this.packageName = aVar.o();
            } else if (p == 42) {
                this.categoryId = aVar.o();
            } else if (p == 50) {
                this.developerId = aVar.o();
            } else if (p == 56) {
                this.developerUserId = aVar.n();
            } else if (p == 66) {
                this.tagName = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j2 = this.pageIndex;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(1, j2);
        }
        long j3 = this.pageSize;
        if (j3 != 0) {
            codedOutputByteBufferNano.v(2, j3);
        }
        if (!this.topicId.equals("")) {
            codedOutputByteBufferNano.C(3, this.topicId);
        }
        if (!this.packageName.equals("")) {
            codedOutputByteBufferNano.C(4, this.packageName);
        }
        if (!this.categoryId.equals("")) {
            codedOutputByteBufferNano.C(5, this.categoryId);
        }
        if (!this.developerId.equals("")) {
            codedOutputByteBufferNano.C(6, this.developerId);
        }
        long j4 = this.developerUserId;
        if (j4 != 0) {
            codedOutputByteBufferNano.v(7, j4);
        }
        if (!this.tagName.equals("")) {
            codedOutputByteBufferNano.C(8, this.tagName);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
