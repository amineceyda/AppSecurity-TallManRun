package com.apkpure.aegon.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import android.widget.TextView;
import g.c.a.b.a.k.j.g;
import g.c.a.b.a.k.j.r;
import java.util.Objects;

public class NestedScrollView extends ScrollView {
    public a b;

    public interface a {
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        TextView textView;
        super.onScrollChanged(i2, i3, i4, i5);
        a aVar = this.b;
        if (aVar != null) {
            r rVar = ((g) aVar).a;
            Objects.requireNonNull(rVar);
            r.w.debug("setOnScrollChangeListener scrollY={} oldScrollY={} appBarLayout.height={}", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(rVar.f1893f.getHeight()));
            String str = "";
            if (i3 < rVar.f1893f.getHeight()) {
                rVar.f1893f.setBackgroundColor(rVar.a.getResources().getColor(2131099995));
                textView = rVar.f1894g;
            } else {
                rVar.f1893f.setBackgroundColor(rVar.a.getResources().getColor(2131099922));
                String e2 = rVar.c.e() != null ? rVar.c.e() : str;
                textView = rVar.f1894g;
                if (e2 != null) {
                    str = e2;
                }
            }
            textView.setText(str);
        }
    }

    public void setOnScrollChangeListener(a aVar) {
        this.b = aVar;
    }
}
