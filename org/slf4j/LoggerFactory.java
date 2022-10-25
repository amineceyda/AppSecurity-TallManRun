package org.slf4j;

import g.a.a.a.a;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.event.SubstituteLoggingEvent;
import org.slf4j.helpers.NOPLoggerFactory;
import org.slf4j.helpers.SubstituteLogger;
import org.slf4j.helpers.SubstituteLoggerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticLoggerBinder;

public final class LoggerFactory {
    private static final String[] API_COMPATIBILITY_LIST = {"1.6", "1.7"};
    public static final String CODES_PREFIX = "http://www.slf4j.org/codes.html";
    public static boolean DETECT_LOGGER_NAME_MISMATCH = Util.safeGetBooleanSystemProperty(DETECT_LOGGER_NAME_MISMATCH_PROPERTY);
    public static final String DETECT_LOGGER_NAME_MISMATCH_PROPERTY = "slf4j.detectLoggerNameMismatch";
    public static final int FAILED_INITIALIZATION = 2;
    public static volatile int INITIALIZATION_STATE = 0;
    public static final String JAVA_VENDOR_PROPERTY = "java.vendor.url";
    public static final String LOGGER_NAME_MISMATCH_URL = "http://www.slf4j.org/codes.html#loggerNameMismatch";
    public static final String MULTIPLE_BINDINGS_URL = "http://www.slf4j.org/codes.html#multiple_bindings";
    public static final NOPLoggerFactory NOP_FALLBACK_FACTORY = new NOPLoggerFactory();
    public static final int NOP_FALLBACK_INITIALIZATION = 4;
    public static final String NO_STATICLOGGERBINDER_URL = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    public static final String NULL_LF_URL = "http://www.slf4j.org/codes.html#null_LF";
    public static final int ONGOING_INITIALIZATION = 1;
    public static final String REPLAY_URL = "http://www.slf4j.org/codes.html#replay";
    private static String STATIC_LOGGER_BINDER_PATH = "org/slf4j/impl/StaticLoggerBinder.class";
    public static final String SUBSTITUTE_LOGGER_URL = "http://www.slf4j.org/codes.html#substituteLogger";
    public static final SubstituteLoggerFactory SUBST_FACTORY = new SubstituteLoggerFactory();
    public static final int SUCCESSFUL_INITIALIZATION = 3;
    public static final int UNINITIALIZED = 0;
    public static final String UNSUCCESSFUL_INIT_MSG = "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    public static final String UNSUCCESSFUL_INIT_URL = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    public static final String VERSION_MISMATCH = "http://www.slf4j.org/codes.html#version_mismatch";

    private LoggerFactory() {
    }

