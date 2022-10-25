package e.b.c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.util.Objects;

public class g extends r implements DialogInterface {

    /* renamed from: d  reason: collision with root package name */
    public final AlertController f941d = new AlertController(getContext(), this, getWindow());

    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context) {
            int f2 = g.f(context, 0);
            this.a = new AlertController.b(new ContextThemeWrapper(context, g.f(context, f2)));
            this.b = f2;
        }

        public a(Context context, int i2) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, g.f(context, i2)));
            this.b = i2;
        }

        public g a() {
            g gVar = new g(this.a.a, this.b);
            AlertController.b bVar = this.a;
            AlertController alertController = gVar.f941d;
            View view = bVar.f36e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f35d;
                if (charSequence != null) {
                    alertController.f26e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f37f;
            if (charSequence2 != null) {
                alertController.f27f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f38g;
            if (charSequence3 != null) {
                alertController.e(-1, charSequence3, bVar.f39h, (Message) null, (Drawable) null);
            }
            CharSequence charSequence4 = bVar.f40i;
            if (charSequence4 != null) {
                alertController.e(-2, charSequence4, bVar.f41j, (Message) null, (Drawable) null);
            }
            CharSequence charSequence5 = bVar.f42k;
            if (charSequence5 != null) {
                alertController.e(-3, charSequence5, bVar.f43l, (Message) null, (Drawable) null);
            }
            if (bVar.p != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
                int i2 = bVar.s ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar.p;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.a, i2, 16908308, (CharSequence[]) null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.t;
                if (bVar.q != null) {
                    recycleListView.setOnItemClickListener(new f(bVar, alertController));
                }
                if (bVar.s) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f28g = recycleListView;
            }
            View view2 = bVar.r;
            if (view2 != null) {
                alertController.f29h = view2;
                alertController.f30i = 0;
                alertController.n = false;
            }
            Objects.requireNonNull(this.a);
            gVar.setCancelable(true);
            Objects.requireNonNull(this.a);
            gVar.setCanceledOnTouchOutside(true);
            gVar.setOnCancelListener(this.a.f44m);
            gVar.setOnDismissListener(this.a.n);
            DialogInterface.OnKeyListener onKeyListener = this.a.o;
            if (onKeyListener != null) {
                gVar.setOnKeyListener(onKeyListener);
            }
            return gVar;
        }

        public a b(int i2) {
            AlertController.b bVar = this.a;
            bVar.f37f = bVar.a.getText(i2);
            return this;
        }

        public a c(DialogInterface.OnKeyListener onKeyListener) {
            this.a.o = onKeyListener;
            return this;
        }

        public a d(int i2) {
            AlertController.b bVar = this.a;
            bVar.f35d = bVar.a.getText(i2);
            return this;
        }

        public g e() {
            g a2 = a();
            a2.show();
            return a2;
        }
    }

    public g(Context context, int i2) {
        super(context, f(context, i2));
    }

    public static int f(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968623, typedValue, true);
        return typedValue.resourceId;
    }

    public Button c(int i2) {
        AlertController alertController = this.f941d;
        Objects.requireNonNull(alertController);
        if (i2 == -3) {
            return alertController.w;
        }
        if (i2 == -2) {
            return alertController.s;
        }
        if (i2 != -1) {
            return null;
        }
        return alertController.o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e4, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ee, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0353, code lost:
        if (r7 != null) goto L_0x03a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            androidx.appcompat.app.AlertController r1 = r0.f941d
            int r2 = r1.K
            int r2 = r1.J
            e.b.c.r r3 = r1.b
            r3.setContentView((int) r2)
            android.view.Window r2 = r1.c
            r3 = 2131297261(0x7f0903ed, float:1.8212462E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2131297709(0x7f0905ad, float:1.821337E38)
            android.view.View r4 = r2.findViewById(r3)
            r5 = 2131296677(0x7f0901a5, float:1.8211277E38)
            android.view.View r6 = r2.findViewById(r5)
            r7 = 2131296517(0x7f090105, float:1.8210953E38)
            android.view.View r8 = r2.findViewById(r7)
            r9 = 2131296703(0x7f0901bf, float:1.821133E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r9 = r1.f29h
            r11 = 0
            if (r9 == 0) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            int r9 = r1.f30i
            if (r9 == 0) goto L_0x004e
            android.content.Context r9 = r1.a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r12 = r1.f30i
            android.view.View r9 = r9.inflate(r12, r2, r11)
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            if (r13 == 0) goto L_0x005c
            boolean r14 = androidx.appcompat.app.AlertController.a(r9)
            if (r14 != 0) goto L_0x0063
        L_0x005c:
            android.view.Window r14 = r1.c
            r15 = 131072(0x20000, float:1.83671E-40)
            r14.setFlags(r15, r15)
        L_0x0063:
            r14 = -1
            r15 = 8
            if (r13 == 0) goto L_0x0098
            android.view.Window r13 = r1.c
            r12 = 2131296702(0x7f0901be, float:1.8211328E38)
            android.view.View r12 = r13.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r14, r14)
            r12.addView(r9, r13)
            boolean r9 = r1.n
            if (r9 == 0) goto L_0x008a
            int r9 = r1.f31j
            int r13 = r1.f32k
            int r10 = r1.f33l
            int r14 = r1.f34m
            r12.setPadding(r9, r13, r10, r14)
        L_0x008a:
            android.widget.ListView r9 = r1.f28g
            if (r9 == 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            e.b.h.i0$a r9 = (e.b.h.i0.a) r9
            r10 = 0
            r9.weight = r10
            goto L_0x009b
        L_0x0098:
            r2.setVisibility(r15)
        L_0x009b:
            android.view.View r3 = r2.findViewById(r3)
            android.view.View r5 = r2.findViewById(r5)
            android.view.View r7 = r2.findViewById(r7)
            android.view.ViewGroup r3 = r1.d(r3, r4)
            android.view.ViewGroup r4 = r1.d(r5, r6)
            android.view.ViewGroup r5 = r1.d(r7, r8)
            android.view.Window r6 = r1.c
            r7 = 2131297490(0x7f0904d2, float:1.8212926E38)
            android.view.View r6 = r6.findViewById(r7)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r1.A = r6
            r6.setFocusable(r11)
            androidx.core.widget.NestedScrollView r6 = r1.A
            r6.setNestedScrollingEnabled(r11)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.F = r6
            if (r6 != 0) goto L_0x00d6
            goto L_0x010c
        L_0x00d6:
            java.lang.CharSequence r7 = r1.f27f
            if (r7 == 0) goto L_0x00de
            r6.setText(r7)
            goto L_0x010c
        L_0x00de:
            r6.setVisibility(r15)
            androidx.core.widget.NestedScrollView r6 = r1.A
            android.widget.TextView r7 = r1.F
            r6.removeView(r7)
            android.widget.ListView r6 = r1.f28g
            if (r6 == 0) goto L_0x0109
            androidx.core.widget.NestedScrollView r6 = r1.A
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.core.widget.NestedScrollView r7 = r1.A
            int r7 = r6.indexOfChild(r7)
            r6.removeViewAt(r7)
            android.widget.ListView r8 = r1.f28g
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r6.addView(r8, r7, r9)
            goto L_0x010c
        L_0x0109:
            r4.setVisibility(r15)
        L_0x010c:
            r6 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1.o = r6
            android.view.View$OnClickListener r7 = r1.R
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r1.p
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x012f
            android.graphics.drawable.Drawable r6 = r1.r
            if (r6 != 0) goto L_0x012f
            android.widget.Button r6 = r1.o
            r6.setVisibility(r15)
            r6 = 0
            goto L_0x014d
        L_0x012f:
            android.widget.Button r6 = r1.o
            java.lang.CharSequence r7 = r1.p
            r6.setText(r7)
            android.graphics.drawable.Drawable r6 = r1.r
            if (r6 == 0) goto L_0x0147
            int r7 = r1.f25d
            r6.setBounds(r11, r11, r7, r7)
            android.widget.Button r6 = r1.o
            android.graphics.drawable.Drawable r7 = r1.r
            r8 = 0
            r6.setCompoundDrawables(r7, r8, r8, r8)
        L_0x0147:
            android.widget.Button r6 = r1.o
            r6.setVisibility(r11)
            r6 = 1
        L_0x014d:
            r7 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.s = r7
            android.view.View$OnClickListener r8 = r1.R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.t
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x016f
            android.graphics.drawable.Drawable r7 = r1.v
            if (r7 != 0) goto L_0x016f
            android.widget.Button r7 = r1.s
            r7.setVisibility(r15)
            goto L_0x018e
        L_0x016f:
            android.widget.Button r7 = r1.s
            java.lang.CharSequence r8 = r1.t
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.v
            if (r7 == 0) goto L_0x0187
            int r8 = r1.f25d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.s
            android.graphics.drawable.Drawable r8 = r1.v
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
        L_0x0187:
            android.widget.Button r7 = r1.s
            r7.setVisibility(r11)
            r6 = r6 | 2
        L_0x018e:
            r7 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.w = r7
            android.view.View$OnClickListener r8 = r1.R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.x
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x01b1
            android.graphics.drawable.Drawable r7 = r1.z
            if (r7 != 0) goto L_0x01b1
            android.widget.Button r7 = r1.w
            r7.setVisibility(r15)
            r9 = 0
            goto L_0x01d2
        L_0x01b1:
            android.widget.Button r7 = r1.w
            java.lang.CharSequence r8 = r1.x
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.z
            if (r7 == 0) goto L_0x01ca
            int r8 = r1.f25d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.w
            android.graphics.drawable.Drawable r8 = r1.z
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
            goto L_0x01cb
        L_0x01ca:
            r9 = 0
        L_0x01cb:
            android.widget.Button r7 = r1.w
            r7.setVisibility(r11)
            r6 = r6 | 4
        L_0x01d2:
            android.content.Context r7 = r1.a
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r7 = r7.getTheme()
            r10 = 2130968621(0x7f04002d, float:1.75459E38)
            r12 = 1
            r7.resolveAttribute(r10, r8, r12)
            int r7 = r8.data
            if (r7 == 0) goto L_0x01ea
            r7 = 1
            goto L_0x01eb
        L_0x01ea:
            r7 = 0
        L_0x01eb:
            r8 = 2
            if (r7 == 0) goto L_0x0200
            if (r6 != r12) goto L_0x01f3
            android.widget.Button r7 = r1.o
            goto L_0x01fd
        L_0x01f3:
            if (r6 != r8) goto L_0x01f8
            android.widget.Button r7 = r1.s
            goto L_0x01fd
        L_0x01f8:
            r7 = 4
            if (r6 != r7) goto L_0x0200
            android.widget.Button r7 = r1.w
        L_0x01fd:
            r1.b(r7)
        L_0x0200:
            if (r6 == 0) goto L_0x0204
            r6 = 1
            goto L_0x0205
        L_0x0204:
            r6 = 0
        L_0x0205:
            if (r6 != 0) goto L_0x020a
            r5.setVisibility(r15)
        L_0x020a:
            android.view.View r6 = r1.G
            r7 = 2131297699(0x7f0905a3, float:1.821335E38)
            if (r6 == 0) goto L_0x0228
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r12 = -1
            r6.<init>(r12, r10)
            android.view.View r10 = r1.G
            r3.addView(r10, r11, r6)
            android.view.Window r6 = r1.c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            goto L_0x029d
        L_0x0228:
            android.view.Window r6 = r1.c
            r10 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.D = r6
            java.lang.CharSequence r6 = r1.f26e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r10 = 1
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x028c
            boolean r6 = r1.P
            if (r6 == 0) goto L_0x028c
            android.view.Window r6 = r1.c
            r7 = 2131296391(0x7f090087, float:1.8210697E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.E = r6
            java.lang.CharSequence r7 = r1.f26e
            r6.setText(r7)
            int r6 = r1.B
            if (r6 == 0) goto L_0x025f
            android.widget.ImageView r7 = r1.D
            r7.setImageResource(r6)
            goto L_0x029d
        L_0x025f:
            android.graphics.drawable.Drawable r6 = r1.C
            if (r6 == 0) goto L_0x0269
            android.widget.ImageView r7 = r1.D
            r7.setImageDrawable(r6)
            goto L_0x029d
        L_0x0269:
            android.widget.TextView r6 = r1.E
            android.widget.ImageView r7 = r1.D
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r10 = r1.D
            int r10 = r10.getPaddingTop()
            android.widget.ImageView r12 = r1.D
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r1.D
            int r13 = r13.getPaddingBottom()
            r6.setPadding(r7, r10, r12, r13)
            android.widget.ImageView r6 = r1.D
            r6.setVisibility(r15)
            goto L_0x029d
        L_0x028c:
            android.view.Window r6 = r1.c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r1.D
            r6.setVisibility(r15)
            r3.setVisibility(r15)
        L_0x029d:
            int r2 = r2.getVisibility()
            if (r2 == r15) goto L_0x02a5
            r12 = 1
            goto L_0x02a6
        L_0x02a5:
            r12 = 0
        L_0x02a6:
            if (r3 == 0) goto L_0x02b0
            int r2 = r3.getVisibility()
            if (r2 == r15) goto L_0x02b0
            r2 = 1
            goto L_0x02b1
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            int r5 = r5.getVisibility()
            if (r5 == r15) goto L_0x02b9
            r5 = 1
            goto L_0x02ba
        L_0x02b9:
            r5 = 0
        L_0x02ba:
            if (r5 != 0) goto L_0x02c8
            r6 = 2131297669(0x7f090585, float:1.821329E38)
            android.view.View r6 = r4.findViewById(r6)
            if (r6 == 0) goto L_0x02c8
            r6.setVisibility(r11)
        L_0x02c8:
            if (r2 == 0) goto L_0x02e7
            androidx.core.widget.NestedScrollView r6 = r1.A
            if (r6 == 0) goto L_0x02d2
            r7 = 1
            r6.setClipToPadding(r7)
        L_0x02d2:
            java.lang.CharSequence r6 = r1.f27f
            if (r6 != 0) goto L_0x02dd
            android.widget.ListView r6 = r1.f28g
            if (r6 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r3 = r9
            goto L_0x02e4
        L_0x02dd:
            r6 = 2131297690(0x7f09059a, float:1.8213332E38)
            android.view.View r3 = r3.findViewById(r6)
        L_0x02e4:
            if (r3 == 0) goto L_0x02f3
            goto L_0x02f0
        L_0x02e7:
            r3 = 2131297670(0x7f090586, float:1.8213291E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L_0x02f3
        L_0x02f0:
            r3.setVisibility(r11)
        L_0x02f3:
            android.widget.ListView r3 = r1.f28g
            boolean r6 = r3 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r6 == 0) goto L_0x031f
            androidx.appcompat.app.AlertController$RecycleListView r3 = (androidx.appcompat.app.AlertController.RecycleListView) r3
            java.util.Objects.requireNonNull(r3)
            if (r5 == 0) goto L_0x0302
            if (r2 != 0) goto L_0x031f
        L_0x0302:
            int r6 = r3.getPaddingLeft()
            if (r2 == 0) goto L_0x030d
            int r7 = r3.getPaddingTop()
            goto L_0x030f
        L_0x030d:
            int r7 = r3.b
        L_0x030f:
            int r10 = r3.getPaddingRight()
            if (r5 == 0) goto L_0x031a
            int r13 = r3.getPaddingBottom()
            goto L_0x031c
        L_0x031a:
            int r13 = r3.c
        L_0x031c:
            r3.setPadding(r6, r7, r10, r13)
        L_0x031f:
            if (r12 != 0) goto L_0x03aa
            android.widget.ListView r3 = r1.f28g
            if (r3 == 0) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            androidx.core.widget.NestedScrollView r3 = r1.A
        L_0x0328:
            if (r3 == 0) goto L_0x03aa
            if (r5 == 0) goto L_0x032d
            r11 = 2
        L_0x032d:
            r2 = r2 | r11
            r5 = 3
            android.view.Window r6 = r1.c
            r7 = 2131297489(0x7f0904d1, float:1.8212924E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.Window r7 = r1.c
            r10 = 2131297488(0x7f0904d0, float:1.8212922E38)
            android.view.View r7 = r7.findViewById(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r10 < r11) goto L_0x0356
            java.util.WeakHashMap<android.view.View, java.lang.String> r8 = e.e.j.q.a
            if (r10 < r11) goto L_0x034e
            r3.setScrollIndicators(r2, r5)
        L_0x034e:
            if (r6 == 0) goto L_0x0353
            r4.removeView(r6)
        L_0x0353:
            if (r7 == 0) goto L_0x03aa
            goto L_0x03a7
        L_0x0356:
            if (r6 == 0) goto L_0x0360
            r3 = r2 & 1
            if (r3 != 0) goto L_0x0360
            r4.removeView(r6)
            r6 = r9
        L_0x0360:
            if (r7 == 0) goto L_0x036a
            r2 = r2 & r8
            if (r2 != 0) goto L_0x036a
            r4.removeView(r7)
            r10 = r9
            goto L_0x036b
        L_0x036a:
            r10 = r7
        L_0x036b:
            if (r6 != 0) goto L_0x036f
            if (r10 == 0) goto L_0x03aa
        L_0x036f:
            java.lang.CharSequence r2 = r1.f27f
            if (r2 == 0) goto L_0x0388
            androidx.core.widget.NestedScrollView r2 = r1.A
            e.b.c.b r3 = new e.b.c.b
            r3.<init>(r1, r6, r10)
            r2.setOnScrollChangeListener(r3)
            androidx.core.widget.NestedScrollView r2 = r1.A
            e.b.c.c r3 = new e.b.c.c
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L_0x03aa
        L_0x0388:
            android.widget.ListView r2 = r1.f28g
            if (r2 == 0) goto L_0x039f
            e.b.c.d r3 = new e.b.c.d
            r3.<init>(r1, r6, r10)
            r2.setOnScrollListener(r3)
            android.widget.ListView r2 = r1.f28g
            e.b.c.e r3 = new e.b.c.e
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L_0x03aa
        L_0x039f:
            if (r6 == 0) goto L_0x03a4
            r4.removeView(r6)
        L_0x03a4:
            if (r10 == 0) goto L_0x03aa
            r7 = r10
        L_0x03a7:
            r4.removeView(r7)
        L_0x03aa:
            android.widget.ListView r2 = r1.f28g
            if (r2 == 0) goto L_0x03c1
            android.widget.ListAdapter r3 = r1.H
            if (r3 == 0) goto L_0x03c1
            r2.setAdapter(r3)
            int r1 = r1.I
            r3 = -1
            if (r1 <= r3) goto L_0x03c1
            r3 = 1
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x03c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.c.g.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f941d.A;
        if (nestedScrollView != null && nestedScrollView.k(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f941d.A;
        if (nestedScrollView != null && nestedScrollView.k(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f941d;
        alertController.f26e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
