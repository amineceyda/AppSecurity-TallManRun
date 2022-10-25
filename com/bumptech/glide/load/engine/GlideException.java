package com.bumptech.glide.load.engine;

import android.util.Log;
import g.d.a.l.l;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class GlideException extends Exception {
    public static final StackTraceElement[] b = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private g.d.a.l.a dataSource;
    private String detailMessage;
    private Exception exception;
    private l key;

    public static final class a implements Appendable {
        public final Appendable b;
        public boolean c = true;

        public a(Appendable appendable) {
            this.b = appendable;
        }

        public Appendable append(char c2) throws IOException {
            boolean z = false;
            if (this.c) {
                this.c = false;
                this.b.append("  ");
            }
            if (c2 == 10) {
                z = true;
            }
            this.c = z;
            this.b.append(c2);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.c) {
                this.c = false;
                this.b.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == 10) {
                z = true;
            }
            this.c = z;
            this.b.append(charSequence, i2, i3);
            return this;
        }
    }

    public GlideException(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.detailMessage = str;
        setStackTrace(b);
        this.causes = emptyList;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(b);
        this.causes = list;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).g(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a2 : ((GlideException) th).causes) {
                a(a2, list);
            }
            return;
        }
        list.add(th);
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder i3 = g.a.a.a.a.i("Root cause (");
            int i4 = i2 + 1;
            i3.append(i4);
            i3.append(" of ");
            i3.append(size);
            i3.append(")");
            Log.i(str, i3.toString(), (Throwable) arrayList.get(i2));
            i2 = i4;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public final void g(Appendable appendable) {
        d(this, appendable);
        b(this.causes, new a(appendable));
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str4 = "";
        if (this.dataClass != null) {
            StringBuilder i2 = g.a.a.a.a.i(", ");
            i2.append(this.dataClass);
            str = i2.toString();
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.dataSource != null) {
            StringBuilder i3 = g.a.a.a.a.i(", ");
            i3.append(this.dataSource);
            str2 = i3.toString();
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.key != null) {
            StringBuilder i4 = g.a.a.a.a.i(", ");
            i4.append(this.key);
            str4 = i4.toString();
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void h(l lVar, g.d.a.l.a aVar) {
        this.key = lVar;
        this.dataSource = aVar;
        this.dataClass = null;
    }

    public void i(l lVar, g.d.a.l.a aVar, Class<?> cls) {
        this.key = lVar;
        this.dataSource = aVar;
        this.dataClass = cls;
    }

    public void j(Exception exc) {
        this.exception = exc;
    }

    public void printStackTrace() {
        g(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        g(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        g(printWriter);
    }

    public GlideException(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.detailMessage = str;
        setStackTrace(b);
        this.causes = singletonList;
    }
}
