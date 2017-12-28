/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.contact;

import java.util.ArrayList;
import java.util.List;
import user.User;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Message {
    
    private String subject;
    private String message;
    private User sender;
    private List<User> receivers;

    public Message(String subject, String description, User sender, List<User> receivers) {
        this.subject = subject;
        this.message = description;
        this.sender = sender;
        this.receivers = receivers;
    }
    
    public Message() {
        this.subject = "";
        this.message = "";
        this.sender = new User();
        this.receivers = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public List<User> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<User> receivers) {
        this.receivers = receivers;
    }
    
}
