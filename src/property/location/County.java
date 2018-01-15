/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property.location;

import java.io.Serializable;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class County implements Serializable {
    private String name;
    
    @Override
    public String toString()
    {
        return name;
    }
    
    /**
     *
     * @param name
     */
    public County(String name) {
        this.name = name;
    }
    
    /**
     *
     */
    public County() {
        this.name = "";
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
    
}
