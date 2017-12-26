/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Date;
import user.contact.Division;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Administrator extends User {
    
    private Division division;

    public Administrator(String username, String password, String name, String citizenID, int NIF, int phoneNumber, String address, String location, Date registerDate, boolean privateProfile){
        super(username, password, name, citizenID, NIF, phoneNumber, address, location, registerDate, privateProfile);
        this.division = new Division();
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }
    
    
    
}
