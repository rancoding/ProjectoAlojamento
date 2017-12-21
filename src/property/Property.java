/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import property.booking.Booking;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import user.Owner;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Property implements Serializable{
    private final int referenceID;
    private double pricePerNight;
    private String description;
    private PropertyType propertyType;
    private Owner owner;
    private PropertyCharacteristics characteristics;
    private List<Rating> ratings;
    private List<Photo> photos;
    private List<Discount> discounts;
    private List<Discount> extras;
    private List<Booking> bookings;
    private static int count;
    private boolean closed;

    /**
     *
     * @param pricePerNight
     * @param description
     * @param propertyType
     * @param owner
     * @param characteristics
     */
    public Property(double pricePerNight, String description, PropertyType propertyType, Owner owner, PropertyCharacteristics characteristics, boolean closed) {
        this.referenceID = count;
        this.pricePerNight = pricePerNight;
        this.description = description;
        this.propertyType = propertyType;
        this.owner = owner;
        this.characteristics = characteristics;
        this.ratings = new ArrayList<>();
        this.photos = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.extras = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.closed = closed;
        count++;
    }

    
    /**
     *
     * @return
     */
    public int getReferenceID() {
        return referenceID;
    }

    /**
     *
     * @return
     */
    public double getPricePerNight() {
        return pricePerNight;
    }

    /**
     *
     * @param pricePerNight
     */
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     *
     * @param propertyType
     */
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    /**
     *
     * @return
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     *
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     *
     * @return
     */
    public PropertyCharacteristics getCharacteristics() {
        return characteristics;
    }

    /**
     *
     * @param characteristics
     */
    public void setCharacteristics(PropertyCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    /**
     *
     * @return
     */
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     *
     * @param ratings
     */
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    /**
     *
     * @return
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     *
     * @param photos
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    /**
     *
     * @return
     */
    public List<Discount> getDiscounts() {
        return discounts;
    }

    /**
     *
     * @param discounts
     */
    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    /**
     *
     * @return
     */
    public List<Discount> getExtras() {
        return extras;
    }

    /**
     *
     * @param extras
     */
    public void setExtras(List<Discount> extras) {
        this.extras = extras;
    }

    /**
     *
     * @return
     */
    public List<Booking> getBookings() {
        return bookings;
    }

    /**
     *
     * @param bookings
     */
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
    
    
    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
    
    
}
