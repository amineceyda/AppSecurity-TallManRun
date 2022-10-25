package g.c.a.o.g;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import g.i.c.a.a.i.b;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f2191d = LoggerFactory.getLogger("ConcatAdapter");
    public final List<BaseAdapter> b = new ArrayList();
    public DataSetObserver c;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1000) {
                d.this.notifyDataSetInvalidated();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            super.onChanged();
            d.this.notifyDataSetChanged();
        }
    }

    public d(BaseAdapter... baseAdapterArr) {
        new a(Looper.getMainLooper());
        this.c = new b();
        for (BaseAdapter baseAdapter : baseAdapterArr) {
            baseAdapter.registerDataSetObserver(this.c);
            this.b.add(baseAdapter);
        }
    }

    public BaseAdapter a(int i2) {
        if (i2 < 0 || i2 >= this.b.size()) {
            return null;
        }
        return this.b.get(i2);
    }

    public final int[] b(int i2) {
        int[] iArr = {-1, -1};
        if (i2 < 0) {
            return iArr;
        }
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            BaseAdapter baseAdapter = this.b.get(i3);
            if (i2 - baseAdapter.getCount() < 0) {
                iArr[0] = i3;
                iArr[1] = i2;
                return iArr;
            }
            i2 -= baseAdapter.getCount();
        }
        return iArr;
    }

    public int getCount() {
        List<BaseAdapter> list = this.b;
        int i2 = 0;
        if (list == null) {
            return 0;
        }
        for (BaseAdapter count : list) {
            i2 += count.getCount();
        }
        return i2;
    }

    public Object getItem(int i2) {
        int[] b2 = b(i2);
        return this.b.get(b2[0]).getItem(b2[1]);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public int getItemViewType(int i2) {
        int[] b2 = b(i2);
        BaseAdapter a2 = a(b2[0]);
        if (a2 == null) {
            return -1;
        }
        return ((b2[0] + 1) * 1000) + a2.getItemViewType(b2[1]);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        int[] b2 = b(i2);
        Logger logger = f2191d;
        StringBuilder i3 = g.a.a.a.a.i("getView ");
        i3.append(b2[0]);
        i3.append(" ");
        i3.append(b2[1]);
        logger.info(i3.toString());
        View view2 = this.b.get(b2[0]).getView(b2[1], view, viewGroup);
        b.C0166b.a.h(i2, view, viewGroup, (long) i2);
        return view2;
    }

    public boolean isEmpty() {
        return this.b.size() <= 0;
    }
}
