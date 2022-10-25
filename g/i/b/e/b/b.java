package g.i.b.e.b;

import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.h.a.a;
import g.i.b.e.h.e;

public final class b {
    public int a = -1;
    public String b = "";
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public byte f4097d;

    public b() {
    }

    public b(String str) {
        this.b = str;
        this.c = -1;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("[")) {
            String[] split = str.split(Constants.KEY_INDEX_FILE_SEPARATOR);
            if (split.length != 2) {
                return false;
            }
            String str2 = split[0];
            this.b = str2;
            if (!e.h(str2)) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(split[1]);
                this.c = parseInt;
                if (parseInt < 0 || parseInt > 65535) {
                    return false;
                }
                return true;
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                return false;
            }
        } else if (!str.contains("]")) {
            return false;
        } else {
            String[] split2 = str.split("]");
            if (split2.length != 2 || !split2[1].startsWith(Constants.KEY_INDEX_FILE_SEPARATOR)) {
                return false;
            }
            String substring = split2[0].substring(1);
            if (!a.r(substring)) {
                return false;
            }
            try {
                int parseInt2 = Integer.parseInt(split2[1].substring(1));
                if (parseInt2 < 0 || parseInt2 > 65535) {
                    return false;
                }
                this.b = "[" + substring + "]";
                this.c = parseInt2;
                return true;
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                return false;
            }
        }
    }

    public final boolean b() {
        if (!TextUtils.isEmpty(this.b) && this.b.charAt(0) == '[') {
            String str = this.b;
            if (str.charAt(str.length() - 1) == ']') {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.b + Constants.KEY_INDEX_FILE_SEPARATOR + this.c + ",protocalType:" + 1 + ",ipType:" + this.f4097d;
    }
}
