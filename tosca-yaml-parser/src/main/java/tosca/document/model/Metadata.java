package tosca.document.model;

import ak.research.yamlparser.Position;

import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class Metadata extends BaseItem
{
    public Metadata(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }
}
