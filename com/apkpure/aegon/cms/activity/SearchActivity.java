package com.apkpure.aegon.cms.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import com.apkpure.aegon.widgets.textview.RoundLinearLayout;
import g.c.a.d.a.c;
import g.c.a.d.a.d;
import g.c.a.d.a.e;
import g.c.a.d.a.f;
import g.c.a.d.a.h;
import g.c.a.d.b.g;
import g.c.a.d.b.i;
import g.c.a.f.b;
import g.c.a.g.b.a;
import g.i.c.a.a.i.b;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SearchActivity extends a {
    public static final Logger u = LoggerFactory.getLogger("Search|SearchActivityLog");
    public b r;
    public i s;
    public g t;

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
        ImageView imageView;
        ImageView imageView2;
        EditText editText;
        EditText editText2;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(2131492918, (ViewGroup) null);
        setContentView(inflate);
        int i2 = 2131298632;
        ImageView imageView3 = (ImageView) inflate.findViewById(2131298632);
        if (imageView3 != null) {
            i2 = 2131297042;
            ImageView imageView4 = (ImageView) inflate.findViewById(2131297042);
            if (imageView4 != null) {
                i2 = 2131298663;
                RoundLinearLayout roundLinearLayout = (RoundLinearLayout) inflate.findViewById(2131298663);
                if (roundLinearLayout != null) {
                    i2 = 2131297497;
                    ImageView imageView5 = (ImageView) inflate.findViewById(2131297497);
                    if (imageView5 != null) {
                        i2 = 2131298665;
                        EditText editText3 = (EditText) inflate.findViewById(2131298665);
                        if (editText3 != null) {
                            i2 = 2131298666;
                            ViewFlipper viewFlipper = (ViewFlipper) inflate.findViewById(2131298666);
                            if (viewFlipper != null) {
                                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(2131298667);
                                if (frameLayout != null) {
                                    i2 = 2131297705;
                                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(2131297705);
                                    if (linearLayout != null) {
                                        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(2131298672);
                                        if (frameLayout2 != null) {
                                            g.c.a.f.b bVar = new g.c.a.f.b((LinearLayout) inflate, imageView3, imageView4, roundLinearLayout, imageView5, editText3, viewFlipper, frameLayout, linearLayout, frameLayout2);
                                            this.r = bVar;
                                            if (!(bVar == null || imageView4 == null)) {
                                                imageView4.setOnClickListener(new f(this));
                                            }
                                            g.c.a.f.b bVar2 = this.r;
                                            if (!(bVar2 == null || (editText2 = bVar2.f2003d) == null)) {
                                                editText2.addTextChangedListener(new g.c.a.d.a.i(this));
                                            }
                                            g.c.a.f.b bVar3 = this.r;
                                            if (!(bVar3 == null || (editText = bVar3.f2003d) == null)) {
                                                editText.setOnKeyListener(new d(this));
                                            }
                                            g.c.a.f.b bVar4 = this.r;
                                            if (!(bVar4 == null || (imageView2 = bVar4.a) == null)) {
                                                imageView2.setOnClickListener(new e(this));
                                            }
                                            g.c.a.f.b bVar5 = this.r;
                                            if (!(bVar5 == null || (imageView = bVar5.c) == null)) {
                                                imageView.setOnClickListener(new c(this));
                                            }
                                            if (this.s == null) {
                                                i iVar = i.f1959f;
                                                i iVar2 = new i();
                                                this.s = iVar2;
                                                iVar2.f1962e = new h(this);
                                            }
                                            i iVar3 = this.s;
                                            Boolean valueOf = iVar3 == null ? null : Boolean.valueOf(iVar3.isAdded());
                                            Boolean bool = Boolean.TRUE;
                                            if (!i.o.c.h.a(valueOf, bool)) {
                                                FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
                                                i iVar4 = this.s;
                                                i.o.c.h.c(iVar4);
                                                beginTransaction.add(2131298672, iVar4, "LiteFragment").commit();
                                            }
                                            FragmentTransaction beginTransaction2 = getFragmentManager().beginTransaction();
                                            i iVar5 = this.s;
                                            i.o.c.h.c(iVar5);
                                            beginTransaction2.show(iVar5);
                                            if (this.t == null) {
                                                g gVar = g.f1951h;
                                                this.t = new g();
                                            }
                                            g gVar2 = this.t;
                                            if (!i.o.c.h.a(gVar2 == null ? null : Boolean.valueOf(gVar2.isAdded()), bool)) {
                                                FragmentTransaction beginTransaction3 = getFragmentManager().beginTransaction();
                                                g gVar3 = this.t;
                                                i.o.c.h.c(gVar3);
                                                beginTransaction3.add(2131298667, gVar3, "LiteFragment").commit();
                                            }
                                            FragmentTransaction beginTransaction4 = getFragmentManager().beginTransaction();
                                            g gVar4 = this.t;
                                            i.o.c.h.c(gVar4);
                                            beginTransaction4.show(gVar4);
                                            return;
                                        }
                                        i2 = 2131298672;
                                    }
                                } else {
                                    i2 = 2131298667;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        FragmentManager fragmentManager;
        FragmentTransaction beginTransaction;
        FragmentManager fragmentManager2;
        FragmentTransaction beginTransaction2;
        super.onSaveInstanceState(bundle, persistableBundle);
        g gVar = this.t;
        if (!(gVar == null || !gVar.isAdded() || (fragmentManager2 = getFragmentManager()) == null || (beginTransaction2 = fragmentManager2.beginTransaction()) == null)) {
            beginTransaction2.remove(this.t);
        }
        i iVar = this.s;
        if (iVar != null && iVar.isAdded() && (fragmentManager = getFragmentManager()) != null && (beginTransaction = fragmentManager.beginTransaction()) != null) {
            beginTransaction.remove(this.s);
        }
    }

    public String r() {
        return "page_search";
    }

    public long s() {
        return 2023;
    }

    public final void y() {
        Boolean bool;
        g.c.a.d.b.e eVar;
        Editable text;
        Editable text2;
        g.c.a.f.b bVar = this.r;
        SwipeRefreshLayout swipeRefreshLayout = null;
        EditText editText = bVar == null ? null : bVar.f2003d;
        boolean z = false;
        if (editText == null || (text2 = editText.getText()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(text2.length() == 0);
        }
        if (i.o.c.h.a(bool, Boolean.TRUE)) {
            u.info("Key work text is null or empty.");
            return;
        }
        g.c.a.f.b bVar2 = this.r;
        View view = bVar2 == null ? null : bVar2.f2003d;
        if (view != null) {
            Context context = view.getContext();
            if (context != null && (context instanceof Activity)) {
                view = ((Activity) context).getCurrentFocus();
            }
            if (view != null) {
                view.clearFocus();
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
            }
        }
        g.c.a.f.b bVar3 = this.r;
        ViewFlipper viewFlipper = bVar3 == null ? null : bVar3.f2004e;
        if (viewFlipper != null) {
            viewFlipper.setDisplayedChild(1);
        }
        g gVar = this.t;
        if (gVar != null) {
            g.c.a.f.b bVar4 = this.r;
            EditText editText2 = bVar4 == null ? null : bVar4.f2003d;
            String obj = (editText2 == null || (text = editText2.getText()) == null) ? null : text.toString();
            if (!i.o.c.h.a(gVar.b, obj) && (eVar = gVar.f1956g) != null) {
                eVar.f2183g.clear();
                eVar.notifyDataSetChanged();
                eVar.l();
                View view2 = eVar.f2181e;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            gVar.b = obj;
            if (obj == null || obj.length() == 0) {
                z = true;
            }
            if (z) {
                g.f1952i.info("Search keyWork is null or empty.");
                return;
            }
            g.c.a.f.f fVar = gVar.f1953d;
            if (fVar != null) {
                swipeRefreshLayout = fVar.c;
            }
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            i.o.c.h.c(obj);
            gVar.b(obj, gVar.c, 1);
        }
    }
}
