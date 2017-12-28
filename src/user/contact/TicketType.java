/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.contact;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class TicketType {
    private String name;
    private String description;
    private Category category;

    public TicketType(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }
    
    public TicketType() {
        this.name = "";
        this.description = "";
        this.category = new Category();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
}
