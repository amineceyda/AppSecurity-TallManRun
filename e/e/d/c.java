package e.e.d;

import android.graphics.Path;
import android.util.Log;
import e.b.a;

public class c {
    public char a;
    public float[] b;

    public c(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    public c(c cVar) {
        this.a = cVar.a;
        float[] fArr = cVar.b;
        this.b = a.c(fArr, 0, fArr.length);
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        double d2;
        double d3;
        float f9 = f2;
        float f10 = f4;
        float f11 = f6;
        boolean z3 = z2;
        double radians = Math.toRadians((double) f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = (double) f9;
        Double.isNaN(d4);
        double d5 = (double) f3;
        Double.isNaN(d5);
        double d6 = (d5 * sin) + (d4 * cos);
        double d7 = d4;
        double d8 = (double) f11;
        Double.isNaN(d8);
        double d9 = d6 / d8;
        double d10 = radians;
        double d11 = (double) (-f9);
        Double.isNaN(d11);
        Double.isNaN(d5);
        double d12 = (d5 * cos) + (d11 * sin);
        double d13 = (double) f7;
        Double.isNaN(d13);
        double d14 = d12 / d13;
        double d15 = d5;
        double d16 = (double) f10;
        Double.isNaN(d16);
        double d17 = (double) f5;
        Double.isNaN(d17);
        Double.isNaN(d8);
        double d18 = ((d17 * sin) + (d16 * cos)) / d8;
        double d19 = (double) (-f10);
        Double.isNaN(d19);
        Double.isNaN(d17);
        Double.isNaN(d13);
        double d20 = ((d17 * cos) + (d19 * sin)) / d13;
        double d21 = d9 - d18;
        double d22 = d14 - d20;
        double d23 = (d9 + d18) / 2.0d;
        double d24 = (d14 + d20) / 2.0d;
        double d25 = sin;
        double d26 = (d22 * d22) + (d21 * d21);
        if (d26 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d27 = (1.0d / d26) - 0.25d;
        if (d27 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d26);
            float sqrt = (float) (Math.sqrt(d26) / 1.99999d);
            a(path, f2, f3, f4, f5, f11 * sqrt, f7 * sqrt, f8, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d27);
        double d28 = d21 * sqrt2;
        double d29 = sqrt2 * d22;
        if (z == z3) {
            d3 = d23 - d29;
            d2 = d24 + d28;
        } else {
            d3 = d23 + d29;
            d2 = d24 - d28;
        }
        double atan2 = Math.atan2(d14 - d2, d9 - d3);
        double atan22 = Math.atan2(d20 - d2, d18 - d3) - atan2;
        int i2 = 0;
        if (z3 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        Double.isNaN(d8);
        double d30 = d3 * d8;
        Double.isNaN(d13);
        double d31 = d2 * d13;
        double d32 = (d30 * cos) - (d31 * d25);
        double d33 = (d31 * cos) + (d30 * d25);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d10);
        double sin2 = Math.sin(d10);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(d8);
        double d34 = -d8;
        double d35 = d34 * cos2;
        Double.isNaN(d13);
        double d36 = d13 * sin2;
        double d37 = (d35 * sin3) - (d36 * cos3);
        double d38 = d34 * sin2;
        Double.isNaN(d13);
        double d39 = d13 * cos2;
        double d40 = (cos3 * d39) + (sin3 * d38);
        double d41 = atan2;
        double d42 = (double) ceil;
        Double.isNaN(d42);
        Double.isNaN(d42);
        double d43 = atan22 / d42;
        double d44 = d41;
        while (i2 < ceil) {
            double d45 = d44 + d43;
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            Double.isNaN(d8);
            double d46 = d43;
            double d47 = (((d8 * cos2) * cos4) + d32) - (d36 * sin4);
            Double.isNaN(d8);
            double d48 = d32;
            double d49 = (d39 * sin4) + (d8 * sin2 * cos4) + d33;
            double d50 = (d35 * sin4) - (d36 * cos4);
            double d51 = (cos4 * d39) + (sin4 * d38);
            double d52 = d45 - d44;
            double tan = Math.tan(d52 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d52)) / 3.0d;
            double d53 = (d37 * sqrt3) + d7;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) d53, (float) ((d40 * sqrt3) + d15), (float) (d47 - (sqrt3 * d50)), (float) (d49 - (sqrt3 * d51)), (float) d47, (float) d49);
            i2++;
            d39 = d39;
            d38 = d38;
            ceil = ceil;
            cos2 = cos2;
            d44 = d45;
            d8 = d8;
            d40 = d51;
            d37 = d50;
            d7 = d47;
            d15 = d49;
            d43 = d46;
            d32 = d48;
        }
    }

