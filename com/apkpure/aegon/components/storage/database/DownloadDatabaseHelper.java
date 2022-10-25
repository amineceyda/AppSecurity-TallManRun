package com.apkpure.aegon.components.storage.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apkpure.aegon.components.storage.database.table.QDDownloadTaskInternal;
import g.f.a.a.e.a;
import g.f.a.b.g;
import g.f.a.b.h;
import g.f.a.b.n;
import g.f.a.e.b;
import g.f.a.h.c;
import g.f.a.i.d;
import org.slf4j.Logger;

public class DownloadDatabaseHelper extends a {
    private static final String DATABASE_NAME = "downloads.db";
    private static final int DATABASE_VERSION = 1;
    private static volatile DownloadDatabaseHelper databaseHelper;
    private Context context;
    private n<QDDownloadTaskInternal, String> qdDownloadTasksDao;

    private DownloadDatabaseHelper(Context context2) {
        super(context2, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        this.context = context2;
    }

    public static DownloadDatabaseHelper getInstance(Context context2) {
        if (databaseHelper == null) {
            synchronized (DownloadDatabaseHelper.class) {
                Context applicationContext = context2.getApplicationContext();
                if (databaseHelper == null) {
                    databaseHelper = new DownloadDatabaseHelper(applicationContext);
                }
            }
        }
        return databaseHelper;
    }

    private void reallyClose() {
        super.close();
    }

    public void close() {
        throw new AssertionError("DON't close global DownloadDatabaseHelper object.");
    }

    public void finalize() {
        synchronized (DownloadDatabaseHelper.class) {
            if (databaseHelper != null) {
                if (databaseHelper.isOpen()) {
                    databaseHelper.reallyClose();
                }
                databaseHelper = null;
            }
        }
        try {
            super.finalize();
        } catch (Throwable unused) {
            Logger logger = g.c.a.e.e.a.a;
        }
    }

    public n<QDDownloadTaskInternal, String> getQDDownloadTasksDao() {
        if (this.qdDownloadTasksDao == null) {
            this.qdDownloadTasksDao = getRuntimeExceptionDao(QDDownloadTaskInternal.class);
        }
        return this.qdDownloadTasksDao;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase, c cVar) {
        g.f.a.e.c cVar2 = a.logger;
        b.a aVar = b.a.DEBUG;
        Object obj = g.f.a.e.c.b;
        cVar2.g(aVar, (Throwable) null, "onCreate start", obj, obj, obj, (Object[]) null);
        Class<QDDownloadTaskInternal> cls = QDDownloadTaskInternal.class;
        try {
            g.f.a.e.c cVar3 = d.a;
            d.b(h.b(cVar, cls), false);
        } catch (Exception e2) {
            Logger logger = g.c.a.e.e.a.a;
            a.logger.e("onCreate start exception", e2);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, c cVar, int i2, int i3) {
        g.f.a.i.c<T, ID> cVar2;
        g.f.a.e.c cVar3 = a.logger;
        b.a aVar = b.a.DEBUG;
        Object obj = g.f.a.e.c.b;
        cVar3.g(aVar, (Throwable) null, "onUpgrade start", obj, obj, obj, (Object[]) null);
        try {
            a.logger.f("oldVersion={} newVersion={}", Integer.valueOf(i2), Integer.valueOf(i3));
            if (i2 > 26 || i3 != 27) {
                g.f.a.e.c cVar4 = d.a;
                g b = h.b(cVar, QDDownloadTaskInternal.class);
                c O = b.O();
                Class a = b.a();
                g.f.a.c.c cVar5 = ((g.f.a.a.b) O).f3835e;
                if (b instanceof g.f.a.b.a) {
                    cVar2 = ((g.f.a.b.a) b).f3844f;
                } else {
                    cVar2 = new g.f.a.i.c<>(O, (g.f.a.b.a) null, a);
                }
                d.e(cVar5, O, cVar2, true);
                onCreate(sQLiteDatabase, cVar);
                return;
            }
            g.f.a.e.c cVar6 = d.a;
            d.b(h.b(cVar, QDDownloadTaskInternal.class), true);
        } catch (Exception unused) {
            Logger logger = g.c.a.e.e.a.a;
        }
    }
}
