package tosca.document.model;

import ak.research.yamlparser.Position;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public abstract class BaseItem {

    protected Map<String, Object> innerData = new LinkedHashMap<>();
    protected SourceContext sourceContext;

    public BaseItem(Map<String, Object> innerData, SourceContext sourceContext) {
        this.innerData = innerData;
        this.sourceContext = sourceContext;
    }

    public Map<String, Object> getInnerData() {
        return innerData;
    }

    public SourceContext getSourceContext() {
        return sourceContext;
    }

    protected String getInnerString(String key) {
        return (String)innerData.get( key);
    }
}
