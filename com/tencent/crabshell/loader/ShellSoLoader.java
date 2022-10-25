package com.tencent.crabshell.loader;

import android.app.Application;
import android.text.TextUtils;
import com.tencent.crabshell.Logger;
import com.tencent.crabshell.common.DataSavingUtils;
import g.a.a.a.a;
import java.util.ArrayList;
import m.b.a.a.b.f;

public class ShellSoLoader {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String KEY_HOTFIX_SO_LIST = "hotfix_so_list";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(2760399150695067536L, "com/tencent/crabshell/loader/ShellSoLoader", 19);
        $jacocoData = a;
        return a;
    }

    public ShellSoLoader() {
        $jacocoInit()[0] = true;
    }

    public static void loadDiffSo(Application application) {
        boolean[] $jacocoInit = $jacocoInit();
        long currentTimeMillis = System.currentTimeMillis();
        $jacocoInit[1] = true;
        String trim = DataSavingUtils.getDataString(application, KEY_HOTFIX_SO_LIST).trim();
        $jacocoInit[2] = true;
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "---loadDiffSo=1=" + trim);
        $jacocoInit[3] = true;
        if (TextUtils.isEmpty(trim)) {
            $jacocoInit[4] = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        $jacocoInit[5] = true;
        arrayList.add("libaurora");
        $jacocoInit[6] = true;
        arrayList.add("libbs-sec");
        $jacocoInit[7] = true;
        String[] split = trim.split(",");
        int length = split.length;
        int i2 = 0;
        $jacocoInit[8] = true;
        while (i2 < length) {
            String str = split[i2];
            $jacocoInit[9] = true;
            Logger.i(ShellAllLoader.CRAB_SHELL_TAG, "---loadDiffSo==" + str);
            $jacocoInit[10] = true;
            if (TextUtils.isEmpty(str)) {
                $jacocoInit[11] = true;
            } else if (!arrayList.contains(str)) {
                $jacocoInit[12] = true;
                try {
                    System.load(str);
                    $jacocoInit[14] = true;
                } catch (Throwable th) {
                    $jacocoInit[15] = true;
                    th.printStackTrace();
                    $jacocoInit[16] = true;
                }
            } else {
                $jacocoInit[13] = true;
            }
            i2++;
            $jacocoInit[17] = true;
        }
        StringBuilder i3 = a.i("loadDiffSoTime=");
        i3.append(System.currentTimeMillis() - currentTimeMillis);
        Logger.i(ShellAllLoader.CRAB_SHELL_TAG, i3.toString());
        $jacocoInit[18] = true;
    }
}
