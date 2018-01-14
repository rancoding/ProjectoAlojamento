/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.util.Date;

/**
 * The discount class which contains its variables
 * @author Rafael
 * @author Gustavo
 */
public class Discount {
    
    private String description;
    private int percentage;
    private Date startingDate;
    private Date endingDate;

    /**
     * The Discount constructor
     * @param description What is the discount for and extra information
     * @param startDate The starting date of this discount
     * @param endDate The discount expiring date
     */
    public Discount(String description,int percentage, Date startDate, Date endDate) {
        this.description = description;
        this.percentage=percentage;
        this.startingDate = startDate;
        this.endingDate = endDate;
    }
    
    /**
     * The Discount constructor, requiring nothing and initializing variables with "empty" values and the current date
     */
    public Discount() {
        this.description = "";
        this.percentage = 0;
        this.startingDate = new Date();
        this.endingDate = new Date();
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    /**
     * Returns the current discount description
     * @return The discount description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a new discount description (which is sent as an argument)
     * @param description The new discount description to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the current discount starting date
     * @return The discount starting date
     */
    public Date getStartingDate() {
        return startingDate;
    }

    /**
     * Sets a new discount starting date (which is sent as an argument)
     * @param startingDate The new discount starting date to be set
     */
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    /**
     * Returns the current discount expiring date
     * @return The discount expiring date
     */
    public Date getEndingDate() {
        return endingDate;
    }

    /**
     * Sets a new discount expiring date (which is sent as an argument)
     * @param endingDate The new discount expiring date to be set
     */
    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
}
