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
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param description The bed type description
     */
    public BedType(String description) {
        this.description = description;
    }

    /**
     *
     * @return The bed type description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description The new bed type description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
