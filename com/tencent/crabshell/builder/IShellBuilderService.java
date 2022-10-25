package com.tencent.crabshell.builder;

import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.crabshell.loader.PatchResult;

public interface IShellBuilderService {
    void cleanLastVersion(Context context);

    PatchResult getPatchResult();

    void releaseNewApk(Context context, String str) throws PackageManager.NameNotFoundException;

    void setReporter(ShellBuilderReporter shellBuilderReporter);
}
