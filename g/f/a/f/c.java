package g.f.a.f;

import g.f.a.b.k;
import g.f.a.d.d;
import g.f.a.d.f;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

public class c implements b {
    public String a(Class<?> cls) {
        Entity annotation = cls.getAnnotation(Entity.class);
        Table annotation2 = cls.getAnnotation(Table.class);
        if (annotation != null && c(annotation.name())) {
            return annotation.name();
        }
        if (annotation2 == null || !c(annotation2.name())) {
            return null;
        }
        return annotation2.name();
    }

    public f b(g.f.a.c.c cVar, Field field) {
        FetchType fetch;
        Column annotation = field.getAnnotation(Column.class);
        Basic annotation2 = field.getAnnotation(Basic.class);
        Id annotation3 = field.getAnnotation(Id.class);
        GeneratedValue annotation4 = field.getAnnotation(GeneratedValue.class);
        OneToOne annotation5 = field.getAnnotation(OneToOne.class);
        ManyToOne annotation6 = field.getAnnotation(ManyToOne.class);
        JoinColumn annotation7 = field.getAnnotation(JoinColumn.class);
        Enumerated annotation8 = field.getAnnotation(Enumerated.class);
        Version annotation9 = field.getAnnotation(Version.class);
        if (annotation == null && annotation2 == null && annotation3 == null && annotation5 == null && annotation6 == null && annotation8 == null && annotation9 == null) {
            return null;
        }
        f fVar = new f();
        String name = field.getName();
        Objects.requireNonNull(cVar);
        fVar.a = name;
        if (annotation != null) {
            if (c(annotation.name())) {
                fVar.b = annotation.name();
            }
            if (c(annotation.columnDefinition())) {
                fVar.A = annotation.columnDefinition();
            }
            fVar.f3867f = annotation.length();
            fVar.f3868g = annotation.nullable();
            fVar.q = annotation.unique();
        }
        if (annotation2 != null) {
            fVar.f3868g = annotation2.optional();
        }
        boolean z = true;
        if (annotation3 != null) {
            if (annotation4 == null) {
                fVar.f3869h = true;
            } else {
                fVar.f3870i = true;
            }
        }
        if (!(annotation5 == null && annotation6 == null)) {
            if (Collection.class.isAssignableFrom(field.getType()) || k.class.isAssignableFrom(field.getType())) {
                fVar.F = true;
                if (annotation7 != null && c(annotation7.name())) {
                    annotation7.name();
                }
                if (!(annotation6 == null || (fetch = annotation6.fetch()) == null || fetch != FetchType.EAGER)) {
                    fVar.G = true;
                }
            } else {
                fVar.f3872k = true;
                if (annotation7 != null) {
                    if (c(annotation7.name())) {
                        fVar.b = annotation7.name();
                    }
                    fVar.f3868g = annotation7.nullable();
                    fVar.q = annotation7.unique();
                }
            }
        }
        if (annotation8 != null) {
            EnumType value = annotation8.value();
            fVar.c = (value == null || value != EnumType.STRING) ? d.ENUM_INTEGER : d.ENUM_STRING;
        }
        if (annotation9 != null) {
            fVar.C = true;
        }
        if (fVar.g() == null) {
            fVar.f3865d = g.f.a.d.c.a(field);
        }
        if (f.a(field, cVar, false) == null || f.e(field, cVar, false) == null) {
            z = false;
        }
        fVar.f3873l = z;
        return fVar;
    }

    public final boolean c(String str) {
        return str != null && str.length() > 0;
    }
}
