/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class BedType {
    private String description;

    /**
     *
     * @param description
     */
    public BedType(String description) {
        this.description = description;
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
}