package org.apache.oreo.commons.compress.archivers.dump;

public class InvalidFormatException extends DumpArchiveException {
    private static final long serialVersionUID = 1;
    public long offset;

    public InvalidFormatException() {
        super("there was an error decoding a tape segment");
    }
}
