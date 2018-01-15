/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import property.Property;
import property.PropertyType;
import property.BedType;
import property.location.County;
import property.location.Location;
import property.booking.PaymentType;
import property.booking.BookingType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import property.Discount;
import property.PropertyCharacteristics;
import property.Rating;
import property.Room;
import property.booking.Booking;
import user.User;
import user.contact.Category;
import user.contact.Division;
import user.contact.Status;
import user.contact.Ticket;
import user.contact.TicketType;
import property.exceptions.*;
import user.Client;
import user.Owner;
import user.exceptions.*;

/**
 * Repository where most of the lists will be saved
 * @author Rafael
 * @author Gustavo
 */
public class Repository implements Serializable {
    private static Repository repo = null;
    private Map<Property, County> properties;
    private List<PropertyType> propertiesTypes;
    private List<BedType> bedTypes;
    private List<County> counties;
    private List<PaymentType> paymentTypes;
    private List<BookingType> bookingTypes;
    private List<User> users;
    private List<Ticket> tickets;
    private List<Category> ticketCategories;
    private List<Status> ticketStatus;
    private List<TicketType> ticketTypes;
    private List<Division> divisions;
    
    /**
     * Initializes all the repository lists
     */
    public Repository() {
        this.properties = new LinkedHashMap<>();
        this.propertiesTypes = new ArrayList<>();
        this.bedTypes = new ArrayList<>();
        this.counties = new ArrayList<>();
        this.paymentTypes = new ArrayList<>();
        this.bookingTypes = new ArrayList<>();
        this.users = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.ticketCategories = new ArrayList<>();
        this.ticketStatus = new ArrayList<>();
        this.ticketTypes = new ArrayList<>();
        this.divisions = new ArrayList<>();
    }
    
   

    public static Repository getRepo()
    {
        if(repo == null)
        {
            repo = new Repository();
        }
        return repo;
    }
    
    /**
     * Returns the whole properties map
     * @return The existent properties map
     */
    public Map<Property, County> getProperties() {
        return properties;
    }

    /**
     * Returns the whole property types list
     * @return The existent property types
     */
    public List<PropertyType> getPropertiesTypes() {
        return propertiesTypes;
    }

    /**
     * Returns the whole bed types list
     * @return The existent bed types
     */
    public List<BedType> getBedTypes() {
        return bedTypes;
    }

    /**
     * Returns the whole county list
     * @return The existent counties (which includes districts and counties)
     */
    public List<County> getCounties() {
        return counties;
    }

    /**
     * Returns the whole payment types list
     * @return The existent payment types
     */
    public List<PaymentType> getPaymentTypes() {
        return paymentTypes;
    }

    /**
     * Returns the whole booking types list
     * @return The existent booking types
     */
    public List<BookingType> getBookingTypes() {
        return bookingTypes;
    }

    /**
     * Returns the whole user list
     * @return The existent users (Owners, Clients and Administrators)
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Returns the whole ticket list
     * @return The existent tickets
     */
    public List<Ticket> getTickets() {
        return tickets;
    }

    /**
     * Returns the whole ticket categories list
     * @return The existent ticket categories
     */
    public List<Category> getTicketCategories() {
        return ticketCategories;
    }

    /**
     * Returns the whole ticket status list
     * @return The existent ticket statuses
     */
    public List<Status> getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Returns the whole ticket types list
     * @return The existent ticket types
     */
    public List<TicketType> getTicketTypes() {
        return ticketTypes;
    }

    /**
     * Returns the whole division list
     * @return The existent divisions
     */
    public List<Division> getDivisions() {
        return divisions;
    }   
    
    /**
     * Sets a new property map (which is sent as an argument)
     * @param properties The new property map to be set
     */
    public void setProperties(Map<Property, County> properties) {
        this.properties = properties;
    }

    /**
     * Sets a new property type list (which is sent as an argument)
     * @param propertiesTypes The new property type list to be set
     */
    public void setPropertiesTypes(List<PropertyType> propertiesTypes) {
        this.propertiesTypes = propertiesTypes;
    }

    /**
     * Sets a new bed type list (which is sent as an argument)
     * @param bedTypes The new bed type list to be set
     */
    public void setBedTypes(List<BedType> bedTypes) {
        this.bedTypes = bedTypes;
    }

    /**
     * Sets a new county list (which is sent as an argument)
     * @param counties The new counties list to be set
     */
    public void setCounties(List<County> counties) {
        this.counties = counties;
    }

    /**
     * Sets a new payment type list (which is sent as an argument)
     * @param paymentTypes The new payment type list to be set
     */
    public void setPaymentTypes(List<PaymentType> paymentTypes) {
        this.paymentTypes = paymentTypes;
    }

    /**
     * Sets a new booking type list (which is sent as an argument)
     * @param bookingTypes The new booking type list to be set
     */
    public void setBookingTypes(List<BookingType> bookingTypes) {
        this.bookingTypes = bookingTypes;
    }

    /**
     * Sets a new user list (which is sent as an argument)
     * @param users The new user list to be set
     */
    public void setUsers(List<User> users) {
        this.users = users;
    } 
    
    /**
     * Sets a new ticket list (which is sent as an argument)
     * @param tickets The new ticket list to be set
     */
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    /**
     * Sets a new ticket category list (which is sent as an argument)
     * @param ticketCategories The new ticket category list to be set
     */
    public void setTicketCategories(List<Category> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }

