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
    private List<Discount> oldDiscounts;
    private List<Discount> discounts;
    private List<Discount> extras;
    private List<Booking> bookings;
    private boolean closed;
    private static int count;

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
        this.oldDiscounts = new ArrayList<>();
        this.discounts = new ArrayList<>();
        this.extras = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.closed = closed;
        count++;
    }

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

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PropertyCharacteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(PropertyCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Discount> getOldDiscounts() {
        return oldDiscounts;
    }

    public void setOldDiscounts(List<Discount> oldDiscounts) {
        this.oldDiscounts = oldDiscounts;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public List<Discount> getExtras() {
        return extras;
    }

    public void setExtras(List<Discount> extras) {
        this.extras = extras;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Property.count = count;
    }
    
    /* Rating */
    /* ****** */
    
    public float getPropertyRatingMedianPoints() {
        float medianPoints = 0;
        
        for(Rating r : this.ratings)
        {
            medianPoints += r.getPoints();
        }
        
        return medianPoints / this.ratings.size();
    }
    
    public boolean verifyPoints(Float points) throws InvalidRatingPointsException {
        boolean valid = true;
        
        if(points < 0 || points > 10)
        {
            throw new InvalidRatingPointsException();
        }
        
        return valid;
    }
    
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
    
    public boolean verifyPhotoInfo(Photo p, Photo photo) throws ExistentPropertyPhotoException {
        boolean exists = false;
        
        if((p.getDirectory().equals(photo.getDirectory())) && (p.getName().equals(photo.getName())) && (p.getFormat().equals(photo.getFormat())))
        {
            throw new ExistentPropertyPhotoException();
        }
        
        return exists;
    }
    
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
    
    public boolean verifyDiscountDescription(Discount d, String description) throws ExistentDiscountDescriptionException {
        boolean exists = false;
        
        if(d.getDescription().equalsIgnoreCase(description))
        {
            throw new ExistentDiscountDescriptionException();
        }
        
        return exists;
    }
    
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
    
    public boolean verifyDate(Date date) {
        boolean valid = true;
        
        Date todaysDate =  new Date();
        
        if(todaysDate.after(date))
        {
            valid = false;
        }
        
        return valid;
    }
    
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
    
    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
    
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
