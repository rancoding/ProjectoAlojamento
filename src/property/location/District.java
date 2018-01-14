/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property.location;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class District implements Serializable {
    private int id;
    private String name;
    List<County> counties;

    /**
     *
     * @param id
     * @param name
     */
    public District(int id, String name) {
        this.id = id;
        this.name = name;
        counties = new ArrayList<>();
    }
    
    /**
     *
     */
    public District() {
        this.id = -1;
        this.name = "";
        this.counties = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
    public List<County> getCounties() {
        return counties;
    }

    /**
     *
     * @param counties
     */
    public void setCounties(List<County> counties) {
        this.counties = counties;
    }
    
    
}
