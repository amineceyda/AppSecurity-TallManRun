package com.ola.qsea.strategy.terminal;

public interface ITerminalStrategy {
    ITerminalStrategy enableAndroidId(boolean z);

    ITerminalStrategy enableAudit(boolean z);

    ITerminalStrategy enableBuildModel(boolean z);

    ITerminalStrategy enableCid(boolean z);

    ITerminalStrategy enableIMEI(boolean z);

    ITerminalStrategy enableIMSI(boolean z);

    ITerminalStrategy enableMAC(boolean z);

    ITerminalStrategy enableProcessInfo(boolean z);

    ITerminalStrategy setAndroidId(String str);

    ITerminalStrategy setBuildModel(String str);

    ITerminalStrategy setCid(String str);

    ITerminalStrategy setIMEI(String str);

    ITerminalStrategy setIMSI(String str);

    ITerminalStrategy setMAC(String str);

    ITerminalStrategy setReportDomain(String str);
}
