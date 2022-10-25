package com.apkpure.aegon.widgets.xlistview;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import g.c.a.f.h;
import g.i.c.a.a.i.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class XListView extends ListView implements AbsListView.OnScrollListener {
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final Logger f326l;
    public View b;
    public h c;

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f327d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f328e;

    /* renamed from: f  reason: collision with root package name */
    public int f329f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f330g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f331h;

    /* renamed from: i  reason: collision with root package name */
    public ListAdapter f332i;

    /* renamed from: j  reason: collision with root package name */
    public String f333j = "loading...";

    /* renamed from: k  reason: collision with root package name */
    public String f334k = "no more data";

    public interface a {
        void a();
    }

    public static final class b extends DataSetObserver {
        public final /* synthetic */ XListView a;

        public b(XListView xListView) {
            this.a = xListView;
        }

        public void onChanged() {
            XListView xListView = this.a;
            int i2 = 0;
            xListView.f331h = false;
            xListView.f330g = false;
            h hVar = xListView.c;
            LinearLayout linearLayout = null;
            ProgressBar progressBar = hVar == null ? null : hVar.b;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            h hVar2 = xListView.c;
            TextView textView = hVar2 == null ? null : hVar2.c;
            if (textView != null) {
                textView.setText(xListView.f333j);
            }
            ListAdapter listAdapter = xListView.f332i;
            if (listAdapter instanceof g.c.a.o.g.b) {
                h hVar3 = xListView.c;
                if (hVar3 != null) {
                    linearLayout = hVar3.a;
                }
                if (linearLayout != null) {
                    Objects.requireNonNull(listAdapter, "null cannot be cast to non-null type com.apkpure.aegon.widgets.xlistview.BaseQuickAdapter<*, *>");
                    if (((g.c.a.o.g.b) listAdapter).getCount() <= 0) {
                        i2 = 4;
                    }
                    linearLayout.setVisibility(i2);
                }
            }
        }
    }

    static {
        Logger logger = LoggerFactory.getLogger("XListView");
        i.o.c.h.d(logger, "getLogger(\"XListView\")");
        f326l = logger;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.o.c.h.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(2131493494, (ViewGroup) null);
        this.b = inflate;
        i.o.c.h.c(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i2 = 2131297364;
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(2131297364);
        if (progressBar != null) {
            i2 = 2131298583;
            TextView textView = (TextView) inflate.findViewById(2131298583);
            if (textView != null) {
                this.c = new h(linearLayout, linearLayout, progressBar, textView);
                if (linearLayout != null) {
                    linearLayout.setVisibility(4);
                }
                addFooterView(this.b);
                setOnScrollListener(this);
                String string = context.getString(2131821953);
                i.o.c.h.d(string, "context.getString(R.string.xlistview_loading)");
                this.f333j = string;
                String string2 = context.getString(2131821954);
                i.o.c.h.d(string2, "context.getString(R.string.xlistview_no_more_data)");
                this.f334k = string2;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public final void a(a aVar) {
        synchronized (getLoadMoreListeners()) {
            getLoadMoreListeners().add(aVar);
        }
    }

    public final List<a> getLoadMoreListeners() {
        return this.f327d;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        String str;
        LinearLayout linearLayout;
        i.o.c.h.e(absListView, "view");
        Logger logger = f326l;
        StringBuilder k2 = g.a.a.a.a.k("onScrollStateChanged firstVisibleItem[", i2, "] visibleItemCount[", i3, "] totalItemCount[");
        k2.append(i4);
        k2.append(']');
        logger.debug(k2.toString());
        int i5 = i4 - 1;
        this.f329f = i5;
        int i6 = (i2 + i3) - 1;
        this.f328e = i6;
        if (i6 >= i5) {
            if (this.f331h || this.f330g) {
                StringBuilder i7 = g.a.a.a.a.i("onScrollStateChanged isLoadEnd[");
                i7.append(this.f331h);
                i7.append("] isLoading[");
                i7.append(this.f330g);
                i7.append(']');
                str = i7.toString();
            } else {
                h hVar = this.c;
                Integer num = null;
                if (!(hVar == null || (linearLayout = hVar.a) == null)) {
                    num = Integer.valueOf(linearLayout.getVisibility());
                }
                if (num != null && num.intValue() == 0) {
                    logger.debug("onScrollStateChanged isLoading true");
                    this.f330g = true;
                    synchronized (this.f327d) {
                        for (a a2 : getLoadMoreListeners()) {
                            a2.a();
                        }
                    }
                    return;
                }
                str = "onScrollStateChanged foot view INVISIBLE.";
            }
            logger.debug(str);
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
        b.C0166b.a.i(absListView, i2);
        i.o.c.h.e(absListView, "view");
        Logger logger = f326l;
        logger.debug("onScrollStateChanged scrollState[" + i2 + ']');
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f332i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(new b(this));
        }
    }
}
