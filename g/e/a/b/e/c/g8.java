package g.e.a.b.e.c;

import java.nio.charset.Charset;

public final class g8 implements z8 {
    public static final n8 b = new e8();
    public final n8 a;

    public g8() {
        n8 n8Var;
        n8[] n8VarArr = new n8[2];
        n8VarArr[0] = k7.a;
        try {
            n8Var = (n8) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            n8Var = b;
        }
        n8VarArr[1] = n8Var;
        f8 f8Var = new f8(n8VarArr);
        Charset charset = v7.a;
        this.a = f8Var;
    }
}
