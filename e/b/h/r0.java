package e.b.h;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import e.f.a.c;
import g.i.c.a.a.i.b;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

public class r0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int z = 0;

    /* renamed from: m  reason: collision with root package name */
    public final SearchView f1184m;
    public final SearchableInfo n;
    public final Context o;
    public final WeakHashMap<String, Drawable.ConstantState> p;
    public final int q;
    public int r = 1;
    public ColorStateList s;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;

    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1185d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1186e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.f1185d = (ImageView) view.findViewById(16908296);
            this.f1186e = (ImageView) view.findViewById(2131296802);
        }
    }

    public r0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1184m = searchView;
        this.n = searchableInfo;
        this.q = searchView.getSuggestionCommitIconResId();
        this.o = context;
        this.p = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            e.b.h.r0$a r3 = (e.b.h.r0.a) r3
            int r0 = r1.y
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r6 = 0
        L_0x0019:
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x0035
            int r0 = r1.t
            java.lang.String r0 = h(r2, r0)
            android.widget.TextView r7 = r3.a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0031
            r0 = 8
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r7.setVisibility(r0)
        L_0x0035:
            android.widget.TextView r0 = r3.b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00bc
            int r0 = r1.v
            java.lang.String r0 = h(r2, r0)
            if (r0 == 0) goto L_0x0085
            android.content.res.ColorStateList r9 = r1.s
            if (r9 != 0) goto L_0x0066
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.o
            android.content.res.Resources$Theme r10 = r10.getTheme()
            r11 = 2130969715(0x7f040473, float:1.754812E38)
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.o
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.s = r9
        L_0x0066:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.s
            r16 = 0
            r10 = r15
            r5 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r5, r4, r0, r10)
            goto L_0x008b
        L_0x0085:
            int r0 = r1.u
            java.lang.String r9 = h(r2, r0)
        L_0x008b:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x009e
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x00aa
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r3.a
            r0.setMaxLines(r7)
            goto L_0x00aa
        L_0x009e:
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x00aa
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.a
            r0.setMaxLines(r8)
        L_0x00aa:
            android.widget.TextView r0 = r3.b
            r0.setText(r9)
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 == 0) goto L_0x00b8
            r5 = 8
            goto L_0x00b9
        L_0x00b8:
            r5 = 0
        L_0x00b9:
            r0.setVisibility(r5)
        L_0x00bc:
            android.widget.ImageView r5 = r3.c
            r9 = 0
            if (r5 == 0) goto L_0x016b
            int r0 = r1.w
            r10 = -1
            if (r0 != r10) goto L_0x00c9
            r0 = r9
            goto L_0x0158
        L_0x00c9:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x0158
        L_0x00d5:
            android.app.SearchableInfo r0 = r1.n
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r10 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r11 = r1.p
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto L_0x00fe
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.p
            java.lang.Object r0 = r0.get(r10)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f3
            r0 = r9
            goto L_0x014b
        L_0x00f3:
            android.content.Context r10 = r1.o
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r10)
            goto L_0x014b
        L_0x00fe:
            android.content.Context r11 = r1.o
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x0131 }
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L_0x0111
            goto L_0x013c
        L_0x0111:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L_0x013d
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = g.a.a.a.a.j(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            goto L_0x0137
        L_0x0131:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
        L_0x0137:
            java.lang.String r11 = "SuggestionsAdapter"
            android.util.Log.w(r11, r0)
        L_0x013c:
            r11 = r9
        L_0x013d:
            if (r11 != 0) goto L_0x0141
            r0 = r9
            goto L_0x0145
        L_0x0141:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L_0x0145:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.p
            r12.put(r10, r0)
            r0 = r11
        L_0x014b:
            if (r0 == 0) goto L_0x014e
            goto L_0x0158
        L_0x014e:
            android.content.Context r0 = r1.o
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0158:
            r10 = 4
            r5.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0162
            r5.setVisibility(r10)
            goto L_0x016b
        L_0x0162:
            r5.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r8, r4)
        L_0x016b:
            android.widget.ImageView r0 = r3.f1185d
            if (r0 == 0) goto L_0x0191
            int r5 = r1.x
            r10 = -1
            if (r5 != r10) goto L_0x0175
            goto L_0x017d
        L_0x0175:
            java.lang.String r2 = r2.getString(r5)
            android.graphics.drawable.Drawable r9 = r1.f(r2)
        L_0x017d:
            r0.setImageDrawable(r9)
            if (r9 != 0) goto L_0x0188
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x0191
        L_0x0188:
            r0.setVisibility(r4)
            r9.setVisible(r4, r4)
            r9.setVisible(r8, r4)
        L_0x0191:
            int r0 = r1.r
            if (r0 == r7) goto L_0x01a4
            if (r0 != r8) goto L_0x019c
            r0 = r6 & 1
            if (r0 == 0) goto L_0x019c
            goto L_0x01a4
        L_0x019c:
            android.widget.ImageView r0 = r3.f1186e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01b9
        L_0x01a4:
            android.widget.ImageView r0 = r3.f1186e
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.f1186e
            android.widget.TextView r2 = r3.a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f1186e
            r0.setOnClickListener(r1)
        L_0x01b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.r0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.t = cursor.getColumnIndex("suggest_text_1");
                this.u = cursor.getColumnIndex("suggest_text_2");
                this.v = cursor.getColumnIndex("suggest_text_2_url");
                this.w = cursor.getColumnIndex("suggest_icon_1");
                this.x = cursor.getColumnIndex("suggest_icon_2");
                this.y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    public CharSequence c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        if (this.n.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!this.n.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f1391l.inflate(this.f1389j, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(2131296802)).setImageResource(this.q);
        return inflate;
    }

    public Drawable e(Uri uri) throws FileNotFoundException {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.o.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(g.a.a.a.a.t("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(g.a.a.a.a.t("More than two path segments: ", uri));
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException(g.a.a.a.a.t("No resource found for: ", uri));
                }
                throw new FileNotFoundException(g.a.a.a.a.t("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(g.a.a.a.a.t("No package found for authority: ", uri));
            }
        } else {
            throw new FileNotFoundException(g.a.a.a.a.t("No authority: ", uri));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013b
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013b
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013b
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.content.Context r4 = r7.o     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.p     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.o     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r2 = e.e.c.a.c(r4, r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.p     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0072:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.p
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x007f
            r2 = r1
            goto L_0x0083
        L_0x007f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0083:
            if (r2 == 0) goto L_0x0086
            return r2
        L_0x0086:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            if (r4 == 0) goto L_0x00b6
            android.graphics.drawable.Drawable r0 = r7.e(r2)     // Catch:{ NotFoundException -> 0x009f }
            r1 = r0
            goto L_0x0130
        L_0x009f:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010f }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            throw r3     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00b6:
            android.content.Context r4 = r7.o     // Catch:{ FileNotFoundException -> 0x010f }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x010f }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            if (r4 == 0) goto L_0x00f8
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00df }
            r4.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00dd
        L_0x00ca:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00dd:
            r1 = r5
            goto L_0x0130
        L_0x00df:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00f7
        L_0x00e4:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010f }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00f7:
            throw r5     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x00f8:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010f }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010f }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010f }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010f }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010f }
            throw r3     // Catch:{ FileNotFoundException -> 0x010f }
        L_0x010f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0130:
            if (r1 == 0) goto L_0x013b
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.p
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.r0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.o.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f1391l.inflate(this.f1390k, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e2.toString());
            }
            return inflate;
        }
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        try {
            view2 = super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(this.o, this.f1383d, viewGroup);
            ((a) d2.getTag()).a.setText(e2.toString());
            view2 = d2;
        }
        b.C0166b.a.h(i2, view, viewGroup, getItemId(i2));
        return view2;
    }

    public boolean hasStableIds() {
        return false;
    }

    public final void i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        i(this.f1383d);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        i(this.f1383d);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1184m.w((CharSequence) tag);
        }
        b.C0166b.a.j(view);
    }
}
