package 初版;

import java.util.Arrays;
import java.util.List;

public class Dictionary {
    private String name;
    private List<Topic> topics;

    public Dictionary(String name, Topic... topics) {
        this.name = name;
        this.topics = Arrays.asList(topics);
    }

    public String getName() {
        return name;
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
