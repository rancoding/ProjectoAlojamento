/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.contact;

import user.User;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Ticket {
    private int referenceID;
    private TicketType ticketType;
    private String subject;
    private String message;
    private Division division;
    private boolean finalised;
    private User sender;
    private Status status;
    private static int count;

    public Ticket(TicketType ticketType, String subject, String message, Division division, boolean finalised, Status status, User sender) {
        
        this.referenceID = count;
        this.ticketType = ticketType;
        this.subject = subject;
        this.message = message;
        this.division = division;
        this.finalised = finalised;
        this.status = status;
        this.sender = sender;
        count++;
    }
    
    public int getReferenceID() {
        return referenceID;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public boolean isFinalised() {
        return finalised;
    }

    public void setFinalised(boolean finalised) {
        this.finalised = finalised;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
