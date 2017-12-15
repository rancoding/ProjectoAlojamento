/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.util.Date;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Discount {
    private String description;
    private Date startingDate;
    private Date endingDate;

    /**
     *
     * @param description
     * @param startDate
     * @param endDate
     */
    public Discount(String description, Date startDate, Date endDate) {
        this.description = description;
        this.startingDate = startDate;
        this.endingDate = endDate;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public Date getStartingDate() {
        return startingDate;
    }

    /**
     *
     * @param startingDate
     */
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    /**
     *
     * @return
     */
    public Date getEndingDate() {
        return endingDate;
    }

    /**
     *
     * @param endingDate
     */
    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }
}
