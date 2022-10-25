package com.apkpure.aegon.view.button;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.e.c.a;
import g.c.a.e.c.b;
import g.c.a.e.c.c;
import g.c.a.m.l;
import g.c.a.n.a.i;
import g.c.a.n.a.j;
import g.c.a.n.a.k;
import g.c.b.b.f;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import j.a.h0;
import j.a.x;
import j.a.y;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DownloadButton extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final DownloadButton f288l = null;

    /* renamed from: m  reason: collision with root package name */
    public static final Logger f289m = LoggerFactory.getLogger("DownloadButtonLog");
    public static float n;
    public static float o;
    public static float p;
    public static float q;
    public static final TextPaint r = new TextPaint();
    public Context b;
    public TextView c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressBar f290d;

    /* renamed from: e  reason: collision with root package name */
    public final k f291e = new k((j) null, (DownloadTask) null, (AppDetailInfo) null, (DTStatInfo) null, 15);

    /* renamed from: f  reason: collision with root package name */
    public final i f292f = new i();

    /* renamed from: g  reason: collision with root package name */
    public c.b f293g;

    /* renamed from: h  reason: collision with root package name */
    public a.b f294h;

    /* renamed from: i  reason: collision with root package name */
    public b.C0060b f295i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f296j = true;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f297k;

    @e(c = "com.apkpure.aegon.view.button.DownloadButton$launchCoroutineScopeScope$1", f = "DownloadButton.kt", l = {345}, m = "invokeSuspend")
    public static final class a extends h implements p<x, i.m.d<? super i.j>, Object> {
        public final /* synthetic */ k $downloadButtonStateInfo;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ DownloadButton this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DownloadButton downloadButton, k kVar, i.m.d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = downloadButton;
            this.$downloadButtonStateInfo = kVar;
        }

        public final i.m.d<i.j> a(Object obj, i.m.d<?> dVar) {
            a aVar = new a(this.this$0, this.$downloadButtonStateInfo, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public Object d(Object obj, Object obj2) {
            a aVar = new a(this.this$0, this.$downloadButtonStateInfo, (i.m.d) obj2);
            aVar.L$0 = (x) obj;
            return aVar.l(i.j.a);
        }

        public final Object l(Object obj) {
            x xVar;
            i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                f.q0(obj);
                x xVar2 = (x) this.L$0;
                DownloadButton downloadButton = this.this$0;
                k kVar = this.$downloadButtonStateInfo;
                this.L$0 = xVar2;
                this.label = 1;
                DownloadButton downloadButton2 = DownloadButton.f288l;
                Objects.requireNonNull(downloadButton);
                h0 h0Var = h0.c;
                Object x0 = f.x0(h0.a, new g.c.a.n.a.h(kVar, downloadButton, (i.m.d<? super g.c.a.n.a.h>) null), this);
                if (x0 != aVar) {
                    x0 = i.j.a;
                }
                if (x0 == aVar) {
                    return aVar;
                }
                xVar = xVar2;
            } else if (i2 == 1) {
                xVar = (x) this.L$0;
                f.q0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.f(xVar, (CancellationException) null, 1);
            return i.j.a;
        }
    }

    public static final class b implements c.a {
        public final /* synthetic */ DownloadButton a;

        public b(DownloadButton downloadButton) {
            this.a = downloadButton;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
            if (r1.isDownloading() != false) goto L_0x0045;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(android.content.Context r1, java.lang.String r2) {
            /*
                r0 = this;
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                g.c.a.n.a.k r1 = r1.getDownloadButtonStateInfo()
                com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.c
                if (r1 == 0) goto L_0x004b
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                g.c.a.n.a.k r1 = r1.getDownloadButtonStateInfo()
                com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.c
                i.o.c.h.c(r1)
                java.lang.String r1 = r1.packageName
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x001e
                goto L_0x004b
            L_0x001e:
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                g.c.a.n.a.i r1 = r1.getDownloadButtonManager()
                com.apkpure.aegon.view.button.DownloadButton r2 = r0.a
                g.c.a.n.a.k r2 = r2.getDownloadButtonStateInfo()
                java.util.Objects.requireNonNull(r1)
                java.lang.String r1 = "stateInfo"
                i.o.c.h.e(r2, r1)
                com.apkpure.aegon.components.download.DownloadTask r1 = r2.b
                if (r1 == 0) goto L_0x0040
                i.o.c.h.c(r1)
                boolean r1 = r1.isDownloading()
                if (r1 == 0) goto L_0x0040
                goto L_0x0045
            L_0x0040:
                g.c.a.n.a.j r1 = g.c.a.n.a.j.INSTALLED
                r2.b(r1)
            L_0x0045:
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                r2 = 0
                r1.o(r2)
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.view.button.DownloadButton.b.a(android.content.Context, java.lang.String):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
            if (r1.isDownloading() != false) goto L_0x0045;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(android.content.Context r1, java.lang.String r2) {
            /*
                r0 = this;
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                g.c.a.n.a.k r1 = r1.getDownloadButtonStateInfo()
                com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.c
                if (r1 == 0) goto L_0x004b
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                g.c.a.n.a.k r1 = r1.getDownloadButtonStateInfo()
                com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r1.c
                i.o.c.h.c(r1)
                java.lang.String r1 = r1.packageName
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x001e
                goto L_0x004b
            L_0x001e:
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                g.c.a.n.a.i r1 = r1.getDownloadButtonManager()
                com.apkpure.aegon.view.button.DownloadButton r2 = r0.a
                g.c.a.n.a.k r2 = r2.getDownloadButtonStateInfo()
                java.util.Objects.requireNonNull(r1)
                java.lang.String r1 = "stateInfo"
                i.o.c.h.e(r2, r1)
                com.apkpure.aegon.components.download.DownloadTask r1 = r2.b
                if (r1 == 0) goto L_0x0040
                i.o.c.h.c(r1)
                boolean r1 = r1.isDownloading()
                if (r1 == 0) goto L_0x0040
                goto L_0x0045
            L_0x0040:
                g.c.a.n.a.j r1 = g.c.a.n.a.j.WAITING_FOR_DOWNLOAD
                r2.b(r1)
            L_0x0045:
                com.apkpure.aegon.view.button.DownloadButton r1 = r0.a
                r2 = 0
                r1.o(r2)
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.view.button.DownloadButton.b.b(android.content.Context, java.lang.String):void");
        }
    }

    public static final class c implements a.C0059a {
        public final /* synthetic */ DownloadButton a;

        public c(DownloadButton downloadButton) {
            this.a = downloadButton;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
            if (r1.isDownloading() != false) goto L_0x0035;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(android.content.Context r3, int r4) {
            /*
                r2 = this;
                com.apkpure.aegon.view.button.DownloadButton r3 = r2.a
                g.c.a.n.a.i r3 = r3.getDownloadButtonManager()
                com.apkpure.aegon.view.button.DownloadButton r4 = r2.a
                android.content.Context r4 = r4.getContext()
                java.lang.String r0 = "getContext()"
                i.o.c.h.d(r4, r0)
                com.apkpure.aegon.view.button.DownloadButton r0 = r2.a
                g.c.a.n.a.k r0 = r0.getDownloadButtonStateInfo()
                java.util.Objects.requireNonNull(r3)
                java.lang.String r1 = "context"
                i.o.c.h.e(r4, r1)
                java.lang.String r1 = "stateInfo"
                i.o.c.h.e(r0, r1)
                com.apkpure.aegon.components.download.DownloadTask r1 = r0.b
                if (r1 == 0) goto L_0x0032
                i.o.c.h.c(r1)
                boolean r1 = r1.isDownloading()
                if (r1 == 0) goto L_0x0032
                goto L_0x0035
            L_0x0032:
                r3.h(r4, r0)
            L_0x0035:
                com.apkpure.aegon.view.button.DownloadButton r3 = r2.a
                r4 = 0
                r3.o(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.view.button.DownloadButton.c.a(android.content.Context, int):void");
        }
    }

    public static final class d implements b.a {
        public final /* synthetic */ DownloadButton a;

        public d(DownloadButton downloadButton) {
            this.a = downloadButton;
        }

        public void a(Context context, DownloadTask downloadTask) {
            if (DownloadButton.a(this.a, downloadTask)) {
                i downloadButtonManager = this.a.getDownloadButtonManager();
                k downloadButtonStateInfo = this.a.getDownloadButtonStateInfo();
                Objects.requireNonNull(downloadButtonManager);
                i.o.c.h.e(downloadButtonStateInfo, "stateInfo");
                downloadButtonStateInfo.b(j.WAITING_FOR_DOWNLOAD);
                this.a.o((String) null);
            }
        }

        public void b(Context context, DownloadTask downloadTask) {
            Float f2;
            ProgressBar downloadProgressBar;
            if (DownloadButton.a(this.a, downloadTask)) {
                this.a.getDownloadButtonStateInfo().b = downloadTask;
                k downloadButtonStateInfo = this.a.getDownloadButtonStateInfo();
                DTStatInfo statInfo = downloadTask == null ? null : downloadTask.getStatInfo();
                i.o.c.h.c(statInfo);
                downloadButtonStateInfo.a(statInfo);
                i downloadButtonManager = this.a.getDownloadButtonManager();
                k downloadButtonStateInfo2 = this.a.getDownloadButtonStateInfo();
                Objects.requireNonNull(downloadButtonManager);
                i.o.c.h.e(downloadButtonStateInfo2, "stateInfo");
                downloadButtonStateInfo2.b(j.f2102h);
                if (downloadTask == null) {
                    f2 = null;
                } else {
                    f2 = Float.valueOf(downloadTask.getDownloadPercent());
                }
                if (!(f2 == null || (downloadProgressBar = this.a.getDownloadProgressBar()) == null)) {
                    downloadProgressBar.setProgress((int) downloadTask.getDownloadPercent());
                }
                if (this.a.getShowProgressOnButton()) {
                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    i.o.c.h.c(downloadTask);
                    String format = decimalFormat.format(Float.valueOf(downloadTask.getDownloadPercent()));
                    DownloadButton.f289m.debug(i.o.c.h.j("onDownloadStarted update: ", format));
                    DownloadButton downloadButton = this.a;
                    String format2 = String.format("%s%%", Arrays.copyOf(new Object[]{format}, 1));
                    i.o.c.h.d(format2, "java.lang.String.format(format, *args)");
                    downloadButton.o(format2);
                    return;
                }
                this.a.o((String) null);
            }
        }

        public void c(Context context, DownloadTask downloadTask) {
            if (DownloadButton.a(this.a, downloadTask)) {
                this.a.getDownloadButtonStateInfo().b = downloadTask;
                k downloadButtonStateInfo = this.a.getDownloadButtonStateInfo();
                DTStatInfo statInfo = downloadTask == null ? null : downloadTask.getStatInfo();
                i.o.c.h.c(statInfo);
                downloadButtonStateInfo.a(statInfo);
                i downloadButtonManager = this.a.getDownloadButtonManager();
                k downloadButtonStateInfo2 = this.a.getDownloadButtonStateInfo();
                Objects.requireNonNull(downloadButtonManager);
                i.o.c.h.e(downloadButtonStateInfo2, "stateInfo");
                downloadButtonStateInfo2.b(j.f2102h);
                if (this.a.getShowProgressOnButton()) {
                    DecimalFormat decimalFormat = new DecimalFormat("0.0");
                    i.o.c.h.c(downloadTask);
                    String format = decimalFormat.format(Float.valueOf(downloadTask.getDownloadPercent()));
                    DownloadButton downloadButton = this.a;
                    String format2 = String.format("%s%%", Arrays.copyOf(new Object[]{format}, 1));
                    i.o.c.h.d(format2, "java.lang.String.format(format, *args)");
                    downloadButton.o(format2);
                    DownloadButton.f289m.debug(i.o.c.h.j("onDownloadStarted percent: ", format));
                    ProgressBar downloadProgressBar = this.a.getDownloadProgressBar();
                    if (downloadProgressBar != null) {
                        downloadProgressBar.setProgress((int) downloadTask.getDownloadPercent());
                    }
                    this.a.m();
                    return;
                }
                this.a.o((String) null);
            }
        }

        public void d(Context context, DownloadTask downloadTask) {
            j jVar;
            if (DownloadButton.a(this.a, downloadTask)) {
                i downloadButtonManager = this.a.getDownloadButtonManager();
                k downloadButtonStateInfo = this.a.getDownloadButtonStateInfo();
                Objects.requireNonNull(downloadButtonManager);
                i.o.c.h.e(downloadButtonStateInfo, "stateInfo");
                if (downloadTask != null) {
                    if (downloadTask.isFailed()) {
                        f.j0(context, context.getResources().getString(2131821752));
                        downloadTask.isExpired();
                        jVar = j.WAITING_FOR_DOWNLOAD;
                    } else if (downloadTask.isSuccess()) {
                        jVar = j.WAITING_FOR_INSTALL;
                    } else if (downloadTask.isCanceled() || downloadTask.isAborted()) {
                        jVar = j.PAUSED;
                    }
                    downloadButtonStateInfo.b(jVar);
                }
                this.a.o((String) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.o.c.h.e(context, "context");
        this.b = context;
        h(context);
    }

    public static final boolean a(DownloadButton downloadButton, DownloadTask downloadTask) {
        Objects.requireNonNull(downloadButton);
        boolean z = false;
        if (!(downloadTask == null || downloadTask.getStatInfo() == null)) {
            if (downloadButton.getDownloadButtonStateInfo().f2108d.appId == downloadTask.getStatInfo().appId) {
                z = true;
            }
            if (z && downloadButton.getDownloadButtonStateInfo().b == null) {
                downloadButton.getDownloadButtonStateInfo().b = g.c.a.e.b.e.i(downloadButton.b).g(downloadButton.getDownloadButtonStateInfo().f2108d.appId);
            }
        }
        return z;
    }

    public static final void g(Context context) {
        i.o.c.h.e(context, "context");
        o = (float) e.e.d.l.a.v(context, 80.0f);
        p = (float) e.e.d.l.a.v(context, 56.0f);
        q = (float) e.e.d.l.a.v(context, 8.0f);
        String obj = context.getText(2131821001).toString();
        Locale b2 = l.b();
        i.o.c.h.d(b2, "getLanguage()");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String upperCase = obj.toUpperCase(b2);
        i.o.c.h.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        TextPaint textPaint = r;
        textPaint.setTextSize((float) g.h.a.a.b0(context, 12.0f));
        float v = ((float) e.e.d.l.a.v(context, 16.0f)) + textPaint.measureText(upperCase);
        n = v;
        float f2 = p;
        if (v < f2) {
            n = f2;
        }
        float f3 = n;
        float f4 = o;
        if (f3 > f4) {
            n = f4;
        }
    }

    public void b() {
        i iVar = this.f292f;
        Context context = getContext();
        i.o.c.h.d(context, "context");
        iVar.d(context, getDownloadButtonStateInfo());
    }

    public void c() {
        i iVar = this.f292f;
        Context context = getContext();
        i.o.c.h.d(context, "context");
        iVar.d(context, getDownloadButtonStateInfo());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.apkpure.aegon.components.models.Asset} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: type inference failed for: r6v19 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            r0 = 0
            r9.setEnabled(r0)
            g.c.a.n.a.k r1 = r9.getDownloadButtonStateInfo()
            g.c.a.n.a.j r1 = r1.a
            int r1 = r1.ordinal()
            r2 = 1
            java.lang.String r3 = "stateInfo"
            java.lang.String r4 = "DownloadButton"
            java.lang.String r5 = "downloadButtonStateInfo"
            r6 = 0
            java.lang.String r7 = "context"
            switch(r1) {
                case 1: goto L_0x01bf;
                case 2: goto L_0x017d;
                case 3: goto L_0x0177;
                case 4: goto L_0x00ec;
                case 5: goto L_0x009e;
                case 6: goto L_0x0071;
                case 7: goto L_0x0052;
                case 8: goto L_0x004d;
                case 9: goto L_0x0046;
                case 10: goto L_0x0041;
                case 11: goto L_0x003c;
                case 12: goto L_0x002a;
                case 13: goto L_0x002a;
                default: goto L_0x001b;
            }
        L_0x001b:
            g.c.a.n.a.i r0 = r9.f292f
            android.content.Context r1 = r9.getContext()
            i.o.c.h.d(r1, r7)
            g.c.a.n.a.k r4 = r9.getDownloadButtonStateInfo()
            goto L_0x01d5
        L_0x002a:
            g.c.a.n.a.i r0 = r9.f292f
            android.content.Context r1 = r9.getContext()
            i.o.c.h.d(r1, r7)
            g.c.a.n.a.k r3 = r9.getDownloadButtonStateInfo()
            r0.g(r1, r3, r6)
            goto L_0x01e1
        L_0x003c:
            r9.j()
            goto L_0x01e1
        L_0x0041:
            r9.c()
            goto L_0x01e1
        L_0x0046:
            g.c.a.n.a.i r0 = r9.f292f
            java.util.Objects.requireNonNull(r0)
            goto L_0x01e1
        L_0x004d:
            r9.b()
            goto L_0x01e1
        L_0x0052:
            g.c.a.n.a.i r1 = r9.f292f
            android.content.Context r3 = r9.getContext()
            i.o.c.h.d(r3, r7)
            g.c.a.n.a.k r4 = r9.getDownloadButtonStateInfo()
            java.util.Objects.requireNonNull(r1)
            i.o.c.h.e(r3, r7)
            i.o.c.h.e(r4, r5)
            com.apkpure.aegon.components.download.DownloadTask r1 = r4.b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            g.c.a.e.b.e.c(r3, r1, r4, r0)
            goto L_0x01e1
        L_0x0071:
            g.c.a.n.a.i r0 = r9.f292f
            android.content.Context r1 = r9.getContext()
            i.o.c.h.d(r1, r7)
            g.c.a.n.a.k r3 = r9.getDownloadButtonStateInfo()
            java.util.Objects.requireNonNull(r0)
            i.o.c.h.e(r1, r7)
            i.o.c.h.e(r3, r5)
            g.c.a.e.b.e r0 = g.c.a.e.b.e.i(r1)
            com.apkpure.aegon.components.download.DownloadTask r1 = r3.b
            if (r1 != 0) goto L_0x0090
            goto L_0x0094
        L_0x0090:
            com.apkpure.aegon.components.models.Asset r6 = r1.getAsset()
        L_0x0094:
            r0.d(r6)
            g.c.a.n.a.j r0 = g.c.a.n.a.j.PAUSED
            r3.b(r0)
            goto L_0x01e1
        L_0x009e:
            g.c.a.n.a.i r1 = r9.f292f
            android.content.Context r5 = r9.getContext()
            i.o.c.h.d(r5, r7)
            g.c.a.n.a.k r8 = r9.getDownloadButtonStateInfo()
            java.util.Objects.requireNonNull(r1)
            i.o.c.h.e(r5, r7)
            i.o.c.h.e(r8, r3)
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r1 = r8.c
            if (r1 != 0) goto L_0x00ba
            r1 = r6
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r1 = r1.packageName
        L_0x00bc:
            if (r1 != 0) goto L_0x00cf
            com.apkpure.aegon.components.download.DownloadTask r1 = r8.b
            if (r1 != 0) goto L_0x00c3
            goto L_0x00d0
        L_0x00c3:
            com.apkpure.aegon.components.models.SimpleDisplayInfo r1 = r1.getSimpleDisplayInfo()
            if (r1 != 0) goto L_0x00ca
            goto L_0x00d0
        L_0x00ca:
            java.lang.String r6 = r1.b()
            goto L_0x00d0
        L_0x00cf:
            r6 = r1
        L_0x00d0:
            if (r6 == 0) goto L_0x00e1
            int r1 = r6.length()
            if (r1 != 0) goto L_0x00d9
            r0 = 1
        L_0x00d9:
            if (r0 == 0) goto L_0x00dc
            goto L_0x00e1
        L_0x00dc:
            g.c.a.e.k.a.f.g(r5, r6)
            goto L_0x01e1
        L_0x00e1:
            java.lang.String r0 = "package Name is empty, cannot open "
            java.lang.String r0 = i.o.c.h.j(r0, r6)
            g.c.a.e.e.a.b(r4, r0)
            goto L_0x01e1
        L_0x00ec:
            g.c.a.n.a.i r0 = r9.f292f
            android.content.Context r1 = r9.getContext()
            i.o.c.h.d(r1, r7)
            g.c.a.n.a.k r3 = r9.getDownloadButtonStateInfo()
            java.util.Objects.requireNonNull(r0)
            i.o.c.h.e(r1, r7)
            i.o.c.h.e(r3, r5)
            com.apkpure.aegon.components.download.DownloadTask r0 = r3.b
            if (r0 != 0) goto L_0x0108
            r5 = r6
            goto L_0x010c
        L_0x0108:
            com.apkpure.aegon.components.models.Asset r5 = r0.getAsset()
        L_0x010c:
            if (r0 != 0) goto L_0x010f
            goto L_0x011a
        L_0x010f:
            com.apkpure.aegon.components.models.SimpleDisplayInfo r7 = r0.getSimpleDisplayInfo()
            if (r7 != 0) goto L_0x0116
            goto L_0x011a
        L_0x0116:
            java.lang.String r6 = r7.b()
        L_0x011a:
            if (r5 != 0) goto L_0x0138
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r0 = r3.c
            i.o.c.h.c(r0)
            com.tencent.trpcprotocol.projecta.common.assetinfo.nano.AssetInfo r3 = r0.asset
            java.lang.String r5 = "appDetail.asset"
            i.o.c.h.d(r3, r5)
            g.c.a.e.b.e r5 = g.c.a.e.b.e.i(r1)
            com.apkpure.aegon.components.models.Asset r3 = com.apkpure.aegon.components.models.Asset.i(r3)
            com.apkpure.aegon.components.download.DownloadTask r5 = r5.e(r3)
            java.lang.String r6 = r0.packageName
            r0 = r5
            r5 = r3
        L_0x0138:
            i.o.c.h.c(r5)
            boolean r3 = r5.h()
            if (r3 == 0) goto L_0x0171
            i.o.c.h.c(r0)
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r3 = r0.getStatInfo()
            java.lang.String r3 = r3.isApks
            java.lang.String r4 = "1"
            boolean r3 = i.o.c.h.a(r3, r4)
            java.lang.String r0 = r0.getDownloadFilePath()
            boolean r3 = g.c.a.e.d.e.c.a(r3)
            if (r3 == 0) goto L_0x0169
            g.c.a.e.d.b r3 = new g.c.a.e.d.b
            r3.<init>(r1)
            g.c.a.e.d.a r4 = new g.c.a.e.d.a
            r4.<init>(r1, r0)
            g.c.a.e.d.e.c.b(r1, r6, r3, r4)
            goto L_0x01e1
        L_0x0169:
            g.c.a.b.b.d r3 = g.c.a.b.b.d.a
            r4 = 3
            r3.d(r1, r0, r4)
            goto L_0x01e1
        L_0x0171:
            java.lang.String r0 = "not installable"
            g.c.a.e.e.a.b(r4, r0)
            goto L_0x01e1
        L_0x0177:
            g.c.a.n.a.i r0 = r9.f292f
            java.util.Objects.requireNonNull(r0)
            goto L_0x01e1
        L_0x017d:
            g.c.a.n.a.i r1 = r9.f292f
            android.content.Context r3 = r9.getContext()
            i.o.c.h.d(r3, r7)
            g.c.a.n.a.k r4 = r9.getDownloadButtonStateInfo()
            java.util.Objects.requireNonNull(r1)
            i.o.c.h.e(r3, r7)
            i.o.c.h.e(r4, r5)
            g.c.a.e.k.a.e r5 = g.c.a.e.k.a.e.a(r3)
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r7 = r4.c
            if (r7 != 0) goto L_0x019d
            r7 = r6
            goto L_0x019f
        L_0x019d:
            java.lang.String r7 = r7.packageName
        L_0x019f:
            com.apkpure.aegon.services.AppProtoBufUpdateService$d r5 = r5.b
            if (r5 == 0) goto L_0x01a4
            r0 = 1
        L_0x01a4:
            if (r0 == 0) goto L_0x01ae
            com.apkpure.aegon.services.AppProtoBufUpdateService r0 = com.apkpure.aegon.services.AppProtoBufUpdateService.this
            int r5 = com.apkpure.aegon.services.AppProtoBufUpdateService.f261m
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r6 = r0.b(r7)
        L_0x01ae:
            if (r6 != 0) goto L_0x01b2
            com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo r6 = r4.c
        L_0x01b2:
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r0 = r4.f2108d
            r0.isUpdate = r2
            i.o.c.h.c(r6)
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r0 = r4.f2108d
            r1.f(r3, r6, r0)
            goto L_0x01e1
        L_0x01bf:
            g.c.a.n.a.i r0 = r9.f292f
            android.content.Context r1 = r9.getContext()
            i.o.c.h.d(r1, r7)
            g.c.a.n.a.k r3 = r9.getDownloadButtonStateInfo()
            g.c.a.n.a.c r4 = new g.c.a.n.a.c
            r4.<init>(r9)
            r0.g(r1, r3, r4)
            goto L_0x01e1
        L_0x01d5:
            java.util.Objects.requireNonNull(r0)
            i.o.c.h.e(r1, r7)
            i.o.c.h.e(r4, r3)
            r0.d(r1, r4)
        L_0x01e1:
            r9.setEnabled(r2)
            g.c.a.n.a.k r0 = r9.getDownloadButtonStateInfo()
            r9.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.view.button.DownloadButton.d():void");
    }

    public void e() {
        ProgressBar downloadProgressBar = getDownloadProgressBar();
        Integer valueOf = downloadProgressBar == null ? null : Integer.valueOf(downloadProgressBar.getVisibility());
        if (valueOf != null && valueOf.intValue() == 0) {
            ProgressBar downloadProgressBar2 = getDownloadProgressBar();
            if (downloadProgressBar2 != null) {
                downloadProgressBar2.setVisibility(8);
            }
            ProgressBar downloadProgressBar3 = getDownloadProgressBar();
            if (downloadProgressBar3 != null) {
                downloadProgressBar3.setProgress(0);
            }
        }
    }

    public final void f(AppDetailInfo appDetailInfo, DTStatInfo dTStatInfo, DownloadTask downloadTask) {
        if ((downloadTask == null ? null : downloadTask.getStatInfo()) != null) {
            k downloadButtonStateInfo = getDownloadButtonStateInfo();
            DTStatInfo statInfo = downloadTask.getStatInfo();
            i.o.c.h.d(statInfo, "downloadTask.statInfo");
            downloadButtonStateInfo.a(statInfo);
        } else {
            k downloadButtonStateInfo2 = getDownloadButtonStateInfo();
            if (dTStatInfo == null) {
                dTStatInfo = new DTStatInfo();
            }
            downloadButtonStateInfo2.a(dTStatInfo);
            getDownloadButtonStateInfo().f2108d.appId = g.c.a.e.k.a.f.c(appDetailInfo);
        }
        Logger logger = f289m;
        StringBuilder i2 = g.a.a.a.a.i("name[");
        i2.append(appDetailInfo == null ? null : appDetailInfo.title);
        i2.append("] appId=[");
        i2.append(getDownloadButtonStateInfo().f2108d.appId);
        i2.append("] ");
        logger.info(i2.toString());
        getDownloadButtonStateInfo().b = downloadTask;
        getDownloadButtonStateInfo().c = appDetailInfo;
        l();
        i iVar = this.f292f;
        Context context = getContext();
        i.o.c.h.d(context, "context");
        iVar.h(context, getDownloadButtonStateInfo());
        o((String) null);
    }

    public TextView getButtonTextView() {
        return this.c;
    }

    public final i getDownloadButtonManager() {
        return this.f292f;
    }

    public k getDownloadButtonStateInfo() {
        return this.f291e;
    }

    public ProgressBar getDownloadProgressBar() {
        return this.f290d;
    }

    public final boolean getShowProgressOnButton() {
        return this.f296j;
    }

    public void h(Context context) {
        i.o.c.h.e(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(2131493467, this, true);
        setButtonTextView((TextView) findViewById(2131298164));
        TextView buttonTextView = getButtonTextView();
        if (buttonTextView != null) {
            buttonTextView.setText(2131821001);
        }
        setDownloadProgressBar((ProgressBar) findViewById(2131298244));
        setOnClickListener(new g.c.a.n.a.d(this));
    }

    public final void i(k kVar) {
        h0 h0Var = h0.c;
        f.S(f.a(j.a.t1.j.b), (i.m.f) null, (y) null, new a(this, kVar, (i.m.d<? super a>) null), 3, (Object) null);
    }

    public void j() {
        i iVar = this.f292f;
        Context context = getContext();
        i.o.c.h.d(context, "context");
        iVar.d(context, getDownloadButtonStateInfo());
    }

    public final void k() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        float f2 = n;
        if (!Float.isNaN(f2)) {
            layoutParams.width = Math.round(f2);
            if (getButtonTextView() != null) {
                TextView buttonTextView = getButtonTextView();
                i.o.c.h.c(buttonTextView);
                Context context = getContext();
                i.o.c.h.d(context, "context");
                TextView buttonTextView2 = getButtonTextView();
                i.o.c.h.c(buttonTextView2);
                String obj = buttonTextView2.getText().toString();
                TextPaint textPaint = r;
                float f3 = 12.0f;
                textPaint.setTextSize((float) g.h.a.a.b0(context, 12.0f));
                Locale b2 = l.b();
                i.o.c.h.d(b2, "getLanguage()");
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String upperCase = obj.toUpperCase(b2);
                i.o.c.h.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                if (textPaint.measureText(upperCase) > n - q) {
                    f3 = 10.0f;
                }
                buttonTextView.setTextSize(f3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public final void l() {
        if (!this.f297k) {
            this.f297k = true;
            g.c.a.e.e.a.a("DownloadButton", i.o.c.h.j("registerDownloadEventReceiver, this=", Integer.valueOf(hashCode())));
            this.f293g = new c.b(this.b, new b(this));
            this.f294h = new a.b(this.b, new c(this));
            this.f295i = new b.C0060b(this.b, new d(this));
            c.b bVar = this.f293g;
            i.o.c.h.c(bVar);
            bVar.a(0);
            a.b bVar2 = this.f294h;
            i.o.c.h.c(bVar2);
            bVar2.a();
            b.C0060b bVar3 = this.f295i;
            i.o.c.h.c(bVar3);
            bVar3.a();
        }
    }

    public void m() {
        ProgressBar downloadProgressBar;
        if (this.f296j) {
            ProgressBar downloadProgressBar2 = getDownloadProgressBar();
            Integer valueOf = downloadProgressBar2 == null ? null : Integer.valueOf(downloadProgressBar2.getVisibility());
            if (valueOf != null && valueOf.intValue() == 8 && (downloadProgressBar = getDownloadProgressBar()) != null) {
                downloadProgressBar.setVisibility(0);
            }
        }
    }

    public void n() {
        Context context;
        int i2;
        TextView buttonTextView = getButtonTextView();
        if (buttonTextView != null) {
            int ordinal = getDownloadButtonStateInfo().a.ordinal();
            if (ordinal == 9) {
                context = getContext();
                i2 = 2131821817;
            } else if (ordinal != 13) {
                i2 = 2131821001;
                switch (ordinal) {
                    case 2:
                        context = getContext();
                        i2 = 2131821546;
                        break;
                    case 5:
                        context = getContext();
                        i2 = 2131821235;
                        break;
                    case 6:
                        context = getContext();
                        i2 = 2131821250;
                        break;
                    case 7:
                        context = getContext();
                        i2 = 2131820827;
                        break;
                    default:
                        context = getContext();
                        break;
                }
            } else {
                context = getContext();
                i2 = 2131821450;
            }
            buttonTextView.setText(context.getString(i2));
        }
        k();
    }

    public void o(String str) {
        DownloadTask downloadTask;
        k downloadButtonStateInfo = getDownloadButtonStateInfo();
        Boolean bool = null;
        if (!(downloadButtonStateInfo == null || (downloadTask = downloadButtonStateInfo.b) == null)) {
            bool = Boolean.valueOf(downloadTask.isDownloading());
        }
        if (i.o.c.h.a(bool, Boolean.TRUE)) {
            m();
        } else {
            e();
        }
        if (!(str == null || str.length() == 0)) {
            TextView buttonTextView = getButtonTextView();
            if (buttonTextView != null) {
                buttonTextView.setText(str);
                return;
            }
            return;
        }
        n();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f297k) {
            DownloadTask g2 = g.c.a.e.b.e.i(this.b).g(getDownloadButtonStateInfo().f2108d.appId);
            if (g2 == null || !g2.isDownloading()) {
                this.f297k = false;
                g.c.a.e.e.a.a("DownloadButton", i.o.c.h.j("unRegisterReceiver, this=", Integer.valueOf(hashCode())));
                c.b bVar = this.f293g;
                if (bVar != null) {
                    i.o.c.h.c(bVar);
                    if (bVar.c) {
                        e.e.d.l.a.J0(bVar.a, bVar);
                        bVar.c = false;
                    }
                }
                a.b bVar2 = this.f294h;
                if (bVar2 != null) {
                    i.o.c.h.c(bVar2);
                    if (bVar2.c) {
                        e.e.d.l.a.J0(bVar2.a, bVar2);
                        bVar2.c = false;
                    }
                }
                b.C0060b bVar3 = this.f295i;
                if (bVar3 != null) {
                    i.o.c.h.c(bVar3);
                    bVar3.b();
                }
            }
        }
    }

    public void setButtonTextView(TextView textView) {
        this.c = textView;
    }

    public void setDownloadProgressBar(ProgressBar progressBar) {
        this.f290d = progressBar;
    }

    public final void setShowProgressOnButton(boolean z) {
        this.f296j = z;
    }
}
