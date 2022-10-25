package com.tencent.trpcprotocol.projecta.app_auto_upgrade.app_auto_upgrade.nano;

public interface appAutoUpgrade {
    public static final int ACTIVE = 3;
    public static final int AUTO_UPGRADE = 3;
    public static final int DOWNLOAD = 1;
    public static final int ERROR_EVENT_UPLOAD_FAIL = 11002;
    public static final int ERROR_PULL_UPGRADE_CONFIG_FAIL = 11001;
    public static final int ERROR_PULL_UPGRADE_STYLE_FAIL = 11003;
    public static final int INSTALL = 2;
    public static final int NEW_SELF_UPGRADE = 2;
    public static final int OLD_SELF_UPGRADE = 1;
    public static final int SUCC = 0;
    public static final int UNDEFINED = 0;
    public static final int UNDEFINED_STYLE = 0;
}
