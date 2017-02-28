package ak.research.yamlparser;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.events.Event;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ak435s on 2/28/2017.
 */
public class YamlParser {

    public Iterable<YamlParsingEvent> parse(Reader reader, String readerName) {
        List<YamlParsingEvent> events = new ArrayList<>();
        Iterable<Event> snakeyamlParsingEvents = new Yaml().parse(reader);
        for (Event snakeyamlParsingEvent : snakeyamlParsingEvents) {
            events.add( new YamlParsingEvent(snakeyamlParsingEvent, readerName));
        }
        return events;
    }
}
