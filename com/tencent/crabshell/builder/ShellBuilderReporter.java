package com.tencent.crabshell.builder;

import com.tencent.crabshell.loader.PatchResult;

public interface ShellBuilderReporter {
    void notifyNewVersionReady();

    void notifyRollBack();

    void reportShellUnzipDone(PatchResult patchResult);

    void reportShellUnzipFail(PatchResult patchResult);
}
