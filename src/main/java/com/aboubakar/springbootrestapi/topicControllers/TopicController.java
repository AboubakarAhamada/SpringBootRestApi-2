package com.aboubakar.springbootrestapi.topicControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
