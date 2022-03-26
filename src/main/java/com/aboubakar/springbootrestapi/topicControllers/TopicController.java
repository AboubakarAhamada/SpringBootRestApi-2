package com.aboubakar.springbootrestapi.topicControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.aboubakar.springbootrestapi.topic.Topic;
import com.aboubakar.springbootrestapi.topicService.TopicService;

@RestController
public class TopicController {
    
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics/{id}")
    public Topic getOneTopic(@PathVariable String id ){
        return topicService.getOneTopic(id);
    }

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping(method=RequestMethod.POST, value ="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method= RequestMethod.PUT, value ="/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
