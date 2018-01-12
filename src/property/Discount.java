/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.time.LocalDate;



/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Discount {
    private String description;
    private LocalDate startingDate;
    private LocalDate endingDate;

    /**
     *
     * @param description
     * @param startDate
     * @param endDate
     */
    public Discount(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startingDate = startDate;
        this.endingDate = endDate;
    }
    
    /**
     * 
     */
    public Discount() {
        this.description = "";
        this.startingDate = LocalDate.now();
        this.endingDate = LocalDate.now();
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
    public LocalDate getStartingDate() {
        return startingDate;
    }

    /**
     *
     * @param startingDate
     */
    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    /**
     *
     * @return
     */
    public LocalDate getEndingDate() {
        return endingDate;
    }

    /**
     *
     * @param endingDate
     */
    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
}
