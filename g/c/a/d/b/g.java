package g.c.a.d.b;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout;
import com.apkpure.aegon.widgets.xlistview.XListView;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryReq;
import com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryRsp;
import g.c.a.f.f;
import g.c.b.a.d;
import g.c.b.a.e;
import i.j;
import i.o.b.l;
import i.o.b.p;
import i.o.c.h;
import i.o.c.i;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class g extends g.c.a.g.c.a {

    /* renamed from: h  reason: collision with root package name */
    public static final g f1951h = null;

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f1952i = LoggerFactory.getLogger("Search|SearchResultAppFragmentLog");
    public String b = "";
    public String c = "hot_search";

    /* renamed from: d  reason: collision with root package name */
    public f f1953d;

    /* renamed from: e  reason: collision with root package name */
    public View f1954e;

    /* renamed from: f  reason: collision with root package name */
    public String f1955f = "en";

    /* renamed from: g  reason: collision with root package name */
    public e f1956g;

    public static final class a extends i implements i.o.b.a<j> {
        public static final a b = new a();

        public a() {
            super(0);
        }

        public Object a() {
            g.f1952i.debug("Search query app start.");
            return j.a;
        }
    }

    public static final class b extends i implements l<d<SearchQueryRsp>, j> {
        public final /* synthetic */ SearchQueryReq $req;
        public final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(g gVar, SearchQueryReq searchQueryReq) {
            super(1);
            this.this$0 = gVar;
            this.$req = searchQueryReq;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00c9 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object g(java.lang.Object r13) {
            /*
                r12 = this;
                g.c.b.a.d r13 = (g.c.b.a.d) r13
                java.lang.String r0 = "resp"
                i.o.c.h.e(r13, r0)
                boolean r0 = r13.d()
                if (r0 != 0) goto L_0x0012
                org.slf4j.Logger r13 = g.c.a.d.b.g.f1952i
                java.lang.String r0 = "Search query resp is not success."
                goto L_0x001a
            L_0x0012:
                T r0 = r13.b
                if (r0 != 0) goto L_0x001f
                org.slf4j.Logger r13 = g.c.a.d.b.g.f1952i
                java.lang.String r0 = "Search query data is null."
            L_0x001a:
                r13.info(r0)
                goto L_0x012d
            L_0x001f:
                org.slf4j.Logger r0 = g.c.a.d.b.g.f1952i
                java.lang.String r1 = "Search query success."
                r0.debug(r1)
                T r13 = r13.b
                com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryRsp r13 = (com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryRsp) r13
                if (r13 != 0) goto L_0x002e
                goto L_0x012d
            L_0x002e:
                g.c.a.d.b.g r1 = r12.this$0
                com.tencent.trpcprotocol.projecta.search_svr.search_svr.nano.SearchQueryReq r2 = r12.$req
                java.lang.String r3 = r1.b
                java.lang.String r4 = r2.searchInputKey
                boolean r3 = i.o.c.h.a(r3, r4)
                if (r3 != 0) goto L_0x005f
                java.lang.String r13 = "Handle search result keyWork had changed. newKeyWork["
                java.lang.StringBuilder r13 = g.a.a.a.a.i(r13)
                java.lang.String r2 = r1.b
                r13.append(r2)
                java.lang.String r2 = "] oldKeyWork["
                r13.append(r2)
                java.lang.String r1 = r1.b
                r13.append(r1)
                r1 = 93
                r13.append(r1)
                java.lang.String r13 = r13.toString()
                r0.info(r13)
                goto L_0x012d
            L_0x005f:
                int r0 = r2.page
                long r2 = (long) r0
                r0 = 0
                r4 = 1
                r6 = 0
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 > 0) goto L_0x0078
                g.c.a.f.f r2 = r1.f1953d
                if (r2 != 0) goto L_0x0070
                r2 = r0
                goto L_0x0072
            L_0x0070:
                com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r2 = r2.c
            L_0x0072:
                if (r2 != 0) goto L_0x0075
                goto L_0x0078
            L_0x0075:
                r2.setRefreshing(r6)
            L_0x0078:
                g.c.a.d.b.e r1 = r1.f1956g
                if (r1 != 0) goto L_0x007e
                goto L_0x012d
            L_0x007e:
                r1.n = r13
                com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsList[] r2 = r13.cmsList
                r3 = 1
                if (r2 == 0) goto L_0x0090
                int r2 = r2.length
                if (r2 != 0) goto L_0x008a
                r2 = 1
                goto L_0x008b
            L_0x008a:
                r2 = 0
            L_0x008b:
                if (r2 == 0) goto L_0x008e
                goto L_0x0090
            L_0x008e:
                r2 = 0
                goto L_0x0091
            L_0x0090:
                r2 = 1
            L_0x0091:
                if (r2 == 0) goto L_0x009c
                org.slf4j.Logger r13 = g.c.a.d.b.e.o
                java.lang.String r0 = "Set data cmsList is null or empty."
                r13.info(r0)
                goto L_0x012d
            L_0x009c:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsList[] r7 = r13.cmsList
                java.lang.String r8 = "resp.cmsList"
                i.o.c.h.d(r7, r8)
                int r8 = r7.length
                r9 = 0
            L_0x00aa:
                if (r9 >= r8) goto L_0x00cc
                r10 = r7[r9]
                com.tencent.trpcprotocol.projecta.common.cmsresponse.nano.CmsItemList[] r10 = r10.itemList
                if (r10 == 0) goto L_0x00bd
                int r11 = r10.length
                if (r11 != 0) goto L_0x00b7
                r11 = 1
                goto L_0x00b8
            L_0x00b7:
                r11 = 0
            L_0x00b8:
                if (r11 == 0) goto L_0x00bb
                goto L_0x00bd
            L_0x00bb:
                r11 = 0
                goto L_0x00be
            L_0x00bd:
                r11 = 1
            L_0x00be:
                if (r11 == 0) goto L_0x00c1
                goto L_0x00c9
            L_0x00c1:
                java.lang.String r11 = "it.itemList"
                i.o.c.h.d(r10, r11)
                i.l.c.a(r2, r10)
            L_0x00c9:
                int r9 = r9 + 1
                goto L_0x00aa
            L_0x00cc:
                com.tencent.trpcprotocol.projecta.common.paging.nano.Paging r7 = r13.page
                long r7 = r7.currentPage
                int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r9 <= 0) goto L_0x00e2
                java.lang.String r4 = "data"
                i.o.c.h.e(r2, r4)
                java.util.List<T> r4 = r1.f2183g
                r4.addAll(r2)
                r1.notifyDataSetChanged()
                goto L_0x00e5
            L_0x00e2:
                r1.j(r2)
            L_0x00e5:
                com.tencent.trpcprotocol.projecta.common.paging.nano.Paging r13 = r13.page
                long r4 = r13.currentPage
                long r7 = r13.total
                int r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r13 < 0) goto L_0x011e
                android.view.ViewGroup r13 = r1.b
                boolean r2 = r13 instanceof com.apkpure.aegon.widgets.xlistview.XListView
                if (r2 == 0) goto L_0x011a
                com.apkpure.aegon.widgets.xlistview.XListView r13 = (com.apkpure.aegon.widgets.xlistview.XListView) r13
                r13.f331h = r3
                r13.f330g = r6
                g.c.a.f.h r2 = r13.c
                if (r2 != 0) goto L_0x0101
                r2 = r0
                goto L_0x0103
            L_0x0101:
                android.widget.ProgressBar r2 = r2.b
            L_0x0103:
                if (r2 != 0) goto L_0x0106
                goto L_0x010b
            L_0x0106:
                r3 = 8
                r2.setVisibility(r3)
            L_0x010b:
                g.c.a.f.h r2 = r13.c
                if (r2 != 0) goto L_0x0110
                goto L_0x0112
            L_0x0110:
                android.widget.TextView r0 = r2.c
            L_0x0112:
                if (r0 != 0) goto L_0x0115
                goto L_0x011a
            L_0x0115:
                java.lang.String r13 = r13.f334k
                r0.setText(r13)
            L_0x011a:
                r1.l()
                goto L_0x012d
            L_0x011e:
                android.view.ViewGroup r13 = r1.b
                boolean r0 = r13 instanceof com.apkpure.aegon.widgets.xlistview.XListView
                if (r0 == 0) goto L_0x012a
                com.apkpure.aegon.widgets.xlistview.XListView r13 = (com.apkpure.aegon.widgets.xlistview.XListView) r13
                r13.f331h = r6
                r13.f330g = r6
            L_0x012a:
                r1.l()
            L_0x012d:
                i.j r13 = i.j.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: g.c.a.d.b.g.b.g(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends i implements p<Integer, String, j> {
        public final /* synthetic */ g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(2);
            this.this$0 = gVar;
        }

        public Object d(Object obj, Object obj2) {
            SwipeRefreshLayout swipeRefreshLayout;
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            h.e(str, "message");
            Logger logger = g.f1952i;
            logger.info("Search query app fail,code[" + intValue + "] message[" + str + ']');
            e eVar = this.this$0.f1956g;
            if (eVar != null) {
                ViewGroup viewGroup = eVar.b;
                if (viewGroup instanceof XListView) {
                    XListView xListView = (XListView) viewGroup;
                    xListView.f331h = false;
                    xListView.f330g = false;
                }
                eVar.l();
            }
            f fVar = this.this$0.f1953d;
            if (fVar == null) {
                swipeRefreshLayout = null;
            } else {
                swipeRefreshLayout = fVar.c;
            }
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            return j.a;
        }
    }

    public final void a() {
        String str = this.b;
        if (str == null || str.length() == 0) {
            f1952i.info("Search keyWork is null or empty.");
            return;
        }
        String str2 = this.b;
        h.c(str2);
        b(str2, this.c, 1);
    }

    public final void b(String str, String str2, long j2) {
        SearchQueryReq searchQueryReq = new SearchQueryReq();
        searchQueryReq.key = str;
        searchQueryReq.searchInputKey = str;
        searchQueryReq.page = (int) j2;
        searchQueryReq.searchType = str2;
        searchQueryReq.hl = this.f1955f;
        e.a aVar = new e.a();
        aVar.f("search_query");
        aVar.c = searchQueryReq;
        aVar.d(a.b);
        aVar.c(SearchQueryRsp.class, new b(this, searchQueryReq));
        aVar.b(new c(this));
        aVar.e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1955f = e.e.f.b.A(g.c.a.e.i.b.a.c.c());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.apkpure.aegon.widgets.xlistview.XListView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.app.FragmentTransaction} */
    /* JADX WARNING: type inference failed for: r8v1 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            java.lang.String r7 = "inflater"
            i.o.c.h.e(r6, r7)
            android.view.View r7 = r5.f1954e
            if (r7 == 0) goto L_0x000b
            goto L_0x013c
        L_0x000b:
            r7 = 2131493491(0x7f0c0273, float:1.8610464E38)
            r8 = 0
            android.view.View r6 = r6.inflate(r7, r8)     // Catch:{ Exception -> 0x0014 }
            goto L_0x001d
        L_0x0014:
            r6 = move-exception
            org.slf4j.Logger r7 = f1952i
            java.lang.String r0 = "inflate R.layout.fragment_searches_result_layout exception"
            r7.warn((java.lang.String) r0, (java.lang.Throwable) r6)
            r6 = r8
        L_0x001d:
            r5.f1954e = r6
            if (r6 != 0) goto L_0x004b
            android.app.Activity r6 = r5.getActivity()
            if (r6 != 0) goto L_0x0028
            goto L_0x0033
        L_0x0028:
            android.app.FragmentManager r6 = r6.getFragmentManager()
            if (r6 != 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            android.app.FragmentTransaction r8 = r6.beginTransaction()
        L_0x0033:
            if (r8 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            android.app.FragmentTransaction r6 = r8.remove(r5)
            if (r6 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            r6.commit()
        L_0x0040:
            android.view.View r7 = new android.view.View
            android.app.Activity r6 = r5.getActivity()
            r7.<init>(r6)
            goto L_0x013c
        L_0x004b:
            i.o.c.h.c(r6)
            r7 = 2131298636(0x7f09094c, float:1.821525E38)
            android.view.View r0 = r6.findViewById(r7)
            java.lang.String r1 = "Missing required view with ID: "
            if (r0 == 0) goto L_0x0155
            r7 = 2131297058(0x7f090322, float:1.821205E38)
            android.view.View r2 = r0.findViewById(r7)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131297059(0x7f090323, float:1.8212052E38)
            if (r2 == 0) goto L_0x0143
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            android.view.View r4 = r0.findViewById(r3)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0140
            g.c.a.f.e r0 = new g.c.a.f.e
            r0.<init>(r7, r2, r7, r4)
            r7 = 2131297429(0x7f090495, float:1.8212803E38)
            android.view.View r2 = r6.findViewById(r7)
            com.apkpure.aegon.widgets.xlistview.XListView r2 = (com.apkpure.aegon.widgets.xlistview.XListView) r2
            if (r2 == 0) goto L_0x0155
            r7 = 2131298661(0x7f090965, float:1.8215301E38)
            android.view.View r3 = r6.findViewById(r7)
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r3 = (com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout) r3
            if (r3 == 0) goto L_0x0155
            g.c.a.f.f r7 = new g.c.a.f.f
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r7.<init>(r6, r0, r2, r3)
            r5.f1953d = r7
            if (r7 != 0) goto L_0x0099
            r0 = r8
        L_0x0099:
            if (r0 != 0) goto L_0x009c
            goto L_0x00a7
        L_0x009c:
            android.widget.TextView r6 = r0.c
            if (r6 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            r7 = 2131820957(0x7f11019d, float:1.9274644E38)
            r6.setText(r7)
        L_0x00a7:
            g.c.a.f.f r6 = r5.f1953d
            if (r6 != 0) goto L_0x00ad
            r6 = r8
            goto L_0x00af
        L_0x00ad:
            g.c.a.f.e r6 = r6.a
        L_0x00af:
            if (r6 != 0) goto L_0x00b2
            goto L_0x00bd
        L_0x00b2:
            android.widget.TextView r6 = r6.b
            if (r6 != 0) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            r7 = 2131821432(0x7f110378, float:1.9275607E38)
            r6.setText(r7)
        L_0x00bd:
            g.c.a.f.f r6 = r5.f1953d
            if (r6 != 0) goto L_0x00c3
            r6 = r8
            goto L_0x00c5
        L_0x00c3:
            g.c.a.f.e r6 = r6.a
        L_0x00c5:
            if (r6 != 0) goto L_0x00c8
            goto L_0x00d5
        L_0x00c8:
            android.widget.TextView r6 = r6.b
            if (r6 != 0) goto L_0x00cd
            goto L_0x00d5
        L_0x00cd:
            g.c.a.d.b.c r7 = new g.c.a.d.b.c
            r7.<init>(r5)
            r6.setOnClickListener(r7)
        L_0x00d5:
            g.c.a.f.f r6 = r5.f1953d
            if (r6 != 0) goto L_0x00da
            goto L_0x00de
        L_0x00da:
            com.apkpure.aegon.widgets.xlistview.XListView r6 = r6.b
            if (r6 != 0) goto L_0x00e0
        L_0x00de:
            r7 = r8
            goto L_0x00ea
        L_0x00e0:
            g.c.a.d.b.e r7 = new g.c.a.d.b.e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.<init>(r6, r0)
        L_0x00ea:
            r5.f1956g = r7
            if (r7 != 0) goto L_0x00ef
            goto L_0x0107
        L_0x00ef:
            g.c.a.d.b.f r6 = new g.c.a.d.b.f
            r6.<init>(r5)
            g.c.a.f.f r7 = r5.f1953d
            if (r7 != 0) goto L_0x00fa
            r7 = r8
            goto L_0x00fc
        L_0x00fa:
            com.apkpure.aegon.widgets.xlistview.XListView r7 = r7.b
        L_0x00fc:
            java.lang.String r0 = "listener"
            i.o.c.h.e(r6, r0)
            if (r7 != 0) goto L_0x0104
            goto L_0x0107
        L_0x0104:
            r7.a(r6)
        L_0x0107:
            g.c.a.d.b.e r6 = r5.f1956g
            if (r6 != 0) goto L_0x010c
            goto L_0x011b
        L_0x010c:
            g.c.a.f.f r7 = r5.f1953d
            if (r7 != 0) goto L_0x0111
            goto L_0x0115
        L_0x0111:
            g.c.a.f.e r7 = r7.a
            if (r7 != 0) goto L_0x0117
        L_0x0115:
            r7 = r8
            goto L_0x0119
        L_0x0117:
            android.widget.LinearLayout r7 = r7.a
        L_0x0119:
            r6.f2181e = r7
        L_0x011b:
            g.c.a.f.f r7 = r5.f1953d
            if (r7 != 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            com.apkpure.aegon.widgets.xlistview.XListView r8 = r7.b
        L_0x0122:
            if (r8 != 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            r8.setAdapter((android.widget.ListAdapter) r6)
        L_0x0128:
            g.c.a.f.f r6 = r5.f1953d
            if (r6 != 0) goto L_0x012d
            goto L_0x013a
        L_0x012d:
            com.apkpure.aegon.widgets.swipe.SwipeRefreshLayout r6 = r6.c
            if (r6 != 0) goto L_0x0132
            goto L_0x013a
        L_0x0132:
            g.c.a.d.b.b r7 = new g.c.a.d.b.b
            r7.<init>(r5)
            r6.setOnRefreshListener(r7)
        L_0x013a:
            android.view.View r7 = r5.f1954e
        L_0x013c:
            g.h.a.a.O(r5, r7)
            return r7
        L_0x0140:
            r7 = 2131297059(0x7f090323, float:1.8212052E38)
        L_0x0143:
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r6 = r6.getResourceName(r7)
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r6 = r1.concat(r6)
            r7.<init>(r6)
            throw r7
        L_0x0155:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r6 = r6.getResourceName(r7)
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r6 = r1.concat(r6)
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.d.b.g.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
