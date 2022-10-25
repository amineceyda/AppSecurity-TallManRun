package g.e.a.b.e.c;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

public final class i implements p {
    public final Double b;

    public i(Double d2) {
        if (d2 == null) {
            this.b = Double.valueOf(Double.NaN);
        } else {
            this.b = d2;
        }
    }

    public final Double d() {
        return this.b;
    }

    public final String e() {
        if (Double.isNaN(this.b.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.b.doubleValue())) {
            return this.b.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.b.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.b.equals(((i) obj).b);
    }

    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final p i(String str, h4 h4Var, List list) {
        if ("toString".equals(str)) {
            return new t(e());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{e(), str}));
    }

    public final p l() {
        return new i(this.b);
    }

    public final Boolean m() {
        boolean z = false;
        if (!Double.isNaN(this.b.doubleValue()) && this.b.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final String toString() {
        return e();
    }
}
