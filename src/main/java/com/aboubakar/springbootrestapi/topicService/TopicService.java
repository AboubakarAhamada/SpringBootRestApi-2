package com.aboubakar.springbootrestapi.topicService;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

import com.aboubakar.springbootrestapi.topic.Topic;

@Service
public class TopicService {

    private List <Topic> topics = Arrays.asList(
        new Topic("python", "Python", "Python and Jango"),
        new Topic("php", "PHP", "PHP & Wordpress"),
        new Topic("java", "Jave", "Java SE and JavaFX"),
        new Topic("jee", "Java", "Java EE and Spring Boot")
    );
    
    public Topic getOneTopic(String id){
        return topics.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Topic> getAllTopics(){
        return topics;
    }
    
}
