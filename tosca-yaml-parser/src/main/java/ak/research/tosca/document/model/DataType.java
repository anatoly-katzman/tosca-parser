package ak.research.tosca.document.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class DataType extends EntityType
{
    private List<Constraint> constraints = new ArrayList<>();
    private List<PropertyDefinition> propertyDefinitions = new ArrayList<>();

    public DataType(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }
}
