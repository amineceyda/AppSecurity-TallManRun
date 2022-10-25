package com.tencent.crabshell.loader;

import g.a.a.a.a;
import java.io.Serializable;
import m.b.a.a.b.f;

public class PatchResult implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    public long costTime;
    public long dexOptTriggerTime;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f765e;
    public boolean isOatGenerated;
    public boolean isRetry = false;
    public boolean isSuccess;
    public long patchBuildNo = 0;
    public String patchVersion;
    public String rawPatchFilePath;
    public long targetBuildNo = 0;
    public String versionName = "";

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-7212940658682568892L, "com/tencent/crabshell/loader/PatchResult", 18);
        $jacocoData = a;
        return a;
    }

    public PatchResult() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuffer stringBuffer = new StringBuffer();
        $jacocoInit[1] = true;
        stringBuffer.append("\nPatchResult: \n");
        $jacocoInit[2] = true;
        StringBuilder i2 = a.i("isSuccess:");
        i2.append(this.isSuccess);
        i2.append("\n");
        stringBuffer.append(i2.toString());
        $jacocoInit[3] = true;
        StringBuilder i3 = a.i("rawPatchFilePath:");
        i3.append(this.rawPatchFilePath);
        i3.append("\n");
        stringBuffer.append(i3.toString());
        $jacocoInit[4] = true;
        StringBuilder i4 = a.i("costTime:");
        i4.append(this.costTime);
        i4.append("\n");
        stringBuffer.append(i4.toString());
        $jacocoInit[5] = true;
        StringBuilder i5 = a.i("dexoptTriggerTime:");
        i5.append(this.dexOptTriggerTime);
        i5.append("\n");
        stringBuffer.append(i5.toString());
        $jacocoInit[6] = true;
        StringBuilder i6 = a.i("isOatGenerated:");
        i6.append(this.isOatGenerated);
        i6.append("\n");
        stringBuffer.append(i6.toString());
        if (this.patchVersion == null) {
            $jacocoInit[7] = true;
        } else {
            $jacocoInit[8] = true;
            StringBuilder i7 = a.i("patchVersion:");
            i7.append(this.patchVersion);
            i7.append("\n");
            stringBuffer.append(i7.toString());
            $jacocoInit[9] = true;
        }
        if (this.f765e == null) {
            $jacocoInit[10] = true;
        } else {
            $jacocoInit[11] = true;
            StringBuilder i8 = a.i("Throwable:");
            i8.append(this.f765e.getMessage());
            i8.append("\n");
            stringBuffer.append(i8.toString());
            $jacocoInit[12] = true;
        }
        StringBuilder i9 = a.i("targetBuildNo:");
        i9.append(this.targetBuildNo);
        i9.append("\n");
        stringBuffer.append(i9.toString());
        $jacocoInit[13] = true;
        StringBuilder i10 = a.i("patchBuildNo:");
        i10.append(this.patchBuildNo);
        i10.append("\n");
        stringBuffer.append(i10.toString());
        $jacocoInit[14] = true;
        StringBuilder i11 = a.i("isRetry:");
        i11.append(this.isRetry);
        i11.append("\n");
        stringBuffer.append(i11.toString());
        $jacocoInit[15] = true;
        StringBuilder i12 = a.i("versionName:");
        i12.append(this.versionName);
        i12.append("\n");
        stringBuffer.append(i12.toString());
        $jacocoInit[16] = true;
        String stringBuffer2 = stringBuffer.toString();
        $jacocoInit[17] = true;
        return stringBuffer2;
    }
}
