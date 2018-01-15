/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.time.LocalDate;
import java.util.Date;
import property.location.County;
import user.contact.Division;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Administrator extends User {
    
    private Division division;

    /**
     *
     * @param username
     * @param password
     * @param name
     * @param citizenID
     * @param NIF
     * @param phoneNumber
     * @param address
     * @param location
     * @param registerDate
     * @param privateProfile
     */
    public Administrator(String username, String password, String name, String citizenID, int NIF, int phoneNumber, String address, County county, Date registerDate, boolean privateProfile){
        super(username, password, name, citizenID, NIF, phoneNumber, address, county, registerDate, privateProfile);
        this.division = new Division();
    }
    
    /**
     *
     */
    public Administrator() {
        super("","","","",-1,-1,"",new County(),new Date(),false);
        this.division = new Division();
    }

    /**
     *
     * @return
     */
    public Division getDivision() {
        return division;
    }

    /**
     *
     * @param division
     */
    public void setDivision(Division division) {
        this.division = division;
    }
    
    
    
}
