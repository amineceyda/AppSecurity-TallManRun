package com.tencent.raft.measure;

import android.content.Context;
import com.tencent.raft.measure.config.MeasureAppConfig;
import com.tencent.raft.measure.config.RAFTComConfig;
import com.tencent.raft.measure.exception.ComConfigInvalidException;
import com.tencent.raft.measure.log.RLog;
import com.tencent.raft.measure.utils.MeasureConst;
import com.tencent.raft.raftframework.sla.SLAConstant;
import g.i.d.a.a;
import g.i.d.a.b;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class RAFTMeasure {
    private static final a core = new a();

    private RAFTMeasure() {
    }

    public static void enableCrashMonitor(Context context, RAFTComConfig rAFTComConfig) {
        a aVar = core;
        Objects.requireNonNull(aVar);
        if (!rAFTComConfig.isDataValid()) {
            StringBuilder i2 = g.a.a.a.a.i("SLIComConfig not valid ");
            i2.append(rAFTComConfig.toString());
            RLog.d("MeasureCore", i2.toString());
            if (aVar.b.isDebug()) {
                throw new ComConfigInvalidException(rAFTComConfig);
            }
            return;
        }
        aVar.b.getExecutor().schedule(new b(aVar, context, rAFTComConfig), 5000, TimeUnit.MILLISECONDS);
    }

    public static MeasureAppConfig getAppConfig() {
        return core.b;
    }

    public static void reportAvg(Context context, RAFTComConfig rAFTComConfig, String str, long j2) {
        core.e(context, rAFTComConfig, str, String.valueOf(j2), 20, MeasureConst.SLI_TYPE_AVG);
    }

    public static void reportAvg(Context context, RAFTComConfig rAFTComConfig, String str, long j2, int i2) {
        core.e(context, rAFTComConfig, str, String.valueOf(j2), i2, MeasureConst.SLI_TYPE_AVG);
    }

    public static void reportDistribution(Context context, RAFTComConfig rAFTComConfig, String str, long j2) {
        reportDistribution(context, rAFTComConfig, str, String.valueOf(j2), 20);
    }

    public static void reportDistribution(Context context, RAFTComConfig rAFTComConfig, String str, long j2, int i2) {
        reportDistribution(context, rAFTComConfig, str, String.valueOf(j2), i2);
    }

    public static void reportDistribution(Context context, RAFTComConfig rAFTComConfig, String str, String str2) {
        core.e(context, rAFTComConfig, str, str2, 20, MeasureConst.SLI_TYPE_DISTRIBUTION);
    }

    public static void reportDistribution(Context context, RAFTComConfig rAFTComConfig, String str, String str2, int i2) {
        core.e(context, rAFTComConfig, str, str2, i2, MeasureConst.SLI_TYPE_DISTRIBUTION);
    }

    public static void reportSuccess(Context context, RAFTComConfig rAFTComConfig, String str, boolean z) {
        core.e(context, rAFTComConfig, str, z ? SLAConstant.TYPE_DEPRECATED_START : "0", 20, MeasureConst.SLI_TYPE_SUCCESS);
    }

    public static void reportSuccess(Context context, RAFTComConfig rAFTComConfig, String str, boolean z, int i2) {
        core.e(context, rAFTComConfig, str, z ? SLAConstant.TYPE_DEPRECATED_START : "0", i2, MeasureConst.SLI_TYPE_SUCCESS);
    }

    public static void updateSLIAppConfig(MeasureAppConfig measureAppConfig) {
        core.b = measureAppConfig;
    }
}
