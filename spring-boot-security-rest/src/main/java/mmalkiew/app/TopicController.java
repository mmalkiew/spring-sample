package mmalkiew.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mmalkiew on 2015-03-15.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @RequestMapping(name="/getTopic", method = RequestMethod.GET)
    public List<Topic> getAllTopic(){
        return topicRepository.findAll();
    }

    @RequestMapping(name="/saveTopic", method = RequestMethod.POST)
    public void saveTopic(Integer id, @RequestParam("topicName")String topicName){
        Topic topic = new Topic();
        topic.setId(id);
        topic.setTopicName(topicName);

        topicRepository.save(topic);
    }
}
