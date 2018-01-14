/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property.location;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Location {
    private int id;
    private String name;
    List<District> districts;

    /**
     *
     * @param id
     * @param name
     */
    public Location(int id, String name) {
        this.id = id;
        this.name = name;
        districts = new ArrayList<>();
    }
    
    /**
     *
     */
    public Location() {
        this.id = -1;
        this.name = "";
        this.districts = new ArrayList<>();
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
    public List<District> getDistricts() {
        return districts;
    }

    /**
     *
     * @param districts
     */
    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
    
    
}
