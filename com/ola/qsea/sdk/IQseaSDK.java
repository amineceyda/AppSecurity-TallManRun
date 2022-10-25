package com.ola.qsea.sdk;

import android.content.Context;
import com.ola.qsea.log.IObservableLog;
import com.ola.qsea.sdk.debug.IDebugger;
import com.ola.qsea.strategy.terminal.ITerminalStrategy;

public interface IQseaSDK {
    IQseaSDK addUserId(String str, String str2);

    String getBCTicket();

    IDebugger getDebugger();

    Qsea getQsea();

    void getQsea(IAsyncQseaListener iAsyncQseaListener);

    String getSdkVersion();

    ITerminalStrategy getStrategy();

    String getToken();

    boolean init(Context context);

    boolean isQseaValid(String str, String str2);

    IQseaSDK setAppVersion(String str);

    IQseaSDK setChannelID(String str);

    IQseaSDK setLogAble(boolean z);

    IQseaSDK setLogObserver(IObservableLog iObservableLog);

    IQseaSDK setSdkName(String str);
}
