package com.tencent.trpcprotocol.projecta.common.openconfig.nano;

import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.tencent.beacon.event.open.EventResult;
import g.e.d.a.a;
import g.e.d.a.b;
import g.e.d.a.c;
import g.e.d.a.d;
import g.e.d.a.e;
import java.io.IOException;
import java.util.Map;

public final class OpenConfig extends d {
    private static volatile OpenConfig[] _emptyArray;
    public String clickUrl;
    public EventInfo eventInfo;
    public Map<String, String> eventInfoV2;
    public String installUrl;
    public MenuAction[] menuActions;
    public boolean noLoading;
    public boolean noLoadingTop;
    public OpenConfig[] pageConfigs;
    public String shareUrl;
    public boolean supportUrlVar;
    public String title;
    public String type;
    public String uninstallUrl;
    public String url;

    public OpenConfig() {
        clear();
    }

    public static OpenConfig[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (b.b) {
                if (_emptyArray == null) {
                    _emptyArray = new OpenConfig[0];
                }
            }
        }
        return _emptyArray;
    }

    public static OpenConfig parseFrom(a aVar) throws IOException {
        return new OpenConfig().mergeFrom(aVar);
    }

    public static OpenConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (OpenConfig) d.mergeFrom(new OpenConfig(), bArr);
    }

    public OpenConfig clear() {
        this.type = "";
        this.url = "";
        this.title = "";
        this.shareUrl = "";
        this.noLoading = false;
        this.eventInfo = null;
        this.clickUrl = "";
        this.pageConfigs = emptyArray();
        this.menuActions = MenuAction.emptyArray();
        this.eventInfoV2 = null;
        this.noLoadingTop = false;
        this.supportUrlVar = false;
        this.uninstallUrl = "";
        this.installUrl = "";
        this.cachedSize = -1;
        return this;
    }

    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.type.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(1, this.type);
        }
        if (!this.url.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(2, this.url);
        }
        if (!this.title.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(3, this.title);
        }
        if (!this.shareUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(4, this.shareUrl);
        }
        boolean z = this.noLoading;
        if (z) {
            computeSerializedSize += CodedOutputByteBufferNano.a(5, z);
        }
        EventInfo eventInfo2 = this.eventInfo;
        if (eventInfo2 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.g(6, eventInfo2);
        }
        if (!this.clickUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(7, this.clickUrl);
        }
        OpenConfig[] openConfigArr = this.pageConfigs;
        int i2 = 0;
        if (openConfigArr != null && openConfigArr.length > 0) {
            int i3 = 0;
            while (true) {
                OpenConfig[] openConfigArr2 = this.pageConfigs;
                if (i3 >= openConfigArr2.length) {
                    break;
                }
                OpenConfig openConfig = openConfigArr2[i3];
                if (openConfig != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(8, openConfig);
                }
                i3++;
            }
        }
        MenuAction[] menuActionArr = this.menuActions;
        if (menuActionArr != null && menuActionArr.length > 0) {
            while (true) {
                MenuAction[] menuActionArr2 = this.menuActions;
                if (i2 >= menuActionArr2.length) {
                    break;
                }
                MenuAction menuAction = menuActionArr2[i2];
                if (menuAction != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.g(9, menuAction);
                }
                i2++;
            }
        }
        Map<String, String> map = this.eventInfoV2;
        if (map != null) {
            computeSerializedSize += b.a(map, 10, 9, 9);
        }
        boolean z2 = this.noLoadingTop;
        if (z2) {
            computeSerializedSize += CodedOutputByteBufferNano.a(11, z2);
        }
        boolean z3 = this.supportUrlVar;
        if (z3) {
            computeSerializedSize += CodedOutputByteBufferNano.a(12, z3);
        }
        if (!this.uninstallUrl.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.j(13, this.uninstallUrl);
        }
        return !this.installUrl.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.j(14, this.installUrl) : computeSerializedSize;
    }

    public OpenConfig mergeFrom(a aVar) throws IOException {
        c.C0132c cVar = c.a;
        while (true) {
            int p = aVar.p();
            switch (p) {
                case 0:
                    return this;
                case 10:
                    this.type = aVar.o();
                    break;
                case ConnectionResult.SERVICE_UPDATING:
                    this.url = aVar.o();
                    break;
                case 26:
                    this.title = aVar.o();
                    break;
                case 34:
                    this.shareUrl = aVar.o();
                    break;
                case 40:
                    this.noLoading = aVar.c();
                    break;
                case 50:
                    if (this.eventInfo == null) {
                        this.eventInfo = new EventInfo();
                    }
                    aVar.g(this.eventInfo);
                    break;
                case 58:
                    this.clickUrl = aVar.o();
                    break;
                case 66:
                    int a = e.a(aVar, 66);
                    OpenConfig[] openConfigArr = this.pageConfigs;
                    int length = openConfigArr == null ? 0 : openConfigArr.length;
                    int i2 = a + length;
                    OpenConfig[] openConfigArr2 = new OpenConfig[i2];
                    if (length != 0) {
                        System.arraycopy(openConfigArr, 0, openConfigArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        openConfigArr2[length] = new OpenConfig();
                        aVar.g(openConfigArr2[length]);
                        aVar.p();
                        length++;
                    }
                    openConfigArr2[length] = new OpenConfig();
                    aVar.g(openConfigArr2[length]);
                    this.pageConfigs = openConfigArr2;
                    break;
                case 74:
                    int a2 = e.a(aVar, 74);
                    MenuAction[] menuActionArr = this.menuActions;
                    int length2 = menuActionArr == null ? 0 : menuActionArr.length;
                    int i3 = a2 + length2;
                    MenuAction[] menuActionArr2 = new MenuAction[i3];
                    if (length2 != 0) {
                        System.arraycopy(menuActionArr, 0, menuActionArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        menuActionArr2[length2] = new MenuAction();
                        aVar.g(menuActionArr2[length2]);
                        aVar.p();
                        length2++;
                    }
                    menuActionArr2[length2] = new MenuAction();
                    aVar.g(menuActionArr2[length2]);
                    this.menuActions = menuActionArr2;
                    break;
                case 82:
                    this.eventInfoV2 = b.b(aVar, this.eventInfoV2, cVar, 9, 9, null, 10, 18);
                    break;
                case 88:
                    this.noLoadingTop = aVar.c();
                    break;
                case 96:
                    this.supportUrlVar = aVar.c();
                    break;
                case EventResult.ERROR_CODE_NAME_NULL:
                    this.uninstallUrl = aVar.o();
                    break;
                case 114:
                    this.installUrl = aVar.o();
                    break;
                default:
                    if (aVar.s(p)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.type.equals("")) {
            codedOutputByteBufferNano.C(1, this.type);
        }
        if (!this.url.equals("")) {
            codedOutputByteBufferNano.C(2, this.url);
        }
        if (!this.title.equals("")) {
            codedOutputByteBufferNano.C(3, this.title);
        }
        if (!this.shareUrl.equals("")) {
            codedOutputByteBufferNano.C(4, this.shareUrl);
        }
        boolean z = this.noLoading;
        if (z) {
            codedOutputByteBufferNano.p(5, z);
        }
        EventInfo eventInfo2 = this.eventInfo;
        if (eventInfo2 != null) {
            codedOutputByteBufferNano.w(6, eventInfo2);
        }
        if (!this.clickUrl.equals("")) {
            codedOutputByteBufferNano.C(7, this.clickUrl);
        }
        OpenConfig[] openConfigArr = this.pageConfigs;
        int i2 = 0;
        if (openConfigArr != null && openConfigArr.length > 0) {
            int i3 = 0;
            while (true) {
                OpenConfig[] openConfigArr2 = this.pageConfigs;
                if (i3 >= openConfigArr2.length) {
                    break;
                }
                OpenConfig openConfig = openConfigArr2[i3];
                if (openConfig != null) {
                    codedOutputByteBufferNano.w(8, openConfig);
                }
                i3++;
            }
        }
        MenuAction[] menuActionArr = this.menuActions;
        if (menuActionArr != null && menuActionArr.length > 0) {
            while (true) {
                MenuAction[] menuActionArr2 = this.menuActions;
                if (i2 >= menuActionArr2.length) {
                    break;
                }
                MenuAction menuAction = menuActionArr2[i2];
                if (menuAction != null) {
                    codedOutputByteBufferNano.w(9, menuAction);
                }
                i2++;
            }
        }
        Map<String, String> map = this.eventInfoV2;
        if (map != null) {
            b.d(codedOutputByteBufferNano, map, 10, 9, 9);
        }
        boolean z2 = this.noLoadingTop;
        if (z2) {
            codedOutputByteBufferNano.p(11, z2);
        }
        boolean z3 = this.supportUrlVar;
        if (z3) {
            codedOutputByteBufferNano.p(12, z3);
        }
        if (!this.uninstallUrl.equals("")) {
            codedOutputByteBufferNano.C(13, this.uninstallUrl);
        }
        if (!this.installUrl.equals("")) {
            codedOutputByteBufferNano.C(14, this.installUrl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
