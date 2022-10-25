package g.e.a.b.f.b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import g.a.a.a.a;
import g.e.a.b.b.h.c;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class n extends i5 {
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public String f3249d;

    /* renamed from: e  reason: collision with root package name */
    public AccountManager f3250e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f3251f;

    /* renamed from: g  reason: collision with root package name */
    public long f3252g;

    public n(n4 n4Var) {
        super(n4Var);
    }

    public final boolean j() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f3249d = a.g(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long o() {
        h();
        return this.f3252g;
    }

    public final long p() {
        k();
        return this.c;
    }

    public final String q() {
        k();
        return this.f3249d;
    }

    public final boolean r() {
        h();
        Objects.requireNonNull((c) this.a.n);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f3252g > 86400000) {
            this.f3251f = null;
        }
        Boolean bool = this.f3251f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (e.e.c.a.a(this.a.a, "android.permission.GET_ACCOUNTS") != 0) {
            this.a.d().f3140j.a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f3250e == null) {
                this.f3250e = AccountManager.get(this.a.a);
            }
            try {
                Account[] result = this.f3250e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f3250e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f3251f = Boolean.TRUE;
                        this.f3252g = currentTimeMillis;
                        return true;
                    }
                } else {
                    this.f3251f = Boolean.TRUE;
                    this.f3252g = currentTimeMillis;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                this.a.d().f3137g.b("Exception checking account types", e2);
            }
        }
        this.f3252g = currentTimeMillis;
        this.f3251f = Boolean.FALSE;
        return false;
    }
}
