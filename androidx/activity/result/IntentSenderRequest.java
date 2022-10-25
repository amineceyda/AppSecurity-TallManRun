package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();
    private final Intent mFillInIntent;
    private final int mFlagsMask;
    private final int mFlagsValues;
    private final IntentSender mIntentSender;

    public class a implements Parcelable.Creator<IntentSenderRequest> {
        public Object createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        public Object[] newArray(int i2) {
            return new IntentSenderRequest[i2];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.mIntentSender = intentSender;
        this.mFillInIntent = intent;
        this.mFlagsMask = i2;
        this.mFlagsValues = i3;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.mIntentSender = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.mFillInIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.mFlagsMask = parcel.readInt();
        this.mFlagsValues = parcel.readInt();
    }

    public Intent a() {
        return this.mFillInIntent;
    }

    public int b() {
        return this.mFlagsMask;
    }

    public int c() {
        return this.mFlagsValues;
    }

    public IntentSender d() {
        return this.mIntentSender;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.mIntentSender, i2);
        parcel.writeParcelable(this.mFillInIntent, i2);
        parcel.writeInt(this.mFlagsMask);
        parcel.writeInt(this.mFlagsValues);
    }
}
