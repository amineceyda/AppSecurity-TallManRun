package e.e.g;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class d {
    public static final Comparator<byte[]> a = new a();

    public class a implements Comparator<byte[]> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                r2 = 0
                if (r0 == r1) goto L_0x000c
                int r5 = r5.length
                int r6 = r6.length
                goto L_0x001a
            L_0x000c:
                r0 = 0
            L_0x000d:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x0020
                byte r1 = r5[r0]
                byte r3 = r6[r0]
                if (r1 == r3) goto L_0x001d
                byte r5 = r5[r0]
                byte r6 = r6[r0]
            L_0x001a:
                int r2 = r5 - r6
                goto L_0x0020
            L_0x001d:
                int r0 = r0 + 1
                goto L_0x000d
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: e.e.g.d.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [e.e.g.l[], android.database.Cursor] */
    public static k a(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        boolean z;
        e eVar2 = eVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar2.a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(g.a.a.a.a.w("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(eVar2.b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, a);
            List<List<byte[]>> list = eVar2.f1320d;
            if (list == null) {
                list = e.b.a.s(resources, 0);
            }
            int i2 = 0;
            while (true) {
                cursor = 0;
                if (i2 >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i2));
                Collections.sort(arrayList2, a);
                if (arrayList.size() == arrayList2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i2++;
            }
            if (resolveContentProvider == null) {
                return new k(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar2.c}, (String) null, (CancellationSignal) null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        arrayList3.add(new l(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                    }
                }
                return new k(0, (l[]) arrayList3.toArray(new l[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            StringBuilder n = g.a.a.a.a.n("Found content provider ", str, ", but package was not ");
            n.append(eVar2.b);
            throw new PackageManager.NameNotFoundException(n.toString());
        }
    }
}
