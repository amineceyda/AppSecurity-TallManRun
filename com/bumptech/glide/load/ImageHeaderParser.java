package com.bumptech.glide.load;

import g.d.a.l.t.b0.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    ImageType a(ByteBuffer byteBuffer) throws IOException;

    int b(InputStream inputStream, b bVar) throws IOException;

    ImageType c(InputStream inputStream) throws IOException;
}
