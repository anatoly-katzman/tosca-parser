package ak.research.tosca.document.model;

import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class EntityType extends BaseItem
{
    private String derivedFrom;
    private String version;
    private Metadata metadata;
    private String description;

    public EntityType(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }
}
