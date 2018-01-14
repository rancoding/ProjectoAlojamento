/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.contact;

import java.io.Serializable;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Status implements Serializable {
    private String name;
    private String description;

    /**
     *
     * @param name
     * @param description
     */
    public Status(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    /**
     *
     */
    public Status() {
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
