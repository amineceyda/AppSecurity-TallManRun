package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class RecallModuleArray extends d {
    private static volatile RecallModuleArray[] _emptyArray;
    public RecallModule[] modules;

    public RecallModuleArray() {
        clear();
    }

    public static RecallModuleArray[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallModuleArray[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallModuleArray parseFrom(a aVar) throws IOException {
        return new RecallModuleArray().mergeFrom(aVar);
    }

    public static RecallModuleArray parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallModuleArray) d.mergeFrom(new RecallModuleArray(), bArr);
    }

    public RecallModuleArray clear() {
        this.modules = RecallModule.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        RecallModule[] recallModuleArr = this.modules;
        if (recallModuleArr != null && recallModuleArr.length > 0) {
            int i2 = 0;
            while (true) {
                RecallModule[] recallModuleArr2 = this.modules;
                if (i2 >= recallModuleArr2.length) {
                    break;
                }
                RecallModule recallModule = recallModuleArr2[i2];
                if (recallModule != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, recallModule);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public RecallModuleArray mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                RecallModule[] recallModuleArr = this.modules;
                int length = recallModuleArr == null ? 0 : recallModuleArr.length;
                int i2 = a + length;
                RecallModule[] recallModuleArr2 = new RecallModule[i2];
                if (length != 0) {
                    System.arraycopy(recallModuleArr, 0, recallModuleArr2, 0, length);
                }
                while (length < i2 - 1) {
                    recallModuleArr2[length] = new RecallModule();
                    aVar.g(recallModuleArr2[length]);
                    aVar.p();
                    length++;
                }
                recallModuleArr2[length] = new RecallModule();
                aVar.g(recallModuleArr2[length]);
                this.modules = recallModuleArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        RecallModule[] recallModuleArr = this.modules;
        if (recallModuleArr != null && recallModuleArr.length > 0) {
            int i2 = 0;
            while (true) {
                RecallModule[] recallModuleArr2 = this.modules;
                if (i2 >= recallModuleArr2.length) {
                    break;
                }
                RecallModule recallModule = recallModuleArr2[i2];
                if (recallModule != null) {
                    codedOutputByteBufferNano.w(1, recallModule);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
