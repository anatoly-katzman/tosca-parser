package tosca.document.model;

import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class PropertyAssignment extends BaseItem
{
    private String propertyName;
    private String propertyValue;

    public PropertyAssignment(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }
}
