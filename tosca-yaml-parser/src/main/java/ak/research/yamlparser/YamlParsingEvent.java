package ak.research.yamlparser;

import org.yaml.snakeyaml.events.*;

/**
 * Created by ak435s on 2/28/2017.
 */
public class YamlParsingEvent {

    /**
     * Created by ak435s on 2/28/2017.
     */
    public static enum EventType {
        UNSUPPORTED, 
        STREAM_START, STREAM_END,
        DOCUMENT_START, DOCUMENT_END,
        MAPPING_START, MAPPING_END,
        SEQUENCE_START, SEQUENCE_END,
        SCALAR,
    }

    private Position start;
    private Position end;
    private EventType type;
    private String value;

    public YamlParsingEvent(org.yaml.snakeyaml.events.Event snakeyamlEvent, String source) {

        start = new Position( source, snakeyamlEvent.getStartMark().getLine(), snakeyamlEvent.getStartMark().getColumn(),
                snakeyamlEvent.getStartMark().getIndex());
        end = new Position( source, snakeyamlEvent.getEndMark().getLine(), snakeyamlEvent.getStartMark().getColumn(),
                snakeyamlEvent.getStartMark().getIndex());

        value = "N/A";

        if( snakeyamlEvent instanceof StreamStartEvent) {
            type = EventType.STREAM_START;
        } else if( snakeyamlEvent instanceof StreamEndEvent) {
            type = EventType.STREAM_END;
        } else if( snakeyamlEvent instanceof DocumentStartEvent) {
            type = EventType.DOCUMENT_START;
        } else if( snakeyamlEvent instanceof DocumentEndEvent) {
            type = EventType.DOCUMENT_END;
        } else if( snakeyamlEvent instanceof MappingStartEvent) {
            type = EventType.MAPPING_START;
        } else if( snakeyamlEvent instanceof MappingEndEvent) {
            type = EventType.MAPPING_END;
        } else if( snakeyamlEvent instanceof SequenceStartEvent) {
            type = EventType.SEQUENCE_START;
        } else if( snakeyamlEvent instanceof SequenceEndEvent) {
            type = EventType.SEQUENCE_END;
        } else if( snakeyamlEvent instanceof ScalarEvent) {
            type = EventType.SCALAR;
            value = ((ScalarEvent) snakeyamlEvent).getValue();
        } else {
            type = EventType.UNSUPPORTED;
        }
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "YamlParsingEvent{" +
                "start=" + start +
                ", end=" + end +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
