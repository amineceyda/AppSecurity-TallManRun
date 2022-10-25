package com.tencent.trpcprotocol.projecta.vl_recall_app_detail.vl_recall_app_detail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.PreFetch;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class GetAppDetailV1Rsp extends d {
    private static volatile GetAppDetailV1Rsp[] _emptyArray;
    public AppDetailInfo appDetail;
    public CmsResponse cmsResponse;
    public String errmsg;
    public PreFetch[] preFetch;
    public int retcode;

    public GetAppDetailV1Rsp() {
        clear();
    }

    public static GetAppDetailV1Rsp[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new GetAppDetailV1Rsp[0];
                }
            }
        }
        return _emptyArray;
    }

    public static GetAppDetailV1Rsp parseFrom(a aVar) throws IOException {
        return new GetAppDetailV1Rsp().mergeFrom(aVar);
    }

    public static GetAppDetailV1Rsp parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (GetAppDetailV1Rsp) d.mergeFrom(new GetAppDetailV1Rsp(), bArr);
    }

    public GetAppDetailV1Rsp clear() {
        this.retcode = 0;
        this.errmsg = "";
        this.appDetail = null;
        this.cmsResponse = null;
        this.preFetch = PreFetch.emptyArray();
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i2 = this.retcode;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(1, i2);
        }
        if (!this.errmsg.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.errmsg);
        }
        AppDetailInfo appDetailInfo = this.appDetail;
        if (appDetailInfo != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(3, appDetailInfo);
        }
        CmsResponse cmsResponse2 = this.cmsResponse;
        if (cmsResponse2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(4, cmsResponse2);
        }
        PreFetch[] preFetchArr = this.preFetch;
        if (preFetchArr != null && preFetchArr.length > 0) {
            int i3 = 0;
            while (true) {
                PreFetch[] preFetchArr2 = this.preFetch;
                if (i3 >= preFetchArr2.length) {
                    break;
                }
                PreFetch preFetch2 = preFetchArr2[i3];
                if (preFetch2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(5, preFetch2);
                }
                i3++;
            }
        }
        return computeSerializedSize;
    }

    public GetAppDetailV1Rsp mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 8) {
                this.retcode = aVar.m();
            } else if (p != 18) {
                if (p == 26) {
                    if (this.appDetail == null) {
                        this.appDetail = new AppDetailInfo();
                    }
                    dVar = this.appDetail;
                } else if (p == 34) {
                    if (this.cmsResponse == null) {
                        this.cmsResponse = new CmsResponse();
                    }
                    dVar = this.cmsResponse;
                } else if (p == 42) {
                    int a = e.a(aVar, 42);
                    PreFetch[] preFetchArr = this.preFetch;
                    int length = preFetchArr == null ? 0 : preFetchArr.length;
                    int i2 = a + length;
                    PreFetch[] preFetchArr2 = new PreFetch[i2];
                    if (length != 0) {
                        System.arraycopy(preFetchArr, 0, preFetchArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        preFetchArr2[length] = new PreFetch();
                        aVar.g(preFetchArr2[length]);
                        aVar.p();
                        length++;
                    }
                    preFetchArr2[length] = new PreFetch();
                    aVar.g(preFetchArr2[length]);
                    this.preFetch = preFetchArr2;
                } else if (!aVar.s(p)) {
                    return this;
                }
                aVar.g(dVar);
            } else {
                this.errmsg = aVar.o();
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i2 = this.retcode;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(1, i2);
        }
        if (!this.errmsg.equals("")) {
            codedOutputByteBufferNano.C(2, this.errmsg);
        }
        AppDetailInfo appDetailInfo = this.appDetail;
        if (appDetailInfo != null) {
            codedOutputByteBufferNano.w(3, appDetailInfo);
        }
        CmsResponse cmsResponse2 = this.cmsResponse;
        if (cmsResponse2 != null) {
            codedOutputByteBufferNano.w(4, cmsResponse2);
        }
        PreFetch[] preFetchArr = this.preFetch;
        if (preFetchArr != null && preFetchArr.length > 0) {
            int i3 = 0;
            while (true) {
                PreFetch[] preFetchArr2 = this.preFetch;
                if (i3 >= preFetchArr2.length) {
                    break;
                }
                PreFetch preFetch2 = preFetchArr2[i3];
                if (preFetch2 != null) {
                    codedOutputByteBufferNano.w(5, preFetch2);
                }
                i3++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
