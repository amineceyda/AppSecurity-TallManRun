package com.tencent.beacon.event.open;

public final class EventResult {
    public static final int ERROR_CODE_NAME_NULL = 106;
    public static final int ERROR_CODE_NOT_ENABLE = 102;
    public static final int ERROR_CODE_OFFER_FAIL = 103;
    public static final int ERROR_CODE_OTHER = 199;
    public static final int ERROR_CODE_PREVENT = 100;
    public static final int ERROR_CODE_SAMPLE = 101;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_PARAMS_LONG = 105;
    public String errMsg;
    public int errorCode;
    public long eventID;

    public static final class a {
        public static EventResult a(int i2) {
            switch (i2) {
                case 100:
                    return new EventResult(i2, -1, "not allowed in strategy (false).");
                case EventResult.ERROR_CODE_SAMPLE /*101*/:
                    return new EventResult(i2, -1, "sampled by svr rate (false).");
                case EventResult.ERROR_CODE_NOT_ENABLE /*102*/:
                    return new EventResult(i2, -1, "event report not enable!");
                case EventResult.ERROR_CODE_OFFER_FAIL /*103*/:
                    return new EventResult(i2, -1, "insert event to db error!");
                case EventResult.ERROR_PARAMS_LONG /*105*/:
                    return new EventResult(i2, -1, "event params length > 45K!");
                case EventResult.ERROR_CODE_NAME_NULL /*106*/:
                    return new EventResult(i2, -1, "event code isEmpty!");
                default:
                    return null;
            }
        }

        public static EventResult a(long j2) {
            return new EventResult(0, j2, (String) null);
        }
    }

    public EventResult(int i2, long j2, String str) {
        this.errorCode = i2;
        this.eventID = j2;
        this.errMsg = str;
    }

    public boolean isSuccess() {
        return this.errorCode == 0;
    }
}
