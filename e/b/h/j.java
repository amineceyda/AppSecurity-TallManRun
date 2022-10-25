package e.b.h;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import e.e.d.l.a;
import e.e.j.c;
import e.e.j.n;
import e.e.j.p;
import e.e.j.q;
import e.e.k.e;
import java.util.WeakHashMap;

public class j extends EditText implements p, n {
    public final d b;
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public final w f1156d = new w(this);

    /* renamed from: e  reason: collision with root package name */
    public final e f1157e = new e();

    public j(Context context, AttributeSet attributeSet) {
        super(u0.a(context), attributeSet, 2130968968);
        s0.a(this, getContext());
        d dVar = new d(this);
        this.b = dVar;
        dVar.d(attributeSet, 2130968968);
        x xVar = new x(this);
        this.c = xVar;
        xVar.e(attributeSet, 2130968968);
        xVar.b();
    }

    public c a(c cVar) {
        return this.f1157e.a(this, cVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f1156d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            e.b.h.w r0 = r2.f1156d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.a()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.j.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r8 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r8 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            e.b.h.x r1 = r7.c
            r1.g(r7, r0, r8)
            e.b.a.q(r0, r8, r7)
            java.util.WeakHashMap<android.view.View, java.lang.String> r1 = e.e.j.q.a
            r1 = 2131297653(0x7f090575, float:1.8213257E38)
            java.lang.Object r1 = r7.getTag(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r0 == 0) goto L_0x007f
            if (r1 == 0) goto L_0x007f
            int r2 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r2 < r5) goto L_0x0028
            r8.contentMimeTypes = r1
            goto L_0x003d
        L_0x0028:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0033
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0033:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r1)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r1)
        L_0x003d:
            e.b.h.s r1 = new e.b.h.s
            r1.<init>(r7)
            if (r8 == 0) goto L_0x0077
            r6 = 0
            if (r2 < r5) goto L_0x004e
            e.e.j.z.b r8 = new e.e.j.z.b
            r8.<init>(r0, r6, r1)
        L_0x004c:
            r0 = r8
            goto L_0x007f
        L_0x004e:
            if (r2 < r5) goto L_0x0055
            java.lang.String[] r8 = r8.contentMimeTypes
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0055:
            android.os.Bundle r2 = r8.extras
            if (r2 != 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            java.lang.String[] r2 = r2.getStringArray(r4)
            if (r2 != 0) goto L_0x0067
            android.os.Bundle r8 = r8.extras
            java.lang.String[] r8 = r8.getStringArray(r3)
            goto L_0x0068
        L_0x0067:
            r8 = r2
        L_0x0068:
            if (r8 == 0) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            java.lang.String[] r8 = e.e.j.z.a.a
        L_0x006d:
            int r8 = r8.length
            if (r8 != 0) goto L_0x0071
            goto L_0x007f
        L_0x0071:
            e.e.j.z.c r8 = new e.e.j.z.c
            r8.<init>(r0, r6, r1)
            goto L_0x004c
        L_0x0077:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "editorInfo must be non-null"
            r8.<init>(r0)
            throw r8
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.j.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    /* JADX INFO: finally extract failed */
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null) {
            WeakHashMap<View, String> weakHashMap = q.a;
            if (((String[]) getTag(2131297653)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        q.k(this, new c(new c.a(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i2) {
        int i3 = 0;
        if (i2 == 16908322 || i2 == 16908337) {
            WeakHashMap<View, String> weakHashMap = q.a;
            if (((String[]) getTag(2131297653)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                if (primaryClip != null && primaryClip.getItemCount() > 0) {
                    c.a aVar = new c.a(primaryClip, 1);
                    if (i2 != 16908322) {
                        i3 = 1;
                    }
                    aVar.c = i3;
                    q.k(this, new c(aVar));
                }
                i3 = 1;
            }
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.b;
        if (dVar != null) {
            dVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.M0(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1156d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.b = textClassifier;
        }
    }
}
