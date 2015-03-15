package mmalkiew.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mmalkiew on 2015-03-15.
 */
@Entity
public class Topic {

    @Id
    @GeneratedValue
    private Integer id;
    private String topicName;

    public Integer getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
