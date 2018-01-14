/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.contact;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class TicketType implements Serializable {
    private String name;
    private String description;
    private Category category;
    private List<Division> divisions;

    /**
     *
     * @param name
     * @param description
     * @param category
     */
    public TicketType(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.divisions = new ArrayList<>();
    }
    
    /**
     *
     */
    public TicketType() {
        this.name = "";
        this.description = "";
        this.category = new Category();
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

    /**
     *
     * @return
     */
    public Category getCategory() {
        return category;
    }

    /**
     *
     * @param category
     */
    public void setCategory(Category category) {
        this.category = category;
    }
    
    public List<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }
}
