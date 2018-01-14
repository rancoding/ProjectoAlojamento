/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import property.booking.Booking;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import property.exceptions.ExistentDiscountDescriptionException;
import property.exceptions.ExistentPropertyPhotoException;
import property.exceptions.InvalidRatingPointsException;
import user.Client;
import user.Owner;

/**
 * The property class which contains its variables
 * @author Rafael
 * @author Gustavo
 */
public class Property implements Serializable {
    private final int referenceID;
    private double pricePerNight;
    private String description;
    private PropertyType propertyType;
    private Owner owner;
    private PropertyCharacteristics characteristics;
    private List<Rating> ratings;
    private List<Photo> photos;
    private List<Discount> oldDiscounts;
    private List<Discount> discounts;
    private List<Discount> extras;
    private List<Booking> bookings;
    private boolean closed;
    private static int count = 0;

    /**
     * The Property constructor
     * @param pricePerNight The property cost per night
     * @param description The property description
     * @param propertyType The property type
     * @param owner Who owns the property
     * @param characteristics The multiple characteristics of the property
     * @param closed If the property is closed or not
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
        this.oldDiscounts = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.extras = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.closed = closed;
        count++;
    }

    /**
     * The Photo constructor, requiring nothing and initializing variables with "empty" values or -1 values
     */
    public Property() {
        this.referenceID = -1;
        this.pricePerNight = -1;
        this.description = "";
        this.propertyType = new PropertyType();
        this.owner = new Owner();
        this.characteristics = new PropertyCharacteristics();
        this.ratings = new ArrayList<>();
        this.photos = new ArrayList<>();
        this.oldDiscounts = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.extras = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.closed = false;
    }

    /**
     * Returns the current property price per night
     * @return The cost per night
     */
    public double getPricePerNight() {
        return pricePerNight;
    }

