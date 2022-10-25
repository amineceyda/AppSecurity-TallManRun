package g.c.a.b.a;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.apkpure.aegon.app.activity.ManagerActivity;
import com.apkpure.aegon.components.download.DownloadTask;
import g.c.a.b.a.l.d;
import i.o.c.h;
import java.util.List;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {
    public final /* synthetic */ List b;
    public final /* synthetic */ DownloadTask c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ManagerActivity f1876d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f1877e;

    public /* synthetic */ e(List list, DownloadTask downloadTask, ManagerActivity managerActivity, boolean z) {
        this.b = list;
        this.c = downloadTask;
        this.f1876d = managerActivity;
        this.f1877e = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        List list = this.b;
        DownloadTask downloadTask = this.c;
        ManagerActivity managerActivity = this.f1876d;
        boolean z = this.f1877e;
        int i3 = ManagerActivity.A;
        h.e(list, "$tasks");
        h.e(downloadTask, "$task");
        h.e(managerActivity, "this$0");
        list.remove(downloadTask);
        managerActivity.z.add(downloadTask);
        managerActivity.r.debug(h.j("deleteDownloadDialog size = ", Integer.valueOf(list.size())));
        BaseAdapter z2 = managerActivity.z(z);
        if (z2 instanceof d) {
            managerActivity.r.debug(h.j("deleteDownloadDialog set new data = ", Integer.valueOf(list.size())));
            ((d) z2).j(list);
        } else if (z2 != null) {
            z2.notifyDataSetChanged();
        }
        g.c.a.o.g.d dVar = managerActivity.v;
        boolean z3 = true;
        boolean z4 = false;
        if (dVar != null) {
            if (z && managerActivity.y.isEmpty()) {
                BaseAdapter A = managerActivity.A(true);
                List<BaseAdapter> list2 = dVar.b;
                if (list2 != null) {
                    list2.remove(A);
                }
                dVar.notifyDataSetChanged();
            }
            if (managerActivity.x.isEmpty()) {
                BaseAdapter A2 = managerActivity.A(false);
                List<BaseAdapter> list3 = dVar.b;
                if (list3 != null) {
                    list3.remove(A2);
                }
                dVar.notifyDataSetChanged();
            }
            if (managerActivity.y.isEmpty() && managerActivity.x.isEmpty()) {
                managerActivity.E();
            }
        }
        dialogInterface.cancel();
        try {
            CheckBox checkBox = (CheckBox) ((Dialog) dialogInterface).findViewById(2131296545);
            if (checkBox == null || !checkBox.isChecked()) {
                z3 = false;
            }
            z4 = z3;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        g.c.a.e.b.e.i(managerActivity).l(downloadTask.getAsset(), z4);
    }
}
