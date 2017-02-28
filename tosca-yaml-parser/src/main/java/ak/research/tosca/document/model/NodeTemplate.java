package ak.research.tosca.document.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class NodeTemplate extends BaseItem {

    private String type;

    public NodeTemplate(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private List<PropertyAssignment> propertyAssignments = new ArrayList();
}
