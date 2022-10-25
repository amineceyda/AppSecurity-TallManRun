package e.a.e.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

public abstract class a<I, O> {

    /* renamed from: e.a.e.f.a$a  reason: collision with other inner class name */
    public static final class C0031a<T> {
        @SuppressLint({"UnknownNullness"})
        public final T a;

        public C0031a(@SuppressLint({"UnknownNullness"}) T t) {
            this.a = t;
        }
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i2);

    public C0031a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i2) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i2, Intent intent);
}
