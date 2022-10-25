package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class RecallItemList extends d {
    private static volatile RecallItemList[] _emptyArray;
    public RecallItem[] recallItem;

    public RecallItemList() {
        clear();
    }

    public static RecallItemList[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallItemList[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallItemList parseFrom(a aVar) throws IOException {
        return new RecallItemList().mergeFrom(aVar);
    }

    public static RecallItemList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallItemList) d.mergeFrom(new RecallItemList(), bArr);
    }

    public RecallItemList clear() {
        this.recallItem = RecallItem.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        RecallItem[] recallItemArr = this.recallItem;
        if (recallItemArr != null && recallItemArr.length > 0) {
            int i2 = 0;
            while (true) {
                RecallItem[] recallItemArr2 = this.recallItem;
                if (i2 >= recallItemArr2.length) {
                    break;
                }
                RecallItem recallItem2 = recallItemArr2[i2];
                if (recallItem2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(1, recallItem2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public RecallItemList mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                int a = e.a(aVar, 10);
                RecallItem[] recallItemArr = this.recallItem;
                int length = recallItemArr == null ? 0 : recallItemArr.length;
                int i2 = a + length;
                RecallItem[] recallItemArr2 = new RecallItem[i2];
                if (length != 0) {
                    System.arraycopy(recallItemArr, 0, recallItemArr2, 0, length);
                }
                while (length < i2 - 1) {
                    recallItemArr2[length] = new RecallItem();
                    aVar.g(recallItemArr2[length]);
                    aVar.p();
                    length++;
                }
                recallItemArr2[length] = new RecallItem();
                aVar.g(recallItemArr2[length]);
                this.recallItem = recallItemArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        RecallItem[] recallItemArr = this.recallItem;
        if (recallItemArr != null && recallItemArr.length > 0) {
            int i2 = 0;
            while (true) {
                RecallItem[] recallItemArr2 = this.recallItem;
                if (i2 >= recallItemArr2.length) {
                    break;
                }
                RecallItem recallItem2 = recallItemArr2[i2];
                if (recallItem2 != null) {
                    codedOutputByteBufferNano.w(1, recallItem2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
