package tosca.document.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class PropertyDefinition extends BaseItem
{
    private String type;
    private String description;
    private boolean required;
    private String defaultValue;
    private String status;
    private List<Constraint> constraints = new ArrayList<>();
    private String entrySchema;

    public PropertyDefinition(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }

    public String getType() {
//        return type;
        return (String)innerData.get( "type");
    }

    public String getDescription() {
        return description;
    }

    public boolean isRequired() {
        return required;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getStatus() {
        return status;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public String getEntrySchema() {
        return entrySchema;
    }
}
