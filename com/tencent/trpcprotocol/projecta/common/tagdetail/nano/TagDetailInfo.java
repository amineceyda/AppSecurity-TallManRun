package com.tencent.trpcprotocol.projecta.common.tagdetail.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.aiheadlineinfo.nano.AIHeadlineInfo;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import java.io.IOException;

public final class TagDetailInfo extends d {
    private static volatile TagDetailInfo[] _emptyArray;
    public AIHeadlineInfo aiHeadlineInfo;
    public String id;
    public boolean isAppTag;
    public boolean isUserUse;
    public String name;
    public OpenConfig tagOpenConfig;
    public String type;

    public TagDetailInfo() {
        clear();
    }

    public static TagDetailInfo[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new TagDetailInfo[0];
                }
            }
        }
        return _emptyArray;
    }

    public static TagDetailInfo parseFrom(a aVar) throws IOException {
        return new TagDetailInfo().mergeFrom(aVar);
    }

    public static TagDetailInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (TagDetailInfo) d.mergeFrom(new TagDetailInfo(), bArr);
    }

    public TagDetailInfo clear() {
        this.id = "";
        this.name = "";
        this.type = "";
        this.isUserUse = false;
        this.isAppTag = false;
        this.tagOpenConfig = null;
        this.aiHeadlineInfo = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.id.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.id);
        }
        if (!this.name.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.name);
        }
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.type);
        }
        boolean z = this.isUserUse;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(4, z);
        }
        boolean z2 = this.isAppTag;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.a(5, z2);
        }
        OpenConfig openConfig = this.tagOpenConfig;
        if (openConfig != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(6, openConfig);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        return aIHeadlineInfo != null ? computeSerializedSize + CodedOutputByteBufferNano.g(7, aIHeadlineInfo) : computeSerializedSize;
    }

    public TagDetailInfo mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.id = aVar.o();
            } else if (p == 18) {
                this.name = aVar.o();
            } else if (p == 26) {
                this.type = aVar.o();
            } else if (p == 32) {
                this.isUserUse = aVar.c();
            } else if (p != 40) {
                if (p == 50) {
                    if (this.tagOpenConfig == null) {
                        this.tagOpenConfig = new OpenConfig();
                    }
                    dVar = this.tagOpenConfig;
                } else if (p == 58) {
                    if (this.aiHeadlineInfo == null) {
                        this.aiHeadlineInfo = new AIHeadlineInfo();
                    }
                    dVar = this.aiHeadlineInfo;
                } else if (!aVar.s(p)) {
                    return this;
                }
                aVar.g(dVar);
            } else {
                this.isAppTag = aVar.c();
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.id.equals("")) {
            codedOutputByteBufferNano.C(1, this.id);
        }
        if (!this.name.equals("")) {
            codedOutputByteBufferNano.C(2, this.name);
        }
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(3, this.type);
        }
        boolean z = this.isUserUse;
        if (z) {
            codedOutputByteBufferNano.p(4, z);
        }
        boolean z2 = this.isAppTag;
        if (z2) {
            codedOutputByteBufferNano.p(5, z2);
        }
        OpenConfig openConfig = this.tagOpenConfig;
        if (openConfig != null) {
            codedOutputByteBufferNano.w(6, openConfig);
        }
        AIHeadlineInfo aIHeadlineInfo = this.aiHeadlineInfo;
        if (aIHeadlineInfo != null) {
            codedOutputByteBufferNano.w(7, aIHeadlineInfo);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
