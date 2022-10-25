package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.e.a.b.c.b;
import g.e.a.b.d.d;
import g.e.a.b.d.e;
import g.e.a.b.d.f;
import g.e.a.b.d.g;
import g.e.a.b.d.h;
import g.e.a.b.d.i;
import g.e.a.b.d.j;
import g.e.a.b.d.k;
import g.e.a.b.d.l;
import java.lang.reflect.Field;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;

public final class DynamiteModule {
    public static final a b = new f();
    public static final a c = new g();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f368d = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: e  reason: collision with root package name */
    public static String f369e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f  reason: collision with root package name */
    public static boolean f370f = false;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: g  reason: collision with root package name */
    public static int f371g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static final ThreadLocal<i> f372h = new ThreadLocal<>();

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal<Long> f373i = new d();

    /* renamed from: j  reason: collision with root package name */
    public static final a.C0001a f374j = new e();
    @GuardedBy("DynamiteModule.class")

    /* renamed from: k  reason: collision with root package name */
    public static k f375k;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: l  reason: collision with root package name */
    public static l f376l;
    public final Context a;

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        public interface C0001a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z) throws LoadingException;
        }

        public static class b {
            public int a = 0;
            public int b = 0;
            public int c = 0;
        }

        b a(Context context, String str, C0001a aVar) throws LoadingException;
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (g.c.b.b.f.y(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, a aVar, String str) throws LoadingException {
        int i2;
        ThreadLocal<Long> threadLocal;
        Boolean bool;
        DynamiteModule dynamiteModule;
        g.e.a.b.c.a aVar2;
        l lVar;
        Boolean valueOf;
        g.e.a.b.c.a aVar3;
        Context context2 = context;
        a aVar4 = aVar;
        String str2 = str;
        Class<DynamiteModule> cls = DynamiteModule.class;
        ThreadLocal<i> threadLocal2 = f372h;
        i iVar = threadLocal2.get();
        i iVar2 = new i((h) null);
        threadLocal2.set(iVar2);
        ThreadLocal<Long> threadLocal3 = f373i;
        long longValue = threadLocal3.get().longValue();
        try {
            threadLocal3.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a2 = aVar4.a(context2, str2, f374j);
            int i3 = a2.a;
            int i4 = a2.b;
            StringBuilder sb = new StringBuilder(str.length() + 68 + str.length());
            sb.append("Considering local module ");
            sb.append(str2);
            sb.append(Constants.KEY_INDEX_FILE_SEPARATOR);
            sb.append(i3);
            sb.append(" and remote module ");
            sb.append(str2);
            sb.append(Constants.KEY_INDEX_FILE_SEPARATOR);
            sb.append(i4);
            Log.i("DynamiteModule", sb.toString());
            int i5 = a2.c;
            if (i5 != 0) {
                if (i5 == -1) {
                    if (a2.a != 0) {
                        i5 = -1;
                    }
                }
                if (!(i5 == 1 && a2.b == 0)) {
                    if (i5 == -1) {
                        DynamiteModule f2 = f(context2, str2);
                        if (longValue == 0) {
                            threadLocal3.remove();
                        } else {
                            threadLocal3.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = iVar2.a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal2.set(iVar);
                        return f2;
                    } else if (i5 == 1) {
                        try {
                            int i6 = a2.b;
                            try {
                                synchronized (cls) {
                                    bool = f368d;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 51);
                                        sb2.append("Selected remote version of ");
                                        sb2.append(str2);
                                        sb2.append(", version >= ");
                                        sb2.append(i6);
                                        Log.i("DynamiteModule", sb2.toString());
                                        synchronized (cls) {
                                            lVar = f376l;
                                        }
                                        if (lVar != null) {
                                            i iVar3 = threadLocal2.get();
                                            if (iVar3 == null || iVar3.a == null) {
                                                throw new LoadingException("No result cursor");
                                            }
                                            Context applicationContext = context.getApplicationContext();
                                            Cursor cursor2 = iVar3.a;
                                            new b(null);
                                            synchronized (cls) {
                                                valueOf = Boolean.valueOf(f371g >= 2);
                                            }
                                            if (valueOf.booleanValue()) {
                                                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                aVar3 = lVar.C(new b(applicationContext), str2, i6, new b(cursor2));
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                aVar3 = lVar.B(new b(applicationContext), str2, i6, new b(cursor2));
                                            }
                                            Context context3 = (Context) b.B(aVar3);
                                            if (context3 != null) {
                                                dynamiteModule = new DynamiteModule(context3);
                                            } else {
                                                throw new LoadingException("Failed to get module context");
                                            }
                                        } else {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        StringBuilder sb3 = new StringBuilder(str.length() + 51);
                                        sb3.append("Selected remote version of ");
                                        sb3.append(str2);
                                        sb3.append(", version >= ");
                                        sb3.append(i6);
                                        Log.i("DynamiteModule", sb3.toString());
                                        k i7 = i(context);
                                        if (i7 != null) {
                                            Parcel z = i7.z(6, i7.A());
                                            int readInt = z.readInt();
                                            z.recycle();
                                            if (readInt >= 3) {
                                                i iVar4 = threadLocal2.get();
                                                if (iVar4 != null) {
                                                    aVar2 = i7.C(new b(context2), str2, i6, new b(iVar4.a));
                                                } else {
                                                    throw new LoadingException("No cached result cursor holder");
                                                }
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                aVar2 = i7.D(new b(context2), str2, i6);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                aVar2 = i7.B(new b(context2), str2, i6);
                                            }
                                            if (b.B(aVar2) != null) {
                                                dynamiteModule = new DynamiteModule((Context) b.B(aVar2));
                                            } else {
                                                throw new LoadingException("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    if (longValue == 0) {
                                        threadLocal3.remove();
                                    } else {
                                        threadLocal3.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = iVar2.a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal2.set(iVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.");
                            } catch (RemoteException e2) {
                                throw new LoadingException("Failed to load remote module.", e2);
                            } catch (LoadingException e3) {
                                throw e3;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                try {
                                    Objects.requireNonNull(context2, "null reference");
                                } catch (Exception e4) {
                                    Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
                                }
                                throw new LoadingException("Failed to load remote module.", th2);
                            }
                        } catch (LoadingException e5) {
                            String valueOf2 = String.valueOf(e5.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i8 = a2.a;
                            if (i8 != 0) {
                                if (aVar.a(context2, str2, new j(i8)).c == -1) {
                                    DynamiteModule f3 = f(context2, str2);
                                    if (i2 != 0) {
                                        threadLocal.set(Long.valueOf(longValue));
                                    }
                                    return f3;
                                }
                            }
                            throw new LoadingException("Remote load failed. No local fallback found.", e5);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder(47);
                        sb4.append("VersionPolicy returned invalid code:");
                        sb4.append(i5);
                        throw new LoadingException(sb4.toString());
                    }
                }
            }
            int i9 = a2.a;
            int i10 = a2.b;
            StringBuilder sb5 = new StringBuilder(str.length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str2);
            sb5.append(" found. Local version is ");
            sb5.append(i9);
            sb5.append(" and remote version is ");
            sb5.append(i10);
            sb5.append(".");
            throw new LoadingException(sb5.toString());
        } finally {
            i2 = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
            threadLocal = f373i;
            if (i2 == 0) {
                threadLocal.remove();
            } else {
                threadLocal.set(Long.valueOf(longValue));
            }
            Cursor cursor4 = iVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f372h.set(iVar);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0090=Splitter:B:42:0x0090, B:17:0x0038=Splitter:B:17:0x0038, B:23:0x0048=Splitter:B:23:0x0048} */
    public static int d(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x01fe }
            java.lang.Boolean r1 = f368d     // Catch:{ all -> 0x01fb }
            r2 = 0
            if (r1 != 0) goto L_0x00d0
            android.content.Context r1 = r9.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r3 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r3 = r3.getName()     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            java.lang.Class r1 = r1.loadClass(r3)     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            java.lang.String r3 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            java.lang.Class r3 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            monitor-enter(r3)     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
            java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00a4 }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x003b
            java.lang.ClassLoader r1 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a4 }
            if (r4 != r1) goto L_0x0035
            goto L_0x00a0
        L_0x0035:
            g(r4)     // Catch:{ LoadingException -> 0x0038 }
        L_0x0038:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a4 }
            goto L_0x00a2
        L_0x003b:
            boolean r4 = f370f     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x009b
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00a4 }
            boolean r5 = r4.equals(r2)     // Catch:{ all -> 0x00a4 }
            if (r5 == 0) goto L_0x0048
            goto L_0x009b
        L_0x0048:
            int r5 = e(r9, r10, r11)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r6 = f369e     // Catch:{ LoadingException -> 0x0093 }
            if (r6 == 0) goto L_0x0090
            boolean r6 = r6.isEmpty()     // Catch:{ LoadingException -> 0x0093 }
            if (r6 == 0) goto L_0x0057
            goto L_0x0090
        L_0x0057:
            java.lang.ClassLoader r6 = g.e.a.b.d.b.a()     // Catch:{ LoadingException -> 0x0093 }
            if (r6 == 0) goto L_0x005e
            goto L_0x0085
        L_0x005e:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0093 }
            r7 = 29
            if (r6 < r7) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r6 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r7 = f369e     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r7, r8)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0093 }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x0093 }
            goto L_0x0085
        L_0x0075:
            g.e.a.b.d.c r6 = new g.e.a.b.d.c     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r7 = f369e     // Catch:{ LoadingException -> 0x0093 }
            java.lang.String r8 = "null reference"
            java.util.Objects.requireNonNull(r7, r8)     // Catch:{ LoadingException -> 0x0093 }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0093 }
            r6.<init>(r7, r8)     // Catch:{ LoadingException -> 0x0093 }
        L_0x0085:
            g(r6)     // Catch:{ LoadingException -> 0x0093 }
            r1.set(r2, r6)     // Catch:{ LoadingException -> 0x0093 }
            f368d = r4     // Catch:{ LoadingException -> 0x0093 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01fb }
            return r5
        L_0x0090:
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01fb }
            return r5
        L_0x0093:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a4 }
        L_0x0097:
            r1.set(r2, r4)     // Catch:{ all -> 0x00a4 }
            goto L_0x00a0
        L_0x009b:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00a4 }
            goto L_0x0097
        L_0x00a0:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00a4 }
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            goto L_0x00ce
        L_0x00a4:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            throw r1     // Catch:{ ClassNotFoundException -> 0x00ab, IllegalAccessException -> 0x00a9, NoSuchFieldException -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            goto L_0x00ac
        L_0x00a9:
            r1 = move-exception
            goto L_0x00ac
        L_0x00ab:
            r1 = move-exception
        L_0x00ac:
            java.lang.String r3 = "DynamiteModule"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01fb }
            int r4 = r1.length()     // Catch:{ all -> 0x01fb }
            int r4 = r4 + 30
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
            r5.<init>(r4)     // Catch:{ all -> 0x01fb }
            java.lang.String r4 = "Failed to load module via V2: "
            r5.append(r4)     // Catch:{ all -> 0x01fb }
            r5.append(r1)     // Catch:{ all -> 0x01fb }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x01fb }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x01fb }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01fb }
        L_0x00ce:
            f368d = r1     // Catch:{ all -> 0x01fb }
        L_0x00d0:
            monitor-exit(r0)     // Catch:{ all -> 0x01fb }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x01fe }
            r1 = 0
            if (r0 == 0) goto L_0x00fe
            int r9 = e(r9, r10, r11)     // Catch:{ LoadingException -> 0x00dd }
            return r9
        L_0x00dd:
            r10 = move-exception
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x01fe }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x01fe }
            int r2 = r10.length()     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x00f5
            java.lang.String r10 = r0.concat(r10)     // Catch:{ all -> 0x01fe }
            goto L_0x00fa
        L_0x00f5:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x01fe }
            r10.<init>(r0)     // Catch:{ all -> 0x01fe }
        L_0x00fa:
            android.util.Log.w(r11, r10)     // Catch:{ all -> 0x01fe }
            return r1
        L_0x00fe:
            g.e.a.b.d.k r3 = i(r9)     // Catch:{ all -> 0x01fe }
            if (r3 != 0) goto L_0x0106
            goto L_0x01f2
        L_0x0106:
            android.os.Parcel r0 = r3.A()     // Catch:{ RemoteException -> 0x01cc }
            r4 = 6
            android.os.Parcel r0 = r3.z(r4, r0)     // Catch:{ RemoteException -> 0x01cc }
            int r4 = r0.readInt()     // Catch:{ RemoteException -> 0x01cc }
            r0.recycle()     // Catch:{ RemoteException -> 0x01cc }
            r0 = 3
            if (r4 < r0) goto L_0x017b
            java.lang.ThreadLocal<g.e.a.b.d.i> r0 = f372h     // Catch:{ RemoteException -> 0x01cc }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x01cc }
            g.e.a.b.d.i r0 = (g.e.a.b.d.i) r0     // Catch:{ RemoteException -> 0x01cc }
            if (r0 == 0) goto L_0x012d
            android.database.Cursor r0 = r0.a     // Catch:{ RemoteException -> 0x01cc }
            if (r0 == 0) goto L_0x012d
            int r1 = r0.getInt(r1)     // Catch:{ RemoteException -> 0x01cc }
            goto L_0x01f2
        L_0x012d:
            g.e.a.b.c.b r4 = new g.e.a.b.c.b     // Catch:{ RemoteException -> 0x01cc }
            r4.<init>(r9)     // Catch:{ RemoteException -> 0x01cc }
            java.lang.ThreadLocal<java.lang.Long> r0 = f373i     // Catch:{ RemoteException -> 0x01cc }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x01cc }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x01cc }
            long r7 = r0.longValue()     // Catch:{ RemoteException -> 0x01cc }
            r5 = r10
            r6 = r11
            g.e.a.b.c.a r10 = r3.E(r4, r5, r6, r7)     // Catch:{ RemoteException -> 0x01cc }
            java.lang.Object r10 = g.e.a.b.c.b.B(r10)     // Catch:{ RemoteException -> 0x01cc }
            android.database.Cursor r10 = (android.database.Cursor) r10     // Catch:{ RemoteException -> 0x01cc }
            if (r10 == 0) goto L_0x0167
            boolean r11 = r10.moveToFirst()     // Catch:{ RemoteException -> 0x0178, all -> 0x0175 }
            if (r11 != 0) goto L_0x0153
            goto L_0x0167
        L_0x0153:
            int r11 = r10.getInt(r1)     // Catch:{ RemoteException -> 0x0178, all -> 0x0175 }
            if (r11 <= 0) goto L_0x0160
            boolean r0 = h(r10)     // Catch:{ RemoteException -> 0x0178, all -> 0x0175 }
            if (r0 == 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r2 = r10
        L_0x0161:
            if (r2 == 0) goto L_0x01c8
            r2.close()     // Catch:{ all -> 0x01fe }
            goto L_0x01c8
        L_0x0167:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r0)     // Catch:{ RemoteException -> 0x0178, all -> 0x0175 }
            if (r10 == 0) goto L_0x01f2
            r10.close()     // Catch:{ all -> 0x01fe }
            goto L_0x01f2
        L_0x0175:
            r11 = move-exception
            goto L_0x01f5
        L_0x0178:
            r11 = move-exception
            r2 = r10
            goto L_0x01ce
        L_0x017b:
            r5 = 2
            if (r4 != r5) goto L_0x01a4
            java.lang.String r0 = "DynamiteModule"
            java.lang.String r4 = "IDynamite loader version = 2, no high precision latency measurement."
            android.util.Log.w(r0, r4)     // Catch:{ RemoteException -> 0x01cc }
            g.e.a.b.c.b r0 = new g.e.a.b.c.b     // Catch:{ RemoteException -> 0x01cc }
            r0.<init>(r9)     // Catch:{ RemoteException -> 0x01cc }
            android.os.Parcel r4 = r3.A()     // Catch:{ RemoteException -> 0x01cc }
            g.e.a.b.e.b.c.b(r4, r0)     // Catch:{ RemoteException -> 0x01cc }
            r4.writeString(r10)     // Catch:{ RemoteException -> 0x01cc }
            r4.writeInt(r11)     // Catch:{ RemoteException -> 0x01cc }
            r10 = 5
            android.os.Parcel r10 = r3.z(r10, r4)     // Catch:{ RemoteException -> 0x01cc }
            int r11 = r10.readInt()     // Catch:{ RemoteException -> 0x01cc }
            r10.recycle()     // Catch:{ RemoteException -> 0x01cc }
            goto L_0x01c8
        L_0x01a4:
            java.lang.String r4 = "DynamiteModule"
            java.lang.String r5 = "IDynamite loader version < 2, falling back to getModuleVersion2"
            android.util.Log.w(r4, r5)     // Catch:{ RemoteException -> 0x01cc }
            g.e.a.b.c.b r4 = new g.e.a.b.c.b     // Catch:{ RemoteException -> 0x01cc }
            r4.<init>(r9)     // Catch:{ RemoteException -> 0x01cc }
            android.os.Parcel r5 = r3.A()     // Catch:{ RemoteException -> 0x01cc }
            g.e.a.b.e.b.c.b(r5, r4)     // Catch:{ RemoteException -> 0x01cc }
            r5.writeString(r10)     // Catch:{ RemoteException -> 0x01cc }
            r5.writeInt(r11)     // Catch:{ RemoteException -> 0x01cc }
            android.os.Parcel r10 = r3.z(r0, r5)     // Catch:{ RemoteException -> 0x01cc }
            int r11 = r10.readInt()     // Catch:{ RemoteException -> 0x01cc }
            r10.recycle()     // Catch:{ RemoteException -> 0x01cc }
        L_0x01c8:
            r1 = r11
            goto L_0x01f2
        L_0x01ca:
            r10 = move-exception
            goto L_0x01f3
        L_0x01cc:
            r10 = move-exception
            r11 = r10
        L_0x01ce:
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01ca }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x01ca }
            int r3 = r11.length()     // Catch:{ all -> 0x01ca }
            if (r3 == 0) goto L_0x01e5
            java.lang.String r11 = r0.concat(r11)     // Catch:{ all -> 0x01ca }
            goto L_0x01ea
        L_0x01e5:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x01ca }
            r11.<init>(r0)     // Catch:{ all -> 0x01ca }
        L_0x01ea:
            android.util.Log.w(r10, r11)     // Catch:{ all -> 0x01ca }
            if (r2 == 0) goto L_0x01f2
            r2.close()     // Catch:{ all -> 0x01fe }
        L_0x01f2:
            return r1
        L_0x01f3:
            r11 = r10
            r10 = r2
        L_0x01f5:
            if (r10 == 0) goto L_0x01fa
            r10.close()     // Catch:{ all -> 0x01fe }
        L_0x01fa:
            throw r11     // Catch:{ all -> 0x01fe }
        L_0x01fb:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01fb }
            throw r10     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r10 = move-exception
            java.lang.String r11 = "null reference"
            java.util.Objects.requireNonNull(r9, r11)     // Catch:{ Exception -> 0x0205 }
            goto L_0x020d
        L_0x0205:
            r9 = move-exception
            java.lang.String r11 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r11, r0, r9)
        L_0x020d:
            goto L_0x020f
        L_0x020e:
            throw r10
        L_0x020f:
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (h(r10) != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(android.content.Context r10, java.lang.String r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = f373i     // Catch:{ Exception -> 0x00a0 }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00a0 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00a0 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00a0 }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L_0x0019
            r10 = r4
        L_0x0019:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00a0 }
            r12.<init>()     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch:{ Exception -> 0x00a0 }
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch:{ Exception -> 0x00a0 }
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00a0 }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch:{ Exception -> 0x00a0 }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00a0 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00a0 }
            if (r10 == 0) goto L_0x00a2
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            if (r11 == 0) goto L_0x00a2
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            if (r12 <= 0) goto L_0x008d
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch:{ all -> 0x008a }
            f369e = r2     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008a }
            if (r2 < 0) goto L_0x006f
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008a }
            f371g = r2     // Catch:{ all -> 0x008a }
        L_0x006f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch:{ all -> 0x008a }
            if (r2 < 0) goto L_0x0082
            int r2 = r10.getInt(r2)     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            f370f = r9     // Catch:{ all -> 0x008a }
            r11 = r9
        L_0x0082:
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            boolean r1 = h(r10)     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            if (r1 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008a:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008a }
            throw r11     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
        L_0x008d:
            r0 = r10
        L_0x008e:
            if (r11 != 0) goto L_0x0096
            if (r0 == 0) goto L_0x0095
            r0.close()
        L_0x0095:
            return r12
        L_0x0096:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00a0 }
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r10.<init>(r11)     // Catch:{ Exception -> 0x00a0 }
            throw r10     // Catch:{ Exception -> 0x00a0 }
        L_0x009e:
            r10 = move-exception
            goto L_0x00c6
        L_0x00a0:
            r10 = move-exception
            goto L_0x00b8
        L_0x00a2:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12)     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            throw r11     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
        L_0x00b1:
            r11 = move-exception
            r0 = r10
            r10 = r11
            goto L_0x00c6
        L_0x00b5:
            r11 = move-exception
            r0 = r10
            r10 = r11
        L_0x00b8:
            boolean r11 = r10 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x009e }
            if (r11 == 0) goto L_0x00be
            throw r10     // Catch:{ all -> 0x009e }
        L_0x00be:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x009e }
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r10)     // Catch:{ all -> 0x009e }
            throw r11     // Catch:{ all -> 0x009e }
        L_0x00c6:
            if (r0 == 0) goto L_0x00cb
            r0.close()
        L_0x00cb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule f(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @javax.annotation.concurrent.GuardedBy("DynamiteModule.class")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.ClassLoader r2) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            java.lang.String r0 = "com.google.android.gms.dynamiteloader.DynamiteLoaderV2"
            java.lang.Class r2 = r2.loadClass(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            java.lang.Object r2 = r2.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x002d
        L_0x0019:
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoaderV2"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            boolean r1 = r0 instanceof g.e.a.b.d.l     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            if (r1 == 0) goto L_0x0027
            r2 = r0
            g.e.a.b.d.l r2 = (g.e.a.b.d.l) r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            goto L_0x002d
        L_0x0027:
            g.e.a.b.d.l r0 = new g.e.a.b.d.l     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r0.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            r2 = r0
        L_0x002d:
            f376l = r2     // Catch:{ ClassNotFoundException -> 0x0038, IllegalAccessException -> 0x0036, InstantiationException -> 0x0034, InvocationTargetException -> 0x0032, NoSuchMethodException -> 0x0030 }
            return
        L_0x0030:
            r2 = move-exception
            goto L_0x0039
        L_0x0032:
            r2 = move-exception
            goto L_0x0039
        L_0x0034:
            r2 = move-exception
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            goto L_0x0039
        L_0x0038:
            r2 = move-exception
        L_0x0039:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException
            java.lang.String r1 = "Failed to instantiate dynamite loader"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.g(java.lang.ClassLoader):void");
    }

    public static boolean h(Cursor cursor) {
        i iVar = f372h.get();
        if (iVar == null || iVar.a != null) {
            return false;
        }
        iVar.a = cursor;
        return true;
    }

    public static k i(Context context) {
        k kVar;
        synchronized (DynamiteModule.class) {
            k kVar2 = f375k;
            if (kVar2 != null) {
                return kVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    kVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    kVar = queryLocalInterface instanceof k ? (k) queryLocalInterface : new k(iBinder);
                }
                if (kVar != null) {
                    f375k = kVar;
                    return kVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    public IBinder b(String str) throws LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new LoadingException(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e2);
        }
    }
}
