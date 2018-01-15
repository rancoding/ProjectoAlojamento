/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.io.Serializable;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class PropertyType implements Serializable {
    private String name;
    private String description;

    @Override
    public String toString()
    {
        return name;
    }
    
    /**
     *
     * @param name
     * @param description
     */
    public PropertyType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 
     */
    public PropertyType() {
        this.name = "";
        this.description = "";
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
