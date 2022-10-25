package com.tencent.raft.codegenmeta.annotation;

import g.a.a.a.a;
import java.io.Serializable;
import java.util.Set;
import javax.lang.model.element.Modifier;
import org.slf4j.helpers.MessageFormatter;

public class RaftAnnotationConfigArg implements Serializable {
    private static final long serialVersionUID = 1001;
    public String argMethod;
    public String argName;
    public String configClassName;
    public String configMethodName;
    public Set<Modifier> modifier;
    public String returnType;

    public String toString() {
        StringBuilder i2 = a.i("RaftAnnotationConfigArg{configClassName='");
        a.p(i2, this.configClassName, '\'', ", configMethodName='");
        a.p(i2, this.configMethodName, '\'', ", argMethod='");
        a.p(i2, this.argMethod, '\'', ", argName='");
        a.p(i2, this.argName, '\'', ", modifier=");
        i2.append(this.modifier);
        i2.append(", returnType='");
        i2.append(this.returnType);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
