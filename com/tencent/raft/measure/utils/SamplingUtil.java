package com.tencent.raft.measure.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.raft.measure.config.RAFTComConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class SamplingUtil {
    private static final int MAX_APP_REPORT_COUNT = 25;
    private static final int MAX_COM_REPORT_COUNT = 10;
    private static final int MAX_KEY_REPORT_COUNT = 5;
    private static final String SPLIT_SHARE = "&";
    private static final String SP_APP_REPORT = "SP_APP_REPORT";
    private static final String SP_DATE = "SP_DATE";
    private static final List<String> START_UP_LIST = Collections.synchronizedList(new ArrayList());
    public static final int START_UP_SAMPLING_RATE = 5;

    public enum SamplingResult {
        REPORT,
        APP_LIMIT,
        SLI_LIMIT,
        COM_LIMIT,
        KEY_LIMIT,
        COM_RATE_LIMIT,
        START_UP_RATE_LIMIT,
        REPEAT_LIMIT
    }

    private SamplingUtil() {
    }

    private static void addLimitToSP(Context context, RAFTComConfig rAFTComConfig, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SLIReport", 4);
        checkSPDate(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(SP_APP_REPORT, sharedPreferences.getInt(SP_APP_REPORT, 0) + 1);
        edit.putInt(rAFTComConfig.getUniKey(), sharedPreferences.getInt(rAFTComConfig.getUniKey(), 0) + 1);
        edit.putInt(rAFTComConfig.getUniKey() + SPLIT_SHARE + str, sharedPreferences.getInt(rAFTComConfig.getUniKey() + SPLIT_SHARE + str, 0) + 1);
        edit.apply();
    }

    private static SamplingResult checkLimitFormSP(Context context, RAFTComConfig rAFTComConfig, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SLIReport", 4);
        if (sharedPreferences == null) {
            return SamplingResult.APP_LIMIT;
        }
        checkSPDate(sharedPreferences);
        if (sharedPreferences.getInt(SP_APP_REPORT, 0) >= MAX_APP_REPORT_COUNT) {
            return SamplingResult.APP_LIMIT;
        }
        if (sharedPreferences.getInt(rAFTComConfig.getUniKey(), 0) >= 10) {
            return SamplingResult.COM_LIMIT;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rAFTComConfig.getUniKey());
        sb.append(SPLIT_SHARE);
        sb.append(str);
        return sharedPreferences.getInt(sb.toString(), 0) >= 5 ? SamplingResult.KEY_LIMIT : SamplingResult.REPORT;
    }

    private static void checkSPDate(SharedPreferences sharedPreferences) {
        Date date = new Date();
        Date date2 = new Date(sharedPreferences.getLong(SP_DATE, 0));
        if (date.getDate() != date2.getDate() || date.getMonth() != date2.getMonth()) {
            SharedPreferences.Editor clear = sharedPreferences.edit().clear();
            clear.putLong(SP_DATE, System.currentTimeMillis());
            clear.apply();
        }
    }

    public static SamplingResult getSLISamplingResult(Context context, RAFTComConfig rAFTComConfig, String str, int i2) {
        SamplingResult checkLimitFormSP = checkLimitFormSP(context, rAFTComConfig, str);
        SamplingResult samplingResult = SamplingResult.REPORT;
        if (checkLimitFormSP != samplingResult) {
            return checkLimitFormSP;
        }
        if ((Math.random() * 100.0d) + 1.0d > ((double) i2)) {
            return SamplingResult.COM_RATE_LIMIT;
        }
        if (i2 > 20 && (Math.random() * 100.0d) + 1.0d > 20.0d) {
            return SamplingResult.SLI_LIMIT;
        }
        addLimitToSP(context, rAFTComConfig, str);
        return samplingResult;
    }

    public static SamplingResult startUpSampling(RAFTComConfig rAFTComConfig) {
        List<String> list = START_UP_LIST;
        if (list.contains(rAFTComConfig.getUniKey())) {
            return SamplingResult.REPEAT_LIMIT;
        }
        if ((Math.random() * 100.0d) + 1.0d > 5.0d) {
            return SamplingResult.START_UP_RATE_LIMIT;
        }
        list.add(rAFTComConfig.getUniKey());
        return SamplingResult.REPORT;
    }
}
