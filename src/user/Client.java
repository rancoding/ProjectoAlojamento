/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.time.LocalDate;
import property.Property;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import property.location.County;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Client extends User {
    
    private boolean banned;
    private List<Property> favorites;

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
    public Client(String username, String password, String name, String citizenID, int NIF, int phoneNumber, String address, County county, Date registerDate, boolean privateProfile){
        super(username, password, name, citizenID, NIF, phoneNumber, address, county, registerDate, privateProfile);
        this.banned = false;
        favorites = new ArrayList<>();
    }
    
    /**
     *
     */
    public Client() {
        super("","","","",-1,-1,"",new County(), new Date(),false);
        this.banned = false;
        this.favorites = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public boolean isBanned() {
        return banned;
    }

    /**
     *
     * @param banned
     */
    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    /**
     *
     * @return
     */
    public List<Property> getFavorite() {
        return favorites;
    }

    /**
     *
     * @param favorites
     */
    public void setFavorite(List<Property> favorites) {
        this.favorites = favorites;
    }
    
    
    
}
