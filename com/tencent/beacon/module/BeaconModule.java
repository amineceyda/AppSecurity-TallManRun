package com.tencent.beacon.module;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public interface BeaconModule {
    public static final Map<ModuleName, BeaconModule> a = new HashMap();

    void a(Context context);
}
