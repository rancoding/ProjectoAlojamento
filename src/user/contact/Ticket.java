/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.contact;

import java.io.Serializable;
import user.User;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Ticket implements Serializable {
    private final int referenceID;
    private TicketType ticketType;
    private String subject;
    private String message;
    private boolean finalised;
    private User sender;
    private Status status;
    private String answer;
    private static int count;

    /**
     *
     * @param ticketType
     * @param subject
     * @param message
     * @param finalised
     * @param status
     * @param sender
     */
    public Ticket(TicketType ticketType, String subject, String message, boolean finalised, Status status, User sender) {
        
        this.referenceID = count;
        this.ticketType = ticketType;
        this.subject = subject;
        this.message = message;
        this.finalised = finalised;
        this.status = status;
        this.sender = sender;
        count++;
    }
    
    /**
     *
     */
    public Ticket() {
        this.referenceID = -1;
        this.ticketType = new TicketType();
        this.subject = "";
        this.message = "";
        this.finalised = false;
        this.status = new Status();
        this.sender = new User();
    }
    
    /**
     *
     * @return
     */
    public int getReferenceID() {
        return referenceID;
    }

    /**
     *
     * @return
     */
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     *
     * @param ticketType
     */
    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    /**
     *
     * @return
     */
    public String getSubject() {
        return subject;
    }

    /**
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @return
     */
    public boolean isFinalised() {
        return finalised;
    }

    /**
     *
     * @param finalised
     */
    public void setFinalised(boolean finalised) {
        this.finalised = finalised;
    }

    /**
     *
     * @return
     */
    public User getSender() {
        return sender;
    }

    /**
     *
     * @param sender
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

    /**
     *
     * @return
     */
    public Status getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }
    
    
}
