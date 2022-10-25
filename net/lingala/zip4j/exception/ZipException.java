package net.lingala.zip4j.exception;

import java.io.IOException;

public class ZipException extends IOException {
    private static final long serialVersionUID = 1;
    private a type;

    public enum a {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }
}
