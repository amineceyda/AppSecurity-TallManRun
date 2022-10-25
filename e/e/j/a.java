package e.e.j;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e.e.j.y.b;
import e.e.j.y.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a = c;
    public final View.AccessibilityDelegate b = new C0044a(this);

    /* renamed from: e.e.j.a$a  reason: collision with other inner class name */
    public static final class C0044a extends View.AccessibilityDelegate {
        public final a a;

        public C0044a(a aVar) {
            this.a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.a.a.getAccessibilityNodeProvider(view);
            c cVar = accessibilityNodeProvider != null ? new c(accessibilityNodeProvider) : null;
            if (cVar != null) {
                return (AccessibilityNodeProvider) cVar.a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i2;
            View view2 = view;
            b bVar = new b(accessibilityNodeInfo);
            Boolean b = q.n().b(view2);
            boolean booleanValue = b == null ? false : b.booleanValue();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                bVar.a.setScreenReaderFocusable(booleanValue);
            } else {
                bVar.f(1, booleanValue);
            }
            Boolean b2 = q.a().b(view2);
            boolean booleanValue2 = b2 == null ? false : b2.booleanValue();
            if (i3 >= 28) {
                bVar.a.setHeading(booleanValue2);
            } else {
                bVar.f(2, booleanValue2);
            }
            CharSequence f2 = q.f(view);
            if (i3 >= 28) {
                bVar.a.setPaneTitle(f2);
            } else {
                bVar.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", f2);
            }
            bVar.g(q.q().b(view2));
            this.a.c(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                bVar.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(2131297645);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                ClickableSpan[] d2 = b.d(text);
                if (d2 != null && d2.length > 0) {
                    bVar.e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131296283);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(2131297645);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(2131297645, sparseArray2);
                    }
                    for (int i6 = 0; i6 < d2.length; i6++) {
                        ClickableSpan clickableSpan = d2[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i2 = b.b;
                                b.b = i2 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i2 = sparseArray2.keyAt(i7);
                                break;
                            } else {
                                i7++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(d2[i6]));
                        ClickableSpan clickableSpan2 = d2[i6];
                        Spanned spanned = (Spanned) text;
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    }
                }
            }
            List list = (List) view2.getTag(2131297644);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                bVar.a((b.a) list.get(i8));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.a.d(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.a.a.sendAccessibilityEvent(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public View.AccessibilityDelegate a() {
        return this.b;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, b bVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131297644(0x7f09056c, float:1.8213239E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000f:
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x007f
            java.lang.Object r3 = r0.get(r2)
            e.e.j.y.b$a r3 = (e.e.j.y.b.a) r3
            java.util.Objects.requireNonNull(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 21
            if (r4 < r5) goto L_0x002f
            java.lang.Object r4 = r3.a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            int r4 = r4.getId()
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            if (r4 != r10) goto L_0x007c
            e.e.j.y.d r0 = r3.c
            if (r0 == 0) goto L_0x007f
            r0 = 0
            java.lang.Class<? extends e.e.j.y.d$a> r2 = r3.b
            if (r2 == 0) goto L_0x0075
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x004f }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x004f }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x004f }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ Exception -> 0x004f }
            e.e.j.y.d$a r2 = (e.e.j.y.d.a) r2     // Catch:{ Exception -> 0x004f }
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x004d }
            goto L_0x0074
        L_0x004d:
            r0 = move-exception
            goto L_0x0053
        L_0x004f:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0053:
            java.lang.Class<? extends e.e.j.y.d$a> r4 = r3.b
            if (r4 != 0) goto L_0x005a
            java.lang.String r4 = "null"
            goto L_0x005e
        L_0x005a:
            java.lang.String r4 = r4.getName()
        L_0x005e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L_0x0074:
            r0 = r2
        L_0x0075:
            e.e.j.y.d r2 = r3.c
            boolean r0 = r2.a(r9, r0)
            goto L_0x0080
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x007f:
            r0 = 0
        L_0x0080:
            if (r0 != 0) goto L_0x0088
            android.view.View$AccessibilityDelegate r0 = r8.a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L_0x0088:
            if (r0 != 0) goto L_0x00d9
            r2 = 2131296283(0x7f09001b, float:1.8210478E38)
            if (r10 != r2) goto L_0x00d9
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131297645(0x7f09056d, float:1.821324E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto L_0x00d8
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L_0x00d8
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto L_0x00d1
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = e.e.j.y.b.d(r11)
            r2 = 0
        L_0x00bf:
            if (r11 == 0) goto L_0x00d1
            int r3 = r11.length
            if (r2 >= r3) goto L_0x00d1
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00ce
            r11 = 1
            goto L_0x00d2
        L_0x00ce:
            int r2 = r2 + 1
            goto L_0x00bf
        L_0x00d1:
            r11 = 0
        L_0x00d2:
            if (r11 == 0) goto L_0x00d8
            r10.onClick(r9)
            r1 = 1
        L_0x00d8:
            r0 = r1
        L_0x00d9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.j.a.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
