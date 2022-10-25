package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import g.c.b.b.f;
import g.e.b.h;
import g.e.b.i;

public class FirebaseInitProvider extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        f.o(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        h hVar;
        String str;
        String str2;
        Context context = getContext();
        synchronized (h.f3440j) {
            if (h.f3442l.containsKey("[DEFAULT]")) {
                hVar = h.b();
            } else {
                i a = i.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    hVar = null;
                } else {
                    hVar = h.e(context, a);
                }
            }
        }
        if (hVar == null) {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization unsuccessful";
        } else {
            str2 = "FirebaseInitProvider";
            str = "FirebaseApp initialization successful";
        }
        Log.i(str2, str);
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
