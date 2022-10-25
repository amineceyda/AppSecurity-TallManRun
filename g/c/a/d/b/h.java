package g.c.a.d.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchTopKeywordInfo;
import g.c.a.o.b.b;
import java.util.List;

public final class h extends b<SearchTopKeywordInfo> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f1957d;

    /* renamed from: e  reason: collision with root package name */
    public a f1958e;

    public interface a {
        void a(View view, SearchTopKeywordInfo searchTopKeywordInfo, int i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, List<SearchTopKeywordInfo> list) {
        super(list);
        i.o.c.h.e(context, "context");
        this.f1957d = context;
    }

    public View a(g.c.a.o.b.a aVar, int i2, Object obj) {
        String str;
        SearchTopKeywordInfo searchTopKeywordInfo = (SearchTopKeywordInfo) obj;
        String str2 = null;
        View inflate = View.inflate(this.f1957d, 2131493409, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(2131298575);
        ImageView imageView = (ImageView) inflate.findViewById(2131298300);
        i.o.c.h.d(imageView, "hotIcon");
        if (searchTopKeywordInfo != null) {
            str2 = searchTopKeywordInfo.type;
        }
        imageView.setVisibility(i.o.c.h.a(str2, "hot") ? 0 : 8);
        if (searchTopKeywordInfo == null || (str = searchTopKeywordInfo.keyword) == null) {
            str = "";
        }
        textView.setText(str);
        inflate.setOnClickListener(new d(this, inflate, searchTopKeywordInfo, i2));
        i.o.c.h.d(inflate, "layout");
        return inflate;
    }
}
