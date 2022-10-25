package f.a.a.b.u.j;

import android.text.TextUtils;
import g.a.a.a.a;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class h {
    public f a;

    public h(f fVar) {
        this.a = fVar;
    }

    public static String c(String str) {
        String str2 = File.separator;
        if (!str.contains(str2)) {
            return a.c("(?:￾)?", str, "(?:￿)?");
        }
        String[] split = str.split(str2);
        for (int i2 = 0; i2 < split.length; i2++) {
            if (split[i2].length() > 0) {
                split[i2] = a.f(a.i("(?:￾)?"), split[i2], "(?:￿)?");
            }
        }
        return TextUtils.join(File.separator, split);
    }

    public final void a(List<File> list, List<q> list2, int i2, List<File> list3) {
        if (i2 < list2.size() - 1) {
            q qVar = list2.get(i2);
            for (File next : list) {
                Objects.requireNonNull(this.a);
                if (next.isDirectory() && qVar.c(next)) {
                    list3.add(next);
                    Objects.requireNonNull(this.a);
                    a(Arrays.asList(next.listFiles((FilenameFilter) null)), list2, i2 + 1, list3);
                }
            }
        }
    }

    public final List<File> b(List<File> list, List<q> list2, int i2) {
        ArrayList arrayList = new ArrayList();
        q qVar = list2.get(i2);
        int size = list2.size() - 1;
        Iterator<File> it = list.iterator();
        if (i2 >= size) {
            while (it.hasNext()) {
                File next = it.next();
                if (qVar.c(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        while (it.hasNext()) {
            File next2 = it.next();
            Objects.requireNonNull(this.a);
            if (next2.isDirectory() && qVar.c(next2)) {
                Objects.requireNonNull(this.a);
                arrayList.addAll(b(Arrays.asList(next2.listFiles((FilenameFilter) null)), list2, i2 + 1));
            }
        }
        return arrayList;
    }

    public List<q> d(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            boolean z = str2.contains("(?:￾)?") && str2.contains("(?:￿)?");
            String replace = str2.replace("(?:￾)?", "").replace("(?:￿)?", "");
            if (z) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new o(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new s(replace));
            } else {
                arrayList2.add(replace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new o(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    public final List<String> e(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File absolutePath : list) {
            arrayList.add(absolutePath.getAbsolutePath());
        }
        return arrayList;
    }
}
