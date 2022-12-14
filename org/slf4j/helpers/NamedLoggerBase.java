package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    public String name;

    public String getName() {
        return this.name;
    }

    public Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(getName());
    }
}