    private static final void bind() {
        Set<URL> set = null;
        try {
            if (!isAndroid()) {
                set = findPossibleStaticLoggerBinderPathSet();
                reportMultipleBindingAmbiguity(set);
            }
            StaticLoggerBinder.getSingleton();
            INITIALIZATION_STATE = 3;
            reportActualBinding(set);
        } catch (NoClassDefFoundError e2) {
            if (messageContainsOrgSlf4jImplStaticLoggerBinder(e2.getMessage())) {
                INITIALIZATION_STATE = 4;
                Util.report("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
                Util.report("Defaulting to no-operation (NOP) logger implementation");
                Util.report("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
            } else {
                failedBinding(e2);
                throw e2;
            }
        } catch (NoSuchMethodError e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                INITIALIZATION_STATE = 2;
                Util.report("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                Util.report("Your binding is version 1.5.5 or earlier.");
                Util.report("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        } catch (Exception e4) {
            failedBinding(e4);
            throw new IllegalStateException("Unexpected initialization failure", e4);
        } catch (Throwable th) {
            postBindCleanUp();
            throw th;
        }
        postBindCleanUp();
    }

    private static void emitReplayOrSubstituionWarning(SubstituteLoggingEvent substituteLoggingEvent, int i2) {
        if (substituteLoggingEvent.getLogger().isDelegateEventAware()) {
            emitReplayWarning(i2);
        } else if (!substituteLoggingEvent.getLogger().isDelegateNOP()) {
            emitSubstitutionWarning();
        }
    }

    private static void emitReplayWarning(int i2) {
        Util.report("A number (" + i2 + ") of logging calls during the initialization phase have been intercepted and are");
        Util.report("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        Util.report("See also http://www.slf4j.org/codes.html#replay");
    }

    private static void emitSubstitutionWarning() {
        Util.report("The following set of substitute loggers may have been accessed");
        Util.report("during the initialization phase. Logging calls during this");
        Util.report("phase were not honored. However, subsequent logging calls to these");
        Util.report("loggers will work as normally expected.");
        Util.report("See also http://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void failedBinding(Throwable th) {
        INITIALIZATION_STATE = 2;
        Util.report("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set<URL> findPossibleStaticLoggerBinderPathSet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = LoggerFactory.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(STATIC_LOGGER_BINDER_PATH) : classLoader.getResources(STATIC_LOGGER_BINDER_PATH);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e2) {
            Util.report("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    private static void fixSubstituteLoggers() {
        SubstituteLoggerFactory substituteLoggerFactory = SUBST_FACTORY;
        synchronized (substituteLoggerFactory) {
            substituteLoggerFactory.postInitialization();
            for (SubstituteLogger next : substituteLoggerFactory.getLoggers()) {
                next.setDelegate(getLogger(next.getName()));
            }
        }
    }

    public static ILoggerFactory getILoggerFactory() {
        if (INITIALIZATION_STATE == 0) {
            synchronized (LoggerFactory.class) {
                if (INITIALIZATION_STATE == 0) {
                    INITIALIZATION_STATE = 1;
                    performInitialization();
                }
            }
        }
        int i2 = INITIALIZATION_STATE;
        if (i2 == 1) {
            return SUBST_FACTORY;
        }
        if (i2 == 2) {
            throw new IllegalStateException(UNSUCCESSFUL_INIT_MSG);
        } else if (i2 == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        } else {
            if (i2 == 4) {
                return NOP_FALLBACK_FACTORY;
            }
            throw new IllegalStateException("Unreachable code");
        }
    }

    public static Logger getLogger(Class<?> cls) {
        Class<?> callingClass;
        Logger logger = getLogger(cls.getName());
        if (DETECT_LOGGER_NAME_MISMATCH && (callingClass = Util.getCallingClass()) != null && nonMatchingClasses(cls, callingClass)) {
            Util.report(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{logger.getName(), callingClass.getName()}));
            Util.report("See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return logger;
    }

    public static Logger getLogger(String str) {
        return getILoggerFactory().getLogger(str);
    }

    private static boolean isAmbiguousStaticLoggerBinderPathSet(Set<URL> set) {
        return set.size() > 1;
    }

    private static boolean isAndroid() {
        String safeGetSystemProperty = Util.safeGetSystemProperty(JAVA_VENDOR_PROPERTY);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.toLowerCase().contains("android");
    }

    private static boolean messageContainsOrgSlf4jImplStaticLoggerBinder(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("org/slf4j/impl/StaticLoggerBinder") || str.contains("org.slf4j.impl.StaticLoggerBinder");
    }

    private static boolean nonMatchingClasses(Class<?> cls, Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    private static final void performInitialization() {
        bind();
        if (INITIALIZATION_STATE == 3) {
            versionSanityCheck();
        }
    }

    private static void postBindCleanUp() {
        fixSubstituteLoggers();
        replayEvents();
        SUBST_FACTORY.clear();
    }

    private static void replayEvents() {
        LinkedBlockingQueue<SubstituteLoggingEvent> eventQueue = SUBST_FACTORY.getEventQueue();
        int size = eventQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i2 = 0;
        while (eventQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                SubstituteLoggingEvent substituteLoggingEvent = (SubstituteLoggingEvent) it.next();
                replaySingleEvent(substituteLoggingEvent);
                int i3 = i2 + 1;
                if (i2 == 0) {
                    emitReplayOrSubstituionWarning(substituteLoggingEvent, size);
                }
                i2 = i3;
            }
            arrayList.clear();
        }
    }

    private static void replaySingleEvent(SubstituteLoggingEvent substituteLoggingEvent) {
        if (substituteLoggingEvent != null) {
            SubstituteLogger logger = substituteLoggingEvent.getLogger();
            String name = logger.getName();
            if (logger.isDelegateNull()) {
                throw new IllegalStateException("Delegate logger cannot be null at this state.");
            } else if (!logger.isDelegateNOP()) {
                if (logger.isDelegateEventAware()) {
                    logger.log(substituteLoggingEvent);
                } else {
                    Util.report(name);
                }
            }
        }
    }

    private static void reportActualBinding(Set<URL> set) {
        if (set != null && isAmbiguousStaticLoggerBinderPathSet(set)) {
            StringBuilder i2 = a.i("Actual binding is of type [");
            i2.append(StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr());
            i2.append("]");
            Util.report(i2.toString());
        }
    }

    private static void reportMultipleBindingAmbiguity(Set<URL> set) {
        if (isAmbiguousStaticLoggerBinderPathSet(set)) {
            Util.report("Class path contains multiple SLF4J bindings.");
            for (URL url : set) {
                Util.report("Found binding in [" + url + "]");
            }
            Util.report("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void reset() {
        INITIALIZATION_STATE = 0;
    }

    private static final void versionSanityCheck() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String startsWith : API_COMPATIBILITY_LIST) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                Util.report("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(API_COMPATIBILITY_LIST).toString());
                Util.report("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            Util.report("Unexpected problem occured during version sanity check", th);
        }
    }
}
