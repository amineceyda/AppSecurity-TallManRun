package com.tencent.crabshell.loader;

import android.annotation.SuppressLint;
import com.tencent.raft.codegenmeta.utils.Constants;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import m.b.a.a.b.f;

@SuppressLint({"NewApi"})
public final class NewClassLoaderForLowSdk extends PathClassLoader {
    private static transient /* synthetic */ boolean[] $jacocoData;
    public static ArrayList<String> CLASS_CANNOT_REPLACED;
    private final ClassLoader mOriginAppClassLoader;

    public class CompoundEnumeration<E> implements Enumeration<E> {
        private static transient /* synthetic */ boolean[] $jacocoData;
        private Enumeration<E>[] enums;
        private int index = 0;
        public final /* synthetic */ NewClassLoaderForLowSdk this$0;

        private static /* synthetic */ boolean[] $jacocoInit() {
            boolean[] zArr = $jacocoData;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = f.a(977270451220589945L, "com/tencent/crabshell/loader/NewClassLoaderForLowSdk$CompoundEnumeration", 10);
            $jacocoData = a;
            return a;
        }

        public CompoundEnumeration(NewClassLoaderForLowSdk newClassLoaderForLowSdk, Enumeration<E>[] enumerationArr) {
            boolean[] $jacocoInit = $jacocoInit();
            this.this$0 = newClassLoaderForLowSdk;
            this.enums = enumerationArr;
            $jacocoInit[0] = true;
        }

        public boolean hasMoreElements() {
            boolean[] $jacocoInit = $jacocoInit();
            while (true) {
                int i2 = this.index;
                Enumeration<E>[] enumerationArr = this.enums;
                if (i2 < enumerationArr.length) {
                    $jacocoInit[1] = true;
                    if (enumerationArr[i2] == null) {
                        $jacocoInit[2] = true;
                    } else if (!enumerationArr[i2].hasMoreElements()) {
                        $jacocoInit[3] = true;
                    } else {
                        $jacocoInit[4] = true;
                        return true;
                    }
                    this.index++;
                    $jacocoInit[5] = true;
                } else {
                    $jacocoInit[6] = true;
                    return false;
                }
            }
        }

        public E nextElement() {
            boolean[] $jacocoInit = $jacocoInit();
            if (hasMoreElements()) {
                E nextElement = this.enums[this.index].nextElement();
                $jacocoInit[9] = true;
                return nextElement;
            }
            $jacocoInit[7] = true;
            NoSuchElementException noSuchElementException = new NoSuchElementException();
            $jacocoInit[8] = true;
            throw noSuchElementException;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(1398011126036700853L, "com/tencent/crabshell/loader/NewClassLoaderForLowSdk", 32);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<String> arrayList = new ArrayList<>();
        CLASS_CANNOT_REPLACED = arrayList;
        $jacocoInit[30] = true;
        arrayList.add("com.qq.AppService.RealAstApp");
        $jacocoInit[31] = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewClassLoaderForLowSdk(String str, File file, String str2, ClassLoader classLoader) throws Exception {
        super("", str2, ClassLoader.getSystemClassLoader());
        boolean[] $jacocoInit = $jacocoInit();
        this.mOriginAppClassLoader = classLoader;
        $jacocoInit[0] = true;
        injectDexPath(this, str, file);
        $jacocoInit[1] = true;
    }

    private static void injectDexPath(ClassLoader classLoader, String str, File file) throws Exception {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            ArrayList arrayList = new ArrayList(16);
            $jacocoInit[18] = true;
            String[] split = str.split(Constants.KEY_INDEX_FILE_SEPARATOR);
            int length = split.length;
            int i2 = 0;
            $jacocoInit[19] = true;
            while (i2 < length) {
                String str2 = split[i2];
                $jacocoInit[20] = true;
                if (str2.isEmpty()) {
                    $jacocoInit[21] = true;
                } else {
                    arrayList.add(new File(str2));
                    $jacocoInit[22] = true;
                }
                i2++;
                $jacocoInit[23] = true;
            }
            if (arrayList.isEmpty()) {
                $jacocoInit[24] = true;
            } else {
                $jacocoInit[25] = true;
                ShellClassLoader.injectDexInternal(classLoader, arrayList, file);
                $jacocoInit[26] = true;
            }
            $jacocoInit[29] = true;
        } catch (Throwable unused) {
            $jacocoInit[27] = true;
            Exception exc = new Exception("Fail to create TinkerClassLoader.");
            $jacocoInit[28] = true;
            throw exc;
        }
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Class<?> cls;
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[2] = true;
        if (!CLASS_CANNOT_REPLACED.contains(str)) {
            $jacocoInit[3] = true;
            try {
                cls = super.findClass(str);
                $jacocoInit[6] = true;
            } catch (ClassNotFoundException unused) {
                cls = null;
                $jacocoInit[7] = true;
            }
            if (cls != null) {
                $jacocoInit[8] = true;
                return cls;
            }
            Class<?> loadClass = this.mOriginAppClassLoader.loadClass(str);
            $jacocoInit[9] = true;
            return loadClass;
        }
        $jacocoInit[4] = true;
        Class<?> loadClass2 = this.mOriginAppClassLoader.loadClass(str);
        $jacocoInit[5] = true;
        return loadClass2;
    }

    public URL getResource(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        URL resource = Object.class.getClassLoader().getResource(str);
        if (resource != null) {
            $jacocoInit[10] = true;
            return resource;
        }
        URL findResource = findResource(str);
        if (findResource != null) {
            $jacocoInit[11] = true;
            return findResource;
        }
        URL resource2 = this.mOriginAppClassLoader.getResource(str);
        $jacocoInit[12] = true;
        return resource2;
    }

    public Enumeration<URL> getResources(String str) throws IOException {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[13] = true;
        $jacocoInit[14] = true;
        ClassLoader classLoader = this.mOriginAppClassLoader;
        $jacocoInit[15] = true;
        Enumeration[] enumerationArr = {Object.class.getClassLoader().getResources(str), findResources(str), classLoader.getResources(str)};
        $jacocoInit[16] = true;
        CompoundEnumeration compoundEnumeration = new CompoundEnumeration(this, enumerationArr);
        $jacocoInit[17] = true;
        return compoundEnumeration;
    }
}
