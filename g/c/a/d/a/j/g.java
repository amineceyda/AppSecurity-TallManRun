package g.c.a.d.a.j;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.apkpure.aegon.cms.activity.PictureBrowseActivity;
import com.apkpure.aegon.cms.activity.picture_browse.PictureBean;
import com.apkpure.aegon.widgets.layout.FingerFrameLayout;
import com.apkpure.aegon.widgets.photoview.PhotoView;
import e.e.d.l.a;
import g.c.a.e.k.g.e;
import g.c.a.g.b.c;
import g.d.a.f;

public class g extends c {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f1930l = 0;

    /* renamed from: e  reason: collision with root package name */
    public FingerFrameLayout f1931e;

    /* renamed from: f  reason: collision with root package name */
    public PhotoView f1932f;

    /* renamed from: g  reason: collision with root package name */
    public ProgressBar f1933g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f1934h;

    /* renamed from: i  reason: collision with root package name */
    public PictureBean f1935i;

    /* renamed from: j  reason: collision with root package name */
    public PictureBrowseActivity.b f1936j;

    /* renamed from: k  reason: collision with root package name */
    public FingerFrameLayout.a f1937k;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131493070, viewGroup, false);
        Parcelable parcelable = getArguments().getParcelable("bundle_image_data");
        this.f1935i = parcelable == null ? new PictureBean() : (PictureBean) parcelable;
        this.f1931e = (FingerFrameLayout) inflate.findViewById(2131296977);
        this.f1932f = (PhotoView) inflate.findViewById(2131298641);
        this.f1933g = (ProgressBar) inflate.findViewById(2131297061);
        this.f1934h = (ImageView) inflate.findViewById(2131296820);
        if (this.f1936j != null) {
            this.f1932f.setOnViewTapListener(new a(this));
            this.f1934h.setOnClickListener(new b(this));
        }
        this.f1931e.setUpdateAlpha(false);
        FingerFrameLayout.a aVar = this.f1937k;
        if (aVar != null) {
            this.f1931e.setOnAlphaChangeListener(aVar);
        }
        this.f1932f.setOnScaleChangeListener(new c(this));
        a.s0(this.c, this.f1935i.originalUrl, a.Q(), new f(this), a.s0(this.c, this.f1935i.thumbnailUrl, a.Q(), (e) null, (f<Drawable>) null)).v(this.f1932f);
        g.c.b.b.f.a0(this, inflate);
        return inflate;
    }
}
