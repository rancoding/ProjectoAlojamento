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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private final Map<Property, County> properties;
    private final List<PropertyCharacteristics> features;
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
        this.features = new ArrayList<>();
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
    
    
    //////////////////////////////////////////// Adding User /////////////////////////////////////////////
    
    /**
    *   Verifica se o Cartão de Cidadão de um utilizador já existe na lista do repositório
    *   @param user User para ir buscar o próprio Cartão de Cidadão com qual deseja comparar o Cartão de Cidadão enviado por parâmetro
    *   @param citizenID Cartão de cidadão enviado para comparar com o cartão de cidadão do utilizador
    *   @return If the citizenID exists or not
    */
    public boolean checkCitizenID(User user, String citizenID) {
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
    public boolean checkNIF(User user, int NIF) {
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
    public boolean checkUsername(User user, String username)
    {
        boolean exists = false;
        
        if(user.getUsername().equals(username))
        {
            exists = true;
        }
        
        return exists;
    }
    
    public boolean checkAllUser(User user) throws ExistentCitizenIdException, ExistentNifException, ExistentUsernameException{
        boolean exists = false;
        
        exists = checkCitizenID(user, user.getCitizenID());
        if(exists){
            throw new ExistentCitizenIdException();
        
        }
        exists =  checkNIF(user, user.getNIF());
        if(exists){
            throw new ExistentNifException();
        
        }
        exists = checkUsername(user, user.getUsername());
        if(exists){
            throw new ExistentUsernameException();
        }
    
        return exists;
    }
    
    //Add users in the list
    public void addUser(User user) throws ExistentCitizenIdException, ExistentNifException, ExistentUsernameException {
        
        boolean exists = false;
        
        for(User u: users)
        {
            try{
                checkAllUser(user);
            }
            catch(ExistentCitizenIdException | ExistentNifException | ExistentUsernameException ex){
                exists = true;
            }
        }
        
        if(!exists)
        {
            this.users.add(user);
        }
    }
    
    
    
    //////////////////////////////////////////// Serialize and Deserialize ///////////////////////////////////////////

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
    
    
    
    
}


