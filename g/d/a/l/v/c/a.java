package g.d.a.l.v.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import g.d.a.l.n;
import g.d.a.l.p;
import g.d.a.l.t.v;
import java.io.IOException;

public class a<DataType> implements p<DataType, BitmapDrawable> {
    public final p<DataType, Bitmap> a;
    public final Resources b;

    public a(Resources resources, p<DataType, Bitmap> pVar) {
        this.b = resources;
        this.a = pVar;
    }

    public v<BitmapDrawable> a(DataType datatype, int i2, int i3, n nVar) throws IOException {
        return t.e(this.b, this.a.a(datatype, i2, i3, nVar));
    }

    public boolean b(DataType datatype, n nVar) throws IOException {
        return this.a.b(datatype, nVar);
    }
}
