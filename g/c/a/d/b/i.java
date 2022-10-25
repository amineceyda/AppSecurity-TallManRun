package g.c.a.d.b;

import android.view.View;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchTopKeywordInfo;
import g.c.a.d.b.h;
import g.c.a.f.g;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class i extends g.c.a.g.c.a {

    /* renamed from: f  reason: collision with root package name */
    public static final i f1959f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f1960g = LoggerFactory.getLogger("Search|TrendingSearchesFragmentLog");
    public g b;
    public View c;

    /* renamed from: d  reason: collision with root package name */
    public h f1961d;

    /* renamed from: e  reason: collision with root package name */
    public a f1962e;

    public interface a {
        void a(SearchTopKeywordInfo searchTopKeywordInfo, int i2);
    }

    public static final class b implements h.a {
        public final /* synthetic */ i a;

        public b(i iVar) {
            this.a = iVar;
        }

        public void a(View view, SearchTopKeywordInfo searchTopKeywordInfo, int i2) {
            a aVar;
            i.o.c.h.e(view, "view");
            if (searchTopKeywordInfo != null && (aVar = this.a.f1962e) != null) {
                aVar.a(searchTopKeywordInfo, i2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: android.app.FragmentTransaction} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.app.FragmentTransaction} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r4 = "inflater"
            i.o.c.h.e(r3, r4)
            android.view.View r4 = r2.c
            if (r4 == 0) goto L_0x000b
            goto L_0x010f
        L_0x000b:
            r4 = 2131493393(0x7f0c0211, float:1.8610265E38)
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r5)     // Catch:{ Exception -> 0x0014 }
            goto L_0x001d
        L_0x0014:
            r3 = move-exception
            org.slf4j.Logger r4 = f1960g
            java.lang.String r0 = "inflate R.layout.fragment_searches_result_layout exception"
            r4.warn((java.lang.String) r0, (java.lang.Throwable) r3)
            r3 = r5
        L_0x001d:
            r2.c = r3
            if (r3 != 0) goto L_0x004b
            android.app.Activity r3 = r2.getActivity()
            if (r3 != 0) goto L_0x0028
            goto L_0x0033
        L_0x0028:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            if (r3 != 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            android.app.FragmentTransaction r5 = r3.beginTransaction()
        L_0x0033:
            if (r5 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            android.app.FragmentTransaction r3 = r5.remove(r2)
            if (r3 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            r3.commit()
        L_0x0040:
            android.view.View r4 = new android.view.View
            android.app.Activity r3 = r2.getActivity()
            r4.<init>(r3)
            goto L_0x010f
        L_0x004b:
            r4 = 2131298599(0x7f090927, float:1.8215176E38)
            if (r3 != 0) goto L_0x0052
            r3 = r5
            goto L_0x0063
        L_0x0052:
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0059 }
            g.c.a.o.b.a r3 = (g.c.a.o.b.a) r3     // Catch:{ Exception -> 0x0059 }
            goto L_0x0063
        L_0x0059:
            r3 = move-exception
            org.slf4j.Logger r0 = f1960g
            java.lang.String r1 = "Find tabLayout exception"
            r0.warn((java.lang.String) r1, (java.lang.Throwable) r3)
            i.j r3 = i.j.a
        L_0x0063:
            boolean r3 = r3 instanceof g.c.a.o.b.a
            if (r3 != 0) goto L_0x0091
            android.app.Activity r3 = r2.getActivity()
            if (r3 != 0) goto L_0x006e
            goto L_0x0079
        L_0x006e:
            android.app.FragmentManager r3 = r3.getFragmentManager()
            if (r3 != 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            android.app.FragmentTransaction r5 = r3.beginTransaction()
        L_0x0079:
            if (r5 != 0) goto L_0x007c
            goto L_0x0086
        L_0x007c:
            android.app.FragmentTransaction r3 = r5.remove(r2)
            if (r3 != 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r3.commit()
        L_0x0086:
            android.view.View r4 = new android.view.View
            android.app.Activity r3 = r2.getActivity()
            r4.<init>(r3)
            goto L_0x010f
        L_0x0091:
            android.view.View r3 = r2.c
            i.o.c.h.c(r3)
            r0 = 2131298548(0x7f0908f4, float:1.8215072E38)
            android.view.View r1 = r3.findViewById(r0)
            android.widget.Button r1 = (android.widget.Button) r1
            if (r1 == 0) goto L_0x0113
            android.view.View r0 = r3.findViewById(r4)
            com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout r0 = (com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout) r0
            if (r0 == 0) goto L_0x0116
            g.c.a.f.g r4 = new g.c.a.f.g
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r4.<init>(r3, r1, r0)
            r2.b = r4
            g.c.a.d.b.h r3 = new g.c.a.d.b.h
            android.app.Activity r4 = r2.getActivity()
            java.lang.String r0 = "activity"
            i.o.c.h.d(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.<init>(r4, r0)
            r2.f1961d = r3
            g.c.a.f.g r4 = r2.b
            if (r4 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            com.apkpure.aegon.widgets.flowlayout.LiteTagFlowLayout r5 = r4.a
        L_0x00ce:
            if (r5 != 0) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            r5.setAdapter(r3)
        L_0x00d4:
            g.c.a.d.b.h r3 = r2.f1961d
            if (r3 != 0) goto L_0x00d9
            goto L_0x00e5
        L_0x00d9:
            g.c.a.d.b.i$b r4 = new g.c.a.d.b.i$b
            r4.<init>(r2)
            java.lang.String r5 = "listener"
            i.o.c.h.e(r4, r5)
            r3.f1958e = r4
        L_0x00e5:
            com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHotWordsReq r3 = new com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHotWordsReq
            r3.<init>()
            g.c.b.a.e$a r4 = new g.c.b.a.e$a
            r4.<init>()
            java.lang.String r5 = "get_search_hot_words"
            r4.f(r5)
            r4.c = r3
            g.c.a.d.b.j r3 = g.c.a.d.b.j.b
            r4.d(r3)
            java.lang.Class<com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHotWordsRsp> r3 = com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.GetSearchHotWordsRsp.class
            g.c.a.d.b.k r5 = new g.c.a.d.b.k
            r5.<init>(r2)
            r4.c(r3, r5)
            g.c.a.d.b.l r3 = g.c.a.d.b.l.b
            r4.b(r3)
            r4.e()
            android.view.View r4 = r2.c
        L_0x010f:
            g.h.a.a.O(r2, r4)
            return r4
        L_0x0113:
            r4 = 2131298548(0x7f0908f4, float:1.8215072E38)
        L_0x0116:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r4)
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "Missing required view with ID: "
            java.lang.String r3 = r5.concat(r3)
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.d.b.i.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
