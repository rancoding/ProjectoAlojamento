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
public class Category implements Serializable {
    private String name;
    private String description;

    /**
     *
     * @param name
     * @param description
     */
    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    /**
     *
     */
    public Category() {
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
