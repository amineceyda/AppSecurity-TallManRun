package com.apkpure.aegon.app.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.apkpure.aegon.components.download.DownloadTask;
import com.apkpure.aegon.components.models.AppDigest;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import com.tencent.trpcprotocol.projecta.common.app_detail.nano.AppDetailInfo;
import g.c.a.b.a.e;
import g.c.a.b.a.f;
import g.c.a.b.a.g;
import g.c.a.b.a.l.d;
import g.c.a.e.c.b;
import g.c.a.o.g.d;
import g.i.c.a.a.i.b;
import i.j;
import i.l.c;
import i.o.b.q;
import i.o.c.h;
import i.o.c.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ManagerActivity extends g.c.a.g.b.a {
    public static final /* synthetic */ int A = 0;
    public final Logger r = LoggerFactory.getLogger((Class<?>) ManagerActivity.class);
    public SwipeRefreshLayout s;
    public View t;
    public ListView u;
    public d v;
    public b.C0060b w;
    public final List<DownloadTask> x = new ArrayList();
    public final List<DownloadTask> y = new ArrayList();
    public final List<DownloadTask> z = new ArrayList();

    public static final class a extends i implements q<Boolean, View, Integer, j> {
        public final /* synthetic */ ManagerActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ManagerActivity managerActivity) {
            super(3);
            this.this$0 = managerActivity;
        }

        public Object c(Object obj, Object obj2, Object obj3) {
            CheckBox checkBox;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            View view = (View) obj2;
            int intValue = ((Number) obj3).intValue();
            h.e(view, "view");
            ManagerActivity managerActivity = this.this$0;
            int i2 = ManagerActivity.A;
            Objects.requireNonNull(managerActivity);
            if (view.getId() == 2131298650) {
                Logger logger = managerActivity.r;
                d dVar = managerActivity.v;
                logger.debug(h.j("deleteDownloadDialog concatAdapter.adapters = ", dVar == null ? null : Integer.valueOf(dVar.getCount())));
                List<DownloadTask> list = booleanValue ? managerActivity.y : managerActivity.x;
                if (list == null || list.size() == 0 || intValue >= list.size()) {
                    managerActivity.r.info("deleteDownloadDialog task error. ");
                } else {
                    DownloadTask downloadTask = list.get(intValue);
                    int i3 = 0;
                    g.c.a.n.b.b bVar = new g.c.a.n.b.b(managerActivity, false);
                    String string = bVar.o.getString(2131820852);
                    if (string != null) {
                        bVar.r.setText(string);
                        bVar.r.setChecked(true);
                        checkBox = bVar.r;
                    } else {
                        checkBox = bVar.r;
                        i3 = 8;
                    }
                    checkBox.setVisibility(i3);
                    bVar.a.f35d = list.get(intValue).getSimpleDisplayInfo().c();
                    bVar.j(2131821661);
                    bVar.n(2131821435, new e(list, downloadTask, managerActivity, booleanValue));
                    bVar.m(17039360, g.c.a.b.a.b.b);
                    bVar.e();
                }
            } else {
                List<DownloadTask> list2 = booleanValue ? managerActivity.y : managerActivity.x;
                if (list2 != null && !list2.isEmpty() && intValue < list2.size()) {
                    DownloadTask downloadTask2 = list2.get(intValue);
                    AppDetailInfo appDetailInfo = new AppDetailInfo();
                    appDetailInfo.packageName = downloadTask2.getSimpleDisplayInfo().b();
                    appDetailInfo.label = downloadTask2.getSimpleDisplayInfo().c();
                    appDetailInfo.iconUrl = downloadTask2.getSimpleDisplayInfo().a();
                    DTStatInfo dTStatInfo = new DTStatInfo();
                    if (view.getContext() != null && (view.getContext() instanceof g.c.a.g.b.a)) {
                        Context context = view.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
                        dTStatInfo = new DTStatInfo(((g.c.a.g.b.a) context).p);
                    }
                    dTStatInfo.moduleName = "app_arrange_list";
                    dTStatInfo.modelType = 1052;
                    dTStatInfo.position = "0";
                    dTStatInfo.smallPosition = String.valueOf(intValue + 1);
                    dTStatInfo.scene = 2079;
                    if (view.getContext() != null && (view.getContext() instanceof g.c.a.g.b.a)) {
                        Context context2 = view.getContext();
                        Objects.requireNonNull(context2, "null cannot be cast to non-null type com.apkpure.aegon.main.base.BaseActivity");
                        ((g.c.a.g.b.a) context2).w(g.c.a.e.h.b.a.a(dTStatInfo));
                    }
                    g.c.a.g.d.a.b(view.getContext(), appDetailInfo);
                }
            }
            return j.a;
        }
    }

    public static final void y(ManagerActivity managerActivity, DownloadTask downloadTask) {
        BaseAdapter z2 = managerActivity.z(false);
        if (z2 instanceof g.c.a.b.a.l.d) {
            int i2 = 0;
            for (T next : managerActivity.x) {
                int i3 = i2 + 1;
                String str = null;
                if (i2 >= 0) {
                    DTStatInfo statInfo = ((DownloadTask) next).getStatInfo();
                    String str2 = statInfo == null ? null : statInfo.downloadId;
                    DTStatInfo statInfo2 = downloadTask.getStatInfo();
                    if (statInfo2 != null) {
                        str = statInfo2.downloadId;
                    }
                    if (h.a(str2, str)) {
                        g.c.a.b.a.l.d dVar = (g.c.a.b.a.l.d) z2;
                        Objects.requireNonNull(dVar);
                        h.e(downloadTask, "downloadTask");
                        for (int i4 = 0; i4 < dVar.b.getChildCount(); i4++) {
                            View childAt = dVar.b.getChildAt(i4);
                            if (childAt.getTag() instanceof d.a) {
                                Object tag = childAt.getTag();
                                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.apkpure.aegon.app.activity.download_manage.ManageDownloadAdapter.ViewHolder");
                                d.a aVar = (d.a) tag;
                                h.e(downloadTask, "downloadTask");
                                if (h.a(downloadTask, aVar.f1903h)) {
                                    aVar.c(downloadTask, aVar.f2189d);
                                }
                            }
                        }
                    }
                    i2 = i3;
                } else {
                    c.g();
                    throw null;
                }
            }
        }
    }

    public final BaseAdapter A(boolean z2) {
        boolean z3;
        g.c.a.o.g.d dVar = this.v;
        T t2 = null;
        if (dVar == null) {
            return null;
        }
        List<BaseAdapter> list = dVar.b;
        h.d(list, "concatAdapter.adapters");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            BaseAdapter baseAdapter = (BaseAdapter) next;
            if (!(baseAdapter instanceof g.c.a.b.a.l.c) || ((g.c.a.b.a.l.c) baseAdapter).n != z2) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                t2 = next;
                break;
            }
        }
        return (BaseAdapter) t2;
    }

    public final g.c.a.b.a.l.d B(List<DownloadTask> list, boolean z2) {
        ListView listView = this.u;
        if (listView != null) {
            return new g.c.a.b.a.l.d(listView, list, z2, new a(this));
        }
        h.k("listView");
        throw null;
    }

    public final g.c.a.b.a.l.c C(int i2, boolean z2) {
        ListView listView = this.u;
        if (listView != null) {
            String string = getString(i2);
            h.d(string, "getString(resId)");
            return new g.c.a.b.a.l.c(listView, z2, string);
        }
        h.k("listView");
        throw null;
    }

    public final void D() {
        g.c.a.o.g.d dVar;
        ListView listView;
        List<DownloadTask> list;
        View view = this.t;
        if (view != null) {
            view.setVisibility(8);
            SwipeRefreshLayout swipeRefreshLayout = this.s;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setVisibility(0);
                SwipeRefreshLayout swipeRefreshLayout2 = this.s;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(true);
                    SwipeRefreshLayout swipeRefreshLayout3 = this.s;
                    if (swipeRefreshLayout3 != null) {
                        swipeRefreshLayout3.setEnabled(true);
                        this.x.clear();
                        this.y.clear();
                        g.c.a.e.b.e i2 = g.c.a.e.b.e.i(this);
                        CopyOnWriteArrayList<DownloadTask> h2 = i2.h();
                        if (h2 != null) {
                            Iterator<DownloadTask> it = h2.iterator();
                            while (it.hasNext()) {
                                DownloadTask next = it.next();
                                if (!(next == null || next.getDownloadDate() == null)) {
                                    if (System.currentTimeMillis() - next.getDownloadDate().getTime() > 1296000000) {
                                        i2.l(next.getAsset(), true);
                                    } else {
                                        AppDigest d2 = AppDigest.d(next.getUserData());
                                        if (d2 != null) {
                                            g.c.a.e.k.a.d b = g.c.a.e.k.a.d.b(this);
                                            h.d(b, "getInstance(this)");
                                            if (!b.c(d2)) {
                                                if (next.isSuccess() && !next.isMissing() && !this.y.contains(next)) {
                                                    list = this.y;
                                                } else if (!this.x.contains(next)) {
                                                    list = this.x;
                                                }
                                                list.add(next);
                                            }
                                        }
                                    }
                                }
                            }
                            for (DownloadTask downloadTask : this.z) {
                                if (this.x.contains(downloadTask)) {
                                    this.x.remove(downloadTask);
                                }
                                if (this.y.contains(downloadTask)) {
                                    this.y.remove(downloadTask);
                                }
                            }
                            List<DownloadTask> list2 = this.x;
                            List<DownloadTask> list3 = this.y;
                            if (list2.isEmpty() && list3.isEmpty()) {
                                E();
                            } else if (!(!list2.isEmpty()) || !(!list3.isEmpty())) {
                                if (!list2.isEmpty()) {
                                    dVar = new g.c.a.o.g.d(C(2131820872, false), B(list2, false));
                                    this.v = dVar;
                                    listView = this.u;
                                    if (listView == null) {
                                        h.k("listView");
                                        throw null;
                                    }
                                } else if (!list3.isEmpty()) {
                                    dVar = new g.c.a.o.g.d(C(2131820863, true), B(list3, true));
                                    this.v = dVar;
                                    listView = this.u;
                                    if (listView == null) {
                                        h.k("listView");
                                        throw null;
                                    }
                                }
                                listView.setAdapter(dVar);
                            } else {
                                g.c.a.o.g.d dVar2 = new g.c.a.o.g.d(C(2131820872, false), B(list2, false), C(2131820863, true), B(list3, true));
                                this.v = dVar2;
                                ListView listView2 = this.u;
                                if (listView2 != null) {
                                    listView2.setAdapter(dVar2);
                                } else {
                                    h.k("listView");
                                    throw null;
                                }
                            }
                            SwipeRefreshLayout swipeRefreshLayout4 = this.s;
                            if (swipeRefreshLayout4 == null) {
                                h.k("swipeRefreshLayout");
                                throw null;
                            } else if (swipeRefreshLayout4.f315d) {
                                swipeRefreshLayout4.setRefreshing(false);
                                SwipeRefreshLayout swipeRefreshLayout5 = this.s;
                                if (swipeRefreshLayout5 != null) {
                                    swipeRefreshLayout5.setEnabled(false);
                                } else {
                                    h.k("swipeRefreshLayout");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        h.k("swipeRefreshLayout");
                        throw null;
                    }
                } else {
                    h.k("swipeRefreshLayout");
                    throw null;
                }
            } else {
                h.k("swipeRefreshLayout");
                throw null;
            }
        } else {
            h.k("emptyView");
            throw null;
        }
    }

    public final void E() {
        SwipeRefreshLayout swipeRefreshLayout = this.s;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setVisibility(8);
            View view = this.t;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.t;
                if (view2 != null) {
                    ((TextView) view2.findViewById(2131297058)).setOnClickListener(new g.c.a.b.a.c(this));
                } else {
                    h.k("emptyView");
                    throw null;
                }
            } else {
                h.k("emptyView");
                throw null;
            }
        } else {
            h.k("swipeRefreshLayout");
            throw null;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131492912);
        ((ImageView) findViewById(2131297042)).setOnClickListener(new f(this));
        ((ImageView) findViewById(2131298668)).setOnClickListener(new g.c.a.b.a.d(this));
        View findViewById = findViewById(2131298648);
        h.d(findViewById, "findViewById(R.id.load_failed_root)");
        this.t = findViewById;
        View findViewById2 = findViewById(2131298655);
        h.d(findViewById2, "findViewById(R.id.manage_download_refresh)");
        this.s = (SwipeRefreshLayout) findViewById2;
        View findViewById3 = findViewById(2131298657);
        h.d(findViewById3, "findViewById(R.id.manage_download_rv)");
        this.u = (ListView) findViewById3;
        SwipeRefreshLayout swipeRefreshLayout = this.s;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new g(this));
            b.C0060b bVar = new b.C0060b(this, new g.c.a.b.a.j(this));
            this.w = bVar;
            bVar.a();
            return;
        }
        h.k("swipeRefreshLayout");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        h.e(menu, "menu");
        getMenuInflater().inflate(2132082688, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        b.C0060b bVar = this.w;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void onResume() {
        super.onResume();
        D();
    }

    public String r() {
        return "page_app_arrange";
    }

    public long s() {
        return 2079;
    }

    public final BaseAdapter z(boolean z2) {
        boolean z3;
        g.c.a.o.g.d dVar = this.v;
        T t2 = null;
        if (dVar == null) {
            return null;
        }
        List<BaseAdapter> list = dVar.b;
        h.d(list, "concatAdapter.adapters");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            BaseAdapter baseAdapter = (BaseAdapter) next;
            if (!(baseAdapter instanceof g.c.a.b.a.l.d) || ((g.c.a.b.a.l.d) baseAdapter).o != z2) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                t2 = next;
                break;
            }
        }
        return (BaseAdapter) t2;
    }
}
