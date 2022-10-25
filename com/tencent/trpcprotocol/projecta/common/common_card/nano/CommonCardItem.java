package com.tencent.trpcprotocol.projecta.common.common_card.nano;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage;
import com.tencent.trpcprotocol.projecta.common.card_data.nano.CardData;
import com.tencent.trpcprotocol.projecta.common.openconfig.nano.OpenConfig;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;

public final class CommonCardItem extends d {
    private static volatile CommonCardItem[] _emptyArray;
    public AppCardConfig appCardConfig;
    public CardData[] data;
    public int dataType;
    public BannerImage icon;
    public OpenConfig openConfig;
    public String title;
    public String type;

    public CommonCardItem() {
        clear();
    }

    public static CommonCardItem[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CommonCardItem[0];
                }
            }
        }
        return _emptyArray;
    }

    public static CommonCardItem parseFrom(a aVar) throws IOException {
        return new CommonCardItem().mergeFrom(aVar);
    }

    public static CommonCardItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (CommonCardItem) d.mergeFrom(new CommonCardItem(), bArr);
    }

    public CommonCardItem clear() {
        this.type = "";
        this.title = "";
        this.dataType = 0;
        this.data = CardData.emptyArray();
        this.appCardConfig = null;
        this.openConfig = null;
        this.icon = null;
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.type);
        }
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.title);
        }
        int i2 = this.dataType;
        if (i2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.e(3, i2);
        }
        CardData[] cardDataArr = this.data;
        if (cardDataArr != null && cardDataArr.length > 0) {
            int i3 = 0;
            while (true) {
                CardData[] cardDataArr2 = this.data;
                if (i3 >= cardDataArr2.length) {
                    break;
                }
                CardData cardData = cardDataArr2[i3];
                if (cardData != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(4, cardData);
                }
                i3++;
            }
        }
        AppCardConfig appCardConfig2 = this.appCardConfig;
        if (appCardConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(5, appCardConfig2);
        }
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(6, openConfig2);
        }
        BannerImage bannerImage = this.icon;
        return bannerImage != null ? computeSerializedSize + CodedOutputByteBufferNano.g(7, bannerImage) : computeSerializedSize;
    }

    public CommonCardItem mergeFrom(a aVar) throws IOException {
        d dVar;
        while (true) {
            int p = aVar.p();
            if (p == 0) {
                return this;
            }
            if (p == 10) {
                this.type = aVar.o();
            } else if (p == 18) {
                this.title = aVar.o();
            } else if (p == 24) {
                int m2 = aVar.m();
                if (m2 == 0 || m2 == 1 || m2 == 2 || m2 == 3 || m2 == 4 || m2 == 5) {
                    this.dataType = m2;
                }
            } else if (p != 34) {
                if (p == 42) {
                    if (this.appCardConfig == null) {
                        this.appCardConfig = new AppCardConfig();
                    }
                    dVar = this.appCardConfig;
                } else if (p == 50) {
                    if (this.openConfig == null) {
                        this.openConfig = new OpenConfig();
                    }
                    dVar = this.openConfig;
                } else if (p == 58) {
                    if (this.icon == null) {
                        this.icon = new BannerImage();
                    }
                    dVar = this.icon;
                } else if (!aVar.s(p)) {
                    return this;
                }
                aVar.g(dVar);
            } else {
                int a = e.a(aVar, 34);
                CardData[] cardDataArr = this.data;
                int length = cardDataArr == null ? 0 : cardDataArr.length;
                int i2 = a + length;
                CardData[] cardDataArr2 = new CardData[i2];
                if (length != 0) {
                    System.arraycopy(cardDataArr, 0, cardDataArr2, 0, length);
                }
                while (length < i2 - 1) {
                    cardDataArr2[length] = new CardData();
                    aVar.g(cardDataArr2[length]);
                    aVar.p();
                    length++;
                }
                cardDataArr2[length] = new CardData();
                aVar.g(cardDataArr2[length]);
                this.data = cardDataArr2;
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(1, this.type);
        }
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(2, this.title);
        }
        int i2 = this.dataType;
        if (i2 != 0) {
            codedOutputByteBufferNano.u(3, i2);
        }
        CardData[] cardDataArr = this.data;
        if (cardDataArr != null && cardDataArr.length > 0) {
            int i3 = 0;
            while (true) {
                CardData[] cardDataArr2 = this.data;
                if (i3 >= cardDataArr2.length) {
                    break;
                }
                CardData cardData = cardDataArr2[i3];
                if (cardData != null) {
                    codedOutputByteBufferNano.w(4, cardData);
                }
                i3++;
            }
        }
        AppCardConfig appCardConfig2 = this.appCardConfig;
        if (appCardConfig2 != null) {
            codedOutputByteBufferNano.w(5, appCardConfig2);
        }
        OpenConfig openConfig2 = this.openConfig;
        if (openConfig2 != null) {
            codedOutputByteBufferNano.w(6, openConfig2);
        }
        BannerImage bannerImage = this.icon;
        if (bannerImage != null) {
            codedOutputByteBufferNano.w(7, bannerImage);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
