package g.c.a.d.a.j;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import com.apkpure.aegon.cms.activity.picture_browse.PictureBean;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import g.c.a.g.b.c;
import g.c.a.m.i;
import g.c.a.p.a;
import g.c.b.b.f;
import g.h.a.c.a.p;

public class k extends c {

    /* renamed from: e  reason: collision with root package name */
    public YouTubePlayerView f1939e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f1940f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f1941g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f1942h;

    /* renamed from: i  reason: collision with root package name */
    public PictureBean f1943i;

    /* renamed from: j  reason: collision with root package name */
    public a f1944j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f1945k;

    /* renamed from: l  reason: collision with root package name */
    public FingerFrameLayout f1946l;

    /* renamed from: m  reason: collision with root package name */
    public PictureBrowseActivity.b f1947m;
    public FingerFrameLayout.a n;
    public boolean o;
    public p p;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(2131493087, viewGroup, false);
        this.f1946l = (FingerFrameLayout) inflate.findViewById(2131297462);
        this.f1945k = (FrameLayout) inflate.findViewById(2131296482);
        this.f1942h = (ImageView) inflate.findViewById(2131296483);
        this.f1940f = (ImageView) inflate.findViewById(2131298617);
        this.f1941g = (TextView) inflate.findViewById(2131297866);
        if (this.f1939e == null) {
            this.f1939e = new YouTubePlayerView(this.c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            this.f1939e.setLayoutParams(layoutParams);
            this.f1939e.setBackgroundResource(2131099760);
            this.f1939e.setVisibility(4);
            this.f1946l.addView(this.f1939e);
        }
        this.f1942h.getLayoutParams().height = e.e.d.l.a.L(this.c);
        this.f1939e.getLayoutParams().height = e.e.d.l.a.L(this.c);
        this.f1939e.setVisibility(8);
        if (getArguments() != null) {
            this.f1943i = (PictureBean) getArguments().getParcelable("bundle_video_data");
        }
        if (this.f1943i != null) {
            if (this.f1947m != null) {
                this.f1946l.setOnClickListener(new d(this));
            }
            this.f1946l.setUpdateAlpha(false);
            FingerFrameLayout.a aVar = this.n;
            if (aVar != null) {
                this.f1946l.setOnAlphaChangeListener(aVar);
            }
            if (!TextUtils.isEmpty(this.f1943i.lengthSeconds)) {
                TextView textView = this.f1941g;
                int parseInt = Integer.parseInt(this.f1943i.lengthSeconds);
                String[] strArr = i.a;
                if (parseInt == 0) {
                    str = "";
                } else {
                    int i2 = parseInt / 3600;
                    int i3 = (parseInt % 3600) / 60;
                    int i4 = parseInt % 60;
                    if (i2 == 0) {
                        str = i.a(i3) + " : " + i.a(i4);
                    } else {
                        str = i.a(i2) + " : " + i.a(i3) + " : " + i.a(i4);
                    }
                }
                textView.setText(str);
                this.f1941g.setVisibility(0);
            } else {
                this.f1941g.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f1943i.thumbnailUrl)) {
                Context context = this.c;
                e.e.d.l.a.Z(context, this.f1943i.thumbnailUrl, this.f1942h, e.e.d.l.a.R(e.e.d.l.a.u0(context, 2)));
            }
            this.f1944j = new a(this.f2031d, this.f1945k);
            this.f1942h.setOnClickListener(new e(this));
            if (this.o) {
                this.f1942h.performClick();
            }
        }
        f.a0(this, inflate);
        return inflate;
    }

    public void onDestroyView() {
        YouTubePlayerView youTubePlayerView = this.f1939e;
        if (youTubePlayerView != null) {
            youTubePlayerView.release();
        }
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        p pVar = this.p;
        if (pVar != null) {
            pVar.b();
        }
    }

    public void setUserVisibleHint(boolean z) {
        p pVar;
        super.setUserVisibleHint(z);
        if (!z && (pVar = this.p) != null) {
            pVar.b();
        }
    }
}
