package com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsList;
import com.tencent.trpcprotocol.projecta.common.paging.nano.Paging;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class SearchUserRsp extends d {
    private static volatile SearchUserRsp[] _emptyArray;
    public CmsList[] cmsList;
    public Paging page;

    public SearchUserRsp() {
        clear();
    }

    public static SearchUserRsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new SearchUserRsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static SearchUserRsp parseFrom(a aVar) throws IOException {
        return new SearchUserRsp().mergeFrom(aVar);
    }

    public static SearchUserRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (SearchUserRsp) d.mergeFrom(new SearchUserRsp(), bArr);
    }

    public SearchUserRsp clear() {
        this.page = null;
        this.cmsList = CmsList.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Paging paging = this.page;
        if (paging != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(1, paging);
        }
        CmsList[] cmsListArr = this.cmsList;
        if (cmsListArr != null && cmsListArr.length > 0) {
            int i2 = 0;
            while (true) {
                CmsList[] cmsListArr2 = this.cmsList;
                if (i2 >= cmsListArr2.length) {
                    break;
                }
                CmsList cmsList2 = cmsListArr2[i2];
                if (cmsList2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(2, cmsList2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public SearchUserRsp mergeFrom(a aVar) throws IOException {
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                if (this.page == null) {
                    this.page = new Paging();
                }
                aVar.g(this.page);
            } else if (p == 18) {
                int a = e.a(aVar, 18);
                CmsList[] cmsListArr = this.cmsList;
                int length = cmsListArr == null ? 0 : cmsListArr.length;
                int i2 = a + length;
                CmsList[] cmsListArr2 = new CmsList[i2];
                if (length != 0) {
                    System.arraycopy(cmsListArr, 0, cmsListArr2, 0, length);
                }
                while (length < i2 - 1) {
                    cmsListArr2[length] = new CmsList();
                    aVar.g(cmsListArr2[length]);
                    aVar.p();
                    length++;
                }
                cmsListArr2[length] = new CmsList();
                aVar.g(cmsListArr2[length]);
                this.cmsList = cmsListArr2;
            } else if (!aVar.s(p)) {
                return this;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Paging paging = this.page;
        if (paging != null) {
            codedOutputByteBufferNano.w(1, paging);
        }
        CmsList[] cmsListArr = this.cmsList;
        if (cmsListArr != null && cmsListArr.length > 0) {
            int i2 = 0;
            while (true) {
                CmsList[] cmsListArr2 = this.cmsList;
                if (i2 >= cmsListArr2.length) {
                    break;
                }
                CmsList cmsList2 = cmsListArr2[i2];
                if (cmsList2 != null) {
                    codedOutputByteBufferNano.w(2, cmsList2);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
