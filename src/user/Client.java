/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import property.Property;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Client extends User {
    
    private boolean banned;
    private List<Property> favorites;

    public Client(String username, String password, String name, String citizenID, int NIF, int phoneNumber, String address, String location, Date registerDate, boolean privateProfile){
        super(username, password, name, citizenID, NIF, phoneNumber, address, location, registerDate, privateProfile);
        this.banned = false;
        favorites = new ArrayList<>();
    }
    
    public Client() {
        super("","","","",-1,-1,"","",new Date(),false);
        this.banned = false;
        this.favorites = new ArrayList<>();
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public List<Property> getFavorite() {
        return favorites;
    }

    public void setFavorite(List<Property> favorites) {
        this.favorites = favorites;
    }
    
    
    
}
