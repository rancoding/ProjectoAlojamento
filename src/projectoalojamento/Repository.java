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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import user.User;
import user.contact.Category;
import user.contact.Division;
import user.contact.Status;
import user.contact.Ticket;
import user.contact.TicketType;
import property.exceptions.*;
import user.exceptions.*;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Repository {
    private final Map<Property, County> properties;
    private final List<PropertyType> propertiesTypes;
    private final List<BedType> bedTypes;
    private final List<Location> locations;
    private final List<PaymentType> paymentTypes;
    private final List<BookingType> bookingTypes;
    private List<User> users;
    private final List<Ticket> tickets;
    private final List<Category> ticketCategories;
    private final List<Status> ticketStatus;
    private final List<TicketType> ticketTypes;
    private final List<Division> divisions;
    
    public Repository() {
        this.properties = new HashMap<>();
        this.propertiesTypes = new ArrayList<>();
        this.bedTypes = new ArrayList<>();
        this.locations = new ArrayList<>();
        this.paymentTypes = new ArrayList<>();
        this.bookingTypes = new ArrayList<>();
        this.users = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.ticketCategories = new ArrayList<>();
        this.ticketStatus = new ArrayList<>();
        this.ticketTypes = new ArrayList<>();
        this.divisions = new ArrayList<>();
    }

    public Map<Property, County> getProperties() {
        return properties;
    }

    public List<PropertyType> getPropertiesTypes() {
        return propertiesTypes;
    }

    public List<BedType> getBedTypes() {
        return bedTypes;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public List<PaymentType> getPaymentTypes() {
        return paymentTypes;
    }

    public List<BookingType> getBookingTypes() {
        return bookingTypes;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public List<Category> getTicketCategories() {
        return ticketCategories;
    }

    public List<Status> getTicketStatus() {
        return ticketStatus;
    }

    public List<TicketType> getTicketTypes() {
        return ticketTypes;
    }

    public List<Division> getDivisions() {
        return divisions;
    }

    /* Setters = Não sei como vamos fazer ainda */
    /* Mas vamos ter de saber em que posição está o objecto a que chegamos na lista para depois poder editalo */
    /* Pode-se fazer tipo: fazes get á lista (tipo getUsers()) e lá no swing (?) vais buscar o utilizador que queres, editas e fazes repo.setUsers(novaLista); ou algo assim */
    /* Não sei é se é no swing que vais buscar user ou se tem uma funçao daqui que retorna, idk */
    /* **************************************** */
    
    /*            Login            */
    /* *************************** */
    
    /**
     * Using a class parameter, allows you to login with any type of user
     * @param c The class sent as an argument (Client, Owner or Administrator)
     * @param username The username of the user you want to log in as
     * @param password The password of the user you want to log in as
     * @return 
     */
    public User login(Class c, String username, String password) {  
        
        for(User u: users)
        {
            if(c.isInstance(u))
            {
                if(username.equals(u.getUsername()) && password.equals(u.getPassword()))
                {
                    return u;
                }
            }    
        }  
        
        return null;
    }
    
  
    
    // Lista alojamentos dado uma localizaçao
    // Adiciona a uma lista para a retornar depois (para no swing termos a lista com a localizaçao dada)
    // deve ser algo assim
    public Map getPropertyByLocation(County country) {
        Map<Property, County> propertyMap = new HashMap<>(); // Não sei se é HashMap mas y
        
        for(Map.Entry<Property, County> mp : this.properties.entrySet())
        {
            if(mp.getValue().equals(country))
            {
                propertyMap.put(mp.getKey(), country);
            }
        }
        
        return propertyMap;
    }
    
    // Lista alojamentos dado o Dono dos mesmos
    // Adiciona a uma lista para a retornar depois (para no swing termos a lista com o dono dado)
    public Map getPropertyByOwner(User owner){
        Map<Property, County> propertyOwner = new HashMap<>();

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
     * Checks whether a given property type name exists
     * @param pt The property type list value
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
    
    
    /*            Bed Type            */
    /* ****************************** */
    
    /**
     * Check whether a given bed type name exists
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
    
    /**
     * Adds a location if no exceptions are thrown
     * @param location The location to be added
     */
    public void addLocation(Location location) {
        
        boolean exists = false;
        
        for(Location l : this.locations) // Mudar o for para um iterator
        {
            if(l.getName().equals(location.getName()))
            {
                try
                {
                    verifyLocationName(l, location.getName());
                }
                catch(ExistentLocationNameException ex)
                {
                    exists = true;
                }
            }
        }
        
        if(!exists)
        {
            this.locations.add(location);
        }
        
    }
    
    
    /*            Payment Type            */
    /* ********************************** */
    
    /**
     * Check whether a given payment type name exists
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
    
    
    /*            Ticket            */
    /* **************************** */
    
    public void addTicket(Ticket tickets){
        this.tickets.add(tickets);   
    }
    
    
    /*            Ticket Type            */
    /* ********************************* */
    
    /**
     * Check whether a given ticket type name exists
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
    
    
    /*            Ticket Category            */
    /* ************************************* */
    
    /**
     * Check whether a given ticket category name exists
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
    
    
    /*            Ticket Status            */
    /* *********************************** */
    
    /**
     * Check whether a given ticket status name exists
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
    
    
    /*            Division            */
    /* ****************************** */
    
    /**
     * Check whether a given division name exists
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
  
    
    
    
   
    
    //////////////////////////////////////////// Adding User /////////////////////////////////////////////
    
    /**
    *   Verifica se o Cartão de Cidadão de um utilizador já existe na lista do repositório
    *   @param user User para ir buscar o próprio Cartão de Cidadão com qual deseja comparar o Cartão de Cidadão enviado por parâmetro
    *   @param citizenID Cartão de cidadão enviado para comparar com o cartão de cidadão do utilizador
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
    *   Verifica se o NIF de um utilizador já existe na lista do repositório
    *   @param user User para ir buscar o próprio NIF com qual deseja comparar o NIF enviado por parâmetro
    *   @param NIF NIF enviado para comparar com o NIF do utilizador
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
    *   Check if the username is already in the database 
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
    
    
    ///////////////////////////////////////// Adding Property //////////////////////////////////////////////
    
    //Add properties in the list
    public void addProperty(Property property, County country) {
        this.properties.put(property, country);
    }
    
    ////////////////////////////////////// Edit /////////////////////////////////////////
    
    /////////// Edit Users ///////////////
    public List<User> editUsers(Class c, User user){
        
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
    }
    return novaLista; 
        
    }
    
public void setUsers(List<User> users){
    this.users = users;
}    
        
    
    
    ////////////////////////////////////// List /////////////////////////////////////////
    
    //////////// List Type of Users //////////////
    
    public List<User> listTypeUsers(Class c){
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
    
}


