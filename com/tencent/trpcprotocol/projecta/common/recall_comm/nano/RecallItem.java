package com.tencent.trpcprotocol.projecta.common.recall_comm.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import java.io.IOException;
import java.util.Map;

public final class RecallItem extends d {
    private static volatile RecallItem[] _emptyArray;
    public String itemId;
    public Map<String, String> itemParams;
    public int itemSourceType;
    public int itemType;
    public Map<String, RecallItemList> subItems;

    public RecallItem() {
        clear();
    }

    public static RecallItem[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new RecallItem[0];
                }
            }
        }
        return _emptyArray;
    }

    public static RecallItem parseFrom(a aVar) throws IOException {
        return new RecallItem().mergeFrom(aVar);
    }

    public static RecallItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (RecallItem) d.mergeFrom(new RecallItem(), bArr);
    }

    public RecallItem clear() {
        this.itemType = 0;
        this.itemId = "";
        this.itemParams = null;
        this.subItems = null;
        this.itemSourceType = 0;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.itemType;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        if (!this.itemId.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.itemId);
        }
        Map<String, String> map = this.itemParams;
        if (map != null) {
            computeSerializedSize += b.a(map, 3, 9, 9);
        }
        Map<String, RecallItemList> map2 = this.subItems;
        if (map2 != null) {
            computeSerializedSize += b.a(map2, 4, 9, 11);
        }
        int i3 = this.itemSourceType;
        return i3 != 0 ? computeSerializedSize + CodedOutputByteBufferNano.e(5, i3) : computeSerializedSize;
    }

    public RecallItem mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.itemType = aVar.m();
            } else if (p == 18) {
                this.itemId = aVar.o();
            } else if (p == 26) {
                this.itemParams = b.b(aVar, this.itemParams, cVar, 9, 9, null, 10, 18);
            } else if (p == 34) {
                this.subItems = b.b(aVar, this.subItems, cVar, 9, 11, new RecallItemList(), 10, 18);
            } else if (p == 40) {
                this.itemSourceType = aVar.m();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.itemType;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        if (!this.itemId.equals("")) {
            codedOutputByteBufferNano.C(2, this.itemId);
        }
        Map<String, String> map = this.itemParams;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 3, 9, 9);
        }
        Map<String, RecallItemList> map2 = this.subItems;
        if (map2 != null) {
            b.d(codedOutputByteBufferNano, map2, 4, 9, 11);
        }
        int i3 = this.itemSourceType;
        if (i3 != 0) {
            codedOutputByteBufferNano.u(5, i3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
