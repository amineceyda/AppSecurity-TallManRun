package e.e.d.l;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import ch.qos.logback.core.rolling.RolloverFailure;
import com.apkpure.aegon.application.AegonApplication;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.install.AppWatcherService;
import com.apkpure.aegon.components.models.AssetInfo;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.tencent.crabshell.common.DataSavingUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import e.e.h.a;
import e.e.j.i;
import e.e.k.d;
import e.i.a.a.c;
import e.m.a.a;
import g.c.a.m.n;
import g.d.a.f;
import g.d.a.l.e;
import g.d.a.l.h;
import g.d.a.l.j;
import g.d.a.l.k;
import g.d.a.l.v.c.v;
import g.i.c.a.a.r.e;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Logger;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
    public static Method a;
    public static boolean b;
    public static Method c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1303d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1304e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1305f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f1306g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1307h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f1308i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f1309j;

    /* renamed from: k  reason: collision with root package name */
    public static ThreadLocal<Rect> f1310k;

    /* renamed from: l  reason: collision with root package name */
    public static Boolean f1311l;

    /* renamed from: m  reason: collision with root package name */
    public static Boolean f1312m;
    public static Boolean n;

    public static Drawable A(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!f1305f) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1304e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            f1305f = true;
        }
        Field field = f1304e;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                f1304e = null;
            }
        }
        return null;
    }

    public static boolean A0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i2);
        }
        if (!b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            b = true;
        }
        Method method = a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i2)});
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                a = null;
            }
        }
        return false;
    }

    public static String B(String str) {
        Application application = AegonApplication.getApplication();
        Objects.requireNonNull(application);
        String absolutePath = application.getFilesDir().getAbsolutePath();
        if (!TextUtils.isEmpty(str)) {
            absolutePath = g.a.a.a.a.w(absolutePath, str);
        }
        try {
            return I(absolutePath, false);
        } catch (Exception unused) {
            return "";
        }
    }

    public static void B0(TextView textView, int i2) {
        b.b(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    public static int C(Context context, int i2) {
        return (int) (context.getResources().getDimension(i2) / context.getResources().getDisplayMetrics().density);
    }

    public static void C0(PopupWindow popupWindow, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i2 >= 21) {
            if (!f1309j) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f1308i = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                f1309j = true;
            }
            Field field = f1308i;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static final Map<String, Object> D(g.c.b.b.j.a aVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (aVar != null) {
            Map<String, String> map = aVar.f2278k;
            if (map == null) {
                str = null;
            } else {
                str = map.get("stat_info");
            }
            DTStatInfo a2 = DTStatInfo.a(str);
            Map<String, Object> H = H(a2);
            if (!(((HashMap) H).isEmpty())) {
                hashMap.putAll(H);
            }
            j0(hashMap, "package_name", aVar.a);
            j0(hashMap, Constants.Raft.VERSION, aVar.b);
            hashMap.put("version_code", Long.valueOf(aVar.c));
            String str2 = aVar.f2272e;
            long j2 = 0;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    j2 = new File(str2).length();
                } catch (Exception unused) {
                    Logger logger = g.c.a.e.e.a.a;
                }
            }
            hashMap.put("file_size", Long.valueOf(j2));
            hashMap.put("install_type", "0");
            hashMap.put("apk_id", a2 == null ? "0" : Integer.valueOf(a2.appId));
            hashMap.put("op_type", "0");
            hashMap.put("fail_desc", "0");
            hashMap.put("install_fail_code", "0");
            hashMap.put("is_apks", Integer.valueOf(aVar.f2277j ? 1 : 0));
        }
        return hashMap;
    }

    public static void D0(TextView textView, e.e.h.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(aVar);
            textView.setText((CharSequence) null);
            return;
        }
        a.C0043a K = K(textView);
        Objects.requireNonNull(aVar);
        if (K.a((a.C0043a) null)) {
            textView.setText(aVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static int E(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f1303d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f1303d = true;
        }
        Method method = c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                c = null;
            }
        }
        return 0;
    }

    public static void E0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i2);
        } else if (drawable instanceof b) {
            ((b) drawable).setTint(i2);
        }
    }

    public static int F(List<ImageHeaderParser> list, InputStream inputStream, g.d.a.l.t.b0.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return G(list, new h(inputStream, bVar));
    }

    public static void F0(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintList(colorStateList);
        }
    }

    public static int G(List<ImageHeaderParser> list, j jVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int a2 = jVar.a(list.get(i2));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    public static void G0(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof b) {
            ((b) drawable).setTintMode(mode);
        }
    }

    public static final Map<String, Object> H(DTStatInfo dTStatInfo) {
        HashMap hashMap = new HashMap();
        if (dTStatInfo == null) {
            return hashMap;
        }
        hashMap.put("scene", Long.valueOf(dTStatInfo.scene));
        String str = dTStatInfo.downloadId;
        i.o.c.h.d(str, "statInfo.downloadId");
        hashMap.put("apk_download_id", str);
        hashMap.put("source_scene", Long.valueOf(dTStatInfo.sourceScene));
        hashMap.put("source_model_type", Integer.valueOf(dTStatInfo.sourceModelType));
        hashMap.put("is_retry_download", Integer.valueOf(dTStatInfo.isRetryDownload));
        hashMap.put("is_update_task", Integer.valueOf(dTStatInfo.isUpdate));
        String str2 = dTStatInfo.openInstallParams;
        i.o.c.h.d(str2, "statInfo.openInstallParams");
        hashMap.put("open_install_params", str2);
        String str3 = dTStatInfo.reportElement;
        i.o.c.h.d(str3, "statInfo.reportElement");
        hashMap.put("eid", str3);
        String str4 = dTStatInfo.recommendId;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("recommend_id", str4);
        String str5 = dTStatInfo.activeType;
        i.o.c.h.d(str5, "statInfo.activeType");
        hashMap.put("active_type", str5);
        hashMap.put("package_id", Long.valueOf(dTStatInfo.packageId));
        String str6 = dTStatInfo.popType;
        i.o.c.h.d(str6, "statInfo.popType");
        hashMap.put("pop_type", str6);
        String str7 = dTStatInfo.position;
        boolean z = false;
        if (!(str7 == null || str7.length() == 0)) {
            j0(hashMap, "position", dTStatInfo.position);
        }
        String str8 = dTStatInfo.smallPosition;
        if (!(str8 == null || str8.length() == 0)) {
            j0(hashMap, "small_position", dTStatInfo.smallPosition);
        }
        int i2 = dTStatInfo.modelType;
        if (i2 > 0) {
            hashMap.put("model_type", Integer.valueOf(i2));
        }
        String str9 = dTStatInfo.moduleName;
        if (!(str9 == null || str9.length() == 0)) {
            j0(hashMap, "module_name", dTStatInfo.moduleName);
        }
        String str10 = dTStatInfo.searchId;
        if (!(str10 == null || str10.length() == 0)) {
            j0(hashMap, "search_id", dTStatInfo.searchId);
        }
        String str11 = dTStatInfo.searchInputKeyword;
        if (!(str11 == null || str11.length() == 0)) {
            j0(hashMap, "search_input_keyword", dTStatInfo.searchInputKeyword);
        }
        String str12 = dTStatInfo.searchRequestKeyword;
        if (!(str12 == null || str12.length() == 0)) {
            j0(hashMap, "search_request_keyword", dTStatInfo.searchRequestKeyword);
        }
        String str13 = dTStatInfo.searchType;
        if (str13 == null || str13.length() == 0) {
            z = true;
        }
        if (!z) {
            j0(hashMap, "search_type", dTStatInfo.searchType);
        }
        j0(hashMap, "source_position", dTStatInfo.sourcePosition);
        j0(hashMap, "source_small_position", dTStatInfo.sourceSmallPosition);
        j0(hashMap, "source_module_name", dTStatInfo.sourceModuleName);
        j0(hashMap, "extended_field", dTStatInfo.b());
        return hashMap;
    }

    public static void H0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!f1307h) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f1306g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f1307h = true;
        }
        Method method = f1306g;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i2)});
            } catch (Exception unused2) {
            }
        }
    }

    public static String I(String str, boolean z) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
            if (z) {
                try {
                    new File(g.a.a.a.a.f(g.a.a.a.a.i(str), File.separator, ".nomedia")).createNewFile();
                } catch (IOException unused) {
                    Logger logger = g.c.a.e.e.a.a;
                }
            }
        }
        return file.getAbsolutePath();
    }

    public static void I0(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + o0(parcel, i2));
    }

    public static String J(String str) {
        return g.a.a.a.a.w("TransportRuntime.", str);
    }

    public static void J0(Context context, BroadcastReceiver broadcastReceiver) {
        e.m.a.a a2 = e.m.a.a.a(context);
        synchronized (a2.b) {
            ArrayList remove = a2.b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    a.c cVar = (a.c) remove.get(size);
                    cVar.f1534d = true;
                    for (int i2 = 0; i2 < cVar.a.countActions(); i2++) {
                        String action = cVar.a.getAction(i2);
                        ArrayList arrayList = a2.c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                a.c cVar2 = (a.c) arrayList.get(size2);
                                if (cVar2.b == broadcastReceiver) {
                                    cVar2.f1534d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                a2.c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r9 != 2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r4 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e.e.h.a.C0043a K(android.widget.TextView r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            e.e.h.a$a r0 = new e.e.h.a$a
            android.text.PrecomputedText$Params r9 = r9.getTextMetricsParams()
            r0.<init>(r9)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r9.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L_0x0024
            r3 = 1
            r7 = 1
            goto L_0x0026
        L_0x0024:
            r3 = 0
            r7 = 0
        L_0x0026:
            android.text.TextDirectionHeuristic r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 < r5) goto L_0x0032
            int r3 = r9.getBreakStrategy()
            int r7 = r9.getHyphenationFrequency()
        L_0x0032:
            android.text.method.TransformationMethod r5 = r9.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L_0x003d
        L_0x003a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0082
        L_0x003d:
            if (r0 < r1) goto L_0x0064
            int r0 = r9.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x0064
            java.util.Locale r9 = r9.getTextLocale()
            android.icu.text.DecimalFormatSymbols r9 = android.icu.text.DecimalFormatSymbols.getInstance(r9)
            java.lang.String[] r9 = r9.getDigitStrings()
            r9 = r9[r4]
            int r9 = r9.codePointAt(r4)
            byte r9 = java.lang.Character.getDirectionality(r9)
            if (r9 == r6) goto L_0x007a
            r0 = 2
            if (r9 != r0) goto L_0x003a
            goto L_0x007a
        L_0x0064:
            int r0 = r9.getLayoutDirection()
            if (r0 != r6) goto L_0x006b
            r4 = 1
        L_0x006b:
            int r9 = r9.getTextDirection()
            switch(r9) {
                case 2: goto L_0x007d;
                case 3: goto L_0x003a;
                case 4: goto L_0x007a;
                case 5: goto L_0x0077;
                case 6: goto L_0x0080;
                case 7: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            if (r4 == 0) goto L_0x0080
        L_0x0074:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0082
        L_0x0077:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0082
        L_0x007a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0082
        L_0x007d:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0082
        L_0x0080:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0082:
            e.e.h.a$a r0 = new e.e.h.a$a
            r0.<init>(r2, r9, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.a.K(android.widget.TextView):e.e.h.a$a");
    }

    public static int K0(Parcel parcel) {
        int readInt = parcel.readInt();
        int o0 = o0(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            throw new SafeParcelReader$ParseException(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i2 = o0 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader$ParseException(sb.toString(), parcel);
    }

    public static int L(Context context) {
        return (((context != null ? context.getResources() : AegonApplication.getApplication().getResources()).getDisplayMetrics().widthPixels - (v(context, 16.0f) * 2)) * 9) / 16;
    }

    public static Drawable L0(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 23 ? drawable : i2 >= 21 ? !(drawable instanceof b) ? new e(drawable) : drawable : !(drawable instanceof b) ? new d(drawable) : drawable;
    }

    public static ImageHeaderParser.ImageType M(List<ImageHeaderParser> list, InputStream inputStream, g.d.a.l.t.b0.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new v(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return N(list, new e(inputStream));
    }

    public static ActionMode.Callback M0(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof d)) ? callback : new d(callback, textView);
    }

    public static ImageHeaderParser.ImageType N(List<ImageHeaderParser> list, k kVar) throws IOException {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ImageHeaderParser.ImageType a2 = kVar.a(list.get(i2));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static void N0(Parcel parcel, int i2, Bundle bundle, boolean z) {
        if (bundle != null) {
            int T0 = T0(parcel, i2);
            parcel.writeBundle(bundle);
            V0(parcel, T0);
        } else if (z) {
            parcel.writeInt(i2 | 0);
        }
    }

    public static void O(Context context, String str, String str2, AssetInfo assetInfo) {
        Intent intent = new Intent(context, AppWatcherService.class);
        intent.putExtra("command", "HANDLE_PACKAGE_EVENT");
        intent.putExtra("event", str);
        intent.putExtra("packageName", str2);
        intent.putExtra("assetInfo", assetInfo);
        try {
            context.startService(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void O0(Parcel parcel, int i2, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int T0 = T0(parcel, i2);
            parcel.writeStrongBinder(iBinder);
            V0(parcel, T0);
        } else if (z) {
            parcel.writeInt(i2 | 0);
        }
    }

    public static void P(String str, String str2) {
        Log.i(J(str), str2);
    }

    public static void P0(Parcel parcel, int i2, Parcelable parcelable, int i3, boolean z) {
        if (parcelable != null) {
            int T0 = T0(parcel, i2);
            parcelable.writeToParcel(parcel, i3);
            V0(parcel, T0);
        } else if (z) {
            parcel.writeInt(i2 | 0);
        }
    }

    public static g.d.a.p.e Q() {
        return (g.d.a.p.e) new g.d.a.p.e().d(g.d.a.l.t.k.a);
    }

    public static void Q0(Parcel parcel, int i2, String str, boolean z) {
        if (str != null) {
            int T0 = T0(parcel, i2);
            parcel.writeString(str);
            V0(parcel, T0);
        } else if (z) {
            parcel.writeInt(i2 | 0);
        }
    }

    public static g.d.a.p.e R(int i2) {
        return (g.d.a.p.e) ((g.d.a.p.e) Q().i(i2)).e(i2);
    }

    public static <T extends Parcelable> void R0(Parcel parcel, int i2, T[] tArr, int i3, boolean z) {
        if (tArr != null) {
            int T0 = T0(parcel, i2);
            parcel.writeInt(r9);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    int dataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int dataPosition2 = parcel.dataPosition();
                    t.writeToParcel(parcel, i3);
                    int dataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(dataPosition);
                    parcel.writeInt(dataPosition3 - dataPosition2);
                    parcel.setDataPosition(dataPosition3);
                }
            }
            V0(parcel, T0);
        } else if (z) {
            parcel.writeInt(i2 | 0);
        }
    }

    public static g.d.a.p.e S(int i2) {
        return (g.d.a.p.e) R(i2).o(new g.c.a.e.k.g.b(), true);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:28:0x0084, B:31:0x008e] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0084 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x008e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0084=Splitter:B:28:0x0084, B:31:0x008e=Splitter:B:31:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void S0(java.io.File r5, java.lang.String r6, java.util.zip.ZipOutputStream r7) {
        /*
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r5.isDirectory()
            r1 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.StringBuilder r6 = g.a.a.a.a.i(r6)
            java.lang.String r0 = r5.getName()
            r6.append(r0)
            java.lang.String r0 = java.io.File.separator
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.io.File[] r5 = r5.listFiles()
            int r0 = r5.length
            if (r0 == 0) goto L_0x0033
            int r0 = r5.length
        L_0x0029:
            if (r1 >= r0) goto L_0x00a1
            r2 = r5[r1]
            S0(r2, r6, r7)
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0033:
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch:{ IOException -> 0x003d }
            r5.<init>(r6)     // Catch:{ IOException -> 0x003d }
            r7.putNextEntry(r5)     // Catch:{ IOException -> 0x003d }
            goto L_0x00a1
        L_0x003d:
            org.slf4j.Logger r5 = g.c.a.e.e.a.a
            goto L_0x00a1
        L_0x0040:
            r0 = 0
            r2 = 1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0084 }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008e, IOException -> 0x0084 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r4.append(r6)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = r5.getName()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            java.lang.String r5 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r0.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r7.putNextEntry(r0)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
        L_0x0066:
            int r6 = r3.read(r5)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r0 = -1
            if (r6 == r0) goto L_0x0074
            r7.write(r5, r1, r6)     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            r7.flush()     // Catch:{ FileNotFoundException -> 0x0080, IOException -> 0x007e, all -> 0x007c }
            goto L_0x0066
        L_0x0074:
            java.io.Closeable[] r5 = new java.io.Closeable[r2]
            r5[r1] = r3
            k(r5)
            goto L_0x00a1
        L_0x007c:
            r5 = move-exception
            goto L_0x0099
        L_0x007e:
            r0 = r3
            goto L_0x0084
        L_0x0080:
            r0 = r3
            goto L_0x008e
        L_0x0082:
            r5 = move-exception
            goto L_0x0098
        L_0x0084:
            org.slf4j.Logger r5 = g.c.a.e.e.a.a     // Catch:{ all -> 0x0082 }
            java.io.Closeable[] r5 = new java.io.Closeable[r2]
            r5[r1] = r0
            k(r5)
            goto L_0x00a1
        L_0x008e:
            org.slf4j.Logger r5 = g.c.a.e.e.a.a     // Catch:{ all -> 0x0082 }
            java.io.Closeable[] r5 = new java.io.Closeable[r2]
            r5[r1] = r0
            k(r5)
            goto L_0x00a1
        L_0x0098:
            r3 = r0
        L_0x0099:
            java.io.Closeable[] r6 = new java.io.Closeable[r2]
            r6[r1] = r3
            k(r6)
            throw r5
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.a.S0(java.io.File, java.lang.String, java.util.zip.ZipOutputStream):void");
    }

    public static void T(Context context, View view, int i2, int i3) {
        int i4 = (int) (((float) i3) * context.getResources().getDisplayMetrics().density);
        View view2 = (View) view.getParent();
        view2.post(new n(view, (int) (((float) i2) * context.getResources().getDisplayMetrics().density), i4, view2));
    }

    public static int T0(Parcel parcel, int i2) {
        parcel.writeInt(i2 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static boolean U(Context context) {
        return context != null && (context instanceof Activity) && !((Activity) context).isFinishing();
    }

    public static void U0(Parcel parcel, int i2, int i3, int i4) {
        if (i3 != i4) {
            String hexString = Integer.toHexString(i3);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i4);
            sb.append(" got ");
            sb.append(i3);
            throw new SafeParcelReader$ParseException(g.a.a.a.a.g(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static boolean V(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static void V0(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean W(int i2, int i3) {
        return i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && i2 <= 512 && i3 <= 384;
    }

    public static void W0(Parcel parcel, int i2, int i3) {
        int o0 = o0(parcel, i2);
        if (o0 != i3) {
            String hexString = Integer.toHexString(o0);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(o0);
            throw new SafeParcelReader$ParseException(g.a.a.a.a.g(sb, " (0x", hexString, ")"), parcel);
        }
    }

    public static final boolean X(DownloadTask downloadTask) {
        return (downloadTask == null || downloadTask.getStatInfo() == null || downloadTask.getStatInfo().isUpdate != 1) ? false : true;
    }

    public static boolean Y(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }

    public static <T> void Z(T t, Object obj, ImageView imageView, g.d.a.p.e eVar) {
        s0(t, obj, eVar, (g.c.a.e.k.g.e) null, (f<Drawable>) null).v(imageView);
    }

    public static String a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    public static <T> void a0(T t, Object obj, ImageView imageView, g.d.a.p.e eVar, g.c.a.e.k.g.e eVar2) {
        s0(t, obj, eVar, eVar2, (f<Drawable>) null).v(imageView);
    }

    public static String b(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    public static Interpolator b0(Context context, int i2) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i2 == 17563663) {
            try {
                return new e.i.a.a.a();
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e2);
                throw notFoundException;
            } catch (IOException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i2 == 17563661) {
            return new e.i.a.a.b();
        } else {
            if (i2 == 17563662) {
                return new c();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i2);
            context.getResources();
            context.getTheme();
            Interpolator o = o(context, animation);
            animation.close();
            return o;
        }
    }

    public static String c(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static boolean c0(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f2, f3, z);
            } catch (AbstractMethodError e2) {
                g.a.a.a.a.o("ViewParent ", viewParent, " does not implement interface method onNestedFling", "ViewParentCompat", e2);
                return false;
            }
        } else if (viewParent instanceof e.e.j.j) {
            return ((e.e.j.j) viewParent).onNestedFling(view, f2, f3, z);
        } else {
            return false;
        }
    }

    public static void d(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public static boolean d0(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f2, f3);
            } catch (AbstractMethodError e2) {
                g.a.a.a.a.o("ViewParent ", viewParent, " does not implement interface method onNestedPreFling", "ViewParentCompat", e2);
                return false;
            }
        } else if (viewParent instanceof e.e.j.j) {
            return ((e.e.j.j) viewParent).onNestedPreFling(view, f2, f3);
        } else {
            return false;
        }
    }

    public static boolean e(File file, File file2) throws RolloverFailure {
        if (!file.exists()) {
            throw new IllegalArgumentException("File [" + file + "] does not exist.");
        } else if (file2.exists()) {
            try {
                Class<?> cls = Class.forName("java.nio.file.Path");
                Class<?> cls2 = Class.forName("java.nio.file.Files");
                Method method = File.class.getMethod("toPath", new Class[0]);
                Method method2 = cls2.getMethod("getFileStore", new Class[]{cls});
                Object invoke = method.invoke(file, new Object[0]);
                Object invoke2 = method.invoke(file2, new Object[0]);
                return method2.invoke((Object) null, new Object[]{invoke}).equals(method2.invoke((Object) null, new Object[]{invoke2}));
            } catch (Exception e2) {
                throw new RolloverFailure("Failed to check file store equality for [" + file + "] and [" + file2 + "]", e2);
            }
        } else {
            throw new IllegalArgumentException("File [" + file2 + "] does not exist.");
        }
    }

    public static void e0(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof e.e.j.h) {
            ((e.e.j.h) viewParent).j(view, i2, i3, iArr, i4);
        } else if (i4 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i2, i3, iArr);
                } catch (AbstractMethodError e2) {
                    g.a.a.a.a.o("ViewParent ", viewParent, " does not implement interface method onNestedPreScroll", "ViewParentCompat", e2);
                }
            } else if (viewParent instanceof e.e.j.j) {
                ((e.e.j.j) viewParent).onNestedPreScroll(view, i2, i3, iArr);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    @android.annotation.TargetApi(18)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap f(android.content.Context r4, android.graphics.Bitmap r5, int r6) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r4 = android.renderscript.RenderScript.create(r4)     // Catch:{ all -> 0x0046 }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x0043 }
            r1.<init>()     // Catch:{ all -> 0x0043 }
            r4.setMessageHandler(r1)     // Catch:{ all -> 0x0043 }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x0043 }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r4, r5, r1, r2)     // Catch:{ all -> 0x0043 }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x0040 }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r4, r2)     // Catch:{ all -> 0x0040 }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r4)     // Catch:{ all -> 0x003e }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r4, r3)     // Catch:{ all -> 0x003e }
            r0.setInput(r1)     // Catch:{ all -> 0x003e }
            float r6 = (float) r6     // Catch:{ all -> 0x003e }
            r0.setRadius(r6)     // Catch:{ all -> 0x003e }
            r0.forEach(r2)     // Catch:{ all -> 0x003e }
            r2.copyTo(r5)     // Catch:{ all -> 0x003e }
            r0.destroy()
            r2.destroy()
            r1.destroy()
            r4.destroy()
            return r5
        L_0x003e:
            r5 = move-exception
            goto L_0x004a
        L_0x0040:
            r5 = move-exception
            r2 = r0
            goto L_0x004a
        L_0x0043:
            r5 = move-exception
            r1 = r0
            goto L_0x0049
        L_0x0046:
            r5 = move-exception
            r4 = r0
            r1 = r4
        L_0x0049:
            r2 = r1
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.destroy()
        L_0x004f:
            if (r2 == 0) goto L_0x0054
            r2.destroy()
        L_0x0054:
            if (r1 == 0) goto L_0x0059
            r1.destroy()
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r4.destroy()
        L_0x005e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.a.f(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void f0(ViewParent viewParent, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof i) {
            ((i) viewParent2).m(view, i2, i3, i4, i5, i6, iArr);
            return;
        }
        iArr[0] = iArr[0] + i4;
        iArr[1] = iArr[1] + i5;
        if (viewParent2 instanceof e.e.j.h) {
            ((e.e.j.h) viewParent2).n(view, i2, i3, i4, i5, i6);
        } else if (i6 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    g.a.a.a.a.o("ViewParent ", viewParent, " does not implement interface method onNestedScroll", "ViewParentCompat", e2);
                }
            } else if (viewParent2 instanceof e.e.j.j) {
                ((e.e.j.j) viewParent2).onNestedScroll(view, i2, i3, i4, i5);
            }
        }
    }

    public static Bitmap g(Bitmap bitmap, int i2, boolean z) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        int i3;
        int i4;
        int[] iArr;
        int[] iArr2;
        int i5 = i2;
        if (z) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmap.copy(bitmap.getConfig(), true);
        }
        if (i5 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i6 = width * height;
        int[] iArr3 = new int[i6];
        bitmap2.getPixels(iArr3, 0, width, 0, 0, width, height);
        int i7 = width - 1;
        int i8 = height - 1;
        int i9 = i5 + i5 + 1;
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[i6];
        int[] iArr7 = new int[Math.max(width, height)];
        int i10 = (i9 + 1) >> 1;
        int i11 = i10 * i10;
        int i12 = i11 * 256;
        int[] iArr8 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr8[i13] = i13 / i11;
        }
        int[] iArr9 = new int[2];
        iArr9[1] = 3;
        iArr9[0] = i9;
        int[][] iArr10 = (int[][]) Array.newInstance(int.class, iArr9);
        int i14 = i5 + 1;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            bitmap3 = bitmap2;
            if (i15 >= height) {
                break;
            }
            int i18 = height;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = -i5;
            int i28 = 0;
            while (true) {
                i4 = i8;
                iArr = iArr7;
                if (i27 > i5) {
                    break;
                }
                int i29 = iArr3[Math.min(i7, Math.max(i27, 0)) + i16];
                int[] iArr11 = iArr10[i27 + i5];
                iArr11[0] = (i29 & 16711680) >> 16;
                iArr11[1] = (i29 & 65280) >> 8;
                iArr11[2] = i29 & 255;
                int abs = i14 - Math.abs(i27);
                i28 = (iArr11[0] * abs) + i28;
                i19 = (iArr11[1] * abs) + i19;
                i20 = (iArr11[2] * abs) + i20;
                if (i27 > 0) {
                    i24 += iArr11[0];
                    i25 += iArr11[1];
                    i26 += iArr11[2];
                } else {
                    i21 += iArr11[0];
                    i22 += iArr11[1];
                    i23 += iArr11[2];
                }
                i27++;
                i8 = i4;
                iArr7 = iArr;
            }
            int i30 = i5;
            int i31 = i28;
            int i32 = 0;
            while (i32 < width) {
                iArr4[i16] = iArr8[i31];
                iArr5[i16] = iArr8[i19];
                iArr6[i16] = iArr8[i20];
                int i33 = i31 - i21;
                int i34 = i19 - i22;
                int i35 = i20 - i23;
                int[] iArr12 = iArr10[((i30 - i5) + i9) % i9];
                int i36 = i21 - iArr12[0];
                int i37 = i22 - iArr12[1];
                int i38 = i23 - iArr12[2];
                if (i15 == 0) {
                    iArr2 = iArr8;
                    iArr[i32] = Math.min(i32 + i5 + 1, i7);
                } else {
                    iArr2 = iArr8;
                }
                int i39 = iArr3[i17 + iArr[i32]];
                iArr12[0] = (i39 & 16711680) >> 16;
                iArr12[1] = (i39 & 65280) >> 8;
                iArr12[2] = i39 & 255;
                int i40 = i24 + iArr12[0];
                int i41 = i25 + iArr12[1];
                int i42 = i26 + iArr12[2];
                i31 = i33 + i40;
                i19 = i34 + i41;
                i20 = i35 + i42;
                i30 = (i30 + 1) % i9;
                int[] iArr13 = iArr10[i30 % i9];
                i21 = i36 + iArr13[0];
                i22 = i37 + iArr13[1];
                i23 = i38 + iArr13[2];
                i24 = i40 - iArr13[0];
                i25 = i41 - iArr13[1];
                i26 = i42 - iArr13[2];
                i16++;
                i32++;
                iArr8 = iArr2;
            }
            int[] iArr14 = iArr8;
            i17 += width;
            i15++;
            bitmap2 = bitmap3;
            height = i18;
            i8 = i4;
            iArr7 = iArr;
        }
        int i43 = i8;
        int[] iArr15 = iArr7;
        int i44 = height;
        int[] iArr16 = iArr8;
        int i45 = 0;
        while (i45 < width) {
            int i46 = -i5;
            int i47 = i9;
            int[] iArr17 = iArr3;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = i46;
            int i56 = i46 * width;
            int i57 = 0;
            int i58 = 0;
            while (true) {
                i3 = width;
                if (i55 > i5) {
                    break;
                }
                int max = Math.max(0, i56) + i45;
                int[] iArr18 = iArr10[i55 + i5];
                iArr18[0] = iArr4[max];
                iArr18[1] = iArr5[max];
                iArr18[2] = iArr6[max];
                int abs2 = i14 - Math.abs(i55);
                i57 = (iArr4[max] * abs2) + i57;
                i58 = (iArr5[max] * abs2) + i58;
                i48 = (iArr6[max] * abs2) + i48;
                if (i55 > 0) {
                    i52 += iArr18[0];
                    i53 += iArr18[1];
                    i54 += iArr18[2];
                } else {
                    i49 += iArr18[0];
                    i50 += iArr18[1];
                    i51 += iArr18[2];
                }
                int i59 = i43;
                if (i55 < i59) {
                    i56 += i3;
                }
                i55++;
                i43 = i59;
                width = i3;
            }
            int i60 = i43;
            int i61 = i5;
            int i62 = i45;
            int i63 = i58;
            int i64 = i44;
            int i65 = i57;
            int i66 = 0;
            while (i66 < i64) {
                iArr17[i62] = (iArr17[i62] & -16777216) | (iArr16[i65] << 16) | (iArr16[i63] << 8) | iArr16[i48];
                int i67 = i65 - i49;
                int i68 = i63 - i50;
                int i69 = i48 - i51;
                int[] iArr19 = iArr10[((i61 - i5) + i47) % i47];
                int i70 = i49 - iArr19[0];
                int i71 = i50 - iArr19[1];
                int i72 = i51 - iArr19[2];
                if (i45 == 0) {
                    iArr15[i66] = Math.min(i66 + i14, i60) * i3;
                }
                int i73 = iArr15[i66] + i45;
                iArr19[0] = iArr4[i73];
                iArr19[1] = iArr5[i73];
                iArr19[2] = iArr6[i73];
                int i74 = i52 + iArr19[0];
                int i75 = i53 + iArr19[1];
                int i76 = i54 + iArr19[2];
                i65 = i67 + i74;
                i63 = i68 + i75;
                i48 = i69 + i76;
                i61 = (i61 + 1) % i47;
                int[] iArr20 = iArr10[i61];
                i49 = i70 + iArr20[0];
                i50 = i71 + iArr20[1];
                i51 = i72 + iArr20[2];
                i52 = i74 - iArr20[0];
                i53 = i75 - iArr20[1];
                i54 = i76 - iArr20[2];
                i62 += i3;
                i66++;
                i5 = i2;
            }
            i45++;
            i5 = i2;
            i43 = i60;
            i44 = i64;
            i9 = i47;
            iArr3 = iArr17;
            width = i3;
        }
        int i77 = width;
        bitmap3.setPixels(iArr3, 0, i77, 0, 0, i77, i44);
        return bitmap3;
    }

    public static void g0(g.c.a.l.o.b bVar, g.c.a.l.o.i iVar) {
        i.o.c.h.e(bVar, "this");
        i.o.c.h.e(iVar, "seekableByteChannel");
    }

    public static boolean h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public static void h0(g.c.a.l.o.b bVar, File file) {
        i.o.c.h.e(bVar, "this");
        i.o.c.h.e(file, "file");
    }

    public static void i(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i0(g.c.a.l.o.b bVar, String str) {
        i.o.c.h.e(bVar, "this");
        i.o.c.h.e(str, "str");
    }

    public static void j(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (f3 >= f4) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static void j0(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (str2 == null) {
                str2 = "";
            }
            map.put(str, str2);
        }
    }

    public static void k(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static boolean k0(Parcel parcel, int i2) {
        W0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static void l(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(translationY + 1.0f);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                float translationY2 = view2.getTranslationY();
                view2.setTranslationY(1.0f + translationY2);
                view2.setTranslationY(translationY2);
            }
        }
    }

    public static IBinder l0(Parcel parcel, int i2) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + o0);
        return readStrongBinder;
    }

    public static Bundle m(Parcel parcel, int i2) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + o0);
        return readBundle;
    }

    public static int m0(Parcel parcel, int i2) {
        W0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static int[] n(Parcel parcel, int i2) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + o0);
        return createIntArray;
    }

    public static long n0(Parcel parcel, int i2) {
        W0(parcel, i2, 8);
        return parcel.readLong();
    }

    public static Interpolator o(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Interpolator eVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            eVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            eVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            eVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            eVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            eVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            eVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            eVar = new e.q.a.a.e(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder i2 = g.a.a.a.a.i("Unknown interpolator name: ");
                            i2.append(xmlPullParser.getName());
                            throw new RuntimeException(i2.toString());
                        }
                        interpolator = eVar;
                    }
                }
            }
        }
        return interpolator;
    }

    public static int o0(Parcel parcel, int i2) {
        return (i2 & -65536) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static <T extends Parcelable> T p(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + o0);
        return t;
    }

    public static void p0(Context context, int i2, BroadcastReceiver broadcastReceiver, String... strArr) {
        IntentFilter intentFilter = new IntentFilter();
        for (String addAction : strArr) {
            intentFilter.addAction(addAction);
            intentFilter.setPriority(i2);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            intentFilter.addDataScheme((String) null);
        }
        e.m.a.a a2 = e.m.a.a.a(context);
        synchronized (a2.b) {
            a.c cVar = new a.c(intentFilter, broadcastReceiver);
            ArrayList arrayList = a2.b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                a2.b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i3 = 0; i3 < intentFilter.countActions(); i3++) {
                String action = intentFilter.getAction(i3);
                ArrayList arrayList2 = a2.c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    a2.c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public static String q(Parcel parcel, int i2) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + o0);
        return readString;
    }

    public static final void q0(String str, View view, Map<String, ?> map) {
        Logger logger = g.c.a.e.h.b.d.a;
        Logger logger2 = g.c.a.e.h.b.e.a;
        Objects.requireNonNull(e.b.a);
        Map<String, ?> z = g.h.a.a.z(g.i.c.a.a.l.c.a(view, false));
        if (z == null || !z.containsKey("report_element")) {
            g.c.a.e.h.b.d.h(view, "app", false);
            e.e.i.b.Q(view, g.i.c.a.a.k.a.REPORT_NONE, "element_click_policy");
        }
        g.c.a.e.h.b.d.e(str, view, map);
    }

    public static ArrayList<String> r(Parcel parcel, int i2) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + o0);
        return createStringArrayList;
    }

    public static final void r0(String str, g.c.b.b.j.a aVar, Map<String, ?> map) {
        i.o.c.h.e(str, "eventId");
        if (aVar != null) {
            g.c.a.e.h.b.d.e(str, (Object) null, map);
            g.c.a.m.j.a("DTDownloadReporter", "reportInstallEvent eventId = " + str + " ; params = " + map);
            if (i.o.c.h.a("AppSuccInstall", str)) {
                DataSavingUtils.putData(AegonApplication.getContext(), i.o.c.h.j("apk_download_id", map.get("apk_download_id")), true);
            }
        }
    }

    public static <T> T[] s(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int o0 = o0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (o0 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + o0);
        return createTypedArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r5 == null) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> g.d.a.f<android.graphics.drawable.Drawable> s0(T r5, java.lang.Object r6, g.d.a.p.e r7, g.c.a.e.k.g.e r8, g.d.a.f<android.graphics.drawable.Drawable> r9) {
        /*
            r0 = 0
            boolean r1 = r5 instanceof androidx.fragment.app.Fragment     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x001d
            r1 = r5
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1     // Catch:{ Exception -> 0x007f }
            boolean r1 = r1.isAdded()     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x001d
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5     // Catch:{ Exception -> 0x007f }
            android.content.Context r1 = r5.getContext()     // Catch:{ Exception -> 0x007f }
            g.d.a.m.l r1 = g.d.a.b.c(r1)     // Catch:{ Exception -> 0x007f }
            g.d.a.g r5 = r1.h(r5)     // Catch:{ Exception -> 0x007f }
            goto L_0x007a
        L_0x001d:
            boolean r1 = r5 instanceof android.app.Fragment     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x0039
            r1 = r5
            android.app.Fragment r1 = (android.app.Fragment) r1     // Catch:{ Exception -> 0x007f }
            boolean r1 = r1.isAdded()     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x0039
            android.app.Fragment r5 = (android.app.Fragment) r5     // Catch:{ Exception -> 0x007f }
            android.app.Activity r1 = r5.getActivity()     // Catch:{ Exception -> 0x007f }
            g.d.a.m.l r1 = g.d.a.b.c(r1)     // Catch:{ Exception -> 0x007f }
            g.d.a.g r5 = r1.f(r5)     // Catch:{ Exception -> 0x007f }
            goto L_0x007a
        L_0x0039:
            boolean r1 = r5 instanceof e.h.b.j     // Catch:{ Exception -> 0x007f }
            java.lang.String r2 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            if (r1 == 0) goto L_0x004f
            e.h.b.j r5 = (e.h.b.j) r5     // Catch:{ Exception -> 0x007f }
            java.util.Objects.requireNonNull(r5, r2)     // Catch:{ Exception -> 0x007f }
            g.d.a.b r1 = g.d.a.b.b(r5)     // Catch:{ Exception -> 0x007f }
            g.d.a.m.l r1 = r1.f2320g     // Catch:{ Exception -> 0x007f }
            g.d.a.g r5 = r1.i(r5)     // Catch:{ Exception -> 0x007f }
            goto L_0x007a
        L_0x004f:
            boolean r1 = r5 instanceof android.app.Activity     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x0063
            android.app.Activity r5 = (android.app.Activity) r5     // Catch:{ Exception -> 0x007f }
            java.util.Objects.requireNonNull(r5, r2)     // Catch:{ Exception -> 0x007f }
            g.d.a.b r1 = g.d.a.b.b(r5)     // Catch:{ Exception -> 0x007f }
            g.d.a.m.l r1 = r1.f2320g     // Catch:{ Exception -> 0x007f }
            g.d.a.g r5 = r1.e(r5)     // Catch:{ Exception -> 0x007f }
            goto L_0x007a
        L_0x0063:
            boolean r1 = r5 instanceof android.view.View     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x006e
            android.view.View r5 = (android.view.View) r5     // Catch:{ Exception -> 0x007f }
            g.d.a.g r5 = g.d.a.b.f(r5)     // Catch:{ Exception -> 0x007f }
            goto L_0x007a
        L_0x006e:
            boolean r1 = r5 instanceof android.content.Context     // Catch:{ Exception -> 0x007f }
            if (r1 == 0) goto L_0x0079
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x007f }
            g.d.a.g r5 = g.d.a.b.e(r5)     // Catch:{ Exception -> 0x007f }
            goto L_0x007a
        L_0x0079:
            r5 = r0
        L_0x007a:
            if (r5 != 0) goto L_0x008b
            goto L_0x0083
        L_0x007d:
            r5 = move-exception
            goto L_0x00b6
        L_0x007f:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x007d }
        L_0x0083:
            android.content.Context r5 = com.apkpure.aegon.application.AegonApplication.getContext()
            g.d.a.g r5 = g.d.a.b.e(r5)
        L_0x008b:
            java.util.Objects.requireNonNull(r5)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            g.d.a.f r2 = new g.d.a.f
            g.d.a.b r3 = r5.b
            android.content.Context r4 = r5.c
            r2.<init>(r3, r5, r1, r4)
            r2.T = r6
            r5 = 1
            r2.X = r5
            g.d.a.f r5 = r2.a(r7)
            g.c.a.e.k.g.c r6 = new g.c.a.e.k.g.c
            r6.<init>(r8)
            r5.U = r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.U = r7
            r7.add(r6)
            r5.V = r9
            return r5
        L_0x00b6:
            android.content.Context r6 = com.apkpure.aegon.application.AegonApplication.getContext()
            g.d.a.b.e(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.a.s0(java.lang.Object, java.lang.Object, g.d.a.p.e, g.c.a.e.k.g.e, g.d.a.f):g.d.a.f");
    }

    public static void t(String str, String str2, Object obj) {
        Log.d(J(str), String.format(str2, new Object[]{obj}));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <TInput, TResult, TException extends java.lang.Throwable> TResult t0(int r5, TInput r6, g.e.a.a.e.b<TInput, TResult, TException> r7, g.e.a.a.f.y.a<TInput, TResult> r8) throws java.lang.Throwable {
        /*
            r8 = 1
            if (r5 >= r8) goto L_0x0008
            java.lang.Object r5 = r7.a(r6)
            return r5
        L_0x0008:
            java.lang.Object r0 = r7.a(r6)
            g.e.a.a.e.c$a r6 = (g.e.a.a.e.c.a) r6
            r1 = r0
            g.e.a.a.e.c$b r1 = (g.e.a.a.e.c.b) r1
            java.net.URL r2 = r1.b
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "CctTransportBackend"
            java.lang.String r4 = "Following redirect to: %s"
            t(r3, r4, r2)
            java.net.URL r1 = r1.b
            g.e.a.a.e.c$a r2 = new g.e.a.a.e.c$a
            g.e.a.a.e.d.o r3 = r6.b
            java.lang.String r6 = r6.c
            r2.<init>(r1, r3, r6)
            r6 = r2
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            if (r6 == 0) goto L_0x0030
            int r5 = r5 + -1
            if (r5 >= r8) goto L_0x0008
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.a.t0(int, java.lang.Object, g.e.a.a.e.b, g.e.a.a.f.y.a):java.lang.Object");
    }

    public static void u(String str, String str2, Object... objArr) {
        Log.d(J(str), String.format(str2, objArr));
    }

    public static int u0(Context context, int i2) {
        int i3;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        if (1 == i2) {
            i3 = 2130968932;
        } else if (2 == i2) {
            i3 = 2130968936;
        } else if (3 == i2) {
            i3 = 2130968933;
        } else if (4 != i2) {
            return 0;
        } else {
            i3 = 2130968935;
        }
        theme.resolveAttribute(i3, typedValue, true);
        return typedValue.resourceId;
    }

    public static int v(Context context, float f2) {
        if (context == null) {
            return 0;
        }
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void v0(TextView textView, int i2) {
        b.b(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void w(String str, String str2, Throwable th) {
        Log.e(J(str), str2, th);
    }

    public static void w0(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    public static void x(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i2);
            throw new SafeParcelReader$ParseException(sb.toString(), parcel);
        }
    }

    public static void x0(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce A[Catch:{ Exception -> 0x00dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map<java.lang.String, java.lang.Object> y(com.apkpure.aegon.components.download.DownloadTask r5, long r6) {
        /*
            java.lang.String r0 = "fast_download_pop"
            java.util.HashMap r1 = new java.util.HashMap
            r2 = 20
            r1.<init>(r2)
            if (r5 != 0) goto L_0x000d
            goto L_0x00df
        L_0x000d:
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r2 = r5.getStatInfo()     // Catch:{ Exception -> 0x00dd }
            java.util.Map r2 = H(r2)     // Catch:{ Exception -> 0x00dd }
            r3 = r2
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ Exception -> 0x00dd }
            boolean r3 = r3.isEmpty()     // Catch:{ Exception -> 0x00dd }
            r4 = 0
            if (r3 != 0) goto L_0x0022
            r1.putAll(r2)     // Catch:{ Exception -> 0x00dd }
        L_0x0022:
            com.apkpure.aegon.components.models.SimpleDisplayInfo r2 = r5.getSimpleDisplayInfo()     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x004f
            java.lang.String r2 = "package_name"
            com.apkpure.aegon.components.models.SimpleDisplayInfo r3 = r5.getSimpleDisplayInfo()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x00dd }
            j0(r1, r2, r3)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "version"
            com.apkpure.aegon.components.models.SimpleDisplayInfo r3 = r5.getSimpleDisplayInfo()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r3 = r3.e()     // Catch:{ Exception -> 0x00dd }
            j0(r1, r2, r3)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "version_code"
            com.apkpure.aegon.components.models.SimpleDisplayInfo r3 = r5.getSimpleDisplayInfo()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r3 = r3.d()     // Catch:{ Exception -> 0x00dd }
            j0(r1, r2, r3)     // Catch:{ Exception -> 0x00dd }
        L_0x004f:
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r2 = r5.getStatInfo()     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x0085
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r2 = r5.getStatInfo()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r2.isApks     // Catch:{ Exception -> 0x00dd }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00dd }
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = "is_apks"
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r3 = r5.getStatInfo()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r3 = r3.isApks     // Catch:{ Exception -> 0x00dd }
            j0(r1, r2, r3)     // Catch:{ Exception -> 0x00dd }
            com.apkpure.aegon.components.statistics.datong.DTStatInfo r2 = r5.getStatInfo()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r2.b()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r3 = "downloadTask.statInfo.extendedField"
            i.o.c.h.d(r2, r3)     // Catch:{ Exception -> 0x00dd }
            r3 = 2
            boolean r2 = i.t.e.a(r2, r0, r4, r3)     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x0085
            java.lang.String r2 = "pop_type"
            j0(r1, r2, r0)     // Catch:{ Exception -> 0x00dd }
        L_0x0085:
            com.apkpure.aegon.components.models.Asset r0 = r5.getAsset()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "file_size"
            if (r0 == 0) goto L_0x009a
            com.apkpure.aegon.components.models.Asset r0 = r5.getAsset()     // Catch:{ Exception -> 0x00dd }
            long r3 = r0.d()     // Catch:{ Exception -> 0x00dd }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x00dd }
            goto L_0x009f
        L_0x009a:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00dd }
        L_0x009f:
            r1.put(r2, r0)     // Catch:{ Exception -> 0x00dd }
            boolean r0 = r5.isSuccess()     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "download_cost_time"
            goto L_0x00b3
        L_0x00ab:
            boolean r0 = r5.isDownloading()     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "download_connection_time"
        L_0x00b3:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x00dd }
            r1.put(r0, r6)     // Catch:{ Exception -> 0x00dd }
        L_0x00ba:
            java.lang.String r6 = g.c.a.e.b.g.c(r5)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r7 = "getEngine(downloadTask)"
            i.o.c.h.d(r6, r7)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r7 = "download_engine"
            r1.put(r7, r6)     // Catch:{ Exception -> 0x00dd }
            boolean r6 = r5.isFailed()     // Catch:{ Exception -> 0x00dd }
            if (r6 == 0) goto L_0x00df
            java.lang.String r6 = "download_fail_error_code"
            java.lang.String r5 = r5.getDownloadErrorCode()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r7 = "downloadTask.downloadErrorCode"
            i.o.c.h.d(r5, r7)     // Catch:{ Exception -> 0x00dd }
            r1.put(r6, r5)     // Catch:{ Exception -> 0x00dd }
            goto L_0x00df
        L_0x00dd:
            org.slf4j.Logger r5 = g.c.a.m.j.a
        L_0x00df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.d.l.a.y(com.apkpure.aegon.components.download.DownloadTask, long):java.util.Map");
    }

    public static void y0(EditorInfo editorInfo, CharSequence charSequence, int i2) {
        editorInfo.setInitialSurroundingSubText(charSequence, i2);
    }

    public static int z(String str) {
        if ("REQUESTER_COMMON_DOWNLOAD_SERVICE".equals(str)) {
            return 1;
        }
        if ("REQUESTER_ULTRA_DOWNLOAD_SERVICE".equals(str)) {
            return 2;
        }
        if ("REQUESTER_APP_UPDATE_SERVICE".equals(str)) {
            return 3;
        }
        if ("REQUESTER_APP_UPDATE_MANAGER".equals(str)) {
            return 4;
        }
        if ("REQUESTER_APP_WATCHER_SERVICE".equals(str)) {
            return 5;
        }
        if ("REQUEST_APP_PUSH".equals(str)) {
            return 6;
        }
        return "REQUEST_APK_UPLOAD".equals(str) ? 7 : 0;
    }

    public static void z0(TextView textView, int i2) {
        b.b(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }
}
