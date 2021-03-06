package com.rondoiq.event.handler;

import com.rondoiq.event.event.StudentCreatedEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
public class StudentEventHandler {

    @EventHandler
    public void on(StudentCreatedEvent event) {
        System.out.println("Id in process: " + event.getId());
        System.out.println("Name in process : " + event.getName());
        System.out.println("Age in process : " + event.getAge());
    }

}
