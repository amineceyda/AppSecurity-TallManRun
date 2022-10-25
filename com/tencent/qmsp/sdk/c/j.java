package com.tencent.qmsp.sdk.c;

import android.os.Bundle;
import android.util.Pair;
import com.tencent.qmsp.sdk.a.b;
import com.tencent.qmsp.sdk.f.h;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class j {
    private static final byte[][] c = {new byte[]{20, 67, -74, 67, 2, 50, 117, -18}, new byte[]{51, 117, -95, 83, 39, 52, 121}, new byte[]{9, 121, -79, 101, 32, 47, 101, -28}, new byte[]{44, 116}, new byte[]{49, 105, -93, 69}, new byte[]{35, 124, -78, 71, 61}, new byte[]{53, 113, -89, 72}, new byte[]{43, 113, -66, 69}, new byte[]{51, 113, -65, 85, 43}, new byte[]{51, 117, -95}, new byte[]{20, 125, -96, 80, 96, 63, 118, -23}};
    private List<a> a;
    private int b = 1;

    public static class a {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public String f825d;

        /* renamed from: e  reason: collision with root package name */
        public String f826e;
    }

    public j() {
        Pair<Integer, List<a>> a2 = a(c(), 1);
        if (a2 != null) {
            this.b = ((Integer) a2.first).intValue();
            this.a = (List) a2.second;
        }
        if (this.a == null) {
            this.a = new LinkedList();
        }
    }

    private int a(Element element) {
        try {
            NamedNodeMap attributes = element.getAttributes();
            if (attributes == null) {
                return 0;
            }
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                Node item = attributes.item(i2);
                String nodeName = item.getNodeName();
                if (nodeName != null) {
                    if (nodeName.equalsIgnoreCase(b(1))) {
                        return Integer.parseInt(item.getNodeValue());
                    }
                }
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private Pair<Integer, List<a>> a(String str, int i2) {
        byte[] a2 = new m().a(str, (String) null, 1);
        if (a2 != null) {
            return a(a2, i2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089 A[SYNTHETIC, Splitter:B:43:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0096 A[SYNTHETIC, Splitter:B:51:0x0096] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.util.List<com.tencent.qmsp.sdk.c.j.a>> a(byte[] r9, int r10) {
        /*
            r8 = this;
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            r1 = 0
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0082, all -> 0x0080 }
            org.w3c.dom.Document r9 = r0.parse(r2)     // Catch:{ Exception -> 0x007e }
            org.w3c.dom.Element r9 = r9.getDocumentElement()     // Catch:{ Exception -> 0x007e }
            int r0 = r8.a((org.w3c.dom.Element) r9)     // Catch:{ Exception -> 0x007e }
            if (r0 == 0) goto L_0x006c
            if (r0 <= r10) goto L_0x001f
            goto L_0x006c
        L_0x001f:
            java.util.LinkedList r10 = new java.util.LinkedList     // Catch:{ Exception -> 0x007e }
            r10.<init>()     // Catch:{ Exception -> 0x007e }
            org.w3c.dom.NodeList r9 = r9.getChildNodes()     // Catch:{ Exception -> 0x007e }
            int r3 = r9.getLength()     // Catch:{ Exception -> 0x007e }
            r4 = 0
        L_0x002d:
            if (r4 >= r3) goto L_0x005a
            org.w3c.dom.Node r5 = r9.item(r4)     // Catch:{ Exception -> 0x007e }
            short r6 = r5.getNodeType()     // Catch:{ Exception -> 0x007e }
            r7 = 1
            if (r6 == r7) goto L_0x003b
            goto L_0x0057
        L_0x003b:
            java.lang.String r6 = r5.getNodeName()     // Catch:{ Exception -> 0x007e }
            if (r6 == 0) goto L_0x0057
            r7 = 2
            java.lang.String r7 = r8.b((int) r7)     // Catch:{ Exception -> 0x007e }
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ Exception -> 0x007e }
            if (r6 != 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            com.tencent.qmsp.sdk.c.j$a r5 = r8.a((org.w3c.dom.Node) r5)     // Catch:{ Exception -> 0x007e }
            if (r5 != 0) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            r10.add(r5)     // Catch:{ Exception -> 0x007e }
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x005a:
            android.util.Pair r9 = new android.util.Pair     // Catch:{ Exception -> 0x007e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x007e }
            r9.<init>(r0, r10)     // Catch:{ Exception -> 0x007e }
            r2.close()     // Catch:{ IOException -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r10 = move-exception
            r10.printStackTrace()
        L_0x006b:
            return r9
        L_0x006c:
            android.util.Pair r9 = new android.util.Pair     // Catch:{ Exception -> 0x007e }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x007e }
            r9.<init>(r10, r1)     // Catch:{ Exception -> 0x007e }
            r2.close()     // Catch:{ IOException -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r10 = move-exception
            r10.printStackTrace()
        L_0x007d:
            return r9
        L_0x007e:
            r9 = move-exception
            goto L_0x0084
        L_0x0080:
            r9 = move-exception
            goto L_0x0094
        L_0x0082:
            r9 = move-exception
            r2 = r1
        L_0x0084:
            r9.printStackTrace()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x0091
            r2.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x0091
        L_0x008d:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0091:
            return r1
        L_0x0092:
            r9 = move-exception
            r1 = r2
        L_0x0094:
            if (r1 == 0) goto L_0x009e
            r1.close()     // Catch:{ IOException -> 0x009a }
            goto L_0x009e
        L_0x009a:
            r10 = move-exception
            r10.printStackTrace()
        L_0x009e:
            goto L_0x00a0
        L_0x009f:
            throw r9
        L_0x00a0:
            goto L_0x009f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.j.a(byte[], int):android.util.Pair");
    }

    private a a(Node node) {
        try {
            NamedNodeMap attributes = node.getAttributes();
            if (attributes == null) {
                return null;
            }
            a aVar = new a();
            int length = attributes.getLength();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                Node item = attributes.item(i3);
                if (item.getNodeType() == 2) {
                    String nodeName = item.getNodeName();
                    String nodeValue = item.getNodeValue();
                    if (nodeName != null) {
                        if (nodeValue != null) {
                            if (nodeName.equalsIgnoreCase(b(3))) {
                                aVar.a = Integer.parseInt(nodeValue);
                            } else if (nodeName.equalsIgnoreCase(b(4))) {
                                aVar.b = Integer.parseInt(nodeValue);
                            } else if (nodeName.equalsIgnoreCase(b(5))) {
                                aVar.c = Integer.parseInt(nodeValue);
                            } else if (nodeName.equalsIgnoreCase(b(6))) {
                                aVar.f826e = nodeValue;
                            } else if (nodeName.equalsIgnoreCase(b(9))) {
                                aVar.f825d = nodeValue;
                            }
                            i2++;
                        }
                    }
                }
            }
            if (i2 != 5) {
                return null;
            }
            b(node);
            return aVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private boolean a(String str, int i2, List<a> list) {
        byte[] a2 = a(i2, list);
        if (a2 == null) {
            return false;
        }
        return new m().a(str, a2, (String) null, 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9 A[SYNTHETIC, Splitter:B:22:0x00a9] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6 A[SYNTHETIC, Splitter:B:30:0x00b6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] a(int r8, java.util.List<com.tencent.qmsp.sdk.c.j.a> r9) {
        /*
            r7 = this;
            r0 = 0
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            r2.<init>()     // Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
            java.lang.String r3 = "UTF-8"
            r1.setOutput(r2, r3)     // Catch:{ Exception -> 0x009e }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x009e }
            r1.startDocument(r0, r3)     // Catch:{ Exception -> 0x009e }
            r3 = 0
            java.lang.String r4 = r7.b((int) r3)     // Catch:{ Exception -> 0x009e }
            r1.startTag(r0, r4)     // Catch:{ Exception -> 0x009e }
            r4 = 1
            java.lang.String r4 = r7.b((int) r4)     // Catch:{ Exception -> 0x009e }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ Exception -> 0x009e }
            r1.attribute(r0, r4, r8)     // Catch:{ Exception -> 0x009e }
            java.util.Iterator r8 = r9.iterator()     // Catch:{ Exception -> 0x009e }
        L_0x002c:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x009e }
            if (r9 == 0) goto L_0x0087
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x009e }
            com.tencent.qmsp.sdk.c.j$a r9 = (com.tencent.qmsp.sdk.c.j.a) r9     // Catch:{ Exception -> 0x009e }
            r4 = 2
            java.lang.String r5 = r7.b((int) r4)     // Catch:{ Exception -> 0x009e }
            r1.startTag(r0, r5)     // Catch:{ Exception -> 0x009e }
            r5 = 3
            java.lang.String r5 = r7.b((int) r5)     // Catch:{ Exception -> 0x009e }
            int r6 = r9.a     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ Exception -> 0x009e }
            r1.attribute(r0, r5, r6)     // Catch:{ Exception -> 0x009e }
            r5 = 4
            java.lang.String r5 = r7.b((int) r5)     // Catch:{ Exception -> 0x009e }
            int r6 = r9.b     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ Exception -> 0x009e }
            r1.attribute(r0, r5, r6)     // Catch:{ Exception -> 0x009e }
            r5 = 5
            java.lang.String r5 = r7.b((int) r5)     // Catch:{ Exception -> 0x009e }
            int r6 = r9.c     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ Exception -> 0x009e }
            r1.attribute(r0, r5, r6)     // Catch:{ Exception -> 0x009e }
            r5 = 9
            java.lang.String r5 = r7.b((int) r5)     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = r9.f825d     // Catch:{ Exception -> 0x009e }
            r1.attribute(r0, r5, r6)     // Catch:{ Exception -> 0x009e }
            r5 = 6
            java.lang.String r5 = r7.b((int) r5)     // Catch:{ Exception -> 0x009e }
            java.lang.String r9 = r9.f826e     // Catch:{ Exception -> 0x009e }
            r1.attribute(r0, r5, r9)     // Catch:{ Exception -> 0x009e }
            java.lang.String r9 = r7.b((int) r4)     // Catch:{ Exception -> 0x009e }
            r1.endTag(r0, r9)     // Catch:{ Exception -> 0x009e }
            goto L_0x002c
        L_0x0087:
            java.lang.String r8 = r7.b((int) r3)     // Catch:{ Exception -> 0x009e }
            r1.endTag(r0, r8)     // Catch:{ Exception -> 0x009e }
            r1.endDocument()     // Catch:{ Exception -> 0x009e }
            byte[] r8 = r2.toByteArray()     // Catch:{ Exception -> 0x009e }
            r2.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r9 = move-exception
            r9.printStackTrace()
        L_0x009d:
            return r8
        L_0x009e:
            r8 = move-exception
            goto L_0x00a4
        L_0x00a0:
            r8 = move-exception
            goto L_0x00b4
        L_0x00a2:
            r8 = move-exception
            r2 = r0
        L_0x00a4:
            r8.printStackTrace()     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x00b1
            r2.close()     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00b1:
            return r0
        L_0x00b2:
            r8 = move-exception
            r0 = r2
        L_0x00b4:
            if (r0 == 0) goto L_0x00be
            r0.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00be
        L_0x00ba:
            r9 = move-exception
            r9.printStackTrace()
        L_0x00be:
            goto L_0x00c0
        L_0x00bf:
            throw r8
        L_0x00c0:
            goto L_0x00bf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qmsp.sdk.c.j.a(int, java.util.List):byte[]");
    }

    private Bundle b(Node node) {
        try {
            Bundle bundle = new Bundle();
            NodeList childNodes = node.getChildNodes();
            int length = childNodes.getLength();
            for (int i2 = 0; i2 < length; i2++) {
                Node item = childNodes.item(i2);
                if (item.getNodeType() == 1) {
                    NamedNodeMap attributes = item.getAttributes();
                    if (attributes != null) {
                        Node namedItem = attributes.getNamedItem(b(7));
                        if (namedItem != null) {
                            if (namedItem.getNodeType() == 2) {
                                String nodeValue = namedItem.getNodeValue();
                                if (nodeValue != null) {
                                    Node namedItem2 = attributes.getNamedItem(b(8));
                                    if (namedItem2 != null) {
                                        if (namedItem2.getNodeType() == 2) {
                                            String nodeValue2 = namedItem2.getNodeValue();
                                            if (nodeValue2 != null) {
                                                bundle.putString(nodeValue, nodeValue2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private String b(int i2) {
        return h.a(c[i2]);
    }

    private String c() {
        return b.a() + File.separator + b(10);
    }

    private boolean c(int i2) {
        return d(i2) != null;
    }

    private a d(int i2) {
        for (a next : this.a) {
            if (next.a == i2) {
                return next;
            }
        }
        return null;
    }

    public a a(int i2) {
        return d(i2);
    }

    public void a(int i2, boolean z) {
        a d2 = d(i2);
        if (d2 != null) {
            this.a.remove(d2);
            if (z) {
                a(c(), this.b, this.a);
            }
        }
    }

    public boolean a() {
        return a(c(), this.b, this.a);
    }

    public boolean a(a aVar, boolean z) {
        if (c(aVar.a)) {
            return false;
        }
        this.a.add(aVar);
        if (z) {
            return a();
        }
        return true;
    }

    public List<a> b() {
        return this.a;
    }
}
