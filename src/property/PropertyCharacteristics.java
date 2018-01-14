/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JSpinner;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class PropertyCharacteristics implements Serializable {
    private int minClients;
    private int maxClients;
    private int roomsQuantity;
    private int bathroomQuantity;
    private List<Room> rooms;
    private boolean pets;
    private boolean kitchen;
    private boolean washingMachine;
    private boolean breakfast;
    private boolean pool;
    private boolean wifi;

    /**
     *
     * @param minClients
     * @param maxClients
     * @param roomsQuantity
     * @param bathroomQuantity
     * @param pets
     * @param kitchen
     * @param washingMachine
     * @param breakfast
     * @param pool
     * @param wifi
     */
    public PropertyCharacteristics(int minClients, int maxClients, int roomsQuantity, int bathroomQuantity, boolean pets, boolean kitchen, boolean washingMachine, boolean breakfast, boolean pool, boolean wifi) {
        this.minClients = minClients;
        this.maxClients = maxClients;
        this.roomsQuantity = roomsQuantity;
        this.bathroomQuantity = bathroomQuantity;
        this.rooms = new ArrayList<>();
        this.pets = pets;
        this.kitchen = kitchen;
        this.washingMachine = washingMachine;
        this.breakfast = breakfast;
        this.pool = pool;
        this.wifi = wifi;
    }

    /**
     * 
     */
    public PropertyCharacteristics() {
        this.minClients = -1;
        this.maxClients = -1;
        this.roomsQuantity = -1;
        this.bathroomQuantity = -1;
        this.rooms = new ArrayList<>();
        this.pets = false;
        this.kitchen = false;
        this.washingMachine = false;
        this.breakfast = false;
        this.pool = false;
        this.wifi = false;
    }
    
    /**
     *
     * @return
     */
    public int getMinClients() {
        return minClients;
    }

    /**
     *
     * @param minClients
     */
    public void setMinClients(int minClients) {
        this.minClients = minClients;
    }

    /**
     *
     * @return
     */
    public int getMaxClients() {
        return maxClients;
    }

    /**
     *
     * @param maxClients
     */
    public void setMaxClients(int maxClients) {
        this.maxClients = maxClients;
    }

    /**
     *
     * @return
     */
    public int getRoomsQuantity() {
        return roomsQuantity;
    }

    /**
     *
     * @param roomsQuantity
     */
    public void setRoomsQuantity(int roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

    /**
     *
     * @return
     */
    public int getBathroomQuantity() {
        return bathroomQuantity;
    }

    /**
     *
     * @param bathroomQuantity
     */
    public void setBathroomQuantity(int bathroomQuantity) {
        this.bathroomQuantity = bathroomQuantity;
    }

    /**
     *
     * @return
     */
    public List<Room> getRooms() {
        return rooms;
    }

    /**
     *
     * @param rooms
     */
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    /**
     *
     * @return
     */
    public boolean isPets() {
        return pets;
    }

    /**
     *
     * @param pets
     */
    public void setPets(boolean pets) {
        this.pets = pets;
    }

    /**
     *
     * @return
     */
    public boolean isKitchen() {
        return kitchen;
    }

    /**
     *
     * @param kitchen
     */
    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    /**
     *
     * @return
     */
    public boolean isWashingMachine() {
        return washingMachine;
    }

    /**
     *
     * @param washingMachine
     */
    public void setWashingMachine(boolean washingMachine) {
        this.washingMachine = washingMachine;
    }

    /**
     *
     * @return
     */
    public boolean isBreakfast() {
        return breakfast;
    }

    /**
     *
     * @param breakfast
     */
    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    /**
     *
     * @return
     */
    public boolean isPool() {
        return pool;
    }

    /**
     *
     * @param pool
     */
    public void setPool(boolean pool) {
        this.pool = pool;
    }

    /**
     *
     * @return
     */
    public boolean isWifi() {
        return wifi;
    }

    /**
     *
     * @param wifi
     */
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
