package e.b.h;

import android.graphics.Typeface;
import android.widget.TextView;

public class y implements Runnable {
    public final /* synthetic */ TextView b;
    public final /* synthetic */ Typeface c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1212d;

    public y(x xVar, TextView textView, Typeface typeface, int i2) {
        this.b = textView;
        this.c = typeface;
        this.f1212d = i2;
    }

    public void run() {
        this.b.setTypeface(this.c, this.f1212d);
    }
}
