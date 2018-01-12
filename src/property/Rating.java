/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;


import java.time.LocalDate;
import user.Client;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Rating {
    private String subject;
    private String message;
    private float points;
    private LocalDate ratingDate;
    private Client client;

    /**
     *
     * @param subject
     * @param description
     * @param points
     * @param ratingDate
     * @param client
     */
    public Rating(String subject, String description, float points, LocalDate ratingDate, Client client) {
        this.subject = subject;
        this.message = description;
        this.points = points;
        this.ratingDate = ratingDate;
        this.client = client;
    }
    
    public Rating() {
        this.subject = "";
        this.message = "";
        this.points = -1;
        this.ratingDate = LocalDate.now();
        this.client = new Client();
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
    public float getPoints() {
        return points;
    }

    /**
     *
     * @param points
     */
    public void setPoints(float points) {
        this.points = points;
    }

    /**
     *
     * @return
     */
    public LocalDate getRatingDate() {
        return ratingDate;
    }

    /**
     *
     * @param ratingDate
     */
    public void setRatingDate(LocalDate ratingDate) {
        this.ratingDate = ratingDate;
    }

    /**
     *
     * @return
     */
    public Client getClient() {
        return client;
    }

    /**
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
}
