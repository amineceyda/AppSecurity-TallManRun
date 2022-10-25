package com.tencent.trpcprotocol.projecta.common.cmsresponse.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.paging.nano.Paging;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class CmsList extends d {
    private static volatile CmsList[] _emptyArray;
    public boolean isShowUpdate;
    public CmsItemList[] itemList;
    public Paging paging;
    public long position;
    public String style;
    public String tag;

    public CmsList() {
        clear();
    }

    public static CmsList[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CmsList[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CmsList parseFrom(a aVar) throws IOException {
        return new CmsList().mergeFrom(aVar);
    }

    public static CmsList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CmsList) d.mergeFrom(new CmsList(), bArr);
    }

    public CmsList clear() {
        this.style = "";
        this.paging = null;
        this.itemList = CmsItemList.emptyArray();
        this.isShowUpdate = false;
        this.position = 0;
        this.tag = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.style.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.style);
        }
        Paging paging2 = this.paging;
        if (paging2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(2, paging2);
        }
        CmsItemList[] cmsItemListArr = this.itemList;
        if (cmsItemListArr != null && cmsItemListArr.length > 0) {
            int i2 = 0;
            while (true) {
                CmsItemList[] cmsItemListArr2 = this.itemList;
                if (i2 >= cmsItemListArr2.length) {
                    break;
                }
                CmsItemList cmsItemList = cmsItemListArr2[i2];
                if (cmsItemList != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(3, cmsItemList);
                }
                i2++;
            }
        }
        boolean z = this.isShowUpdate;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(4, z);
        }
        long j2 = this.position;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.f(5, j2);
        }
        return !this.tag.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(6, this.tag) : computeSerializedSize;
    }

    public CmsList mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.style = aVar.o();
            } else if (p == 18) {
                if (this.paging == null) {
                    this.paging = new Paging();
                }
                aVar.g(this.paging);
            } else if (p == 26) {
                int a = e.a(aVar, 26);
                CmsItemList[] cmsItemListArr = this.itemList;
                int length = cmsItemListArr == null ? 0 : cmsItemListArr.length;
                int i2 = a + length;
                CmsItemList[] cmsItemListArr2 = new CmsItemList[i2];
                if (length != 0) {
                    System.arraycopy(cmsItemListArr, 0, cmsItemListArr2, 0, length);
                }
                while (length < i2 - 1) {
                    cmsItemListArr2[length] = new CmsItemList();
                    aVar.g(cmsItemListArr2[length]);
                    aVar.p();
                    length++;
                }
                cmsItemListArr2[length] = new CmsItemList();
                aVar.g(cmsItemListArr2[length]);
                this.itemList = cmsItemListArr2;
            } else if (p == 32) {
                this.isShowUpdate = aVar.c();
            } else if (p == 40) {
                this.position = aVar.n();
            } else if (p == 50) {
                this.tag = aVar.o();
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.style.equals("")) {
            codedOutputByteBufferNano.C(1, this.style);
        }
        Paging paging2 = this.paging;
        if (paging2 != null) {
            codedOutputByteBufferNano.w(2, paging2);
        }
        CmsItemList[] cmsItemListArr = this.itemList;
        if (cmsItemListArr != null && cmsItemListArr.length > 0) {
            int i2 = 0;
            while (true) {
                CmsItemList[] cmsItemListArr2 = this.itemList;
                if (i2 >= cmsItemListArr2.length) {
                    break;
                }
                CmsItemList cmsItemList = cmsItemListArr2[i2];
                if (cmsItemList != null) {
                    codedOutputByteBufferNano.w(3, cmsItemList);
                }
                i2++;
            }
        }
        boolean z = this.isShowUpdate;
        if (z) {
            codedOutputByteBufferNano.p(4, z);
        }
        long j2 = this.position;
        if (j2 != 0) {
            codedOutputByteBufferNano.v(5, j2);
        }
        if (!this.tag.equals("")) {
            codedOutputByteBufferNano.C(6, this.tag);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
