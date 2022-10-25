package g.e.a.b.b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.zzn;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamite.DynamiteModule;
import g.e.a.b.c.b;
import java.util.Objects;
import javax.annotation.Nullable;

public class d {
    @Nullable
    public static d c;
    public final Context a;
    public volatile String b;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public static d a(Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (d.class) {
            if (c == null) {
                s sVar = u.a;
                synchronized (u.class) {
                    if (u.f2875e == null) {
                        u.f2875e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                c = new d(context);
            }
        }
        return c;
    }

    @Nullable
    public static final q c(PackageInfo packageInfo, q... qVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        r rVar = new r(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            if (qVarArr[i2].equals(rVar)) {
                return qVarArr[i2];
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z) {
        q qVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                qVar = c(packageInfo, t.a);
            } else {
                qVar = c(packageInfo, t.a[0]);
            }
            if (qVar != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    public boolean b(int i2) {
        z zVar;
        int length;
        boolean z;
        z zVar2;
        String str;
        ApplicationInfo applicationInfo;
        String str2;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zVar = null;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    Objects.requireNonNull(zVar, "null reference");
                    break;
                }
                String str3 = packagesForUid[i3];
                if (str3 == null) {
                    zVar = z.b("null pkg");
                } else if (!str3.equals(this.b)) {
                    s sVar = u.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        u.b();
                        z = u.c.m();
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (RemoteException | DynamiteModule.LoadingException e2) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        z = false;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                    if (z) {
                        boolean a2 = c.a(this.a);
                        StrictMode.ThreadPolicy allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            Objects.requireNonNull(u.f2875e, "null reference");
                            try {
                                u.b();
                                zzq y = u.c.y(new zzn(str3, a2, false, new b(u.f2875e), false));
                                if (y.e()) {
                                    zVar2 = z.f2877d;
                                } else {
                                    str2 = y.c();
                                    if (str2 == null) {
                                        str2 = "error checking package certificate";
                                    }
                                    if (y.f() == 4) {
                                        e = new PackageManager.NameNotFoundException();
                                        zVar2 = z.c(str2, e);
                                    } else {
                                        zVar2 = z.b(str2);
                                    }
                                }
                            } catch (DynamiteModule.LoadingException e3) {
                                e = e3;
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                String valueOf = String.valueOf(e.getMessage());
                                str2 = valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: ");
                            }
                        } catch (RemoteException e4) {
                            e = e4;
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                            str2 = "module call";
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads2);
                            throw th2;
                        }
                        StrictMode.setThreadPolicy(allowThreadDiskReads2);
                    } else {
                        try {
                            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str3, 64);
                            boolean a3 = c.a(this.a);
                            if (packageInfo == null) {
                                zVar2 = z.b("null pkg");
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    str = "single cert required";
                                } else {
                                    r rVar = new r(packageInfo.signatures[0].toByteArray());
                                    String str4 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        z a4 = u.a(str4, rVar, a3, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        if (!(!a4.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0)) {
                                            StrictMode.ThreadPolicy allowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                z a5 = u.a(str4, rVar, false, true);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                if (a5.a) {
                                                    str = "debuggable release cert app rejected";
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(allowThreadDiskReads4);
                                                throw th3;
                                            }
                                        }
                                        zVar2 = a4;
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                        throw th4;
                                    }
                                }
                                zVar2 = z.b(str);
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            zVar = z.c(str3.length() != 0 ? "no pkg ".concat(str3) : new String("no pkg "), e5);
                        }
                    }
                    if (zVar2.a) {
                        this.b = str3;
                    }
                    zVar = zVar2;
                } else {
                    zVar = z.f2877d;
                }
                if (zVar.a) {
                    break;
                }
                i3++;
            }
        } else {
            zVar = z.b("no pkgs");
        }
        if (!zVar.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (zVar.c != null) {
                Log.d("GoogleCertificatesRslt", zVar.a(), zVar.c);
            } else {
                Log.d("GoogleCertificatesRslt", zVar.a());
            }
        }
        return zVar.a;
    }
}
