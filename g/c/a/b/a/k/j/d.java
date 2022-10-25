package g.c.a.b.a.k.j;

import android.view.View;

public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ o b;

    public /* synthetic */ d(o oVar) {
        this.b = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r0 = r16
            g.c.a.b.a.k.j.o r1 = r0.b
            android.widget.TextView r2 = r1.f1884g
            int r2 = r2.getMaxLines()
            int r3 = r1.G
            r4 = 8
            r5 = 0
            if (r2 != r3) goto L_0x0319
            android.widget.TextView r2 = r1.f1884g
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxLines(r3)
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r3 = r2.b
            boolean r3 = r3.hasVersion
            r6 = 1
            if (r3 != 0) goto L_0x0029
            android.view.View r2 = r1.f1890m
            r2.setVisibility(r4)
            goto L_0x0313
        L_0x0029:
            java.lang.String r2 = r2.h()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = "-"
            if (r2 != 0) goto L_0x007a
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r7 = r2.b
            boolean r7 = r7.isBeta
            if (r7 == 0) goto L_0x006b
            android.widget.TextView r2 = r1.n
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            g.c.a.b.a.k.f r8 = r1.c
            java.lang.String r8 = r8.h()
            r7.append(r8)
            java.lang.String r8 = "     "
            r7.append(r8)
            android.app.Activity r8 = r1.a
            r9 = 2131820685(0x7f11008d, float:1.9274092E38)
            java.lang.String r8 = r8.getString(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.setText(r7)
            android.widget.ImageView r2 = r1.o
            r2.setVisibility(r4)
            goto L_0x007f
        L_0x006b:
            android.widget.TextView r4 = r1.n
            java.lang.String r2 = r2.h()
            r4.setText(r2)
            android.widget.ImageView r2 = r1.o
            r2.setVisibility(r5)
            goto L_0x007f
        L_0x007a:
            android.widget.TextView r2 = r1.n
            r2.setText(r3)
        L_0x007f:
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            java.lang.String r2 = r2.updateDate
            java.util.Date r2 = g.c.a.m.i.b(r2)
            if (r2 == 0) goto L_0x009c
            android.content.Context r4 = r1.b
            int r7 = g.c.a.e.k.f.b.a
            android.content.Context r4 = r4.getApplicationContext()
            java.text.DateFormat r4 = android.text.format.DateFormat.getMediumDateFormat(r4)
            java.lang.String r2 = r4.format(r2)
            goto L_0x009d
        L_0x009c:
            r2 = 0
        L_0x009d:
            if (r2 == 0) goto L_0x00a5
            android.widget.TextView r4 = r1.p
            r4.setText(r2)
            goto L_0x00aa
        L_0x00a5:
            android.widget.TextView r2 = r1.p
            r2.setText(r3)
        L_0x00aa:
            g.c.a.b.a.k.f r2 = r1.c
            java.lang.String r2 = r2.g()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00bf
            android.widget.TextView r2 = r1.q
            g.c.a.b.a.k.f r4 = r1.c
            java.lang.String r4 = r4.g()
            goto L_0x00c2
        L_0x00bf:
            android.widget.TextView r2 = r1.q
            r4 = r3
        L_0x00c2:
            r2.setText(r4)
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r2 = r2.asset
            if (r2 == 0) goto L_0x00f4
            java.lang.String r2 = r2.type
            java.lang.String r4 = "APK"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x00dd
            android.widget.TextView r2 = r1.s
            r4 = 2131820604(0x7f11003c, float:1.9273928E38)
            goto L_0x00f0
        L_0x00dd:
            java.lang.String r4 = "XAPK"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00eb
            android.widget.TextView r2 = r1.s
            r4 = 2131821665(0x7f110461, float:1.927608E38)
            goto L_0x00f0
        L_0x00eb:
            android.widget.TextView r2 = r1.s
            r4 = 2131821545(0x7f1103e9, float:1.9275836E38)
        L_0x00f0:
            r2.setText(r4)
            goto L_0x00f9
        L_0x00f4:
            android.widget.TextView r2 = r1.s
            r2.setText(r3)
        L_0x00f9:
            android.content.Context r2 = r1.b
            android.widget.TextView r4 = r1.r
            g.c.a.b.a.k.f r7 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r7 = r7.b
            java.lang.String r8 = "mContext"
            i.o.c.h.e(r2, r8)
            java.lang.String r9 = "infoTv"
            i.o.c.h.e(r4, r9)
            java.lang.String r9 = "appDetailInfo"
            i.o.c.h.e(r7, r9)
            java.lang.String[] r7 = r7.permissions
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            if (r7 == 0) goto L_0x0124
            int r10 = r7.length
            if (r10 != 0) goto L_0x011e
            r10 = 1
            goto L_0x011f
        L_0x011e:
            r10 = 0
        L_0x011f:
            if (r10 == 0) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r10 = 0
            goto L_0x0125
        L_0x0124:
            r10 = 1
        L_0x0125:
            if (r10 != 0) goto L_0x012f
            java.lang.String r10 = "permissionArray"
            i.o.c.h.d(r7, r10)
            i.l.c.a(r9, r7)
        L_0x012f:
            boolean r7 = r9.isEmpty()
            java.lang.String r10 = ""
            if (r7 != 0) goto L_0x0213
            i.o.c.h.e(r2, r8)
            java.lang.String r7 = "permissions"
            i.o.c.h.e(r9, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.util.Iterator r9 = r9.iterator()
        L_0x0151:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01d4
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.PermissionInfo r11 = r2.getPermissionInfo(r11, r12)     // Catch:{ Exception -> 0x0164 }
            goto L_0x0165
        L_0x0164:
            r11 = 0
        L_0x0165:
            if (r11 == 0) goto L_0x01aa
            java.lang.CharSequence r12 = r11.loadLabel(r2)
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.String r12 = r12.toString()
            r13[r5] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r13, r6)
            java.lang.String r13 = "<b>%s</b>"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            java.lang.String r13 = "java.lang.String.format(format, *args)"
            i.o.c.h.d(r12, r13)
            java.lang.String r14 = "&#149;&nbsp;"
            java.lang.String r12 = i.o.c.h.j(r14, r12)
            java.lang.CharSequence r14 = r11.loadDescription(r2)
            if (r14 == 0) goto L_0x01aa
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.String r14 = r14.toString()
            r15[r5] = r14
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r15, r6)
            java.lang.String r15 = "<br><small>%s</small>"
            java.lang.String r14 = java.lang.String.format(r15, r14)
            i.o.c.h.d(r14, r13)
            java.lang.String r12 = i.o.c.h.j(r12, r14)
            r7.add(r12)
        L_0x01aa:
            r12 = 29
            if (r11 != 0) goto L_0x01b0
            r13 = 0
            goto L_0x01b2
        L_0x01b0:
            java.lang.String r13 = r11.group
        L_0x01b2:
            if (r13 == 0) goto L_0x0151
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 >= r12) goto L_0x0151
            java.lang.String r11 = r11.group     // Catch:{ Exception -> 0x01c4 }
            i.o.c.h.c(r11)     // Catch:{ Exception -> 0x01c4 }
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.PermissionGroupInfo r11 = r2.getPermissionGroupInfo(r11, r12)     // Catch:{ Exception -> 0x01c4 }
            goto L_0x01c5
        L_0x01c4:
            r11 = 0
        L_0x01c5:
            if (r11 == 0) goto L_0x0151
            java.lang.CharSequence r11 = r11.loadLabel(r2)
            java.lang.String r11 = r11.toString()
            r8.add(r11)
            goto L_0x0151
        L_0x01d4:
            int r2 = r7.size()
            if (r2 <= 0) goto L_0x01e1
            java.lang.String r2 = "<br><br>"
            java.lang.String r2 = android.text.TextUtils.join(r2, r7)
            goto L_0x01e2
        L_0x01e1:
            r2 = 0
        L_0x01e2:
            int r7 = r8.size()
            if (r7 <= 0) goto L_0x01ef
            java.lang.String r7 = "&nbsp;/&nbsp;"
            java.lang.String r7 = android.text.TextUtils.join(r7, r8)
            goto L_0x01f0
        L_0x01ef:
            r7 = 0
        L_0x01f0:
            i.e r8 = new i.e
            r8.<init>(r2, r7)
            java.lang.Object r2 = r8.c()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = r8.d()
            java.lang.String r7 = (java.lang.String) r7
            if (r2 == 0) goto L_0x020c
            int r2 = r2.length()
            if (r2 != 0) goto L_0x020a
            goto L_0x020c
        L_0x020a:
            r2 = 0
            goto L_0x020d
        L_0x020c:
            r2 = 1
        L_0x020d:
            if (r2 != 0) goto L_0x0213
            if (r7 != 0) goto L_0x0214
            r7 = r10
            goto L_0x0214
        L_0x0213:
            r7 = 0
        L_0x0214:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L_0x023c
            i.o.c.h.c(r7)
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r2 < r8) goto L_0x0237
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            android.text.Spanned r2 = android.text.Html.fromHtml(r2, r5)
            goto L_0x023d
        L_0x0237:
            android.text.Spanned r2 = android.text.Html.fromHtml(r7)
            goto L_0x023d
        L_0x023c:
            r2 = r3
        L_0x023d:
            r4.setText(r2)
            android.widget.TextView r2 = r1.t
            g.c.a.b.a.k.f r4 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r4 = r4.b
            java.lang.String r4 = r4.categoryName
            r2.setText(r4)
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            java.lang.String[] r2 = r2.contentRating
            if (r2 == 0) goto L_0x02b5
            int r2 = r2.length
            if (r2 <= 0) goto L_0x02b5
            android.widget.TextView r2 = r1.u
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            g.c.a.b.a.k.f r4 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r4 = r4.b
            java.lang.String[] r4 = r4.contentRating
            r4 = r4[r5]
            r3.append(r4)
            java.lang.String r4 = "\n"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            r2 = 0
        L_0x0275:
            g.c.a.b.a.k.f r3 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r3 = r3.b
            java.lang.String[] r3 = r3.contentRating
            int r4 = r3.length
            if (r2 >= r4) goto L_0x02ba
            if (r2 == 0) goto L_0x02b2
            int r4 = r3.length
            int r4 = r4 + -1
            if (r2 != r4) goto L_0x028d
            android.widget.TextView r4 = r1.u
            r3 = r3[r2]
            r4.append(r3)
            goto L_0x02b2
        L_0x028d:
            android.widget.TextView r3 = r1.u
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            g.c.a.b.a.k.f r7 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r7 = r7.b
            java.lang.String[] r7 = r7.contentRating
            r7 = r7[r2]
            r4.append(r7)
            android.content.Context r7 = r1.b
            r8 = 2131821233(0x7f1102b1, float:1.9275203E38)
            java.lang.String r7 = r7.getString(r8)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            r3.append(r4)
        L_0x02b2:
            int r2 = r2 + 1
            goto L_0x0275
        L_0x02b5:
            android.widget.TextView r2 = r1.u
            r2.setText(r3)
        L_0x02ba:
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.SourceInfo r2 = r2.sourceInfo
            if (r2 == 0) goto L_0x0307
            java.lang.String r2 = r2.name
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0307
            android.widget.TextView r2 = r1.v
            r2.setVisibility(r5)
            android.widget.TextView r2 = r1.w
            r2.setVisibility(r5)
            android.widget.TextView r2 = r1.w
            g.c.a.b.a.k.f r3 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r3 = r3.b
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.SourceInfo r3 = r3.sourceInfo
            java.lang.String r3 = r3.name
            r2.setText(r3)
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.SourceInfo r2 = r2.sourceInfo
            java.lang.String r2 = r2.url
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0313
            android.widget.TextView r2 = r1.w
            android.text.TextPaint r2 = r2.getPaint()
            if (r2 == 0) goto L_0x02fc
            r3 = 8
            r2.setFlags(r3)
        L_0x02fc:
            android.widget.TextView r2 = r1.w
            g.c.a.b.a.k.j.f r3 = new g.c.a.b.a.k.j.f
            r3.<init>(r1)
            r2.setOnClickListener(r3)
            goto L_0x0313
        L_0x0307:
            android.widget.TextView r2 = r1.v
            r3 = 8
            r2.setVisibility(r3)
            android.widget.TextView r2 = r1.w
            r2.setVisibility(r3)
        L_0x0313:
            r1.H = r6
            r1.a(r6)
            goto L_0x033f
        L_0x0319:
            android.widget.TextView r2 = r1.f1884g
            r2.setMaxLines(r3)
            android.widget.TextView r2 = r1.f1884g
            int r3 = r1.G
            r2.setLines(r3)
            g.c.a.b.a.k.f r2 = r1.c
            java.lang.String r2 = r2.c()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x033a
            android.view.View r2 = r1.f1890m
            if (r2 == 0) goto L_0x033a
            r3 = 8
            r2.setVisibility(r3)
        L_0x033a:
            r1.H = r5
            r1.a(r5)
        L_0x033f:
            boolean r2 = r1.H
            if (r2 == 0) goto L_0x0347
            android.view.View r2 = r1.f1890m
            r3 = 0
            goto L_0x034b
        L_0x0347:
            android.view.View r2 = r1.f1890m
            r3 = 8
        L_0x034b:
            r2.setVisibility(r3)
            android.widget.TextView r1 = r1.f1884g
            java.lang.CharSequence r2 = r1.getText()
            r1.setText(r2)
            g.i.c.a.a.i.b r1 = g.i.c.a.a.i.b.C0166b.a
            r2 = r17
            r1.j(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.a.k.j.d.onClick(android.view.View):void");
    }
}
