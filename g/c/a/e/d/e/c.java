package g.c.a.e.d.e;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import e.b.c.g;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class c {
    public static final Logger a = LoggerFactory.getLogger("MIUIOptNoticeShowHelperLog");

    public static class a extends ClickableSpan {
        public final /* synthetic */ Context b;
        public final /* synthetic */ g c;

        public a(Context context, g gVar) {
            this.b = context;
            this.c = gVar;
        }

        public void onClick(View view) {
            if (this.b == null) {
                c.a.warn("startCloseMIUIOptGuide context is null");
            }
            if (this.c.isShowing()) {
                this.c.dismiss();
            }
        }

        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(boolean r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x000b
            org.slf4j.Logger r7 = a
            java.lang.String r1 = "Don't need show, is not apks"
        L_0x0007:
            r7.info(r1)
            return r0
        L_0x000b:
            boolean r7 = g.c.a.e.k.i.b.a()
            if (r7 != 0) goto L_0x0016
            org.slf4j.Logger r7 = a
            java.lang.String r1 = "Don't need show, is not miui"
            goto L_0x0007
        L_0x0016:
            boolean r7 = g.c.a.e.k.i.b.a()
            r1 = 1
            if (r7 == 0) goto L_0x0052
            java.lang.String r7 = "persist.sys.miui_optimization"
            java.lang.String r2 = "android.os.SystemProperties"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x004a }
            java.lang.String r3 = "getBoolean"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x004a }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch:{ Exception -> 0x004a }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x004a }
            r5[r1] = r6     // Catch:{ Exception -> 0x004a }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch:{ Exception -> 0x004a }
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x004a }
            r4[r0] = r7     // Catch:{ Exception -> 0x004a }
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x004a }
            r4[r1] = r7     // Catch:{ Exception -> 0x004a }
            java.lang.Object r7 = r2.invoke(r3, r4)     // Catch:{ Exception -> 0x004a }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x004a }
            boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x004a }
            goto L_0x0053
        L_0x004a:
            r7 = move-exception
            org.slf4j.Logger r2 = g.c.a.e.k.i.b.a
            java.lang.String r3 = "Unable to use SystemProperties.getBoolean"
            r2.warn((java.lang.String) r3, (java.lang.Throwable) r7)
        L_0x0052:
            r7 = 0
        L_0x0053:
            if (r7 != 0) goto L_0x005a
            org.slf4j.Logger r7 = a
            java.lang.String r1 = "Don't need show, is not open miui opt"
            goto L_0x0007
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.d.e.c.a(boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a2 A[Catch:{ Exception -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b2 A[Catch:{ Exception -> 0x00d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r12, java.lang.String r13, g.c.a.m.d r14, g.c.a.m.d r15) {
        /*
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            org.slf4j.Logger r0 = a
            java.lang.String r1 = "report map info : {}"
            r0.debug((java.lang.String) r1, (java.lang.Object) r13)
            e.b.c.g$a r13 = new e.b.c.g$a
            r13.<init>(r12)
            e.b.c.g r13 = r13.a()
            r0 = 2131821893(0x7f110545, float:1.9276542E38)
            java.lang.String r0 = r12.getString(r0)
            r1 = 2131821894(0x7f110546, float:1.9276544E38)
            java.lang.String r4 = r12.getString(r1)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.String r7 = r12.getString(r1)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            java.lang.String r2 = "Check FAQ page"
            boolean r3 = r0.contains(r2)
            r11 = -1
            if (r3 == 0) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            java.lang.String r2 = "查看帮助"
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L_0x0041
            goto L_0x0049
        L_0x0041:
            java.lang.String r2 = "查看幫助"
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L_0x004e
        L_0x0049:
            int r2 = r0.indexOf(r2)
            goto L_0x004f
        L_0x004e:
            r2 = -1
        L_0x004f:
            if (r2 == r11) goto L_0x005f
            g.c.a.e.d.e.c$a r3 = new g.c.a.e.d.e.c$a
            r3.<init>(r12, r13)
            int r12 = r0.length()
            r0 = 33
            r1.setSpan(r3, r2, r12, r0)
        L_0x005f:
            r12 = 0
            r13.setCanceledOnTouchOutside(r12)
            r12 = 2131821895(0x7f110547, float:1.9276546E38)
            r13.setTitle((int) r12)
            androidx.appcompat.app.AlertController r12 = r13.f941d
            r12.f27f = r1
            android.widget.TextView r12 = r12.F
            if (r12 == 0) goto L_0x0074
            r12.setText(r1)
        L_0x0074:
            r6 = -2
            g.c.a.e.d.e.a r8 = new g.c.a.e.d.e.a
            r8.<init>(r15)
            androidx.appcompat.app.AlertController r5 = r13.f941d
            r9 = 0
            r10 = 0
            r5.e(r6, r7, r8, r9, r10)
            r3 = -1
            g.c.a.e.d.e.b r5 = new g.c.a.e.d.e.b
            r5.<init>(r14)
            androidx.appcompat.app.AlertController r2 = r13.f941d
            r6 = 0
            r7 = 0
            r2.e(r3, r4, r5, r6, r7)
            r13.show()     // Catch:{ Exception -> 0x00d0 }
            r12 = 2131297261(0x7f0903ed, float:1.8212462E38)
            r13.findViewById(r12)     // Catch:{ Exception -> 0x00d0 }
            r12 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r12 = r13.findViewById(r12)     // Catch:{ Exception -> 0x00d0 }
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ Exception -> 0x00d0 }
            if (r12 == 0) goto L_0x00a7
            r14 = 1101004800(0x41a00000, float:20.0)
            r12.setTextSize(r14)     // Catch:{ Exception -> 0x00d0 }
        L_0x00a7:
            r12 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r12 = r13.findViewById(r12)     // Catch:{ Exception -> 0x00d0 }
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch:{ Exception -> 0x00d0 }
            if (r12 == 0) goto L_0x00be
            android.text.method.MovementMethod r14 = android.text.method.LinkMovementMethod.getInstance()     // Catch:{ Exception -> 0x00d0 }
            r12.setMovementMethod(r14)     // Catch:{ Exception -> 0x00d0 }
            r14 = 1098907648(0x41800000, float:16.0)
            r12.setTextSize(r14)     // Catch:{ Exception -> 0x00d0 }
        L_0x00be:
            android.widget.Button r12 = r13.c(r11)     // Catch:{ Exception -> 0x00d0 }
            r14 = -2
            android.widget.Button r13 = r13.c(r14)     // Catch:{ Exception -> 0x00d0 }
            r14 = 1096810496(0x41600000, float:14.0)
            r13.setTextSize(r14)     // Catch:{ Exception -> 0x00d0 }
            r12.setTextSize(r14)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d8
        L_0x00d0:
            r12 = move-exception
            org.slf4j.Logger r13 = a
            java.lang.String r14 = "miui opt dialog show error"
            r13.error((java.lang.String) r14, (java.lang.Throwable) r12)
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.e.d.e.c.b(android.content.Context, java.lang.String, g.c.a.m.d, g.c.a.m.d):void");
    }
}
