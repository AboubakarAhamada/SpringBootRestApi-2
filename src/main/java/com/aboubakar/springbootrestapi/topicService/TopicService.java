package com.aboubakar.springbootrestapi.topicService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aboubakar.springbootrestapi.topic.Topic;

@Service
public class TopicService {

    private List <Topic> topics = new ArrayList<>(Arrays.asList(
        new Topic("python", "Python", "Python and Jango"),
        new Topic("php", "PHP", "PHP & Wordpress"),
        new Topic("java", "Jave", "Java SE and JavaFX"),
        new Topic("jee", "Java", "Java EE and Spring Boot")
    ));
    
    public Topic getOneTopic(String id){
        return topics.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public List<Topic> getAllTopics(){
        return topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id){
        for(int i =0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        }
       

    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }

    
}
