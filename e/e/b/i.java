package e.e.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RemoteViews;
import e.d.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class i {
    public final Notification.Builder a;
    public final h b;
    public final List<Bundle> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f1284d = new Bundle();

    public i(h hVar) {
        Notification.Builder builder;
        List<String> b2;
        this.b = hVar;
        int i2 = Build.VERSION.SDK_INT;
        Context context = hVar.a;
        if (i2 >= 26) {
            String str = hVar.n;
        } else {
            builder = new Notification.Builder(context);
        }
        this.a = builder;
        Notification notification = hVar.p;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, (RemoteViews) null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(hVar.f1275e).setContentText(hVar.f1276f).setContentInfo((CharSequence) null).setContentIntent(hVar.f1277g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification.flags & 128) == 0 ? false : true).setLargeIcon(hVar.f1278h).setNumber(0).setProgress(hVar.f1280j, hVar.f1281k, hVar.f1282l);
        if (i2 < 21) {
            builder.setSound(notification.sound, notification.audioStreamType);
        }
        builder.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(0);
        Iterator<g> it = hVar.b.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        Bundle bundle = hVar.f1283m;
        if (bundle != null) {
            this.f1284d.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.a.setShowWhen(hVar.f1279i);
        if (i3 < 21 && (b2 = b(c(hVar.c), hVar.q)) != null && !b2.isEmpty()) {
            this.f1284d.putStringArray("android.people", (String[]) b2.toArray(new String[b2.size()]));
        }
        if (i3 >= 20) {
            this.a.setLocalOnly(false).setGroup((String) null).setGroupSummary(false).setSortKey((String) null);
        }
        if (i3 >= 21) {
            this.a.setCategory((String) null).setColor(0).setVisibility(0).setPublicVersion((Notification) null).setSound(notification.sound, notification.audioAttributes);
            List<String> b3 = i3 < 28 ? b(c(hVar.c), hVar.q) : hVar.q;
            if (b3 != null && !b3.isEmpty()) {
                for (String addPerson : b3) {
                    this.a.addPerson(addPerson);
                }
            }
            if (hVar.f1274d.size() > 0) {
                if (hVar.f1283m == null) {
                    hVar.f1283m = new Bundle();
                }
                Bundle bundle2 = hVar.f1283m.getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < hVar.f1274d.size(); i4++) {
                    String num = Integer.toString(i4);
                    Object obj = j.a;
                    Bundle bundle5 = new Bundle();
                    Objects.requireNonNull(hVar.f1274d.get(i4));
                    bundle5.putInt("icon", 0);
                    bundle5.putCharSequence("title", (CharSequence) null);
                    bundle5.putParcelable("actionIntent", (Parcelable) null);
                    Bundle bundle6 = new Bundle();
                    bundle6.putBoolean("android.support.allowGeneratedReplies", false);
                    bundle5.putBundle("extras", bundle6);
                    bundle5.putParcelableArray("remoteInputs", j.b((l[]) null));
                    bundle5.putBoolean("showsUserInterface", false);
                    bundle5.putInt("semanticAction", 0);
                    bundle4.putBundle(num, bundle5);
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                if (hVar.f1283m == null) {
                    hVar.f1283m = new Bundle();
                }
                hVar.f1283m.putBundle("android.car.EXTENSIONS", bundle2);
                this.f1284d.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            this.a.setExtras(hVar.f1283m).setRemoteInputHistory((CharSequence[]) null);
        }
        if (i5 >= 26) {
            this.a.setBadgeIconType(0).setSettingsText((CharSequence) null).setShortcutId((String) null).setTimeoutAfter(0).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(hVar.n)) {
                this.a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i5 >= 28) {
            Iterator<k> it2 = hVar.c.iterator();
            while (it2.hasNext()) {
                Notification.Builder builder2 = this.a;
                Objects.requireNonNull(it2.next());
                builder2.addPerson(new Person.Builder().setName((CharSequence) null).setIcon((Icon) null).setUri((String) null).setKey((String) null).setBot(false).setImportant(false).build());
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(hVar.o);
            this.a.setBubbleMetadata((Notification.BubbleMetadata) null);
        }
    }

    public static List<String> b(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        b bVar = new b(list2.size() + list.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List<String> c(List<k> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (k requireNonNull : list) {
            Objects.requireNonNull(requireNonNull);
            arrayList.add("");
        }
        return arrayList;
    }

    public final void a(g gVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            Objects.requireNonNull(gVar);
            Notification.Action.Builder builder = i2 >= 23 ? new Notification.Action.Builder((Icon) null, (CharSequence) null, (PendingIntent) null) : new Notification.Action.Builder(0, (CharSequence) null, (PendingIntent) null);
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", false);
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(false);
            }
            bundle.putInt("android.support.action.semanticAction", 0);
            if (i2 >= 28) {
                builder.setSemanticAction(0);
            }
            if (i2 >= 29) {
                builder.setContextual(false);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", false);
            builder.addExtras(bundle);
            this.a.addAction(builder.build());
            return;
        }
        List<Bundle> list = this.c;
        Notification.Builder builder2 = this.a;
        Object obj = j.a;
        Objects.requireNonNull(gVar);
        builder2.addAction(0, (CharSequence) null, (PendingIntent) null);
        Bundle bundle2 = new Bundle((Bundle) null);
        bundle2.putBoolean("android.support.allowGeneratedReplies", false);
        list.add(bundle2);
    }
}
