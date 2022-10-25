package org.slf4j.impl;

import f.a.a.a.n.c;
import org.slf4j.spi.MDCAdapter;

public class StaticMDCBinder {
    public static final StaticMDCBinder SINGLETON = new StaticMDCBinder();

    private StaticMDCBinder() {
    }

    public static final StaticMDCBinder getSingleton() {
        return SINGLETON;
    }

    public MDCAdapter getMDCA() {
        return new c();
    }

    public String getMDCAdapterClassStr() {
        return c.class.getName();
    }
}
