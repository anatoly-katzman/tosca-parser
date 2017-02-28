package ak.research.yamlparser;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.events.Event;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by ak435s on 2/28/2017.
 */
public class TrySnakeyaml {
    public static void main(String[] args) throws FileNotFoundException {
        new TrySnakeyaml().tryYamlParser();
    }

    private void trySnakeYaml() throws FileNotFoundException {
        System.out.println("start");
        String testFile = "C:\\MyProjects\\tosca-parser\\tosca-yaml-parser\\src\\main\\resources\\template_snmpc.yaml";
        Iterable<Event> events = new Yaml().parse(new FileReader(new File(testFile)));
        for (Event event : events) {
            Event aaa = event;
            System.out.println(event);
        }
        System.out.println("end");
    }

    private void tryYamlParser() throws FileNotFoundException {
        System.out.println("start");
//        String testFile = "C:\\MyProjects\\tosca-parser\\tosca-yaml-parser\\src\\main\\resources\\template_snmpc.yaml";
        String testFile = "C:\\MyProjects\\tosca-parser\\tosca-yaml-parser\\src\\main\\resources\\short_template_snmpc.yaml";
        YamlParser parser = new YamlParser();
        Iterable<YamlParsingEvent> events = parser.parse(new FileReader(new File(testFile)), testFile);
        for (YamlParsingEvent event : events) {
            YamlParsingEvent aaa = event;
            System.out.println(event);
        }
        System.out.println("end");
    }

    private void tryYamlOnInvalidInput() throws FileNotFoundException {
        System.out.println("start!");
        String testFile = "C:\\MyProjects\\tosca-parser\\tosca-yaml-parser\\src\\main\\resources\\template_snmpc.yaml";

        FileReader reader = new FileReader(new File(testFile));

        Yaml yaml = new Yaml();
        Object load = yaml.load(reader);

        System.out.println("end!");
    }

}
