package g.f.a.a.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import g.f.a.a.b;
import g.f.a.b.g;
import g.f.a.b.h;
import g.f.a.b.n;
import g.f.a.e.b;
import g.f.a.e.c;
import g.f.a.e.d;
import g.f.a.h.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Objects;

public abstract class a extends SQLiteOpenHelper {
    public static c logger = d.a(a.class);
    public boolean cancelQueriesEnabled;
    public b connectionSource;
    private volatile boolean isOpen;

    public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2) {
        super(context, str, cursorFactory, i2);
        this.connectionSource = new b(this);
        this.isOpen = true;
        logger.i("{}: constructed connectionSource {}", this, this.connectionSource);
    }

    public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, int i3) {
        this(context, str, cursorFactory, i2, openFileId(context, i3));
    }

    public a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i2, File file) {
        this(context, str, cursorFactory, i2, openFile(file));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[SYNTHETIC, Splitter:B:21:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[SYNTHETIC, Splitter:B:25:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4, java.io.InputStream r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            g.f.a.a.b r1 = new g.f.a.a.b
            r1.<init>(r0)
            r0.connectionSource = r1
            r1 = 1
            r0.isOpen = r1
            if (r5 != 0) goto L_0x0010
            return
        L_0x0010:
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ SQLException -> 0x0032 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ SQLException -> 0x0032 }
            r3.<init>(r5)     // Catch:{ SQLException -> 0x0032 }
            r4 = 4096(0x1000, float:5.74E-42)
            r2.<init>(r3, r4)     // Catch:{ SQLException -> 0x0032 }
            java.util.List r3 = g.e.a.b.b.h.e.m(r2)     // Catch:{ SQLException -> 0x002c, all -> 0x0028 }
            g.f.a.b.h.a(r3)     // Catch:{ SQLException -> 0x002c, all -> 0x0028 }
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return
        L_0x0028:
            r3 = move-exception
            r5 = r1
            r1 = r2
            goto L_0x003b
        L_0x002c:
            r3 = move-exception
            r5 = r1
            r1 = r2
            goto L_0x0033
        L_0x0030:
            r3 = move-exception
            goto L_0x003b
        L_0x0032:
            r3 = move-exception
        L_0x0033:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "Could not load object config file"
            r2.<init>(r4, r3)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0030 }
        L_0x003b:
            if (r1 == 0) goto L_0x0040
            r1.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            r5.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.a.e.a.<init>(android.content.Context, java.lang.String, android.database.sqlite.SQLiteDatabase$CursorFactory, int, java.io.InputStream):void");
    }

    private static InputStream openFile(File file) {
        if (file == null) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e2) {
            throw new IllegalArgumentException("Could not open config file " + file, e2);
        }
    }

    private static InputStream openFileId(Context context, int i2) {
        InputStream openRawResource = context.getResources().openRawResource(i2);
        if (openRawResource != null) {
            return openRawResource;
        }
        throw new IllegalStateException(g.a.a.a.a.q("Could not find object config file with id ", i2));
    }

    public void close() {
        super.close();
        Objects.requireNonNull(this.connectionSource);
        this.isOpen = false;
    }

    public g.f.a.h.c getConnectionSource() {
        if (!this.isOpen) {
            c cVar = logger;
            IllegalStateException illegalStateException = new IllegalStateException();
            b.a aVar = b.a.WARNING;
            Object obj = c.b;
            cVar.g(aVar, illegalStateException, "Getting connectionSource was called after closed", obj, obj, obj, (Object[]) null);
        }
        return this.connectionSource;
    }

    public <D extends g<T, ?>, T> D getDao(Class<T> cls) throws SQLException {
        return h.b(getConnectionSource(), cls);
    }

    public <D extends n<T, ?>, T> D getRuntimeExceptionDao(Class<T> cls) {
        try {
            return new n(getDao(cls));
        } catch (SQLException e2) {
            throw new RuntimeException(g.a.a.a.a.v("Could not create RuntimeExcepitionDao for class ", cls), e2);
        }
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        g.f.a.h.c connectionSource2 = getConnectionSource();
        a.C0138a aVar = ((g.f.a.h.a) connectionSource2).b.get();
        g.f.a.h.d dVar = aVar == null ? null : aVar.a;
        boolean z = false;
        if (dVar == null) {
            dVar = new g.f.a.a.c(sQLiteDatabase, true, this.cancelQueriesEnabled);
            try {
                ((g.f.a.a.b) connectionSource2).d(dVar);
                z = true;
            } catch (SQLException e2) {
                throw new IllegalStateException("Could not save special connection", e2);
            }
        }
        try {
            onCreate(sQLiteDatabase, connectionSource2);
        } finally {
            if (z) {
                ((g.f.a.a.b) connectionSource2).a(dVar);
            }
        }
    }

    public abstract void onCreate(SQLiteDatabase sQLiteDatabase, g.f.a.h.c cVar);

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        g.f.a.h.c connectionSource2 = getConnectionSource();
        a.C0138a aVar = ((g.f.a.h.a) connectionSource2).b.get();
        g.f.a.h.d dVar = aVar == null ? null : aVar.a;
        boolean z = false;
        if (dVar == null) {
            dVar = new g.f.a.a.c(sQLiteDatabase, true, this.cancelQueriesEnabled);
            try {
                ((g.f.a.a.b) connectionSource2).d(dVar);
                z = true;
            } catch (SQLException e2) {
                throw new IllegalStateException("Could not save special connection", e2);
            }
        }
        try {
            onUpgrade(sQLiteDatabase, connectionSource2, i2, i3);
        } finally {
            if (z) {
                ((g.f.a.a.b) connectionSource2).a(dVar);
            }
        }
    }

    public abstract void onUpgrade(SQLiteDatabase sQLiteDatabase, g.f.a.h.c cVar, int i2, int i3);

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(super.hashCode());
    }
}
