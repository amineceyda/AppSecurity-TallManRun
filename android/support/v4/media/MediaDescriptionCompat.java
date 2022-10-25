package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private final CharSequence mDescription;
    private Object mDescriptionObj;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        public Object createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        public Object[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mDescription = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r15) {
        /*
            r0 = 0
            if (r15 == 0) goto L_0x0065
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0065
            r2 = r15
            android.media.MediaDescription r2 = (android.media.MediaDescription) r2
            java.lang.String r4 = r2.getMediaId()
            java.lang.CharSequence r5 = r2.getTitle()
            java.lang.CharSequence r6 = r2.getSubtitle()
            java.lang.CharSequence r7 = r2.getDescription()
            android.graphics.Bitmap r8 = r2.getIconBitmap()
            android.net.Uri r9 = r2.getIconUri()
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r10 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x0036
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r11 = r3.getParcelable(r10)
            android.net.Uri r11 = (android.net.Uri) r11
            goto L_0x0037
        L_0x0036:
            r11 = r0
        L_0x0037:
            if (r11 == 0) goto L_0x0050
            java.lang.String r12 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r13 = r3.containsKey(r12)
            if (r13 == 0) goto L_0x004a
            int r13 = r3.size()
            r14 = 2
            if (r13 != r14) goto L_0x004a
            r10 = r0
            goto L_0x0051
        L_0x004a:
            r3.remove(r10)
            r3.remove(r12)
        L_0x0050:
            r10 = r3
        L_0x0051:
            if (r11 == 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            r3 = 23
            if (r1 < r3) goto L_0x005c
            android.net.Uri r0 = r2.getMediaUri()
        L_0x005c:
            r11 = r0
        L_0x005d:
            android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.mDescriptionObj = r15
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.mTitle + ", " + this.mSubtitle + ", " + this.mDescription;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21) {
            parcel.writeString(this.mMediaId);
            TextUtils.writeToParcel(this.mTitle, parcel, i2);
            TextUtils.writeToParcel(this.mSubtitle, parcel, i2);
            TextUtils.writeToParcel(this.mDescription, parcel, i2);
            parcel.writeParcelable(this.mIcon, i2);
            parcel.writeParcelable(this.mIconUri, i2);
            parcel.writeBundle(this.mExtras);
            parcel.writeParcelable(this.mMediaUri, i2);
            return;
        }
        Object obj = this.mDescriptionObj;
        if (obj == null && i3 >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.mMediaId);
            builder.setTitle(this.mTitle);
            builder.setSubtitle(this.mSubtitle);
            builder.setDescription(this.mDescription);
            builder.setIconBitmap(this.mIcon);
            builder.setIconUri(this.mIconUri);
            Bundle bundle = this.mExtras;
            if (i3 < 23 && this.mMediaUri != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean(DESCRIPTION_KEY_NULL_BUNDLE_FLAG, true);
                }
                bundle.putParcelable(DESCRIPTION_KEY_MEDIA_URI, this.mMediaUri);
            }
            builder.setExtras(bundle);
            if (i3 >= 23) {
                builder.setMediaUri(this.mMediaUri);
            }
            obj = builder.build();
            this.mDescriptionObj = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i2);
    }
}
