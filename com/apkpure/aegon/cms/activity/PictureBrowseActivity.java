package com.apkpure.aegon.cms.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;
import com.apkpure.aegon.widgets.viewpager.CustomViewPager;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import g.c.a.d.a.j.h;
import g.c.a.d.a.j.k;
import g.i.c.a.a.i.b;

public class PictureBrowseActivity extends g.c.a.g.b.a {
    public static final /* synthetic */ int C = 0;
    public b A = new g.c.a.d.a.b(this);
    public FingerFrameLayout.a B = new a();
    public CustomViewPager r;
    public RelativeLayout s;
    public TextView t;
    public FrameLayout u;
    public View v;
    public int w;
    public boolean x;
    public h y;
    public PictureBrowseConfigBean z;

    public class a implements FingerFrameLayout.a {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(float r4) {
            /*
                r3 = this;
                r0 = 0
                int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r1 != 0) goto L_0x000f
                com.apkpure.aegon.cms.activity.PictureBrowseActivity r1 = com.apkpure.aegon.cms.activity.PictureBrowseActivity.this
                boolean r2 = r1.x
                if (r2 == 0) goto L_0x000f
                r1.A()
                goto L_0x0018
            L_0x000f:
                com.apkpure.aegon.cms.activity.PictureBrowseActivity r1 = com.apkpure.aegon.cms.activity.PictureBrowseActivity.this
                boolean r2 = r1.x
                if (r2 != 0) goto L_0x0018
                r1.z()
            L_0x0018:
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 != 0) goto L_0x0024
                com.apkpure.aegon.cms.activity.PictureBrowseActivity r4 = com.apkpure.aegon.cms.activity.PictureBrowseActivity.this
                android.widget.FrameLayout r4 = r4.u
                r0 = 2131099690(0x7f06002a, float:1.781174E38)
                goto L_0x0035
            L_0x0024:
                float r4 = java.lang.Math.abs(r4)
                r0 = 1112014848(0x42480000, float:50.0)
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 <= 0) goto L_0x0038
                com.apkpure.aegon.cms.activity.PictureBrowseActivity r4 = com.apkpure.aegon.cms.activity.PictureBrowseActivity.this
                android.widget.FrameLayout r4 = r4.u
                r0 = 2131099992(0x7f060158, float:1.7812353E38)
            L_0x0035:
                r4.setBackgroundResource(r0)
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.cms.activity.PictureBrowseActivity.a.a(float):void");
        }
    }

    public interface b {
    }

    public final void A() {
        this.x = false;
        getWindow().getDecorView().setSystemUiVisibility(1792);
        this.s.animate().translationYBy((float) this.s.getHeight()).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(2130771984, 2130771985);
    }

    public void onBackPressed() {
        CustomViewPager customViewPager;
        boolean z2;
        h hVar = this.y;
        if (hVar != null && (customViewPager = this.r) != null) {
            Fragment fragment = hVar.f1938f.get(customViewPager.getCurrentItem());
            if (fragment instanceof k) {
                YouTubePlayerView youTubePlayerView = ((k) fragment).f1939e;
                if (youTubePlayerView == null || !youTubePlayerView.c.b) {
                    z2 = true;
                } else {
                    youTubePlayerView.b.f549f.c();
                    z2 = false;
                }
                if (!z2) {
                    return;
                }
            }
            this.f13g.a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        CustomViewPager customViewPager;
        super.onConfigurationChanged(configuration);
        boolean z2 = true;
        if (configuration.orientation == 1) {
            A();
            customViewPager = this.r;
        } else {
            z();
            customViewPager = this.r;
            z2 = false;
        }
        customViewPager.setScroll(z2);
        b.C0166b.a.b(this, configuration);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: g.c.a.d.a.j.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: g.c.a.d.a.j.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: g.c.a.d.a.j.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: g.c.a.d.a.j.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 0
            r0 = 1
            e.e.i.b.R(r7, r8, r0, r0)
            r1 = 2131492898(0x7f0c0022, float:1.860926E38)
            r7.setContentView((int) r1)
            r1 = 2131298637(0x7f09094d, float:1.8215253E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r7.u = r1
            r1 = 2131298633(0x7f090949, float:1.8215245E38)
            android.view.View r1 = r7.findViewById(r1)
            com.apkpure.aegon.widgets.viewpager.CustomViewPager r1 = (com.apkpure.aegon.widgets.viewpager.CustomViewPager) r1
            r7.r = r1
            r1 = 2131298619(0x7f09093b, float:1.8215216E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r7.s = r1
            r1 = 2131297689(0x7f090599, float:1.821333E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r7.t = r1
            r1 = 2131297042(0x7f090312, float:1.8212018E38)
            android.view.View r1 = r7.findViewById(r1)
            g.c.a.d.a.a r2 = new g.c.a.d.a.a
            r2.<init>(r7)
            r1.setOnClickListener(r2)
            r1 = 2131298676(0x7f090974, float:1.8215332E38)
            android.view.View r1 = r7.findViewById(r1)
            r7.v = r1
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r2 = "key_picture_data"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean r1 = (com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean) r1
            r7.z = r1
            if (r1 != 0) goto L_0x0064
            goto L_0x0154
        L_0x0064:
            android.view.View r1 = r7.v
            r2 = 2131099993(0x7f060159, float:1.7812355E38)
            int r3 = r7.y(r7, r2)
            r1.setBackgroundColor(r3)
            android.widget.RelativeLayout r1 = r7.s
            int r2 = r7.y(r7, r2)
            r1.setBackgroundColor(r2)
            android.view.Window r1 = r7.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 1792(0x700, float:2.511E-42)
            r1.setSystemUiVisibility(r2)
            android.view.View r1 = r7.v
            r1.setVisibility(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean r2 = r7.z
            java.util.List r2 = r2.f()
            if (r2 == 0) goto L_0x00f5
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00f5
            java.util.Iterator r2 = r2.iterator()
        L_0x00a2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r3 = r2.next()
            com.apkpure.aegon.cms.activity.picture_browse.PictureBean r3 = (com.apkpure.aegon.cms.activity.picture_browse.PictureBean) r3
            int r4 = r3.type
            if (r4 != r0) goto L_0x00d5
            g.c.a.d.a.j.k r4 = new g.c.a.d.a.j.k
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "bundle_video_data"
            r5.putParcelable(r6, r3)
            r4.setArguments(r5)
            com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean r3 = r7.z
            boolean r3 = r3.h()
            r4.o = r3
            com.apkpure.aegon.cms.activity.PictureBrowseActivity$b r3 = r7.A
            r4.f1947m = r3
            com.apkpure.aegon.widgets.layout.FingerFrameLayout$a r3 = r7.B
            r4.n = r3
            goto L_0x00f1
        L_0x00d5:
            if (r4 != 0) goto L_0x00a2
            g.c.a.d.a.j.g r4 = new g.c.a.d.a.j.g
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "bundle_image_data"
            r5.putParcelable(r6, r3)
            r4.setArguments(r5)
            com.apkpure.aegon.cms.activity.PictureBrowseActivity$b r3 = r7.A
            r4.f1936j = r3
            com.apkpure.aegon.widgets.layout.FingerFrameLayout$a r3 = r7.B
            r4.f1937k = r3
        L_0x00f1:
            r1.add(r4)
            goto L_0x00a2
        L_0x00f5:
            com.apkpure.aegon.cms.activity.picture_browse.PictureBrowseConfigBean r2 = r7.z
            int r2 = r2.g()
            r7.w = r2
            int r2 = r1.size()
            int r3 = r7.w
            int r4 = r2 + -1
            if (r3 <= r4) goto L_0x0109
            r7.w = r8
        L_0x0109:
            g.c.a.d.a.j.h r3 = new g.c.a.d.a.j.h
            androidx.fragment.app.FragmentManager r4 = r7.k()
            r3.<init>(r4, r1)
            r7.y = r3
            com.apkpure.aegon.widgets.viewpager.CustomViewPager r1 = r7.r
            r1.setAdapter(r3)
            com.apkpure.aegon.widgets.viewpager.CustomViewPager r1 = r7.r
            int r3 = r7.w
            r1.setCurrentItem(r3)
            com.apkpure.aegon.widgets.viewpager.CustomViewPager r1 = r7.r
            g.c.a.d.a.g r3 = new g.c.a.d.a.g
            r3.<init>(r7, r2)
            java.util.List<androidx.viewpager.widget.ViewPager$h> r4 = r1.i0
            if (r4 != 0) goto L_0x0132
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1.i0 = r4
        L_0x0132:
            java.util.List<androidx.viewpager.widget.ViewPager$h> r1 = r1.i0
            r1.add(r3)
            android.widget.TextView r1 = r7.t
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r7.w
            int r4 = r4 + r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r8] = r4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r3[r0] = r8
            java.lang.String r8 = "%s/%s"
            java.lang.String r8 = java.lang.String.format(r8, r3)
            r1.setText(r8)
        L_0x0154:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apkpure.aegon.cms.activity.PictureBrowseActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onStart() {
        super.onStart();
        overridePendingTransition(2130771986, 2130771984);
    }

    public final int y(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColor(i2) : context.getResources().getColor(i2);
    }

    public final void z() {
        this.x = true;
        getWindow().getDecorView().setSystemUiVisibility(7938);
        this.s.animate().translationY((float) (-this.s.getHeight())).setInterpolator(new AccelerateInterpolator()).setDuration(200).start();
    }
}
