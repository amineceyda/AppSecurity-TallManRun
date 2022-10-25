package com.tencent.raft.raftannotation.utils;

import g.a.a.a.a;
import java.io.PrintStream;

public class Log {
    private static LogPrinter logPrinter = new LogPrinter();

    public static class LogPrinter {
        public void d(String str, String str2) {
            PrintStream printStream = System.out;
            printStream.println("[" + str + "]" + str2);
        }

        public void e(String str, String str2) {
            PrintStream printStream = System.out;
            printStream.println("[" + str + "]" + str2);
        }

        public void e(String str, Throwable th) {
            PrintStream printStream = System.out;
            StringBuilder n = a.n("[", str, "]");
            n.append(th.toString());
            printStream.println(n.toString());
        }

        public void i(String str, String str2) {
            PrintStream printStream = System.out;
            printStream.println("[" + str + "]" + str2);
        }

        public void v(String str, String str2) {
            PrintStream printStream = System.out;
            printStream.println("[" + str + "]" + str2);
        }

        public void w(String str, String str2) {
            PrintStream printStream = System.out;
            printStream.println("[" + str + "]" + str2);
        }
    }

    public static void d(String str, String str2) {
        logPrinter.d(str, str2);
    }

    public static void e(String str, String str2) {
        logPrinter.e(str, str2);
    }

    public static void e(String str, Throwable th) {
        logPrinter.e(str, th);
    }

    public static void i(String str, String str2) {
        logPrinter.i(str, str2);
    }

    public static void setLogPrinter(LogPrinter logPrinter2) {
        if (logPrinter2 != null) {
            logPrinter = logPrinter2;
        }
    }

    public static void v(String str, String str2) {
        logPrinter.v(str, str2);
    }

    public static void w(String str, String str2) {
        logPrinter.w(str, str2);
    }
}
