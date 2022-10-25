package org.slf4j.impl;

import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.a.c;
import f.a.a.a.j.a;
import f.a.a.a.n.b;
import f.a.a.b.z.n;
import java.util.ArrayList;
import org.slf4j.ILoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.spi.LoggerFactoryBinder;

public class StaticLoggerBinder implements LoggerFactoryBinder {
    private static Object KEY = new Object();
    public static final String NULL_CS_URL = "http://logback.qos.ch/codes.html#null_CS";
    public static String REQUESTED_API_VERSION = "1.6";
    private static StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
    private final b contextSelectorBinder;
    private c defaultLoggerContext;
    private boolean initialized = false;

    static {
        SINGLETON.init();
    }

    private StaticLoggerBinder() {
        c cVar = new c();
        this.defaultLoggerContext = cVar;
        this.contextSelectorBinder = b.c;
        cVar.e("default");
    }

    public static StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    public static void reset() {
        StaticLoggerBinder staticLoggerBinder = new StaticLoggerBinder();
        SINGLETON = staticLoggerBinder;
        staticLoggerBinder.init();
    }

    public ILoggerFactory getLoggerFactory() {
        if (!this.initialized) {
            return this.defaultLoggerContext;
        }
        a aVar = this.contextSelectorBinder.a;
        if (aVar != null) {
            return aVar.a();
        }
        throw new IllegalStateException("contextSelector cannot be null. See also http://logback.qos.ch/codes.html#null_CS");
    }

    public String getLoggerFactoryClassStr() {
        return this.contextSelectorBinder.getClass().getName();
    }

    public void init() {
        ArrayList arrayList;
        try {
            new f.a.a.a.n.a(this.defaultLoggerContext).a();
        } catch (JoranException e2) {
            try {
                Util.report("Failed to auto configure default logger context", e2);
            } catch (Exception e3) {
                StringBuilder i2 = g.a.a.a.a.i("Failed to instantiate [");
                i2.append(c.class.getName());
                i2.append("]");
                Util.report(i2.toString(), e3);
                return;
            }
        }
        f.a.a.b.c cVar = this.defaultLoggerContext.f1685d;
        boolean z = false;
        if (cVar != null) {
            synchronized (cVar.f1684g) {
                arrayList = new ArrayList(cVar.f1683f);
            }
            if (arrayList.size() != 0) {
                z = true;
            }
        }
        if (!z) {
            n.d(this.defaultLoggerContext);
        }
        this.contextSelectorBinder.a(this.defaultLoggerContext, KEY);
        this.initialized = true;
    }
}
