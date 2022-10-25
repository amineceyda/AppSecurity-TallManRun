package e.b.g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import e.b.g.i.i;
import e.b.g.i.j;
import e.b.h.e0;
import e.b.h.x0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f992e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f993f;
    public final Object[] a;
    public final Object[] b;
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public Object f994d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e2) {
                StringBuilder n = g.a.a.a.a.n("Couldn't resolve menu item onClick handler ", str, " in class ");
                n.append(cls.getName());
                InflateException inflateException = new InflateException(n.toString());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.a, new Object[]{menuItem})).booleanValue();
                }
                this.b.invoke(this.a, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class b {
        public e.e.j.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f995d;

        /* renamed from: e  reason: collision with root package name */
        public int f996e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f997f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f998g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f999h;

        /* renamed from: i  reason: collision with root package name */
        public int f1000i;

        /* renamed from: j  reason: collision with root package name */
        public int f1001j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1002k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1003l;

        /* renamed from: m  reason: collision with root package name */
        public int f1004m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            this.b = 0;
            this.c = 0;
            this.f995d = 0;
            this.f996e = 0;
            this.f997f = true;
            this.f998g = true;
        }

        public SubMenu a() {
            this.f999h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.f1000i, this.f1001j, this.f1002k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.f1003l).setIcon(this.f1004m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f994d == null) {
                        fVar.f994d = fVar.a(fVar.c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f994d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & -5) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.f1066e == null) {
                            jVar.f1066e = jVar.f1065d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        jVar.f1066e.invoke(jVar.f1065d, new Object[]{Boolean.TRUE});
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.f992e, f.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            e.e.j.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof e.e.e.a.b) {
                    ((e.e.e.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof e.e.e.a.b;
            if (z3) {
                ((e.e.e.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((e.e.e.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i4 = this.o;
            if (z3) {
                ((e.e.e.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z3) {
                ((e.e.e.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((e.e.e.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((e.e.e.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f992e = r0
            f993f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        char c2;
        char c3;
        e.e.j.b bVar;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(g.a.a.a.a.w("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar2.b = 0;
                            bVar2.c = 0;
                            bVar2.f995d = 0;
                            bVar2.f996e = 0;
                            bVar2.f997f = true;
                            bVar2.f998g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f999h) {
                                e.e.j.b bVar3 = bVar2.A;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.f999h = true;
                                    bVar2.c(bVar2.a.add(bVar2.b, bVar2.f1000i, bVar2.f1001j, bVar2.f1002k));
                                } else {
                                    bVar2.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.c.obtainStyledAttributes(attributeSet2, e.b.b.o);
                        bVar2.b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f995d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.f996e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f997f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f998g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        x0 n = x0.n(f.this.c, attributeSet2, e.b.b.p);
                        bVar2.f1000i = n.j(2, 0);
                        bVar2.f1001j = (n.h(5, bVar2.c) & -65536) | (n.h(6, bVar2.f995d) & 65535);
                        bVar2.f1002k = n.l(7);
                        bVar2.f1003l = n.l(8);
                        bVar2.f1004m = n.j(0, 0);
                        String k2 = n.k(9);
                        if (k2 == null) {
                            c2 = 0;
                        } else {
                            c2 = k2.charAt(0);
                        }
                        bVar2.n = c2;
                        bVar2.o = n.h(16, 4096);
                        String k3 = n.k(10);
                        if (k3 == null) {
                            c3 = 0;
                        } else {
                            c3 = k3.charAt(0);
                        }
                        bVar2.p = c3;
                        bVar2.q = n.h(20, 4096);
                        bVar2.r = n.m(11) ? n.a(11, false) : bVar2.f996e;
                        bVar2.s = n.a(3, false);
                        bVar2.t = n.a(4, bVar2.f997f);
                        bVar2.u = n.a(1, bVar2.f998g);
                        bVar2.v = n.h(21, -1);
                        bVar2.z = n.k(12);
                        bVar2.w = n.j(13, 0);
                        bVar2.x = n.k(15);
                        String k4 = n.k(14);
                        bVar2.y = k4;
                        boolean z3 = k4 != null;
                        if (z3 && bVar2.w == 0 && bVar2.x == null) {
                            bVar = (e.e.j.b) bVar2.b(k4, f993f, f.this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.A = bVar;
                        bVar2.B = n.l(17);
                        bVar2.C = n.l(22);
                        if (n.m(19)) {
                            bVar2.E = e0.c(n.h(19, -1), bVar2.E);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.E = null;
                        }
                        if (n.m(18)) {
                            colorStateList = n.b(18);
                        }
                        bVar2.D = colorStateList;
                        n.b.recycle();
                        bVar2.f999h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet2, bVar2.a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            z2 = true;
                            str = name3;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof e.e.e.a.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i2);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
