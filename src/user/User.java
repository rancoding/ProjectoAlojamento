package user;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import user.contact.Message;
import user.contact.Ticket;

/**
 *
 * @author Rafael
 * @author Gustavo
 */

public class User implements Serializable {
    private String username;
    private String password;
    private String name;
    private String citizenID;
    private int NIF;
    private int phoneNumber;
    private String address;
    private String location;
    private Date registerDate;
    private List<Message> messages;
    private List<Ticket> tickets;
    private boolean privateProfile;
    
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
    public User(String username, String password, String name, String citizenID, int NIF, int phoneNumber, String address, String location, Date registerDate, boolean privateProfile) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.citizenID = citizenID;
        this.NIF = NIF;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.location = location;
        this.registerDate = registerDate;
        this.privateProfile = privateProfile;
        messages = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    /**
     *
     */
    public User() {
        this.username = "";
        this.password = "";
        this.name = "";
        this.citizenID = "";
        this.NIF = -1;
        this.phoneNumber = -1;
        this.address = "";
        this.location = "";
        this.registerDate = new Date();
        this.privateProfile = false;
        messages = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
    public String getCitizenID() {
        return citizenID;
    }

    /**
     *
     * @param citizenID
     */
    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    /**
     *
     * @return
     */
    public int getNIF() {
        return NIF;
    }

    /**
     *
     * @param NIF
     */
    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    /**
     *
     * @return
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     *
     * @param phoneNumber
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     *
     * @param registerDate
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     *
     * @return
     */
    public List<Message> getMessages() {
        return messages;
    }

    /**
     *
     * @param messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    /**
     *
     * @return
     */
    public boolean isPrivateProfile() {
        return privateProfile;
    }

    /**
     *
     * @param privateProfile
     */
    public void setPrivateProfile(boolean privateProfile) {
        this.privateProfile = privateProfile;
    }
    
    
}
