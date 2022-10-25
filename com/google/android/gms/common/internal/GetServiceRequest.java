package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g.e.a.b.b.b;
import g.e.a.b.b.f.a;
import g.e.a.b.b.f.d;
import g.e.a.b.b.f.f0;
import g.e.a.b.b.f.z;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new z();
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f356d;

    /* renamed from: e  reason: collision with root package name */
    public String f357e;

    /* renamed from: f  reason: collision with root package name */
    public IBinder f358f;

    /* renamed from: g  reason: collision with root package name */
    public Scope[] f359g;

    /* renamed from: h  reason: collision with root package name */
    public Bundle f360h;

    /* renamed from: i  reason: collision with root package name */
    public Account f361i;

    /* renamed from: j  reason: collision with root package name */
    public Feature[] f362j;

    /* renamed from: k  reason: collision with root package name */
    public Feature[] f363k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f364l;

    /* renamed from: m  reason: collision with root package name */
    public int f365m;
    public boolean n;
    private String zzn;

    public GetServiceRequest(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i5, boolean z2, String str2) {
        this.b = i2;
        this.c = i3;
        this.f356d = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f357e = "com.google.android.gms";
        } else {
            this.f357e = str;
        }
        if (i2 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i6 = d.a.a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                d f0Var = queryLocalInterface instanceof d ? (d) queryLocalInterface : new f0(iBinder);
                int i7 = a.b;
                if (f0Var != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = f0Var.j();
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f361i = account2;
        } else {
            this.f358f = iBinder;
            this.f361i = account;
        }
        this.f359g = scopeArr;
        this.f360h = bundle;
        this.f362j = featureArr;
        this.f363k = featureArr2;
        this.f364l = z;
        this.f365m = i5;
        this.n = z2;
        this.zzn = str2;
    }

    public GetServiceRequest(int i2, String str) {
        this.b = 6;
        this.f356d = b.a;
        this.c = i2;
        this.f364l = true;
        this.zzn = null;
    }

    public final String c() {
        return this.zzn;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        z.a(this, parcel, i2);
    }
}
