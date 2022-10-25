package com.pierfrancescosoffritti.androidyoutubeplayer.core.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import e.e.c.a;
import g.c.b.b.f;
import g.h.a.c.a.l;
import g.h.a.c.a.m;
import g.h.a.c.a.o;
import g.h.a.c.a.p;
import g.h.a.c.a.r.d;
import g.h.a.c.b.k.c;
import g.h.a.c.b.l.b;
import g.i.c.a.a.b0.g;
import g.i.c.a.a.b0.n;
import g.i.c.a.a.i.b;
import g.i.c.a.a.r.e;
import i.o.c.h;
import java.util.Objects;

public final class YouTubePlayerSeekBar extends LinearLayout implements SeekBar.OnSeekBarChangeListener, d {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f558j = 0;
    public boolean b;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f559d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f560e = true;

    /* renamed from: f  reason: collision with root package name */
    public b f561f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f562g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f563h;

    /* renamed from: i  reason: collision with root package name */
    public final SeekBar f564i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YouTubePlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        TextView textView = new TextView(context);
        this.f562g = textView;
        TextView textView2 = new TextView(context);
        this.f563h = textView2;
        SeekBar seekBar = new SeekBar(context);
        this.f564i = seekBar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, g.h.a.b.a, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(2131165360));
        int color = obtainStyledAttributes.getColor(0, a.b(context, 2131099682));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(2131165361);
        textView.setText(getResources().getString(2131820682));
        textView.setPadding(dimensionPixelSize2, dimensionPixelSize2, 0, dimensionPixelSize2);
        textView.setTextColor(a.b(context, 17170443));
        textView.setGravity(16);
        textView2.setText(getResources().getString(2131820682));
        textView2.setPadding(0, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
        textView2.setTextColor(a.b(context, 17170443));
        textView2.setGravity(16);
        setFontSize((float) dimensionPixelSize);
        int i2 = dimensionPixelSize2 * 2;
        seekBar.setPadding(i2, dimensionPixelSize2, i2, dimensionPixelSize2);
        setColor(color);
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
        addView(seekBar, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        setGravity(16);
        seekBar.setOnSeekBarChangeListener(this);
    }

    public void b(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
        if (!this.b) {
            if (this.c <= 0 || h.a(c.a(f2), c.a((float) this.c))) {
                this.c = -1;
                this.f564i.setProgress((int) f2);
            }
        }
    }

    public void e(p pVar, m mVar) {
        h.e(pVar, "youTubePlayer");
        h.e(mVar, "playbackRate");
    }

    public void f(p pVar) {
        h.e(pVar, "youTubePlayer");
    }

    public void g(p pVar, String str) {
        h.e(pVar, "youTubePlayer");
        h.e(str, "videoId");
    }

    public final SeekBar getSeekBar() {
        return this.f564i;
    }

    public final boolean getShowBufferingProgress() {
        return this.f560e;
    }

    public final TextView getVideoCurrentTimeTextView() {
        return this.f562g;
    }

    public final TextView getVideoDurationTextView() {
        return this.f563h;
    }

    public final b getYoutubePlayerSeekBarListener() {
        return this.f561f;
    }

    public void h(p pVar, o oVar) {
        h.e(pVar, "youTubePlayer");
        h.e(oVar, "state");
        this.c = -1;
        int ordinal = oVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    this.f559d = true;
                    return;
                } else if (ordinal != 4) {
                    return;
                }
            }
            this.f559d = false;
            return;
        }
        this.f564i.setProgress(0);
        this.f564i.setMax(0);
        this.f563h.post(new g.h.a.c.b.l.a(this));
    }

    public void j(p pVar) {
        h.e(pVar, "youTubePlayer");
    }

    public void l(p pVar, float f2) {
        int i2;
        SeekBar seekBar;
        h.e(pVar, "youTubePlayer");
        if (this.f560e) {
            seekBar = this.f564i;
            i2 = (int) (f2 * ((float) seekBar.getMax()));
        } else {
            seekBar = this.f564i;
            i2 = 0;
        }
        seekBar.setSecondaryProgress(i2);
    }

    public void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        h.e(seekBar, "seekBar");
        this.f562g.setText(c.a((float) i2));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        h.e(seekBar, "seekBar");
        this.b = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        h.e(seekBar, "seekBar");
        if (this.f559d) {
            this.c = seekBar.getProgress();
        }
        b bVar = this.f561f;
        if (bVar != null) {
            bVar.a((float) seekBar.getProgress());
        }
        this.b = false;
        g.i.c.a.a.i.b bVar2 = b.C0166b.a;
        Objects.requireNonNull(bVar2);
        e eVar = e.b.a;
        if (eVar.a) {
            StringBuilder i2 = g.a.a.a.a.i("onStopTrackingTouch, view = ");
            i2.append(n.b(seekBar));
            f.K("EventCollector", i2.toString());
        }
        if (eVar.i()) {
            g.i.c.a.a.i.e.h hVar = (g.i.c.a.a.i.e.h) g.a(3);
            hVar.d(seekBar);
            bVar2.b.a(seekBar, hVar);
        }
    }

    public void p(p pVar, g.h.a.c.a.n nVar) {
        h.e(pVar, "youTubePlayer");
        h.e(nVar, "error");
    }

    public void r(p pVar, float f2) {
        h.e(pVar, "youTubePlayer");
        this.f563h.setText(c.a(f2));
        this.f564i.setMax((int) f2);
    }

    public void s(p pVar, l lVar) {
        h.e(pVar, "youTubePlayer");
        h.e(lVar, "playbackQuality");
    }

    public final void setColor(int i2) {
        e.e.d.l.a.E0(this.f564i.getThumb(), i2);
        e.e.d.l.a.E0(this.f564i.getProgressDrawable(), i2);
    }

    public final void setFontSize(float f2) {
        this.f562g.setTextSize(0, f2);
        this.f563h.setTextSize(0, f2);
    }

    public final void setShowBufferingProgress(boolean z) {
        this.f560e = z;
    }

    public final void setYoutubePlayerSeekBarListener(g.h.a.c.b.l.b bVar) {
        this.f561f = bVar;
    }
}
