package e.q.a.a;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import e.e.c.c.h;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

public class c {

    public static class a implements TypeEvaluator<e.e.d.c[]> {
        public e.e.d.c[] a;

        public Object evaluate(float f2, Object obj, Object obj2) {
            e.e.d.c[] cVarArr = (e.e.d.c[]) obj;
            e.e.d.c[] cVarArr2 = (e.e.d.c[]) obj2;
            if (e.b.a.a(cVarArr, cVarArr2)) {
                if (!e.b.a.a(this.a, cVarArr)) {
                    this.a = e.b.a.j(cVarArr);
                }
                for (int i2 = 0; i2 < cVarArr.length; i2++) {
                    e.e.d.c cVar = this.a[i2];
                    e.e.d.c cVar2 = cVarArr[i2];
                    e.e.d.c cVar3 = cVarArr2[i2];
                    Objects.requireNonNull(cVar);
                    cVar.a = cVar2.a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = cVar2.b;
                        if (i3 >= fArr.length) {
                            break;
                        }
                        cVar.b[i3] = (cVar3.b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                        i3++;
                    }
                }
                return this.a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x030f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r26
            int r12 = r24.getDepth()
            r0 = 0
            r1 = 0
            r13 = r1
        L_0x000f:
            int r1 = r24.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001d
            int r3 = r24.getDepth()
            if (r3 <= r12) goto L_0x034a
        L_0x001d:
            r3 = 1
            if (r1 == r3) goto L_0x034a
            r4 = 2
            if (r1 == r4) goto L_0x0024
            goto L_0x000f
        L_0x0024:
            java.lang.String r1 = r24.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0048
            android.animation.ObjectAnimator r7 = new android.animation.ObjectAnimator
            r7.<init>()
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = r7
            r5 = r28
            r6 = r24
            e(r0, r1, r2, r3, r4, r5, r6)
            r0 = r7
            goto L_0x031d
        L_0x0048:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0063
            r4 = 0
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r5 = r28
            r6 = r24
            android.animation.ValueAnimator r0 = e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x031d
        L_0x0063:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00a4
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = e.q.a.a.a.f1545h
            r7 = r25
            android.content.res.TypedArray r6 = e.e.c.c.h.e(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            boolean r0 = e.e.c.c.h.d(r10, r0)
            if (r0 != 0) goto L_0x0084
            r0 = 0
            r16 = 0
            goto L_0x008a
        L_0x0084:
            int r0 = r6.getInt(r14, r14)
            r16 = r0
        L_0x008a:
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r28
            a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r0 = r15
            goto L_0x031d
        L_0x00a4:
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0333
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r24)
            r6 = 0
        L_0x00b1:
            int r7 = r24.getEventType()
            if (r7 == r2) goto L_0x02f9
            if (r7 == r3) goto L_0x02f9
            if (r7 == r4) goto L_0x00bf
            r24.next()
            goto L_0x00b1
        L_0x00bf:
            java.lang.String r7 = r24.getName()
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x02e5
            int[] r3 = e.q.a.a.a.f1546i
            android.content.res.TypedArray r3 = e.e.c.c.h.e(r8, r9, r1, r3)
            java.lang.String r7 = "propertyName"
            java.lang.String r7 = e.e.c.c.h.c(r3, r10, r7, r2)
            java.lang.String r14 = "valueType"
            boolean r14 = e.e.c.c.h.d(r10, r14)
            r15 = 4
            if (r14 != 0) goto L_0x00e0
            r4 = 4
            goto L_0x00e4
        L_0x00e0:
            int r4 = r3.getInt(r4, r15)
        L_0x00e4:
            r14 = 0
            r16 = r1
            r15 = r4
        L_0x00e8:
            int r1 = r24.next()
            if (r1 == r2) goto L_0x01f0
            r17 = r2
            r2 = 1
            if (r1 == r2) goto L_0x01f0
            java.lang.String r1 = r24.getName()
            java.lang.String r2 = "keyframe"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x01e6
            java.lang.String r1 = "value"
            r2 = 4
            if (r15 != r2) goto L_0x0132
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r24)
            int[] r15 = e.q.a.a.a.f1547j
            android.content.res.TypedArray r2 = e.e.c.c.h.e(r8, r9, r2, r15)
            boolean r15 = e.e.c.c.h.d(r10, r1)
            if (r15 != 0) goto L_0x0116
            r15 = 0
            goto L_0x011b
        L_0x0116:
            r15 = 0
            android.util.TypedValue r15 = r2.peekValue(r15)
        L_0x011b:
            if (r15 == 0) goto L_0x0120
            r17 = 1
            goto L_0x0122
        L_0x0120:
            r17 = 0
        L_0x0122:
            if (r17 == 0) goto L_0x012e
            int r15 = r15.type
            boolean r15 = d(r15)
            if (r15 == 0) goto L_0x012e
            r15 = 3
            goto L_0x012f
        L_0x012e:
            r15 = 0
        L_0x012f:
            r2.recycle()
        L_0x0132:
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r24)
            r18 = r5
            int[] r5 = e.q.a.a.a.f1547j
            android.content.res.TypedArray r2 = e.e.c.c.h.e(r8, r9, r2, r5)
            java.lang.String r5 = "fraction"
            boolean r5 = e.e.c.c.h.d(r10, r5)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 != 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            r5 = 3
            float r8 = r2.getFloat(r5, r8)
        L_0x014e:
            boolean r5 = e.e.c.c.h.d(r10, r1)
            if (r5 != 0) goto L_0x0156
            r5 = 0
            goto L_0x015b
        L_0x0156:
            r5 = 0
            android.util.TypedValue r5 = r2.peekValue(r5)
        L_0x015b:
            r9 = 4
            if (r5 == 0) goto L_0x0161
            r17 = 1
            goto L_0x0163
        L_0x0161:
            r17 = 0
        L_0x0163:
            if (r15 != r9) goto L_0x0173
            if (r17 == 0) goto L_0x0171
            int r5 = r5.type
            boolean r5 = d(r5)
            if (r5 == 0) goto L_0x0171
            r5 = 3
            goto L_0x0174
        L_0x0171:
            r5 = 0
            goto L_0x0174
        L_0x0173:
            r5 = r15
        L_0x0174:
            if (r17 == 0) goto L_0x01a5
            if (r5 == 0) goto L_0x0192
            r9 = 1
            if (r5 == r9) goto L_0x0180
            r9 = 3
            if (r5 == r9) goto L_0x0180
            r1 = 0
            goto L_0x01b0
        L_0x0180:
            boolean r1 = e.e.c.c.h.d(r10, r1)
            if (r1 != 0) goto L_0x0188
            r1 = 0
            goto L_0x018d
        L_0x0188:
            r1 = 0
            int r1 = r2.getInt(r1, r1)
        L_0x018d:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r8, r1)
            goto L_0x01b0
        L_0x0192:
            r5 = 0
            boolean r1 = e.e.c.c.h.d(r10, r1)
            if (r1 != 0) goto L_0x019b
            r1 = 0
            goto L_0x01a0
        L_0x019b:
            r1 = 0
            float r1 = r2.getFloat(r5, r1)
        L_0x01a0:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r8, r1)
            goto L_0x01b0
        L_0x01a5:
            if (r5 != 0) goto L_0x01ac
            android.animation.Keyframe r1 = android.animation.Keyframe.ofFloat(r8)
            goto L_0x01b0
        L_0x01ac:
            android.animation.Keyframe r1 = android.animation.Keyframe.ofInt(r8)
        L_0x01b0:
            java.lang.String r5 = "interpolator"
            boolean r5 = e.e.c.c.h.d(r10, r5)
            if (r5 != 0) goto L_0x01ba
            r5 = 0
            goto L_0x01c0
        L_0x01ba:
            r5 = 1
            r8 = 0
            int r5 = r2.getResourceId(r5, r8)
        L_0x01c0:
            r8 = r21
            if (r5 <= 0) goto L_0x01cb
            android.view.animation.Interpolator r5 = e.e.d.l.a.b0(r8, r5)
            r1.setInterpolator(r5)
        L_0x01cb:
            r2.recycle()
            if (r1 == 0) goto L_0x01da
            if (r14 != 0) goto L_0x01d7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x01d7:
            r14.add(r1)
        L_0x01da:
            r24.next()
            r2 = 3
            r8 = r22
            r9 = r23
            r5 = r18
            goto L_0x00e8
        L_0x01e6:
            r8 = r21
            r8 = r22
            r9 = r23
            r2 = r17
            goto L_0x00e8
        L_0x01f0:
            r8 = r21
            r18 = r5
            if (r14 == 0) goto L_0x02c9
            int r1 = r14.size()
            if (r1 <= 0) goto L_0x02c9
            r2 = 0
            java.lang.Object r2 = r14.get(r2)
            android.animation.Keyframe r2 = (android.animation.Keyframe) r2
            int r5 = r1 + -1
            java.lang.Object r5 = r14.get(r5)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            float r9 = r5.getFraction()
            r8 = 1065353216(0x3f800000, float:1.0)
            int r17 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r17 >= 0) goto L_0x022c
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x021f
            r5.setFraction(r8)
            goto L_0x022c
        L_0x021f:
            int r9 = r14.size()
            android.animation.Keyframe r5 = b(r5, r8)
            r14.add(r9, r5)
            int r1 = r1 + 1
        L_0x022c:
            float r5 = r2.getFraction()
            r8 = 0
            int r9 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x0247
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x023d
            r2.setFraction(r8)
            goto L_0x0247
        L_0x023d:
            android.animation.Keyframe r2 = b(r2, r8)
            r5 = 0
            r14.add(r5, r2)
            int r1 = r1 + 1
        L_0x0247:
            android.animation.Keyframe[] r2 = new android.animation.Keyframe[r1]
            r14.toArray(r2)
            r5 = 0
        L_0x024d:
            if (r5 >= r1) goto L_0x02bc
            r8 = r2[r5]
            float r9 = r8.getFraction()
            r14 = 0
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 >= 0) goto L_0x02b3
            if (r5 != 0) goto L_0x0260
        L_0x025c:
            r8.setFraction(r14)
            goto L_0x02b3
        L_0x0260:
            int r9 = r1 + -1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r9) goto L_0x0267
            goto L_0x025c
        L_0x0267:
            int r8 = r5 + 1
            r14 = r5
        L_0x026a:
            if (r8 >= r9) goto L_0x0281
            r17 = r2[r8]
            float r17 = r17.getFraction()
            r19 = 0
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 < 0) goto L_0x0279
            goto L_0x0281
        L_0x0279:
            int r14 = r8 + 1
            r20 = r14
            r14 = r8
            r8 = r20
            goto L_0x026a
        L_0x0281:
            int r8 = r14 + 1
            r8 = r2[r8]
            float r8 = r8.getFraction()
            int r9 = r5 + -1
            r9 = r2[r9]
            float r9 = r9.getFraction()
            float r8 = r8 - r9
            int r9 = r14 - r5
            int r9 = r9 + 2
            float r9 = (float) r9
            float r8 = r8 / r9
            r9 = r5
        L_0x0299:
            if (r9 > r14) goto L_0x02b3
            r17 = r1
            r1 = r2[r9]
            int r19 = r9 + -1
            r19 = r2[r19]
            float r19 = r19.getFraction()
            float r10 = r19 + r8
            r1.setFraction(r10)
            int r9 = r9 + 1
            r10 = r24
            r1 = r17
            goto L_0x0299
        L_0x02b3:
            r17 = r1
            int r5 = r5 + 1
            r10 = r24
            r1 = r17
            goto L_0x024d
        L_0x02bc:
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofKeyframe(r7, r2)
            r2 = 3
            if (r15 != r2) goto L_0x02cb
            e.q.a.a.d r5 = e.q.a.a.d.a
            r1.setEvaluator(r5)
            goto L_0x02cb
        L_0x02c9:
            r2 = 3
            r1 = 0
        L_0x02cb:
            r5 = 1
            r8 = 0
            if (r1 != 0) goto L_0x02d3
            android.animation.PropertyValuesHolder r1 = c(r3, r4, r8, r5, r7)
        L_0x02d3:
            if (r1 == 0) goto L_0x02e0
            if (r6 != 0) goto L_0x02dd
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r6 = r4
        L_0x02dd:
            r6.add(r1)
        L_0x02e0:
            r3.recycle()
            r3 = 1
            goto L_0x02e9
        L_0x02e5:
            r16 = r1
            r18 = r5
        L_0x02e9:
            r24.next()
            r4 = 2
            r8 = r22
            r9 = r23
            r10 = r24
            r1 = r16
            r5 = r18
            goto L_0x00b1
        L_0x02f9:
            if (r6 == 0) goto L_0x030f
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
            r3 = 0
        L_0x0302:
            if (r3 >= r1) goto L_0x0310
            java.lang.Object r4 = r6.get(r3)
            android.animation.PropertyValuesHolder r4 = (android.animation.PropertyValuesHolder) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0302
        L_0x030f:
            r2 = 0
        L_0x0310:
            if (r2 == 0) goto L_0x031c
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x031c
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L_0x031c:
            r14 = 1
        L_0x031d:
            if (r11 == 0) goto L_0x032b
            if (r14 != 0) goto L_0x032b
            if (r13 != 0) goto L_0x0328
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0328:
            r13.add(r0)
        L_0x032b:
            r8 = r22
            r9 = r23
            r10 = r24
            goto L_0x000f
        L_0x0333:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown animator name: "
            java.lang.StringBuilder r1 = g.a.a.a.a.i(r1)
            java.lang.String r2 = r24.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x034a:
            if (r11 == 0) goto L_0x0374
            if (r13 == 0) goto L_0x0374
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
            r3 = 0
        L_0x0359:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x036b
            java.lang.Object r4 = r2.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L_0x0359
        L_0x036b:
            if (r27 != 0) goto L_0x0371
            r11.playTogether(r1)
            goto L_0x0374
        L_0x0371:
            r11.playSequentially(r1)
        L_0x0374:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.a.a.c.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe b(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder c(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = d(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = d(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            e.e.d.c[] r13 = e.b.a.h(r12)
            e.e.d.c[] r14 = e.b.a.h(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0167
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            e.q.a.a.c$a r0 = new e.q.a.a.c$a
            r0.<init>()
            if (r14 == 0) goto L_0x008d
            boolean r3 = e.b.a.a(r13, r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0095
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0095:
            r8 = r11
            goto L_0x0167
        L_0x0098:
            if (r14 == 0) goto L_0x0167
            e.q.a.a.c$a r11 = new e.q.a.a.c$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0167
        L_0x00a9:
            if (r12 != r7) goto L_0x00ae
            e.q.a.a.d r12 = e.q.a.a.d.a
            goto L_0x00af
        L_0x00ae:
            r12 = r8
        L_0x00af:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f8
            if (r3 == 0) goto L_0x00e3
            if (r0 != r7) goto L_0x00bc
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c0:
            if (r5 == 0) goto L_0x00d9
            if (r4 != r7) goto L_0x00c9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cd
        L_0x00c9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cd:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x015f
        L_0x00d9:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x015f
        L_0x00e3:
            if (r4 != r7) goto L_0x00ea
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ee
        L_0x00ea:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x015f
        L_0x00f8:
            if (r3 == 0) goto L_0x013e
            if (r0 != r7) goto L_0x0102
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0111
        L_0x0102:
            boolean r0 = d(r0)
            if (r0 == 0) goto L_0x010d
            int r13 = r11.getColor(r13, r2)
            goto L_0x0111
        L_0x010d:
            int r13 = r11.getInt(r13, r2)
        L_0x0111:
            if (r5 == 0) goto L_0x0135
            if (r4 != r7) goto L_0x011b
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012a
        L_0x011b:
            boolean r0 = d(r4)
            if (r0 == 0) goto L_0x0126
            int r11 = r11.getColor(r14, r2)
            goto L_0x012a
        L_0x0126:
            int r11 = r11.getInt(r14, r2)
        L_0x012a:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015f
        L_0x0135:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015f
        L_0x013e:
            if (r5 == 0) goto L_0x0160
            if (r4 != r7) goto L_0x0148
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0157
        L_0x0148:
            boolean r13 = d(r4)
            if (r13 == 0) goto L_0x0153
            int r11 = r11.getColor(r14, r2)
            goto L_0x0157
        L_0x0153:
            int r11 = r11.getInt(r14, r2)
        L_0x0157:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015f:
            r8 = r11
        L_0x0160:
            if (r8 == 0) goto L_0x0167
            if (r12 == 0) goto L_0x0167
            r8.setEvaluator(r12)
        L_0x0167:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.q.a.a.c.c(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static boolean d(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray e2 = h.e(resources2, theme2, attributeSet2, a.f1544g);
        TypedArray e3 = h.e(resources2, theme2, attributeSet2, a.f1548k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        int i2 = 300;
        if (h.d(xmlPullParser2, "duration")) {
            i2 = e2.getInt(1, 300);
        }
        long j2 = (long) i2;
        int i3 = 0;
        long j3 = (long) (!h.d(xmlPullParser2, "startOffset") ? 0 : e2.getInt(2, 0));
        int i4 = !h.d(xmlPullParser2, "valueType") ? 4 : e2.getInt(7, 4);
        if (h.d(xmlPullParser2, "valueFrom") && h.d(xmlPullParser2, "valueTo")) {
            if (i4 == 4) {
                TypedValue peekValue = e2.peekValue(5);
                boolean z = peekValue != null;
                int i5 = z ? peekValue.type : 0;
                TypedValue peekValue2 = e2.peekValue(6);
                boolean z2 = peekValue2 != null;
                i4 = ((!z || !d(i5)) && (!z2 || !d(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder c = c(e2, i4, 5, 6, "");
            if (c != null) {
                valueAnimator4.setValues(new PropertyValuesHolder[]{c});
            }
        }
        valueAnimator4.setDuration(j2);
        valueAnimator4.setStartDelay(j3);
        valueAnimator4.setRepeatCount(!h.d(xmlPullParser2, "repeatCount") ? 0 : e2.getInt(3, 0));
        valueAnimator4.setRepeatMode(!h.d(xmlPullParser2, "repeatMode") ? 1 : e2.getInt(4, 1));
        if (e3 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String c2 = h.c(e3, xmlPullParser2, "pathData", 1);
            if (c2 != null) {
                String c3 = h.c(e3, xmlPullParser2, "propertyXName", 2);
                String c4 = h.c(e3, xmlPullParser2, "propertyYName", 3);
                if (c3 == null && c4 == null) {
                    throw new InflateException(e3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path i6 = e.b.a.i(c2);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(i6, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(i6, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = e2;
                int i7 = 0;
                float f6 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    int i8 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i7)).floatValue(), fArr3, (float[]) null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f6 += f5;
                    int i9 = i7 + 1;
                    if (i9 < arrayList.size() && f6 > ((Float) arrayList.get(i9)).floatValue()) {
                        pathMeasure2.nextContour();
                        i7 = i9;
                    }
                    i3++;
                    min = i8;
                }
                PropertyValuesHolder ofFloat = c3 != null ? PropertyValuesHolder.ofFloat(c3, fArr) : null;
                if (c4 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(c4, fArr2);
                }
                if (ofFloat == null) {
                    i3 = 0;
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i3 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
                    } else {
                        objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = e2;
                objectAnimator.setPropertyName(h.c(e3, xmlPullParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = e2;
        }
        if (!h.d(xmlPullParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i3 = typedArray2.getResourceId(i3, i3);
        }
        if (i3 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(e.e.d.l.a.b0(context, i3));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (e3 != null) {
            e3.recycle();
        }
        return valueAnimator3;
    }
}
