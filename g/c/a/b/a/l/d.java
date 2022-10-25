package g.c.a.b.a.l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.view.button.DownloadButton;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.c.a.o.g.b;
import g.c.a.o.g.c;
import i.j;
import i.o.b.q;
import i.o.c.h;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class d extends b<DownloadTask, a> {
    public final List<DownloadTask> n;
    public final boolean o;
    public final q<Boolean, View, Integer, j> p;

    public static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public final q<Boolean, View, Integer, j> f1901f;

        /* renamed from: g  reason: collision with root package name */
        public final Logger f1902g = LoggerFactory.getLogger((Class<?>) a.class);

        /* renamed from: h  reason: collision with root package name */
        public DownloadTask f1903h;

        /* renamed from: i  reason: collision with root package name */
        public int f1904i = -1000;

        /* renamed from: j  reason: collision with root package name */
        public final TextView f1905j;

        /* renamed from: k  reason: collision with root package name */
        public final ImageView f1906k;

        /* renamed from: l  reason: collision with root package name */
        public final ProgressBar f1907l;

        /* renamed from: m  reason: collision with root package name */
        public final TextView f1908m;
        public final ImageButton n;
        public final DownloadButton o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, q<? super Boolean, ? super View, ? super Integer, j> qVar) {
            super(view, 0, 0, 6);
            h.e(view, "itemView");
            h.e(qVar, "onClick");
            this.f1901f = qVar;
            this.f1905j = (TextView) view.findViewById(2131298659);
            this.f1906k = (ImageView) view.findViewById(2131298652);
            this.f1907l = (ProgressBar) view.findViewById(2131298654);
            this.f1908m = (TextView) view.findViewById(2131298658);
            ImageButton imageButton = (ImageButton) view.findViewById(2131298650);
            this.n = imageButton;
            this.o = (DownloadButton) view.findViewById(2131298649);
            imageButton.setOnClickListener(new a(this));
            view.setOnClickListener(new b(this));
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.text.SpannableStringBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.text.SpannableStringBuilder} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x021e  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x022b  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0236  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(com.apkpure.aegon.components.download.DownloadTask r13, int r14) {
            /*
                r12 = this;
                java.lang.String r0 = "downloadTask"
                i.o.c.h.e(r13, r0)
                r12.f1903h = r13
                r12.f1904i = r14
                android.widget.TextView r14 = r12.f1908m
                android.content.Context r14 = r14.getContext()
                java.lang.String r1 = "statusTextView.context"
                i.o.c.h.d(r14, r1)
                java.lang.String r1 = "context"
                i.o.c.h.e(r14, r1)
                i.o.c.h.e(r13, r0)
                android.content.res.Resources r0 = r14.getResources()
                boolean r1 = r13.isCanceled()
                r2 = 0
                java.lang.String r3 = ""
                r4 = 1
                if (r1 != 0) goto L_0x01ef
                boolean r1 = r13.isAborted()
                if (r1 == 0) goto L_0x0032
                goto L_0x01ef
            L_0x0032:
                boolean r1 = r13.isSuccess()
                if (r1 == 0) goto L_0x0043
                r0 = 2131820824(0x7f110118, float:1.9274374E38)
                java.lang.String r14 = r14.getString(r0)
                java.lang.String r0 = "{\n            context.getString(R.string.completed)\n        }"
                goto L_0x01f8
            L_0x0043:
                boolean r1 = r13.isFailed()
                r5 = 33
                java.lang.String r6 = "resources"
                if (r1 == 0) goto L_0x00a6
                i.o.c.h.d(r0, r6)
                boolean r1 = r13.isInvalid()
                if (r1 == 0) goto L_0x0060
                r1 = 2131820955(0x7f11019b, float:1.927464E38)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "{\n            resources.getString(R.string.file_invalid)\n        }"
                goto L_0x0089
            L_0x0060:
                boolean r1 = r13.isMissing()
                if (r1 == 0) goto L_0x0070
                r1 = 2131820856(0x7f110138, float:1.9274439E38)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "{\n            resources.getString(R.string.deleted)\n        }"
                goto L_0x0089
            L_0x0070:
                boolean r1 = r13.isExpired()
                if (r1 == 0) goto L_0x0080
                r1 = 2131820935(0x7f110187, float:1.9274599E38)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "{\n            resources.getString(R.string.expired)\n        }"
                goto L_0x0089
            L_0x0080:
                r1 = 2131820942(0x7f11018e, float:1.9274613E38)
                java.lang.String r0 = r0.getString(r1)
                java.lang.String r1 = "{\n            resources.getString(R.string.failed)\n        }"
            L_0x0089:
                i.o.c.h.d(r0, r1)
                r1 = 2131100196(0x7f060224, float:1.7812767E38)
                int r14 = e.e.c.a.b(r14, r1)
                android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
                r3.<init>(r0)
                android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
                r1.<init>(r14)
                int r14 = r0.length()
                r3.setSpan(r1, r2, r14, r5)
                goto L_0x01fd
            L_0x00a6:
                boolean r1 = r13.isDownloading()
                if (r1 == 0) goto L_0x01fd
                i.o.c.h.d(r0, r6)
                boolean r1 = r13.isWaiting()
                if (r1 == 0) goto L_0x00ba
                r14 = 2131821657(0x7f110459, float:1.9276063E38)
                goto L_0x01e7
            L_0x00ba:
                boolean r1 = r13.isPreparing()
                if (r1 == 0) goto L_0x00c5
                r14 = 2131821311(0x7f1102ff, float:1.9275362E38)
                goto L_0x01e7
            L_0x00c5:
                boolean r1 = g.c.a.e.f.b.a.c(r14)
                if (r1 == 0) goto L_0x01e4
                long r6 = r13.getDownloadSize()
                r8 = 0
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 <= 0) goto L_0x01e0
                long r6 = r13.getTotalSize()
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 <= 0) goto L_0x01e0
                r0 = 2
                java.lang.Object[] r1 = new java.lang.Object[r0]
                long r6 = r13.getDownloadSize()
                java.lang.String r10 = "%.1f"
                java.lang.String r6 = g.c.a.e.k.f.b.b(r6, r10)
                r1[r2] = r6
                long r6 = r13.getTotalSize()
                java.lang.String r6 = g.c.a.e.k.f.b.b(r6, r10)
                r1[r4] = r6
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
                java.lang.String r1 = "%s / %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                java.lang.String r1 = "java.lang.String.format(format, *args)"
                i.o.c.h.d(r0, r1)
                long r6 = r13.getDownloadSpeed()
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0111
                java.lang.String r1 = "0 KB/s"
                goto L_0x0192
            L_0x0111:
                r8 = 1048576(0x100000, double:5.180654E-318)
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L_0x0143
                g.c.a.e.i.b.a$b r1 = g.c.a.e.i.b.a.c
                java.util.Locale r1 = r1.c()
                java.lang.Object[] r8 = new java.lang.Object[r4]
                double r6 = (double) r6
                r9 = 4652218415073722368(0x4090000000000000, double:1024.0)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                double r6 = r6 / r9
                java.lang.Double r6 = java.lang.Double.valueOf(r6)
                r8[r2] = r6
                java.lang.String r6 = "%.1f KB/s"
                java.lang.String r1 = java.lang.String.format(r1, r6, r8)
                goto L_0x0192
            L_0x0143:
                r8 = 1073741824(0x40000000, double:5.304989477E-315)
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                g.c.a.e.i.b.a$b r8 = g.c.a.e.i.b.a.c
                java.util.Locale r8 = r8.c()
                java.lang.Object[] r9 = new java.lang.Object[r4]
                double r6 = (double) r6
                if (r1 >= 0) goto L_0x0171
                r10 = 4697254411347427328(0x4130000000000000, double:1048576.0)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                double r6 = r6 / r10
                java.lang.Double r1 = java.lang.Double.valueOf(r6)
                r9[r2] = r1
                java.lang.String r1 = "%.1f MB/s"
                goto L_0x018e
            L_0x0171:
                r10 = 4742290407621132288(0x41d0000000000000, double:1.073741824E9)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                java.lang.Double.isNaN(r6)
                double r6 = r6 / r10
                java.lang.Double r1 = java.lang.Double.valueOf(r6)
                r9[r2] = r1
                java.lang.String r1 = "%.1f GB/s"
            L_0x018e:
                java.lang.String r1 = java.lang.String.format(r8, r1, r9)
            L_0x0192:
                if (r1 != 0) goto L_0x0195
                goto L_0x0196
            L_0x0195:
                r3 = r1
            L_0x0196:
                java.lang.String r1 = "  "
                java.lang.String r0 = i.o.c.h.j(r1, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                r6 = 32
                r1.append(r6)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                r6 = 2131099703(0x7f060037, float:1.7811767E38)
                int r6 = e.e.c.a.b(r14, r6)
                r7 = 2131100073(0x7f0601a9, float:1.7812517E38)
                int r14 = e.e.c.a.b(r14, r7)
                android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
                r7.<init>(r1)
                android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
                r1.<init>(r6)
                int r6 = r3.length()
                r7.setSpan(r1, r2, r6, r5)
                android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
                r1.<init>(r14)
                int r14 = r3.length()
                int r0 = r0.length()
                r7.setSpan(r1, r14, r0, r5)
                goto L_0x01eb
            L_0x01e0:
                r14 = 2131820882(0x7f110152, float:1.9274491E38)
                goto L_0x01e7
            L_0x01e4:
                r14 = 2131821658(0x7f11045a, float:1.9276065E38)
            L_0x01e7:
                java.lang.String r7 = r0.getString(r14)
            L_0x01eb:
                java.lang.String r14 = "{\n            downloadingText(downloadTask, resources, context)\n        }"
                r3 = r7
                goto L_0x01fa
            L_0x01ef:
                r0 = 2131821252(0x7f1102c4, float:1.9275242E38)
                java.lang.String r14 = r14.getString(r0)
                java.lang.String r0 = "{\n            context.getString(R.string.paused)\n        }"
            L_0x01f8:
                r3 = r14
                r14 = r0
            L_0x01fa:
                i.o.c.h.d(r3, r14)
            L_0x01fd:
                android.widget.TextView r14 = r12.f1905j
                com.apkpure.aegon.components.models.SimpleDisplayInfo r0 = r13.getSimpleDisplayInfo()
                java.lang.String r0 = r0.c()
                r14.setText(r0)
                android.widget.TextView r14 = r12.f1908m
                r14.setText(r3)
                android.widget.ProgressBar r14 = r12.f1907l
                boolean r0 = r13.isSuccess()
                if (r0 != 0) goto L_0x0220
                boolean r0 = r13.isMissing()
                if (r0 == 0) goto L_0x021e
                goto L_0x0220
            L_0x021e:
                r0 = 0
                goto L_0x0222
            L_0x0220:
                r0 = 8
            L_0x0222:
                r14.setVisibility(r0)
                int r14 = android.os.Build.VERSION.SDK_INT
                r0 = 24
                if (r14 < r0) goto L_0x0236
                android.widget.ProgressBar r14 = r12.f1907l
                float r0 = r13.getDownloadPercent()
                int r0 = (int) r0
                r14.setProgress(r0, r4)
                goto L_0x0240
            L_0x0236:
                android.widget.ProgressBar r14 = r12.f1907l
                float r0 = r13.getDownloadPercent()
                int r0 = (int) r0
                r14.setProgress(r0)
            L_0x0240:
                android.widget.ImageView r14 = r12.f1906k
                android.content.Context r14 = r14.getContext()
                com.apkpure.aegon.components.models.SimpleDisplayInfo r13 = r13.getSimpleDisplayInfo()
                java.lang.String r13 = r13.a()
                android.widget.ImageView r0 = r12.f1906k
                r1 = 2131623937(0x7f0e0001, float:1.887504E38)
                g.d.a.p.e r1 = e.e.d.l.a.S(r1)
                e.e.d.l.a.Z(r14, r13, r0, r1)
                com.apkpure.aegon.view.button.DownloadButton r13 = r12.o
                r13.setShowProgressOnButton(r2)
                com.apkpure.aegon.view.button.DownloadButton r13 = r12.o
                com.apkpure.aegon.components.download.DownloadTask r14 = r12.f1903h
                r0 = 0
                r13.f(r0, r0, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.a.b.a.l.d.a.c(com.apkpure.aegon.components.download.DownloadTask, int):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ListView listView, List<DownloadTask> list, boolean z, q<? super Boolean, ? super View, ? super Integer, j> qVar) {
        super(listView, list, 0, (View) null, 12);
        h.e(listView, "listView");
        h.e(list, Constants.Raft.TASKS);
        h.e(qVar, "onClick");
        this.n = list;
        this.o = z;
        this.p = qVar;
    }

    public void h(c cVar, Object obj) {
        a aVar = (a) cVar;
        DownloadTask downloadTask = (DownloadTask) obj;
        h.e(aVar, "holder");
        if (downloadTask != null) {
            aVar.c(downloadTask, aVar.f2189d);
        }
    }

    public c i(ViewGroup viewGroup, int i2, int i3) {
        View inflate = LayoutInflater.from(this.b.getContext()).inflate(2131493508, viewGroup, false);
        h.d(inflate, "view");
        return new a(inflate, this.p);
    }
}