    /**
     * Sets a new ticket status list (which is sent as an argument)
     * @param ticketStatus The new ticket status list to be set
     */
    public void setTicketStatus(List<Status> ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    /**
     * Sets a new ticket type list (which is sent as an argument)
     * @param ticketTypes The new ticket type list to be set
     */
    public void setTicketTypes(List<TicketType> ticketTypes) {
        this.ticketTypes = ticketTypes;
    }

    /**
     * Sets a new divisions list (which is sent as an argument)
     * @param divisions The new divisions list to be set
     */
    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    /* List */
    /* **** */

    /**
     * By receiving an object via parameter (whose contains the information to be listed), checks if every single variable that is to be searched is different than -1 or different than the current
     * property map info. If so, the map will be filtered to only contain the list of properties whose info is equal.
     * @param property The object which contains what is to be searched
     * @return The map that contains all the properties that correspond to the sent object
     */
    public Map listProperties(Property property, County county, double maxPrice) {
        Map<Property, County> newMap = this.properties;
        
        if(property.getPricePerNight() != -1)
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getPricePerNight() >= property.getPricePerNight()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getPricePerNight() <= maxPrice).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(!(property.getPropertyType().getName().equals("")))
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getPropertyType().getName().equalsIgnoreCase(property.getPropertyType().getName())).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().getMinClients() != -1)
        {
            newMap = newMap.entrySet().stream().filter(p -> property.getCharacteristics().getMinClients() >= p.getKey().getCharacteristics().getMinClients()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            newMap = newMap.entrySet().stream().filter(p -> property.getCharacteristics().getMinClients() <= p.getKey().getCharacteristics().getMaxClients()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().getRoomsQuantity() != -1)
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().getRoomsQuantity() >= property.getCharacteristics().getRoomsQuantity()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().getBathroomQuantity() != -1)
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().getBathroomQuantity() >= property.getCharacteristics().getBathroomQuantity()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().isPets())
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().isPets() == true).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().isKitchen())
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().isKitchen() == true).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().isWashingMachine())
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().isWashingMachine() == true).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().isBreakfast())
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().isBreakfast() == true).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().isPool())
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().isPool() == true).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getCharacteristics().isWifi())
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getCharacteristics().isWifi() == true).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(!(county.getName().equals("")))
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getValue().equals(county)).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(property.getDiscount().getPercentage() != -1)
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getDiscount().getPercentage() > 0).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(!(property.getExtras().isEmpty()))
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getExtras().isEmpty() == false).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        }
        
        if(!(property.getRatings().isEmpty()))
        {
            newMap = newMap.entrySet().stream().filter(p -> p.getKey().getRatings().isEmpty() == false).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            
            if(!(newMap.isEmpty()))
            {
                newMap = newMap.entrySet().stream().filter(p -> p.getKey().getPropertyRatingMedianPoints() >= property.getRatings().get(0).getPoints()).collect(Collectors.toMap(Entry::getKey, Entry::getValue));
            }
        }
        
        System.out.println("---------------");
        for(Map.Entry<Property,County> mp : newMap.entrySet())
        {
            System.out.println("");
            System.out.println("Descrição:");
            System.out.println(mp.getKey().getDescription());
            System.out.println("");
        }
        
        if(newMap.isEmpty())
            System.out.println("Sem alojamentos");
        
        return newMap;
    }
    
    /**
     * By receiving an object via parameter (whose contains the information to be listed), checks if every single variable that is to be searched is different than -1 or different than the current
     * ticket list info. If so, the list will be filtered to only contain the list of tickets whose info is equal.
     * @param ticket The object which contains what is to be searched
     * @return The list that contains all the tickets that correspond to the sent object
     */
    public List listTickets(Ticket ticket) {
        List<Ticket> newList = this.tickets;
        
        if(ticket.getReferenceID() != -1)
        {
            newList = newList.stream().filter(t -> t.getReferenceID() != -1).collect(Collectors.toList());
        }
        
        if(!(ticket.getTicketType().equals(new TicketType())))
        {
            newList = newList.stream().filter(t -> t.getTicketType().equals(ticket.getTicketType())).collect(Collectors.toList());
        }
        
        if(!(ticket.getTicketType().getName().equals(new TicketType())))
        {
            newList = newList.stream().filter(t -> t.getTicketType().getName().equals(ticket.getTicketType().getName())).collect(Collectors.toList());
        }
        
        if(!(ticket.getTicketType().getCategory().getName().equals(new Category())))
        {
            newList = newList.stream().filter(t -> t.getTicketType().getCategory().getName().equals(ticket.getTicketType().getCategory().getName())).collect(Collectors.toList());
        }
        
        if(ticket.isFinalised() == false)
        {
            newList = newList.stream().filter(t -> t.isFinalised() == ticket.isFinalised()).collect(Collectors.toList());
        }
        else
        {
            newList = newList.stream().filter(t -> t.isFinalised() == ticket.isFinalised()).collect(Collectors.toList());
        }
        
        if(!(ticket.getSender().equals(new User())))
        {
            newList = newList.stream().filter(t -> t.getSender().equals(ticket.getSender())).collect(Collectors.toList());
        }
        
        if(!(ticket.getStatus().equals(new Status())))
        {
            newList = newList.stream().filter(t -> t.getStatus().equals(ticket.getStatus())).collect(Collectors.toList());
        }
        
        return newList;
    }
    
    /**
     * By receiving an object via parameter (whose contains the information to be listed), checks if every single variable that is to be searched is different than -1 or different than the current
     * user list info. If so, the list will be filtered to only contain the list of tickets whose info is equal.
     * @param user The object which contains what is to be searched
     * @return The list that contains all the users that correspond to the sent object
     */
    public List listUsers(User user) {
        List<User> newList = this.users;
        
        if(!(user.getName().equals("")))
        {
            newList = newList.stream().filter(u -> u.getName().equals(user.getName())).collect(Collectors.toList());
        }
        
        if(!(user.getCitizenID().equals("")))
        {
            newList = newList.stream().filter(u -> u.getCitizenID().equals(user.getCitizenID())).collect(Collectors.toList());
        }
        
        if(user.getNIF() != -1)
        {
            newList = newList.stream().filter(u -> u.getNIF() == user.getNIF()).collect(Collectors.toList());
        }
        
        if(user.getPhoneNumber() != -1)
        {
            newList = newList.stream().filter(u -> u.getPhoneNumber() == user.getPhoneNumber()).collect(Collectors.toList());
        }
        
        if(!(user.getAddress().equals("")))
        {
            newList = newList.stream().filter(u -> u.getAddress().equals(user.getAddress())).collect(Collectors.toList());
        }
        
        if(!(user.getCounty().getName().equals("")))
        {
            newList = newList.stream().filter(u -> u.getCounty().equals(user.getCounty())).collect(Collectors.toList());
        }
        
        /*if(!(user.getRegisterDate().equals("0/0/0")))
        {
            newList = newList.stream().filter(u -> u.getRegisterDate() >= user.getRegisterDate()).collect(Collectors.toList());
        } Não sei fazer com datas ainda */
        
        if(user.isPrivateProfile() == false)
        {
            newList = newList.stream().filter(u -> u.isPrivateProfile() == user.isPrivateProfile()).collect(Collectors.toList());
        }
        else
        {
            newList = newList.stream().filter(u -> u.isPrivateProfile() == user.isPrivateProfile()).collect(Collectors.toList());
        }
        
        return newList;
    }
    
    /* Setters = Não sei como vamos fazer ainda */
    /* Mas vamos ter de saber em que posição está o objecto a que chegamos na lista para depois poder editalo */
    /* Pode-se fazer tipo: fazes get á lista (tipo getUsers()) e lá no swing (?) vais buscar o utilizador que queres, editas e fazes repo.setUsers(novaLista); ou algo assim */
    /* Não sei é se é no swing que vais buscar user ou se tem uma funçao daqui que retorna, idk */
    /* **************************************** */
    
    /*            Login            */
    /* *************************** */
    
    /**
     * Using a class parameter, allows you to login with any type of user within a single method. By sending as an argument the class Owner, Client or Administrator, we're able to check if the user exists
     * for the type of user specified (as a user can have both owner and client accounts).
     * @param c The class sent as an argument (Client, Owner or Administrator)
     * @param username The username of the user you want to log in as
     * @param password The password of the user you want to log in as
     * @return Either the user that was found, or an exception of no user found.
     * @throws user.exceptions.NonExistentUserException
     */
    public User login(Class c, String username, String password) {  
        System.out.println("Entrou na funçao");
        for(User u: this.users)
        {
            System.out.println("Entrou no if");
            System.out.println(c.toString());
            if(c.isInstance(u))
            {
                System.out.println("Sou um cliente");
                System.out.println("Username: " + u.getUsername() + " Password: " + u.getPassword());
                System.out.println("Username: " + username + " Password: " + password);
                if(username.equals(u.getUsername()) && password.equals(u.getPassword()))
                {
                    System.out.println("Encontrou");
                    return u;
                }
            }    
        }  
        
        return null;
    }
    
  
    /*        Property List        */
    /* *************************** */
    
    // Lista alojamentos dado uma localizaçao
    // Adiciona a uma lista para a retornar depois (para no swing termos a lista com a localizaçao dada)
    // deve ser algo assim

    /**
     * Searches the property map to to check if the given county exists in any property, returning a map containing those existent properties.
     * @param county The county that is to be searched within all the properties
     * @return A list of properties that are located at given county
     */
        public Map getPropertyByLocation(County county) {
        Map<Property, County> propertyMap = new HashMap<>(); // Não sei se é HashMap mas y
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            if(mp.getValue().equals(county))
            {
                propertyMap.put(mp.getKey(), county);
            }
        }
        
        return propertyMap;
    }
    
    // Lista alojamentos dado o Dono dos mesmos
    // Adiciona a uma lista para a retornar depois (para no swing termos a lista com o dono dado)

    /**
     * Searches the property map to check if the given owner owns any property, returning a map containing those properties.
     * @param owner The owner that is to be searched within all the properties
     * @return A list of properties that are owned by given owner
     */
        public Map getPropertyByOwner(Owner owner) {
        Map<Property, County> propertyOwner = new LinkedHashMap<>();

        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            if(mp.getKey().getOwner().equals(owner))
            {
                propertyOwner.put(mp.getKey(), mp.getValue());
            } 
        }
        
        return propertyOwner;
    }
    
    
    /*            Property Type            */
    /* *********************************** */
    
    /**
     * Checks whether a given property type name exists or not
     * @param pt The current property type list object
     * @param name The new property type name
     * @throws ExistentPropertyTypeNameException in case the property type name already exists inside the list
     */
    public void verifyPropertyTypeName(PropertyType pt, String name) throws ExistentPropertyTypeNameException {
        
        if(pt.getName().equals(name))
        {
            throw new ExistentPropertyTypeNameException();
        }
    }
    
    /**
     * Adds a property type if no exceptions are thrown
     * @param propertiesType The property type to be added
     */
    public void addPropertyType(PropertyType propertiesType) {
        boolean exists = false;
        
        for(PropertyType pt : this.propertiesTypes) // Mudar o for para um iterator
        {
            if(pt.getName().equals(propertiesType.getName()))
            {
                try
                {
                    verifyPropertyTypeName(pt, propertiesType.getName());
                }
                catch(ExistentPropertyTypeNameException ex)
                {
                    exists = true;
                }  
            }
        }
        
        if(!exists)
        {
            this.propertiesTypes.add(propertiesType);
        }
    }
    
    /**
     * Creates a new list and searches the current property type list to be able to know what is the property type to be modified, and then, if found, adds the new property type to the list instead of the existing property type
     * @param oldPropertyType The old property type to be able to check if it equals to the property type in the repository list
     * @param newPropertyType The new property type to add to the list if the old property type is found
     * @return The list with the modified property type
     */
    public List editPropertyType(PropertyType oldPropertyType, PropertyType newPropertyType) {
        List<PropertyType> newList = new ArrayList<>();
        
        for(PropertyType pt : this.propertiesTypes)
        {
            if(pt.equals(oldPropertyType))
            {
                newList.add(newPropertyType);
            }
            else
            {
                newList.add(pt);
            }
        }
        
        return newList;
    }
    
    
    /*            Bed Type            */
    /* ****************************** */
    
    /**
     * Checks whether a given bed type name exists or not
     * @param bt The bed type list value
     * @param name The new bed type name
     * @throws ExistentBedTypeNameException in case the bed type name already exists inside the list
     */
    public void verifyBedTypeName(BedType bt, String name) throws ExistentBedTypeNameException {
        if(bt.getName().equals(name))
        {
            throw new ExistentBedTypeNameException();
        }
    }
    
    /**
     * Adds a bed type if no exceptions are thrown
     * @param bedType The bed type to be added
     */
    public void addBedType(BedType bedType){
        
        boolean exists = false;
        
        for(BedType bt : this.bedTypes) // Mudar o for para um iterator
        {
            if(bt.getName().equals(bedType.getName()))
            {
                try
                {
                    verifyBedTypeName(bt, bedType.getName());
                }
                catch(ExistentBedTypeNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.bedTypes.add(bedType);  
        }
         
    }
    
    /**
     * Creates a new list and searches the current bed type list to be able to know what is the bed type to be modified, and then, if found, adds the new bed type to the list instead of the existing bed type
     * @param oldBedType The old bed type to be able to check if it equals to the bed type in the repository list
     * @param newBedType The new bed type to add to the list if the old bed type is found
     * @return The list with the modified bed type
     */
    public List editBedType(BedType oldBedType, BedType newBedType) {
        List<BedType> newList = new ArrayList<>();
        
        for(BedType bt : this.bedTypes)
        {
            if(bt.equals(oldBedType))
            {
                newList.add(newBedType);
            }
            else
            {
                newList.add(bt);
            }
        }
        
        return newList;
    }
    
    
    /*            Location            */
    /* ****************************** */
    
    /**
     * Check whether a given location name exists
     * @param l The location list value
     * @param name The new location name
     * @throws ExistentLocationNameException in case the location name already exists inside the list
     */
    public void verifyLocationName(Location l, String name) throws ExistentLocationNameException {
        if(l.getName().equals(name))
        {
            throw new ExistentLocationNameException();
        }
    }
    
    /*            Payment Type            */
    /* ********************************** */
    
    /**
     * Check whether a given payment type name exists or not
     * @param pt The payment type list value
     * @param name The new payment type name
     * @throws ExistentPaymentTypeNameException in case the payment type name already exists inside the list
     */
    public void verifyPaymentTypeName(PaymentType pt, String name) throws ExistentPaymentTypeNameException {
        if(pt.getName().equals(name))
        {
            throw new ExistentPaymentTypeNameException();
        }
    }
    
    /**
     * Adds a payment type if no exceptions are thrown
     * @param paymentType The payment type to be added
     */
    public void addPaymentType(PaymentType paymentType) {
        
        boolean exists = false;
        
        for(PaymentType pt : this.paymentTypes) // Mudar o for para um iterator
        {
            if(pt.getName().equals(paymentType.getName()))
            {
                try
                {
                    verifyPaymentTypeName(pt, paymentType.getName());
                }
                catch(ExistentPaymentTypeNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.paymentTypes.add(paymentType);
        }
    }
    
    /**
     * Creates a new list and searches the current payment type list to be able to know what is the payment type to be modified, and then, if found, adds the new payment type to the list instead of the existing payment type
     * @param oldPaymentType The old payment type to be able to check if it equals to the payment type in the repository list
     * @param newPaymentType The new payment type to add to the list if the old payment type is found
     * @return The list with the modified payment type
     */
    public List editPaymentType(PaymentType oldPaymentType, PaymentType newPaymentType) {
        List<PaymentType> newList = new ArrayList<>();
        
        for(PaymentType pt : this.paymentTypes)
        {
            if(pt.equals(oldPaymentType))
            {
                newList.add(newPaymentType);
            }
            else
            {
                newList.add(pt);
            }
        }
        
        return newList;
    }
    
    
    /*            Booking Type            */
    /* ********************************** */
    
    /**
     * Check whether a given booking type name exists
     * @param bt The booking type list value
     * @param name The new booking type name
     * @throws ExistentBookingTypeNameException in case the booking type name already exists inside the list
     */
    public void verifyBookingTypeName(BookingType bt, String name) throws ExistentBookingTypeNameException {
        if(bt.getName().equals(name))
        {
            throw new ExistentBookingTypeNameException();
        }
    }
    
    /**
     * Adds a booking type if no exceptions are thrown
     * @param bookingType The booking type to be added
     */
    public void addBookingType(BookingType bookingType) {
        
        boolean exists = false;
        
        for(BookingType bt : this.bookingTypes) // Mudar o for para um iterator
        {
            if(bt.getName().equals(bookingType.getName()))
            {
                try
                {
                    verifyBookingTypeName(bt, bookingType.getName());
                }
                catch(ExistentBookingTypeNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.bookingTypes.add(bookingType);
        }
        
    }
    
    /**
     * Creates a new list and searches the current booking type list to be able to know what is the booking type to be modified, and then, if found, adds the new booking type to the list instead of the existing booking type
     * @param oldBookingType The old booking type to be able to check if it equals to the booking type in the repository list
     * @param newBookingType The new booking type to add to the list if the old booking type is found
     * @return The list with the modified booking type
     */
    public List editBookingType(BookingType oldBookingType, BookingType newBookingType) {
        List<BookingType> newList = new ArrayList<>();
        
        for(BookingType bt : this.bookingTypes)
        {
            if(bt.equals(oldBookingType))
            {
                newList.add(newBookingType);
            }
            else
            {
                newList.add(bt);
            }
        }
        
        return newList;
    }
    
    
    /*            Ticket            */
    /* **************************** */

    /**
     * Adds a ticket to the repository ticket list
     * @param tickets The ticket to be added to the list
     */
    public void addTicket(Ticket tickets){
        this.tickets.add(tickets);   
    }
    
    
    /*            Ticket Type            */
    /* ********************************* */
    
    /**
     * Check whether a given ticket type name exists or not
     * @param tt The ticket type list value
     * @param name The new ticket type name
     * @throws ExistentTicketTypeNameException in case the ticket type name already exists inside the list
     */
    public void verifyTicketTypeName(TicketType tt, String name) throws ExistentTicketTypeNameException {
        if(tt.getName().equals(name))
        {
            throw new ExistentTicketTypeNameException();
        }
    }
    
    
    /**
     * Adds a ticket type if no exceptions are thrown
     * @param ticketType The ticket type to be added
     */
    public void addTicketType(TicketType ticketType){
        boolean exists = false;
        
        for(TicketType tt : this.ticketTypes) // Mudar o for para um iterator
        {
            if(tt.getName().equals(ticketType.getName()))
            {
                try
                {
                    verifyTicketTypeName(tt, ticketType.getName());
                }
                catch(ExistentTicketTypeNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.ticketTypes.add(ticketType);
        }
    }
    
    /**
     * Creates a new list and searches the current ticket type list to be able to know what is the ticket type to be modified, and then, if found, adds the new ticket type to the list instead of the existing ticket type
     * @param oldTicketType The old ticket type to be able to check if it equals to the ticket type in the repository list
     * @param newTicketType The new ticket type to add to the list if the old ticket type is found
     * @return The list with the modified ticket type
     */
    public List editTicketType(TicketType oldTicketType, TicketType newTicketType) {
        List<TicketType> newList = new ArrayList<>();
        
        for(TicketType tt : this.ticketTypes)
        {
            if(tt.equals(oldTicketType))
            {
                newList.add(newTicketType);
            }
            else
            {
                newList.add(tt);
            }
        }
        
        return newList;
    }
    
    
    /*            Ticket Category            */
    /* ************************************* */
    
    /**
     * Check whether a given ticket category name exists or not
     * @param tc The ticket category list value
     * @param name The new ticket category name
     * @throws ExistentTicketCategoryNameException in case the ticket category name already exists inside the list
     */
    public void verifyTicketCategoryName(Category tc, String name) throws ExistentTicketCategoryNameException {
        if(tc.getName().equals(name))
        {
            throw new ExistentTicketCategoryNameException();
        }
    }
    
    /**
     * Adds a ticket category if no exceptions are thrown
     * @param ticketCategory The ticket category to be added
     */
    public void addCategory(Category ticketCategory) {
        boolean exists = false;
        
        for(Category tc : this.ticketCategories) // Mudar o for para um iterator
        {
            if(tc.getName().equals(ticketCategory.getName()))
            {
                try
                {
                    verifyTicketCategoryName(tc, ticketCategory.getName());
                }
                catch(ExistentTicketCategoryNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.ticketCategories.add(ticketCategory);
        }
    }
    
    /**
     * Creates a new list and searches the current ticket category list to be able to know what is the ticket category to be modified, and then, if found, adds the new ticket category to the list instead of the existing ticket category
     * @param oldTicketCategory The old ticket category to be able to check if it equals to the ticket category in the repository list
     * @param newTicketCategory The new ticket category to add to the list if the old ticket category is found
     * @return The list with the modified ticket category
     */
    public List editTicketCategory(Category oldTicketCategory, Category newTicketCategory) {
        List<Category> newList = new ArrayList<>();
        
        for(Category tc : this.ticketCategories)
        {
            if(tc.equals(oldTicketCategory))
            {
                newList.add(newTicketCategory);
            }
            else
            {
                newList.add(tc);
            }
        }
        
        return newList;
    }
    
    
    /*            Ticket Status            */
    /* *********************************** */
    
    /**
     * Check whether a given ticket status name exists or not
     * @param ts The ticket status list value
     * @param name The new ticket status name
     * @throws ExistentTicketStatusNameException in case the ticket status name already exists inside the list
     */
    public void verifyTicketStatusName(Status ts, String name) throws ExistentTicketStatusNameException {
        if(ts.getName().equals(name))
        {
            throw new ExistentTicketStatusNameException();
        }
    }
    
     /**
     * Adds a ticket status if no exceptions are thrown
     * @param ticketStatus The ticket status to be added
     */
    public void addStatus(Status ticketStatus) {
        boolean exists = false;
        
        for(Status ts : this.ticketStatus) // Mudar o for para um iterator
        {
            if(ts.getName().equals(ticketStatus.getName()))
            {
                try
                {
                    verifyTicketStatusName(ts, ticketStatus.getName());
                }
                catch(ExistentTicketStatusNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.ticketStatus.add(ticketStatus);
        }
    }
    
    /**
     * Creates a new list and searches the current ticket status list to be able to know what is the ticket status to be modified, and then, if found, adds the new ticket status to the list instead of the existing ticket status
     * @param oldTicketStatus The old ticket status to be able to check if it equals to the ticket status in the repository list
     * @param newTicketStatus The new ticket status to add to the list if the old ticket status is found
     * @return The list with the modified ticket status
     */
    public List editTicketStatus(Status oldTicketStatus, Status newTicketStatus) {
        List<Status> newList = new ArrayList<>();
        
        for(Status ts : this.ticketStatus)
        {
            if(ts.equals(oldTicketStatus))
            {
                newList.add(newTicketStatus);
            }
            else
            {
                newList.add(ts);
            }
        }
        
        return newList;
    }
    
    /*            Division            */
    /* ****************************** */
    
    /**
     * Check whether a given division name exists or not
     * @param d The division list value
     * @param name The new division name
     * @throws ExistentDivisionNameException in case the division name already exists inside the list
     */
    public void verifyDivisionName(Division d, String name) throws ExistentDivisionNameException {
        if(d.getName().equals(name))
        {
            throw new ExistentDivisionNameException();
        }
    }
    
     /**
     * Adds a division if no exceptions are thrown
     * @param division The division to be added
     */
    public void addDivision(Division division){
        boolean exists = false;
        
        for(Division d : this.divisions) // Mudar o for para um iterator
        {
            if(d.getName().equals(division.getName()))
            {
                try
                {
                    verifyDivisionName(d, division.getName());
                }
                catch(ExistentDivisionNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.divisions.add(division);
        }
    }
  
    /**
     * Creates a new list and searches the current division list to be able to know what is the division to be modified, and then, if found, adds the new division to the list instead of the existing division
     * @param oldDivision The old division to be able to check if it equals to the division in the repository list
     * @param newDivision The new division to add to the list if the old division is found
     * @return The list with the modified division
     */
    public List editDivision(Division oldDivision, Division newDivision) {
        List<Division> newList = new ArrayList<>();
        
        for(Division d : this.divisions)
        {
            if(d.equals(oldDivision))
            {
                newList.add(newDivision);
            }
            else
            {
                newList.add(d);
            }
        }
        
        return newList;
    }
    
    
   
    
    //////////////////////////////////////////// Adding User /////////////////////////////////////////////
    
    /**
    *   Checks if the Citizen ID already exists in a given user
    *   @param user Current user in the list
    *   @param citizenID New user Citizen ID
    *   @return If the citizenID exists or not
    */
    public boolean verifyCitizenID(User user, String citizenID) {
        boolean exists = false;
        
        if(user.getCitizenID().equals(citizenID))
        {
            exists = true;
        }
        
        return exists;
    }
    
    /**
    *   Checks if the NIF already exists in a given user
    *   @param user Current user in the list
    *   @param NIF New user NIF
    *   @return If the NIF exists or not
    */
    public boolean verifyNIF(User user, int NIF) {
        boolean exists = false;
        
        if(user.getNIF() == NIF)
        {
            exists = true;
        }
        
        return exists;
    }
    
    /**
    *   Check if the username is already in the repository list 
    *   @param user User already created to know his username
    *   @param username username sent to see if exists another user with the same username
    *   @return If the username exists or not
    */
    public boolean verifyUsername(User user, String username)
    {
        boolean exists = false;
        
        if(user.getUsername().equals(username))
        {
            exists = true;
        }
        
        return exists;
    }
    
    /**
     * Verifies the new user CitizenID, NIF and Username to check if it exists already or not
     * @param u The current user in the list
     * @param user The user to be added and verify
     * @throws ExistentCitizenIdException in case the citizen ID already exists
     * @throws ExistentNifException in case the NIF already exists
     * @throws ExistentUsernameException in case the username is already taken
     */
    public void verifyUserInfo(User u, User user) throws ExistentCitizenIdException, ExistentNifException, ExistentUsernameException {
        boolean exists;
        
        exists = verifyCitizenID(u, user.getCitizenID());
        if(exists)
        {
            throw new ExistentCitizenIdException();
        }
        
        exists =  verifyNIF(u, user.getNIF());
        if(exists)
        {
            throw new ExistentNifException();
        }
        
        exists = verifyUsername(u, user.getUsername());
        if(exists)
        {
            throw new ExistentUsernameException();
        }
    }
    
    //Add users in the list

    /**
     * Adds a user while verifying its data between all types of users, meaning if a username, citizen ID or NIF already exists in a client, an owner or admin cannot create that user
     * @param user The new user information
     */
        public void addUser(User user)  {
        
        boolean exists = false;
        
        for(User u: users)
        {
            try
            {
                verifyUserInfo(u, user);
            }
            catch(ExistentCitizenIdException | ExistentNifException | ExistentUsernameException ex)
            {
                exists = true;
            }
        }
        
        if(!exists)
        {
            this.users.add(user);
        }
    }
    
    /**
     * Adds a user not verifying all types of users, meaning a client can create an owner account with the same account information, and vice-versa.
     * @param c The class in which the to be added user is situated
     * @param user The to be added user information
     */
    public void addUserAutoRegister(Class c, User user) {
         boolean exists = false;
        
        for(User u: users)
        {
            if(c.isInstance(u)){
                try
                {
                    verifyUserInfo(u, user);
                }
                catch(ExistentCitizenIdException | ExistentNifException | ExistentUsernameException ex)
                {
                    exists = true;
                }  
            }    
        }
        
        if(!exists)
        {
            this.users.add(user);
        }
    }
    
    ///////////////////////////////////////// Adding Property //////////////////////////////////////////////
    
    //Add properties in the list

    /**
     * Adds a property to the repository map
     * @param property The property info
     * @param county The county in which the property is situated
     */
        public void addProperty(Property property, County county) {
        this.properties.put(property, county);
    }
    
    /**
     * Gets the lowest number of clients within all the existent properties
     * @return The minimum number of clients found
     */
    public int getLowestNumberOfClients() {
        
        int min = 0;
        int pos = 0;
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            if(pos == 0)
            {
                pos = 1;
                min = mp.getKey().getCharacteristics().getMinClients();
            }
                
            if(min > mp.getKey().getCharacteristics().getMinClients())
            {
                min = mp.getKey().getCharacteristics().getMinClients();
            }
        }
        
        return min;
    }
    
    /**
     * Gets the highest number of clients within all the existent properties
     * @return The maximum number of clients found
     */
    public int getHighestNumberOfClients() {
        
        int max = 0;
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            if(max < mp.getKey().getCharacteristics().getMaxClients())
            {
                max = mp.getKey().getCharacteristics().getMaxClients();
            }
        }
        
        return max;
    }

    /**
     * This function will create an empty list (which will be returned at the end) and at each iteration inside the properties map, if it does not found the property county inside the created list
     * it will add that county to the list.
     * @return The list of all the locations that are available within all the existent properties
     */
    public List getAllPropertyLocations() {
        List<County> counties = new ArrayList<>();
        boolean exists = false;
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            for(County c : counties)
            {
                if(mp.getValue().getName().equals(c.getName()))
                {
                   exists = true; 
                }
            }
            
            if(!exists)
            {
                counties.add(mp.getValue());
            }
            exists = false;
        }
        
        return counties;
    }
    
    /**
     * This function will create an empty list (which will be returned at the end) and at each iteration inside the properties map, if it does not found the property type inside the created list
     * it will add that type to the list.
     * @return The list of all the property types that exist within all the existent properties
     */
    public List getAllPropertyTypes() {
        List<PropertyType> propertyTypes = new ArrayList<>();
        boolean exists = false;
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            for(PropertyType pt : propertyTypes)
            {
                if(mp.getKey().getPropertyType().equals(pt))
                {
                   exists = true; 
                }
            }
            
            if(!exists)
            {
                propertyTypes.add(mp.getKey().getPropertyType());
            }
            exists = false;
        }
        
        return propertyTypes;
    }
    
    /** 
     * This function will create an empty list (which will be returned at the end) and at each iteration inside the properties map, and then it will search the property
     * map rooms list, and then the bed types list inside those rooms, and then for each existent bed type on the created list it will see if it equals the room bed types
     * @return The list of all the bed types that exist within all the existent properties and their rooms
     */
    public List getAllBedTypes() {
        List<BedType> bedTypes = new ArrayList<>();
        boolean exists = false;
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            List<Room> rooms = mp.getKey().getCharacteristics().getRooms();
            for(Room r : rooms)
            {
                List<BedType> existingBeds = r.getBedType();
                for(BedType bt2 : existingBeds)
                {
                    for(BedType bt : bedTypes)
                    {
                        if(bt2.equals(bt))
                        {
                            exists = true;
                        }
                    }
                        
                    if(!exists)
                    {
                        bedTypes.add(bt2);
                    }
                        
                    exists = false;
                }
            }
        }
        
        return bedTypes;
    }
    
    /////////////////////// Show Owner Properties ////////////////////
    
    public Map<Property, County> ownerProperties(User user){
        Map<Property, County> map = this.getProperties();
       
        for(Map.Entry<Property, County> mp : map.entrySet()){
            if(mp.getKey().getOwner().equals(user)){
                map.put(mp.getKey(), mp.getValue()); 
            }
        }
        return map;
    }
    
    /////Number Owner Properties ///////
    
    public int nPropertiesByOwner(User user){
        int count =0;
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet()){
            if(mp.getKey().getOwner().equals(user)){
                count++;
            }
        }
        return count;
    }
    
    ///// Number of Property from Owner //////////
    
    public Property currentProperty(Map<Property, County> map, int position){
        int number = 0;
        
        for(Map.Entry<Property, County> mp : map.entrySet())
        {
            if(number == position){
                return mp.getKey();
            
            }
            number++;
        }
        return null;
    }
    
    //////// Number of Beds in Property ////////
    
    public int nBeds(Property p){
        int n = 0;
        for(Room rooms : p.getCharacteristics().getRooms()){
            n = n + rooms.getBedsQuantity();
        }
        return n;
    }
    
   
    
    
    ////////////////////////////////////// Edit /////////////////////////////////////////
    
    /////////// Edit Users ///////////////
    
    /**
     * Creates an empty list and searches within the repository user list (checking if the user is an instance of the send class) for a given user and if found, adds it to the new list instead of the current user.
     * In case the user isn't an instance of the class, then it will just add the current user.
     * @param c The class to know if it is an instance of the current user on the list
     * @param user The user with modified information
     * @return The list with the modified user
     */
    public List<User> editUsers(Class c, User user) {
        
    List<User> novaLista = new ArrayList<>();
    
    for(User u : users) 
    {
        if(c.isInstance(u))
        {
            if(u.getUsername().equals(user.getUsername()))
            {
                novaLista.add(user);
            }
            else
            {
                novaLista.add(u);
            }
        }
        else
        {
            novaLista.add(u);
        }
    }
    
    return novaLista;
    }
    
    ////////////////////////////////////// List /////////////////////////////////////////
    
    //////////// List Type of Users //////////////
    
    /**
     * Lists all the user that are of a given class (Owner, Client, Administrator)
     * @param c The class which the user belongs to
     * @return The list of users in the given class
     */
    public List<User> listUserTypes(Class c) {
        return this.users.stream().filter(p -> c.isInstance(p)).collect(Collectors.toList());     
    }
    
    //////////////////////////////////////////// Serialize and Deserialize Lists ///////////////////////////////////////////

    /**
     * Serializes a given list to a given file
     * @param fileName Name of the file to put the information
     * @param list List that contains information to place on the file
     */
    public void serializing(String fileName, List list) {
        
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            os.writeObject(list);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ficheiro não encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Não sei o que é");
        }
    
    }
    
    /**
     * Deserializes a given file to a given list
     * @param fileName Name of the file containing the information
     * @param list List to contain the file information
     */
    public void deserializing(String fileName, List list) {
        
        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(fileName)))
        {
            list = (List)os.readObject();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ficheiro não encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Não sei o que é");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Classe não encontrada");
        }
    
    }
    
    //////////////////////////////////////////// Serialize and Deserialize Maps ///////////////////////////////////////////
  
    /**
     * Serializes a given map to a given file
     * @param fileName Name of the file to put the information
     * @param map map that contains information to place on the file
     */
    public void serializing(String fileName, Map map) {
        
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            os.writeObject(map);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ficheiro não encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Não sei o que é");
        }
    
    }
    
    /**
     * Deserializes a given file to a given map
     * @param fileName Name of the file containing the information
     * @param map Mapto contain the file information
     */
    public void deserializing(String fileName, Map map) {
        
        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream(fileName)))
        {
            map = (Map)os.readObject();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ficheiro não encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Não sei o que é");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Classe não encontrada");
        }
    
    }
    
    public static void serialize() {
        
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("repository.ser")))
        {
            os.writeObject(repo);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ficheiro não encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Não sei o que é");
        }
    
    }
    
    public static Repository deserialize() {
        
        try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("repository.ser")))
        {
            repo = (Repository)os.readObject();
            System.out.println("ola");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Ficheiro não encontrado");
            return null;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("Classe não encontrada");
            return null;
        }
    
        return repo;
    }
    
    public List getBookingsByClient(Client client) {
        List<Booking> bookings = new ArrayList<>();
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            for(Booking b : mp.getKey().getBookings())
            {
                if(b.getClient().equals(client))
                {
                    bookings.add(b);
                }
            }
        }
        
        return bookings;
    }
    
    public List getOwnerBookings(Owner owner) {
        Map<Property, County> mp = this.getPropertyByOwner(owner);
        List<Booking> bookings = new ArrayList<>();
        
        for(Map.Entry<Property, County> m : mp.entrySet())
        {
            if(m.getKey().getOwner().equals(owner))
            {
                for(Booking b : m.getKey().getBookings())
                {
                    bookings.add(b);
                }
            }
        }
        
        return bookings;
    }
    
    public String getBookingOwnerName(Booking booking) {
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            for(Booking b : mp.getKey().getBookings())
            {
                if(b.getReferenceID() == booking.getReferenceID())
                {
                    return mp.getKey().getOwner().getName();
                }
            }
        }
        
        return "";
    }
}


