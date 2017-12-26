package user;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import user.contact.Message;

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
    private boolean privateProfile;
    
    
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
    }

    public User() {
        this.username = "";
        this.password = "";
        this.name = "";
        this.citizenID = "";
        this.NIF = -1;
        this.phoneNumber = -1;
        this.address = "";
        this.location = "";
        this.registerDate = registerDate;
        this.privateProfile = privateProfile;
        messages = new ArrayList<>();
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public boolean isPrivateProfile() {
        return privateProfile;
    }

    public void setPrivateProfile(boolean privateProfile) {
        this.privateProfile = privateProfile;
    }
    
    
}
