package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import org.slf4j.helpers.MessageFormatter;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();
    private final Intent mData;
    private final int mResultCode;

    public class a implements Parcelable.Creator<ActivityResult> {
        public Object createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        public Object[] newArray(int i2) {
            return new ActivityResult[i2];
        }
    }

    public ActivityResult(int i2, Intent intent) {
        this.mResultCode = i2;
        this.mData = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.mResultCode = parcel.readInt();
        this.mData = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public Intent a() {
        return this.mData;
    }

    public int b() {
        return this.mResultCode;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("ActivityResult{resultCode=");
        int i3 = this.mResultCode;
        i2.append(i3 != -1 ? i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED" : "RESULT_OK");
        i2.append(", data=");
        i2.append(this.mData);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.mResultCode);
        parcel.writeInt(this.mData == null ? 0 : 1);
        Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
