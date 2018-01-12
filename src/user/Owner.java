/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Owner extends User {
    private boolean banned;

    public Owner(String username, String password, String name, String citizenID, int NIF, int phoneNumber, String address, String location, Date registerDate, boolean privateProfile){
        super(username, password, name, citizenID, NIF, phoneNumber, address, location, registerDate, privateProfile);
        this.banned = false;
    }
    
    

    public Owner() {
        
        super("","","","",-1,-1,"","", new Date(),false);
        this.banned = false;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
    
    
}
