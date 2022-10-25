package g.c.a.b.a;

import com.apkpure.aegon.app.activity.AppDetailActivity;
import g.c.a.m.e;

public final /* synthetic */ class a implements e {
    public final /* synthetic */ AppDetailActivity a;

    public /* synthetic */ a(AppDetailActivity appDetailActivity) {
        this.a = appDetailActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0471  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Object r14) {
        /*
            r13 = this;
            com.apkpure.aegon.app.activity.AppDetailActivity r0 = r13.a
            g.c.a.b.a.k.f$a r14 = (g.c.a.b.a.k.f.a) r14
            g.c.a.b.a.k.j.r r1 = r0.s
            g.c.a.b.a.k.f$a r2 = g.c.a.b.a.k.f.a.fetch
            r3 = 8
            r4 = 0
            if (r14 != r2) goto L_0x002c
            android.widget.ProgressBar r2 = r1.f1897j
            r2.setVisibility(r3)
            g.c.a.b.a.k.f r2 = r1.c
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x002c
            android.view.View r2 = r1.q
            r2.setVisibility(r4)
            android.widget.TextView r2 = r1.r
            r5 = 2131821060(0x7f110204, float:1.9274853E38)
            r2.setText(r5)
            android.widget.LinearLayout r2 = r1.n
            r2.setVisibility(r3)
        L_0x002c:
            g.c.a.b.a.k.f r2 = r1.c
            java.lang.String r2 = r2.d()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            if (r2 != 0) goto L_0x0078
            android.content.Context r2 = r1.b
            g.c.a.b.a.k.f r6 = r1.c
            java.lang.String r6 = r6.d()
            android.widget.ImageView r7 = r1.f1899l
            android.content.Context r8 = r1.b
            int r8 = e.e.d.l.a.u0(r8, r5)
            g.d.a.p.e r8 = e.e.d.l.a.S(r8)
            e.e.d.l.a.Z(r2, r6, r7, r8)
            g.c.a.b.a.k.f r2 = r1.c
            java.lang.String r2 = r2.d()
            g.d.a.p.e r6 = e.e.d.l.a.Q()
            g.c.a.e.k.g.a r7 = new g.c.a.e.k.g.a
            android.app.Activity r8 = r1.a
            r9 = 23
            r10 = 30
            r7.<init>(r8, r9, r10)
            g.d.a.p.a r6 = r6.o(r7, r5)
            g.d.a.p.e r6 = (g.d.a.p.e) r6
            android.content.Context r7 = r1.b
            android.widget.ImageView r8 = r1.f1895h
            g.c.a.b.a.k.j.q r9 = new g.c.a.b.a.k.j.q
            r9.<init>(r1)
            e.e.d.l.a.a0(r7, r2, r8, r6, r9)
            goto L_0x0080
        L_0x0078:
            android.widget.ImageView r2 = r1.f1899l
            r6 = 2131230907(0x7f0800bb, float:1.807788E38)
            r2.setImageResource(r6)
        L_0x0080:
            g.c.a.b.a.k.f r2 = r1.c
            boolean r2 = r2.b()
            java.lang.String r6 = ""
            r7 = 0
            if (r2 == 0) goto L_0x008d
            goto L_0x01c2
        L_0x008d:
            android.widget.LinearLayout r2 = r1.n
            r2.setVisibility(r4)
            android.view.View r2 = r1.s
            r2.setVisibility(r4)
            android.view.View r2 = r1.q
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r1.f1898k
            r2.setVisibility(r4)
            android.app.Activity r2 = r1.a
            boolean r8 = r2 instanceof g.c.a.g.b.a
            if (r8 == 0) goto L_0x00b1
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r8 = new com.apkpure.aegon.components.statistics.datong.DTStatInfo
            g.c.a.g.b.a r2 = (g.c.a.g.b.a) r2
            g.c.a.e.h.b.a r2 = r2.p
            r8.<init>((g.c.a.e.h.b.a) r2)
            goto L_0x00b6
        L_0x00b1:
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r8 = new com.apkpure.aegon.components.statistics.datong.DTStatInfo
            r8.<init>()
        L_0x00b6:
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            int r2 = g.c.a.e.k.a.f.c(r2)
            r8.appId = r2
            java.lang.String r2 = "bootstrap_download_card"
            r8.moduleName = r2
            r2 = 1104(0x450, float:1.547E-42)
            r8.modelType = r2
            java.lang.String r2 = "0"
            r8.position = r2
            r8.smallPosition = r2
            r9 = 2008(0x7d8, double:9.92E-321)
            r8.scene = r9
            com.apkpure.aegon.view.button.DownloadButton r2 = r1.t
            g.c.a.b.a.k.f r9 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r9 = r9.b
            r2.f(r9, r8, r7)
            android.app.Activity r2 = r1.a
            if (r2 == 0) goto L_0x0159
            com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout r8 = r1.p
            if (r8 == 0) goto L_0x0159
            g.c.a.b.a.k.f r9 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r9 = r9.b
            java.lang.String r10 = "<this>"
            i.o.c.h.e(r2, r10)
            java.lang.String r10 = "appDetailInfo"
            i.o.c.h.e(r9, r10)
            java.lang.String r10 = "appFlagFl"
            i.o.c.h.e(r8, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r11 = r9.title
            r10.add(r11)
            r8.u = r5
            r11 = 5
            r8.q = r11
            r8.r = r4
            r8.s = r11
            r8.t = r4
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r11 = r9.asset
            if (r11 != 0) goto L_0x0111
            r11 = r7
            goto L_0x0113
        L_0x0111:
            java.lang.String r11 = r11.type
        L_0x0113:
            java.lang.String r12 = "XAPK"
            boolean r11 = i.o.c.h.a(r12, r11)
            if (r11 == 0) goto L_0x0125
            r11 = 2131820655(0x7f11006f, float:1.9274031E38)
            java.lang.String r11 = r2.getString(r11)
            r10.add(r11)
        L_0x0125:
            boolean r11 = r9.isAPKs
            if (r11 == 0) goto L_0x0133
            r11 = 2131820610(0x7f110042, float:1.927394E38)
            java.lang.String r11 = r2.getString(r11)
            r10.add(r11)
        L_0x0133:
            boolean r9 = r9.isOBB
            if (r9 == 0) goto L_0x0141
            r9 = 2131820639(0x7f11005f, float:1.9273999E38)
            java.lang.String r9 = r2.getString(r9)
            r10.add(r9)
        L_0x0141:
            boolean r9 = r10.isEmpty()
            if (r9 == 0) goto L_0x014b
            r8.setVisibility(r3)
            goto L_0x0159
        L_0x014b:
            r8.setVisibility(r4)
            r8.getSelectedList()
            g.c.a.o.a r9 = new g.c.a.o.a
            r9.<init>(r5, r2, r10)
            r8.setAdapter(r9)
        L_0x0159:
            android.widget.TextView r2 = r1.f1900m
            g.c.a.b.a.k.f r8 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r9 = r8.b
            if (r9 == 0) goto L_0x016e
            java.lang.String r9 = r9.developer
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x016e
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r8 = r8.b
            java.lang.String r8 = r8.developer
            goto L_0x016f
        L_0x016e:
            r8 = r6
        L_0x016f:
            r2.setText(r8)
            android.content.Context r2 = r1.b
            android.widget.TextView r8 = r1.f1900m
            r9 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r9 = e.e.d.l.a.C(r2, r9)
            android.content.Context r10 = r1.b
            r11 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r10 = e.e.d.l.a.C(r10, r11)
            e.e.d.l.a.T(r2, r8, r9, r10)
            g.c.a.b.a.k.f r2 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r2.b
            if (r2 == 0) goto L_0x0192
            boolean r2 = r2.isShowCommentScore
            goto L_0x0193
        L_0x0192:
            r2 = 0
        L_0x0193:
            if (r2 == 0) goto L_0x01bd
            android.widget.LinearLayout r2 = r1.n
            r2.setVisibility(r4)
            android.widget.TextView r2 = r1.o
            java.util.Locale r8 = g.c.a.m.l.b()
            java.lang.Object[] r9 = new java.lang.Object[r5]
            g.c.a.b.a.k.f r1 = r1.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.b
            if (r1 == 0) goto L_0x01ab
            double r10 = r1.commentScore
            goto L_0x01ad
        L_0x01ab:
            r10 = 0
        L_0x01ad:
            java.lang.Double r1 = java.lang.Double.valueOf(r10)
            r9[r4] = r1
            java.lang.String r1 = "%.1f"
            java.lang.String r1 = java.lang.String.format(r8, r1, r9)
            r2.setText(r1)
            goto L_0x01c2
        L_0x01bd:
            android.widget.LinearLayout r1 = r1.n
            r1.setVisibility(r3)
        L_0x01c2:
            g.c.a.b.a.k.j.o r0 = r0.t
            java.util.Objects.requireNonNull(r0)
            g.c.a.b.a.k.f$a r1 = g.c.a.b.a.k.f.a.parse
            if (r14 != r1) goto L_0x01d0
            org.slf4j.Logger r14 = g.c.a.b.a.k.j.o.J
            java.lang.String r0 = "FetchType.parse 跳过详情页 body 页面刷新."
            goto L_0x01dc
        L_0x01d0:
            g.c.a.b.a.k.f r14 = r0.c
            boolean r14 = r14.b()
            if (r14 == 0) goto L_0x01e1
            org.slf4j.Logger r14 = g.c.a.b.a.k.j.o.J
            java.lang.String r0 = "app 信息变化时,检测到 appDetail 信息为空."
        L_0x01dc:
            r14.warn(r0)
            goto L_0x0474
        L_0x01e1:
            g.c.a.b.a.k.f r14 = r0.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r14 = r14.b
            if (r14 == 0) goto L_0x01ed
            com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage[] r14 = r14.screenshots
            if (r14 == 0) goto L_0x01ed
            r14 = 1
            goto L_0x01ee
        L_0x01ed:
            r14 = 0
        L_0x01ee:
            if (r14 != 0) goto L_0x01f7
            android.widget.HorizontalScrollView r14 = r0.f1882e
            r14.setVisibility(r3)
            goto L_0x0288
        L_0x01f7:
            android.widget.HorizontalScrollView r14 = r0.f1882e
            r14.setVisibility(r4)
            android.app.Activity r14 = r0.a
            r1 = 2131298639(0x7f09094f, float:1.8215257E38)
            android.view.View r14 = r14.findViewById(r1)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            g.c.a.b.a.k.f r1 = r0.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r1.b
            if (r2 != 0) goto L_0x0216
            org.slf4j.Logger r1 = g.c.a.b.a.k.f.f1878d
            java.lang.String r2 = "extractGalleryDataFromAppInfo app Detail info is null."
            r1.info(r2)
            r1 = r7
            goto L_0x026f
        L_0x0216:
            com.tencent.trpcprotocol.projecta.common.tube.nano.TubeInfo[] r2 = r2.tubes
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collections.addAll(r8, r2)
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.b
            com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage[] r1 = r1.screenshots
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collections.addAll(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0235:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0250
            java.lang.Object r9 = r8.next()
            com.tencent.trpcprotocol.projecta.common.tube.nano.TubeInfo r9 = (com.tencent.trpcprotocol.projecta.common.tube.nano.TubeInfo) r9
            g.c.a.b.a.k.i.a r10 = new g.c.a.b.a.k.i.a
            r10.<init>()
            java.lang.String r11 = "type_tube"
            r10.c = r11
            r10.b = r9
            r1.add(r10)
            goto L_0x0235
        L_0x0250:
            java.util.Iterator r2 = r2.iterator()
        L_0x0254:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x026f
            java.lang.Object r8 = r2.next()
            com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage r8 = (com.tencent.trpcprotocol.projecta.common.bannerimage.nano.BannerImage) r8
            g.c.a.b.a.k.i.a r9 = new g.c.a.b.a.k.i.a
            r9.<init>()
            java.lang.String r10 = "type_img"
            r9.c = r10
            r9.a = r8
            r1.add(r9)
            goto L_0x0254
        L_0x026f:
            g.c.a.b.a.k.h r2 = new g.c.a.b.a.k.h
            android.widget.HorizontalScrollView r8 = r0.f1882e
            r2.<init>(r8, r1)
            g.c.a.b.a.k.j.n r8 = new g.c.a.b.a.k.j.n
            r8.<init>(r0, r14, r2)
            r2.registerDataSetObserver(r8)
            g.c.a.b.a.k.j.b r14 = new g.c.a.b.a.k.j.b
            r14.<init>(r0, r1)
            r2.f2184h = r14
            r2.notifyDataSetChanged()
        L_0x0288:
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.c()
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 == 0) goto L_0x02a0
            android.view.View r14 = r0.f1883f
            r14.setVisibility(r3)
            android.view.View r14 = r0.f1886i
            r14.setVisibility(r3)
            goto L_0x033f
        L_0x02a0:
            android.view.View r1 = r0.f1883f
            r1.setVisibility(r4)
            android.widget.TextView r1 = r0.f1884g
            android.text.Spanned r14 = android.text.Html.fromHtml(r14)
            r1.setText(r14)
            boolean r14 = r0.H
            if (r14 == 0) goto L_0x02b6
            android.view.View r14 = r0.f1890m
            r1 = 0
            goto L_0x02ba
        L_0x02b6:
            android.view.View r14 = r0.f1890m
            r1 = 8
        L_0x02ba:
            r14.setVisibility(r1)
            g.c.a.b.a.k.f r14 = r0.c
            android.content.Context r1 = r0.b
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r14.b
            if (r2 != 0) goto L_0x02c6
            goto L_0x030c
        L_0x02c6:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r14.b
            java.lang.String r2 = r2.inAppProducts
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x02e4
            g.c.a.b.a.k.i.b r2 = new g.c.a.b.a.k.i.b
            r8 = 2131820629(0x7f110055, float:1.9273978E38)
            java.lang.String r8 = r1.getString(r8)
            r2.<init>(r5, r8)
            r7.add(r2)
        L_0x02e4:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r14.b
            boolean r2 = r2.isAdSupported
            if (r2 == 0) goto L_0x02f9
            g.c.a.b.a.k.i.b r2 = new g.c.a.b.a.k.i.b
            r8 = 2131820628(0x7f110054, float:1.9273976E38)
            java.lang.String r1 = r1.getString(r8)
            r2.<init>(r5, r1)
            r7.add(r2)
        L_0x02f9:
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r14 = r14.b
            java.lang.String[] r14 = r14.contentRating
            if (r14 == 0) goto L_0x030c
            int r1 = r14.length
            if (r1 <= 0) goto L_0x030c
            g.c.a.b.a.k.i.b r1 = new g.c.a.b.a.k.i.b
            r14 = r14[r4]
            r1.<init>(r4, r14)
            r7.add(r1)
        L_0x030c:
            if (r7 == 0) goto L_0x0325
            boolean r14 = r7.isEmpty()
            if (r14 == 0) goto L_0x0315
            goto L_0x0325
        L_0x0315:
            com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout r14 = r0.f1885h
            r14.setVisibility(r4)
            com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout r14 = r0.f1885h
            g.c.a.b.a.k.j.m r1 = new g.c.a.b.a.k.j.m
            r1.<init>(r0, r7)
            r14.setAdapter(r1)
            goto L_0x0335
        L_0x0325:
            org.slf4j.Logger r14 = g.c.a.b.a.k.j.o.J
            if (r7 != 0) goto L_0x032b
            r1 = 1
            goto L_0x032c
        L_0x032b:
            r1 = 0
        L_0x032c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "updateDescriptionWarning 是 getDescriptionWarnInfo为空 {}"
            r14.info((java.lang.String) r2, (java.lang.Object) r1)
        L_0x0335:
            android.view.View r14 = r0.f1886i
            g.c.a.b.a.k.j.d r1 = new g.c.a.b.a.k.j.d
            r1.<init>(r0)
            r14.setOnClickListener(r1)
        L_0x033f:
            g.c.a.b.a.k.f r14 = r0.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r14 = r14.b
            java.lang.String r14 = r14.whatsnew
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0357
            android.view.View r14 = r0.x
            r14.setVisibility(r3)
            android.view.View r14 = r0.B
            r14.setVisibility(r3)
            goto L_0x0474
        L_0x0357:
            android.widget.TextView r14 = r0.A
            g.c.a.b.a.k.f r1 = r0.c
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.b
            java.lang.String r1 = r1.whatsnew
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r14.setText(r1)
            android.os.Handler r14 = r0.I
            g.c.a.b.a.k.j.c r1 = new g.c.a.b.a.k.j.c
            r1.<init>(r0)
            r14.post(r1)
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.h()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x03ce
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.g()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x03ce
            android.widget.TextView r14 = r0.z
            r1 = 2131821654(0x7f110456, float:1.9276057E38)
            r14.setText(r1)
            android.widget.TextView r14 = r0.z
            android.content.Context r1 = r0.b
            r2 = 2131821573(0x7f110405, float:1.9275893E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            g.c.a.b.a.k.f r7 = r0.c
            java.lang.String r7 = r7.h()
            r2[r4] = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r8 = r0.b
            r9 = 2131821493(0x7f1103b5, float:1.927573E38)
            java.lang.String r8 = r8.getString(r9)
            r7.append(r8)
            g.c.a.b.a.k.f r8 = r0.c
            java.lang.String r8 = r8.g()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2[r5] = r7
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r14.append(r1)
            goto L_0x041a
        L_0x03ce:
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.h()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x03f7
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.g()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x03f7
            android.widget.TextView r14 = r0.z
            r14.setVisibility(r4)
            android.widget.TextView r14 = r0.z
            g.c.a.b.a.k.f r1 = r0.c
            java.lang.String r1 = r1.h()
            r14.setText(r1)
            goto L_0x043d
        L_0x03f7:
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.h()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x0420
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.g()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x0420
            android.widget.TextView r14 = r0.z
            g.c.a.b.a.k.f r1 = r0.c
            java.lang.String r1 = r1.g()
            r14.setText(r1)
        L_0x041a:
            android.widget.TextView r14 = r0.z
            r14.setVisibility(r4)
            goto L_0x043d
        L_0x0420:
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.h()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x043d
            g.c.a.b.a.k.f r14 = r0.c
            java.lang.String r14 = r14.g()
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x043d
            android.widget.TextView r14 = r0.z
            r14.setVisibility(r3)
        L_0x043d:
            g.c.a.b.a.k.f r14 = r0.c
            android.content.Context r1 = r0.b
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r2 = r14.b
            if (r2 == 0) goto L_0x0465
            java.lang.String r2 = r2.updateDate
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0465
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r14 = r14.b
            java.lang.String r14 = r14.updateDate
            java.util.Date r14 = g.c.a.m.i.b(r14)
            if (r14 == 0) goto L_0x0465
            int r2 = g.c.a.e.k.f.b.a
            android.content.Context r1 = r1.getApplicationContext()
            java.text.DateFormat r1 = android.text.format.DateFormat.getMediumDateFormat(r1)
            java.lang.String r6 = r1.format(r14)
        L_0x0465:
            boolean r14 = android.text.TextUtils.isEmpty(r6)
            android.widget.TextView r0 = r0.y
            if (r14 != 0) goto L_0x0471
            r0.setText(r6)
            goto L_0x0474
        L_0x0471:
            r0.setVisibility(r3)
        L_0x0474:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.a.a.a(java.lang.Object):void");
    }
}
