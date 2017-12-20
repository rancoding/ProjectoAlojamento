/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import property.Property;
import property.PropertyCharacteristics;
import property.PropertyType;
import property.BedType;
import property.location.Country;
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
import java.util.List;
import java.util.Map;
import user.User;
import user.contact.Category;
import user.contact.Division;
import user.contact.Status;
import user.contact.Ticket;
import user.contact.TicketType;
import user.exceptions.ExistentCitizenIdException;
import user.exceptions.ExistentNifException;
import user.exceptions.ExistentUsernameException;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Repository {
    private final Map<Property, Country> properties;
    private final List<PropertyType> propertiesTypes;
    private final List<BedType> bedTypes;
    private final List<Location> locations;
    private final List<PaymentType> paymentTypes;
    private final List<BookingType> bookingTypes;
    private final List<User> users;
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
    
    // Lista alojamentos dado uma localizaçao
    // Adiciona a uma lista para a retornar depois (para no swing termos a lista com a localizaçao dada)
    // deve ser algo assim
    public Map getPropertyByLocation(Country country) {
        Map<Property, Country> propertyMap = new HashMap<>(); // Não sei se é HashMap mas y
        
        for(Map.Entry<Property, Country> mp : this.properties.entrySet())
        {
            if(mp.getValue().equals(country))
            {
                propertyMap.put(mp.getKey(), country);
            }
        }
        
        return propertyMap;
    }
    
    ////////// Adding Property Types /////////////
    
    // Fazer isto para todos que não podem ser repetidos (como tipo de cama, tipo de pagamento, tipo de alojamento, etc)
    
    public boolean verifyPropertyName(PropertyType pt, String name) {
        boolean exists = false;
        
        if(pt.getName().equals(name))
        {
            exists = true; // Aqui vai dar throw new exception (que tem de se criar)
        }
        
        return exists; // Vai-se retirar o return e o tipo de retorno da função de boolean para void
    }
    
    public void addPropertyType(PropertyType propertiesTypes) {
        boolean exists = false;
        
        for(PropertyType pt : this.propertiesTypes) // Mudar o for para um iterator
        {
            if(pt.getName().equals(propertiesTypes.getName()))
            {
                exists = verifyPropertyName(pt, propertiesTypes.getName()); // Try catch com a exception
            }
        }
        
        if(!exists)
        {
            this.propertiesTypes.add(propertiesTypes);
        }
    }
    
    ////////// Adding Bed Types /////////////
    public void addBedType(BedType bedTypes){
        this.bedTypes.add(bedTypes);   
    }
    ////////// Adding Locations /////////////
    public void addLocation(Location locations){
        this.locations.add(locations);   
    }
    ////////// Adding Payment Types /////////////
    public void addPaymentType(PaymentType paymentTypes){
        this.paymentTypes.add(paymentTypes);   
    }
    ////////// Adding Booking Types /////////////
    public void addBookingType(BookingType bookingTypes){
        this.bookingTypes.add(bookingTypes);   
    }
    ////////// Adding Ticket /////////////
    public void addTicket(Ticket tickets){
        this.tickets.add(tickets);   
    }
    ////////// Adding Category Tickets /////////////
    public void addCategory(Category ticketCategories){
        this.ticketCategories.add(ticketCategories);   
    }
    ////////// Adding Status Tickets /////////////
    public void addStatus(Status ticketStatus){
        this.ticketStatus.add(ticketStatus);   
    }
    ////////// Adding TicketType /////////////
    public void addTicketType(TicketType ticketTypes){
        this.ticketTypes.add(ticketTypes);   
    }
    ////////// Adding Divisions /////////////
    public void addDivision(Division divisions){
        this.divisions.add(divisions);   
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
    
    public boolean verifyUserInfo(User u, User user) throws ExistentCitizenIdException, ExistentNifException, ExistentUsernameException {
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
    
        return exists;
    }
    
    //Add users in the list
    public void addUser(User user) throws ExistentCitizenIdException, ExistentNifException, ExistentUsernameException {
        
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
    public void addProperty(Property property, Country country) {
        this.properties.put(property, country);
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


