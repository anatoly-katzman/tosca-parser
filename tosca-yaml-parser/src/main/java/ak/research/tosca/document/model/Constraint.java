package ak.research.tosca.document.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/28/2017.
 */
public class Constraint extends BaseItem
{
    private String operation;
    private List<String> arguments = new ArrayList<>();

    public Constraint(Map<String, Object> innerData, SourceContext sourceContext) {
        super(innerData, sourceContext);
    }

    public String getOperation() {
        return getInnerString("operator");
    }

    public List<String> getArguments() {
        return arguments;
    }
}