    /**
     * Sets a new cost per night (which is sent as an argument)
     * @param pricePerNight The new price per night to be set
     */
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    /**
     * Returns the current property description
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a new property description (which is sent as an argument)
     * @param description The new property description to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the current property type
     * @return The property type
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets a new property type (which is sent as an argument)
     * @param propertyType The new property type to be set
     */
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * Returns the current property owner
     * @return The Owner
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets a new owner (which is sent as an argument)
     * @param owner The new owner to be set
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Returns the current property characteristics
     * @return The property characteristics
     */
    public PropertyCharacteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets a new set of characteristics (which is sent as an argument)
     * @param characteristics The new characteristics to be set
     */
    public void setCharacteristics(PropertyCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * Returns the whole rating list
     * @return The property ratings list
     */
    public List<Rating> getRatings() {
        return ratings;
    }

    /**
     * Sets a new ratings list (which is sent as an argument)
     * @param ratings The new rating list to be set
     */
    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    /**
     * Returns the whole photo list
     * @return The property photo list
     */
    public List<Photo> getPhotos() {
        return photos;
    }

    /**
     * Sets a new photo list (which is sent as an argument)
     * @param photos The new photo list to be set
     */
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    /**
     * Returns the whole inactive discount list
     * @return The old property discount list
     */
    public List<Discount> getOldDiscounts() {
        return oldDiscounts;
    }

    /**
     * Sets a new old discounts list (which is sent as an argument)
     * @param oldDiscounts The new old discounts list to be set
     */
    public void setOldDiscounts(List<Discount> oldDiscounts) {
        this.oldDiscounts = oldDiscounts;
    }

    /**
     * Returns the whole discount list
     * @return The property discount list
     */
    public List<Discount> getDiscounts() {
        return discounts;
    }

    /**
     * Sets a new discounts list (which is sent as an argument)
     * @param discounts The new discounts list to be set
     */
    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    /**
     * Returns the whole extras list (Museum tickets, etc)
     * @return The property extras list
     */
    public List<Discount> getExtras() {
        return extras;
    }

    /**
     * Sets a new extras list (which is sent as an argument)
     * @param extras The new extras list to be set
     */
    public void setExtras(List<Discount> extras) {
        this.extras = extras;
    }

    /**
     * Returns the whole booking list
     * @return The property booking list
     */
    public List<Booking> getBookings() {
        return bookings;
    }

    /**
     * Sets a new booking list (which is sent as an argument)
     * @param bookings The new booking list to be set
     */
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    /**
     * Returns whether the property is closed or not
     * @return If the property is closed
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets the property to be either closed or open
     * @param closed If the property is to be set to closed or open
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    /**
     * Returns the current amount of properties, which is equal to the referenceID + 1
     * @return The amount of properties
     */
    public static int getCount() {
        return count;
    }
    
    /* Rating */
    /* ****** */

    /**
     *
     * @return
     */
    
    
    public float getPropertyRatingMedianPoints() {
        float medianPoints = 0;
        
        for(Rating r : this.ratings)
        {
            medianPoints += r.getPoints();
        }
        
        return medianPoints / this.ratings.size();
    }
    
    /**
     *
     * @param points
     * @return
     * @throws InvalidRatingPointsException
     */
    public boolean verifyPoints(Float points) throws InvalidRatingPointsException {
        boolean valid = true;
        
        if(points < 0 || points > 10)
        {
            throw new InvalidRatingPointsException();
        }
        
        return valid;
    }
    
    /**
     *
     * @param rating
     */
    public void addRating(Rating rating) {
        
        boolean valid = true;
        
        try
        {
            valid = verifyPoints(rating.getPoints());
        }
        catch (InvalidRatingPointsException e)
        {
            valid = false;
        }
        
        if(valid)
        {
            this.ratings.add(rating);
        }
    }
    
    /**
     *
     * @param oldRating
     * @param newRating
     * @return
     */
    public List editRating(Rating oldRating, Rating newRating) {
        List<Rating> newList = new ArrayList<>();
        
        for(Rating r : this.ratings)
        {
            if(r.equals(oldRating))
            {
                newList.add(newRating);
            }
            else
            {
                newList.add(r);
            }
        }
        
        return newList;
    }
    
    /* Photos */
    /* ****** */

    /**
     *
     * @param p
     * @param photo
     * @return
     * @throws ExistentPropertyPhotoException
     */
    
    
    public boolean verifyPhotoInfo(Photo p, Photo photo) throws ExistentPropertyPhotoException {
        boolean exists = false;
        
        if((p.getDirectory().equals(photo.getDirectory())) && (p.getName().equals(photo.getName())) && (p.getFormat().equals(photo.getFormat())))
        {
            throw new ExistentPropertyPhotoException();
        }
        
        return exists;
    }
    
    /**
     *
     * @param photo
     */
    public void addPhoto(Photo photo) {
        
        boolean exists = false;
        
        for(Photo p : this.photos)
        {
            try
            {
                exists = verifyPhotoInfo(p, photo);
            }
            catch(ExistentPropertyPhotoException e)
            {
                exists = false;
            }
        }
        
        if(exists)
        {
            this.photos.add(photo);
        }
    }
    
    /**
     *
     * @param oldPhoto
     * @param newPhoto
     * @return
     */
    public List editPhoto(Photo oldPhoto, Photo newPhoto) {
        List<Photo> newList = new ArrayList<>();
        
        for(Photo p : this.photos)
        {
            if(p.equals(oldPhoto))
            {
                newList.add(newPhoto);
            }
            else
            {
                newList.add(p);
            }
        }
        
        return newList;
    }
    
    /* Discounts */
    /* ********* */

    /**
     *
     * @param d
     * @param description
     * @return
     * @throws ExistentDiscountDescriptionException
     */
    
    
    public boolean verifyDiscountDescription(Discount d, String description) throws ExistentDiscountDescriptionException {
        boolean exists = false;
        
        if(d.getDescription().equalsIgnoreCase(description))
        {
            throw new ExistentDiscountDescriptionException();
        }
        
        return exists;
    }
    
    /**
     *
     * @param discount
     */
    public void addDiscount(Discount discount) {
        
        boolean exists = false;
        
        for(Discount d : this.discounts)
        {
            try
            {
                exists = verifyDiscountDescription(d, discount.getDescription());
            }
            catch(ExistentDiscountDescriptionException e)
            {
                exists = true;
            }
        }
        
        if(exists)
        {
            this.discounts.add(discount);
        }
    }
    
    /**
     *
     * @param date
     * @return
     */
    public boolean verifyDate(Date date) {
        boolean valid = true;
        
        Date todaysDate =  new Date();
        
        if(todaysDate.after(date))
        {
            valid = false;
        }
        
        return valid;
    }
    
    /**
     *
     */
    public void transferOldDiscounts() {
        
        Iterator it = this.discounts.iterator();
        
        while(it.hasNext())
        {
            Discount d = (Discount)it.next();
            
            if(!(verifyDate(d.getEndingDate())))
            {
                this.oldDiscounts.add(d);
                it.remove();
            }
        }
    }
    
    /**
     *
     * @param oldDiscount
     * @param newDiscount
     * @return
     */
    public List editDiscount(Discount oldDiscount, Discount newDiscount) {
        List<Discount> newList = new ArrayList<>();
        
        for(Discount d : this.discounts)
        {
            if(d.equals(oldDiscount))
            {
                newList.add(newDiscount);
            }
            else
            {
                newList.add(d);
            }
        }
        
        return newList;
    }
    
    /* Extras */
    /* ****** */

    /**
     *
     * @param extra
     */
    
    
    public void addExtras(Discount extra) {
        boolean exists = false;
        
        for(Discount d : this.extras)
        {
            try
            {
                exists = verifyDiscountDescription(d, extra.getDescription());
            }
            catch(ExistentDiscountDescriptionException e)
            {
                exists = true;
            }
        }
        
        if(exists)
        {
            this.extras.add(extra);
        }
    }
    
    /**
     *
     * @param oldExtra
     * @param newExtra
     * @return
     */
    public List editExtra(Discount oldExtra, Discount newExtra) {
        List<Discount> newList = new ArrayList<>();
        
        for(Discount d : this.extras)
        {
            if(d.equals(oldExtra))
            {
                newList.add(newExtra);
            }
            else
            {
                newList.add(d);
            }
        }
        
        return newList;
    }
    
    /* Booking */
    /* ******* */

    /**
     *
     * @param booking
     */
    
    
    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
    
    /**
     *
     * @param oldBooking
     * @param newBooking
     * @return
     */
    public List editBooking(Booking oldBooking, Booking newBooking) {
        List<Booking> newList = new ArrayList<>();
        
        for(Booking b : this.bookings)
        {
            if(b.equals(oldBooking))
            {
                newList.add(newBooking);
            }
            else
            {
                newList.add(b);
            }
        }
        
        return newList;
    }
    
   
    
    /* Listing */
    /* ******* */

    /**
     *
     * @param rating
     * @return
     */
    
    
    public List listRatings(Rating rating) {
        List<Rating> newList = this.ratings;
        
        if(!(rating.getRatingDate().equals(new Date())))
        {
            newList = newList.stream().filter(r -> r.getRatingDate().equals(rating.getRatingDate())).collect(Collectors.toList());
        }
        
        if(!(rating.getClient().equals(new Client())))
        {
            newList = newList.stream().filter(r -> r.getClient().equals(rating.getClient())).collect(Collectors.toList());
        }
        
        return newList;
    }
    
    /**
     *
     * @param booking
     * @return
     */
    public List listBookings(Booking booking) {
        List<Booking> newList = this.bookings;
        
        if(booking.getnClients() != -1)
        {
            newList = newList.stream().filter(b -> b.getnClients() == booking.getnClients()).collect(Collectors.toList());
        }
        
        // Pode tar só 1x e sem if porque é igual tar falso ou verdadeiro
        // A não ser que arranja algo sem ser false e true, se der pa meter tipo null faz-se 1 só mas != null
        if(booking.isConfirmed() == false)
        {
            newList = newList.stream().filter(b -> b.isConfirmed() == booking.isConfirmed()).collect(Collectors.toList());
        }
        else
        {
            newList = newList.stream().filter(b -> b.isConfirmed() == booking.isConfirmed()).collect(Collectors.toList());
        }
        
        if(booking.isClosed()== false)
        {
            newList = newList.stream().filter(b -> b.isClosed() == booking.isClosed()).collect(Collectors.toList());
        }
        else
        {
            newList = newList.stream().filter(b -> b.isClosed() == booking.isClosed()).collect(Collectors.toList());
        }
        
        if(booking.isPaid()== false)
        {
            newList = newList.stream().filter(b -> b.isPaid() == booking.isPaid()).collect(Collectors.toList());
        }
        else
        {
            newList = newList.stream().filter(b -> b.isPaid() == booking.isPaid()).collect(Collectors.toList());
        }
        
        if(!(booking.getBookingType().getName().equals("")))
        {
            newList = newList.stream().filter(b -> b.getBookingType().getName().equalsIgnoreCase(booking.getBookingType().getName())).collect(Collectors.toList());
        }
        
        if(!(booking.getPaymentType().getName().equals("")))
        {
            newList = newList.stream().filter(b -> b.getPaymentType().getName().equalsIgnoreCase(booking.getPaymentType().getName())).collect(Collectors.toList());
        }
        
        if(!(booking.getClient().equals(new Client())))
        {
            newList = newList.stream().filter(b -> b.getClient().equals(booking.getClient())).collect(Collectors.toList());
        }
        
        return newList;
    }
}
