package e.e.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

public class a implements Spannable {

    /* renamed from: e.e.h.a$a  reason: collision with other inner class name */
    public static final class C0043a {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1328d;

        public C0043a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.f1328d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }

        @SuppressLint({"NewApi"})
        public C0043a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i2;
            this.f1328d = i3;
        }

        public boolean a(C0043a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.c != aVar.c || this.f1328d != aVar.f1328d)) || this.a.getTextSize() != aVar.a.getTextSize() || this.a.getTextScaleX() != aVar.a.getTextScaleX() || this.a.getTextSkewX() != aVar.a.getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.a.getLetterSpacing() != aVar.a.getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.a.getFontFeatureSettings()))) || this.a.getFlags() != aVar.a.getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.a.getTextLocales())) {
                    return false;
                }
            } else if (!this.a.getTextLocale().equals(aVar.a.getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(aVar.a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0043a)) {
                return false;
            }
            C0043a aVar = (C0043a) obj;
            return a(aVar) && this.b == aVar.b;
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return Objects.hash(new Object[]{Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f1328d)});
            } else if (i2 >= 21) {
                return Objects.hash(new Object[]{Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f1328d)});
            } else {
                return Objects.hash(new Object[]{Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f1328d)});
            }
        }

        public String toString() {
            Object obj;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder i2 = g.a.a.a.a.i("textSize=");
            i2.append(this.a.getTextSize());
            sb2.append(i2.toString());
            sb2.append(", textScaleX=" + this.a.getTextScaleX());
            sb2.append(", textSkewX=" + this.a.getTextSkewX());
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 21) {
                StringBuilder i4 = g.a.a.a.a.i(", letterSpacing=");
                i4.append(this.a.getLetterSpacing());
                sb2.append(i4.toString());
                sb2.append(", elegantTextHeight=" + this.a.isElegantTextHeight());
            }
            if (i3 >= 24) {
                sb = g.a.a.a.a.i(", textLocale=");
                obj = this.a.getTextLocales();
            } else {
                sb = g.a.a.a.a.i(", textLocale=");
                obj = this.a.getTextLocale();
            }
            sb.append(obj);
            sb2.append(sb.toString());
            StringBuilder i5 = g.a.a.a.a.i(", typeface=");
            i5.append(this.a.getTypeface());
            sb2.append(i5.toString());
            if (i3 >= 26) {
                StringBuilder i6 = g.a.a.a.a.i(", variationSettings=");
                i6.append(this.a.getFontVariationSettings());
                sb2.append(i6.toString());
            }
            StringBuilder i7 = g.a.a.a.a.i(", textDir=");
            i7.append(this.b);
            sb2.append(i7.toString());
            sb2.append(", breakStrategy=" + this.c);
            sb2.append(", hyphenationFrequency=" + this.f1328d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public char charAt(int i2) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        throw null;
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i2 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (!(obj instanceof MetricAffectingSpan)) {
            int i5 = Build.VERSION.SDK_INT;
            throw null;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int i2, int i3) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
