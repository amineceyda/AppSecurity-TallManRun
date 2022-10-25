package m.a.a.a.a.b;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;

public class k implements e0 {
    public final Charset a;

    public k(Charset charset) {
        this.a = charset;
    }

    public String a(byte[] bArr) throws IOException {
        return this.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr)).toString();
    }
}
