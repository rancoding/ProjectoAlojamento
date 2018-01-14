/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.io.Serializable;

/**
 * The bed type class which contains its variables
 * @author Rafael
 * @author Gustavo
 */
public class BedType implements Serializable {
    private String name;
    private String description;

    /**
     * The BedType constructor
     * @param name The bed type name
     * @param description The bed type description
     */
    public BedType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * The BedType constructor, requiring only a description
     * @param description The bed type description
     */
    public BedType(String description) {
        this.description = description;
    }

    /**
     * The BedType constructor, requiring nothing and initializing variables with "empty" values
     */
    public BedType() {
        this.name = "";
        this.description = "";
    }
    
    /**
     * Returns the current bed type name
     * @return The bed type name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new bed type name (which is sent as an argument)
     * @param name The new bed type name to be set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Returns the current bed type description
     * @return The bed type description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a new bed type description (which is sent as an argument)
     * @param description The new bed type description to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