    public static void b(c[] cVarArr, Path path) {
        int i2;
        float f2;
        float f3;
        int i3;
        int i4;
        float[] fArr;
        char c;
        int i5;
        float[] fArr2;
        char c2;
        int i6;
        float f4;
        float f5;
        float f6;
        float f7;
        int i7;
        float f8;
        float f9;
        int i8;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        c[] cVarArr2 = cVarArr;
        Path path2 = path;
        float[] fArr3 = new float[6];
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i9 = 0;
        while (i9 < cVarArr2.length) {
            char c6 = cVarArr2[i9].a;
            float[] fArr4 = cVarArr2[i9].b;
            float f25 = fArr3[c4];
            float f26 = fArr3[1];
            float f27 = fArr3[2];
            float f28 = fArr3[3];
            float f29 = fArr3[4];
            float f30 = fArr3[5];
            switch (c6) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path2.moveTo(f29, f30);
                    f25 = f29;
                    f27 = f25;
                    f26 = f30;
                    f28 = f26;
                    break;
            }
            i2 = 2;
            float f31 = f29;
            float f32 = f30;
            float f33 = f25;
            float f34 = f26;
            int i10 = 0;
            while (i10 < fArr4.length) {
                if (c6 != 'A') {
                    if (c6 != 'C') {
                        if (c6 == 'H') {
                            i3 = i10;
                            fArr = fArr4;
                            c = c6;
                            i4 = i9;
                            int i11 = i3 + 0;
                            path2.lineTo(fArr[i11], f34);
                            f33 = fArr[i11];
                        } else if (c6 == 'Q') {
                            i7 = i10;
                            fArr = fArr4;
                            c = c6;
                            i4 = i9;
                            int i12 = i7 + 0;
                            int i13 = i7 + 1;
                            int i14 = i7 + 2;
                            int i15 = i7 + 3;
                            path2.quadTo(fArr[i12], fArr[i13], fArr[i14], fArr[i15]);
                            f7 = fArr[i12];
                            f6 = fArr[i13];
                            f33 = fArr[i14];
                            f34 = fArr[i15];
                        } else if (c6 == 'V') {
                            i3 = i10;
                            fArr = fArr4;
                            c = c6;
                            i4 = i9;
                            int i16 = i3 + 0;
                            path2.lineTo(f33, fArr[i16]);
                            f34 = fArr[i16];
                        } else if (c6 != 'a') {
                            if (c6 != 'c') {
                                if (c6 == 'h') {
                                    i3 = i10;
                                    float f35 = f34;
                                    int i17 = i3 + 0;
                                    path2.rLineTo(fArr4[i17], 0.0f);
                                    f33 += fArr4[i17];
                                } else if (c6 != 'q') {
                                    if (c6 == 'v') {
                                        i3 = i10;
                                        f15 = f34;
                                        float f36 = f33;
                                        int i18 = i3 + 0;
                                        path2.rLineTo(0.0f, fArr4[i18]);
                                        f16 = fArr4[i18];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            i3 = i10;
                                            int i19 = i3 + 0;
                                            float f37 = fArr4[i19];
                                            int i20 = i3 + 1;
                                            float f38 = fArr4[i20];
                                            if (i3 > 0) {
                                                path2.lineTo(fArr4[i19], fArr4[i20]);
                                                f33 = f37;
                                                f34 = f38;
                                            } else {
                                                path2.moveTo(fArr4[i19], fArr4[i20]);
                                                f31 = f37;
                                                f32 = f38;
                                            }
                                        } else if (c6 == 'S') {
                                            i8 = i10;
                                            float f39 = f34;
                                            float f40 = f33;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f17 = (f39 * 2.0f) - f2;
                                                f18 = (f40 * 2.0f) - f3;
                                            } else {
                                                f18 = f40;
                                                f17 = f39;
                                            }
                                            int i21 = i8 + 0;
                                            int i22 = i8 + 1;
                                            int i23 = i8 + 2;
                                            int i24 = i8 + 3;
                                            path.cubicTo(f18, f17, fArr4[i21], fArr4[i22], fArr4[i23], fArr4[i24]);
                                            float f41 = fArr4[i21];
                                            float f42 = fArr4[i22];
                                            f9 = fArr4[i23];
                                            f8 = fArr4[i24];
                                            f3 = f41;
                                            f2 = f42;
                                            f33 = f9;
                                            f34 = f8;
                                        } else if (c6 == 'T') {
                                            i3 = i10;
                                            float f43 = f34;
                                            float f44 = f33;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f19 = (f44 * 2.0f) - f3;
                                                f20 = (f43 * 2.0f) - f2;
                                            } else {
                                                f19 = f44;
                                                f20 = f43;
                                            }
                                            int i25 = i3 + 0;
                                            int i26 = i3 + 1;
                                            path2.quadTo(f19, f20, fArr4[i25], fArr4[i26]);
                                            f2 = f20;
                                            f3 = f19;
                                            fArr = fArr4;
                                            c = c6;
                                            i4 = i9;
                                            f33 = fArr4[i25];
                                            f34 = fArr4[i26];
                                        } else if (c6 == 'l') {
                                            i3 = i10;
                                            f15 = f34;
                                            int i27 = i3 + 0;
                                            int i28 = i3 + 1;
                                            path2.rLineTo(fArr4[i27], fArr4[i28]);
                                            f33 += fArr4[i27];
                                            f16 = fArr4[i28];
                                        } else if (c6 == c3) {
                                            i3 = i10;
                                            int i29 = i3 + 0;
                                            f33 += fArr4[i29];
                                            int i30 = i3 + 1;
                                            f34 += fArr4[i30];
                                            if (i3 > 0) {
                                                path2.rLineTo(fArr4[i29], fArr4[i30]);
                                            } else {
                                                path2.rMoveTo(fArr4[i29], fArr4[i30]);
                                                f32 = f34;
                                                f31 = f33;
                                            }
                                        } else if (c6 != 's') {
                                            if (c6 == 't') {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f23 = f33 - f3;
                                                    f24 = f34 - f2;
                                                } else {
                                                    f24 = 0.0f;
                                                    f23 = 0;
                                                }
                                                int i31 = i10 + 0;
                                                int i32 = i10 + 1;
                                                path2.rQuadTo(f23, f24, fArr4[i31], fArr4[i32]);
                                                float f45 = f23 + f33;
                                                float f46 = f24 + f34;
                                                f33 += fArr4[i31];
                                                f34 += fArr4[i32];
                                                f2 = f46;
                                                f3 = f45;
                                            }
                                            i3 = i10;
                                        } else {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f21 = f34 - f2;
                                                f22 = f33 - f3;
                                            } else {
                                                f22 = 0.0f;
                                                f21 = 0.0f;
                                            }
                                            int i33 = i10 + 0;
                                            int i34 = i10 + 1;
                                            int i35 = i10 + 2;
                                            int i36 = i10 + 3;
                                            i8 = i10;
                                            f10 = f34;
                                            float f47 = f33;
                                            path.rCubicTo(f22, f21, fArr4[i33], fArr4[i34], fArr4[i35], fArr4[i36]);
                                            f13 = fArr4[i33] + f47;
                                            f12 = fArr4[i34] + f10;
                                            f11 = f47 + fArr4[i35];
                                            f14 = fArr4[i36];
                                        }
                                        f33 = f31;
                                        f34 = f32;
                                    } else {
                                        i3 = i10;
                                        int i37 = i3 + 0;
                                        int i38 = i3 + 1;
                                        path2.lineTo(fArr4[i37], fArr4[i38]);
                                        f33 = fArr4[i37];
                                        f34 = fArr4[i38];
                                    }
                                    f34 = f15 + f16;
                                } else {
                                    i8 = i10;
                                    f10 = f34;
                                    float f48 = f33;
                                    int i39 = i8 + 0;
                                    int i40 = i8 + 1;
                                    int i41 = i8 + 2;
                                    int i42 = i8 + 3;
                                    path2.rQuadTo(fArr4[i39], fArr4[i40], fArr4[i41], fArr4[i42]);
                                    f13 = fArr4[i39] + f48;
                                    f12 = fArr4[i40] + f10;
                                    float f49 = f48 + fArr4[i41];
                                    float f50 = fArr4[i42];
                                    f11 = f49;
                                    f14 = f50;
                                }
                                fArr = fArr4;
                                c = c6;
                                i4 = i9;
                            } else {
                                i8 = i10;
                                f10 = f34;
                                float f51 = f33;
                                int i43 = i8 + 2;
                                int i44 = i8 + 3;
                                int i45 = i8 + 4;
                                int i46 = i8 + 5;
                                path.rCubicTo(fArr4[i8 + 0], fArr4[i8 + 1], fArr4[i43], fArr4[i44], fArr4[i45], fArr4[i46]);
                                f13 = fArr4[i43] + f51;
                                f12 = fArr4[i44] + f10;
                                f11 = f51 + fArr4[i45];
                                f14 = fArr4[i46];
                            }
                            f8 = f10 + f14;
                            f3 = f13;
                            f2 = f12;
                            f9 = f11;
                            f33 = f9;
                            f34 = f8;
                            fArr = fArr4;
                            c = c6;
                            i4 = i9;
                        } else {
                            i5 = i10;
                            float f52 = f34;
                            float f53 = f33;
                            int i47 = i5 + 5;
                            float f54 = fArr4[i47] + f53;
                            int i48 = i5 + 6;
                            float f55 = fArr4[i48] + f52;
                            float f56 = fArr4[i5 + 0];
                            float f57 = fArr4[i5 + 1];
                            float f58 = fArr4[i5 + 2];
                            boolean z = fArr4[i5 + 3] != 0.0f;
                            boolean z2 = fArr4[i5 + 4] != 0.0f;
                            fArr2 = fArr4;
                            float f59 = f58;
                            c2 = c6;
                            i6 = i9;
                            a(path, f53, f52, f54, f55, f56, f57, f59, z, z2);
                            f4 = f53 + fArr2[i47];
                            f5 = f52 + fArr2[i48];
                        }
                        i10 = i3 + i2;
                        c5 = c;
                        c6 = c5;
                        fArr4 = fArr;
                        i9 = i4;
                        c3 = 'm';
                        c[] cVarArr3 = cVarArr;
                    } else {
                        i7 = i10;
                        fArr = fArr4;
                        c = c6;
                        i4 = i9;
                        int i49 = i7 + 2;
                        int i50 = i7 + 3;
                        int i51 = i7 + 4;
                        int i52 = i7 + 5;
                        path.cubicTo(fArr[i7 + 0], fArr[i7 + 1], fArr[i49], fArr[i50], fArr[i51], fArr[i52]);
                        float f60 = fArr[i51];
                        float f61 = fArr[i52];
                        f7 = fArr[i49];
                        f33 = f60;
                        f34 = f61;
                        f6 = fArr[i50];
                    }
                    f3 = f7;
                    f2 = f6;
                    i10 = i3 + i2;
                    c5 = c;
                    c6 = c5;
                    fArr4 = fArr;
                    i9 = i4;
                    c3 = 'm';
                    c[] cVarArr32 = cVarArr;
                } else {
                    i5 = i10;
                    fArr2 = fArr4;
                    c2 = c6;
                    i6 = i9;
                    int i53 = i5 + 5;
                    int i54 = i5 + 6;
                    a(path, f33, f34, fArr2[i53], fArr2[i54], fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f, fArr2[i5 + 4] != 0.0f);
                    f4 = fArr2[i53];
                    f5 = fArr2[i54];
                }
                f2 = f34;
                f3 = f33;
                i10 = i3 + i2;
                c5 = c;
                c6 = c5;
                fArr4 = fArr;
                i9 = i4;
                c3 = 'm';
                c[] cVarArr322 = cVarArr;
            }
            int i55 = i9;
            fArr3[0] = f33;
            fArr3[1] = f34;
            fArr3[2] = f3;
            fArr3[3] = f2;
            fArr3[4] = f31;
            fArr3[5] = f32;
            i9 = i55 + 1;
            c5 = cVarArr[i55].a;
            c3 = 'm';
            c4 = 0;
            cVarArr2 = cVarArr;
        }
    }
}
