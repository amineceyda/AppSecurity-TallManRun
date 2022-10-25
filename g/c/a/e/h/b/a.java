package g.c.a.e.h.b;

import android.text.TextUtils;
import com.apkpure.aegon.components.statistics.datong.DTStatInfo;
import java.io.Serializable;
import org.slf4j.helpers.MessageFormatter;

public class a implements Cloneable, Serializable {
    public static final long serialVersionUID = -6457189484379354692L;
    public String activeType = String.valueOf(0);
    public String extendField = "";
    public String fastDownloadId = "";
    public int modelType = -1;
    public String moduleName = "";
    public String pop_type = "";
    public String position = "";
    public String preSearchId = "";
    public String preSearchInputKeyword = "";
    public String preSearchRequestKeyword = "";
    public String preSearchType = "";
    public String recommendId = "";
    public long scene = 0;
    public String searchId = "";
    public String searchInputKeyword = "";
    public String searchRequestKeyword = "";
    public String searchType = "";
    public String smallPosition = "";
    public int sourceModelType = -1;
    public String sourceModuleName = "";
    public String sourcePosition = "";
    public String sourceRecommendId = "";
    public long sourceScene = 0;
    public String sourceSmallPosition = "";

    public static a a(DTStatInfo dTStatInfo) {
        a aVar = new a();
        if (dTStatInfo == null) {
            return aVar;
        }
        aVar.scene = dTStatInfo.scene;
        if (!TextUtils.isEmpty(dTStatInfo.position)) {
            aVar.position = dTStatInfo.position;
        }
        if (!TextUtils.isEmpty(dTStatInfo.smallPosition)) {
            aVar.smallPosition = dTStatInfo.smallPosition;
        }
        aVar.modelType = dTStatInfo.modelType;
        if (!TextUtils.isEmpty(dTStatInfo.moduleName)) {
            aVar.moduleName = dTStatInfo.moduleName;
        }
        return aVar;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("DTPageInfo{scene=");
        i2.append(this.scene);
        i2.append(", position='");
        g.a.a.a.a.p(i2, this.position, '\'', ", smallPosition='");
        g.a.a.a.a.p(i2, this.smallPosition, '\'', ", sourceScene=");
        i2.append(this.sourceScene);
        i2.append(", sourcePosition='");
        g.a.a.a.a.p(i2, this.sourcePosition, '\'', ", sourceSmallPosition='");
        g.a.a.a.a.p(i2, this.sourceSmallPosition, '\'', ", modelType=");
        i2.append(this.modelType);
        i2.append(", sourceModelType=");
        i2.append(this.sourceModelType);
        i2.append(10);
        i2.append(", moduleName='");
        g.a.a.a.a.p(i2, this.moduleName, '\'', ", sourceModuleName='");
        g.a.a.a.a.p(i2, this.sourceModuleName, '\'', ", extendField='");
        g.a.a.a.a.p(i2, this.extendField, '\'', ", pop_type='");
        g.a.a.a.a.p(i2, this.pop_type, '\'', ", recommendId='");
        g.a.a.a.a.p(i2, this.recommendId, '\'', ", sourceRecommendId='");
        g.a.a.a.a.p(i2, this.sourceRecommendId, '\'', ", fastDownloadId='");
        i2.append(this.fastDownloadId);
        i2.append('\'');
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }
}
