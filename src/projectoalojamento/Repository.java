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

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Repository {
    private final Map<Property, County> alojamentos;
    private final List<PropertyCharacteristics> caracteristicas;
    private final List<PropertyType> tipoAlojamento;
    private final List<BedType> tipoCama;
    private final List<Location> localidades;
    private final List<PaymentType> tipoPagamento;
    private final List<BookingType> tipoReserva;
    private final List<User> utilizadores;
    private final List<Ticket> tickets;
    private final List<Category> categoriasTicket;
    private final List<Status> estadosTicket;
    private final List<TicketType> tiposTicket;
    private final List<Division> departamentos;
    
    public Repository() {
        this.alojamentos = new HashMap<>();
        this.caracteristicas = new ArrayList<>();
        this.tipoAlojamento = new ArrayList<>();
        this.tipoCama = new ArrayList<>();
        this.localidades = new ArrayList<>();
        this.tipoPagamento = new ArrayList<>();
        this.tipoReserva = new ArrayList<>();
        this.utilizadores = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.categoriasTicket = new ArrayList<>();
        this.estadosTicket = new ArrayList<>();
        this.tiposTicket = new ArrayList<>();
        this.departamentos = new ArrayList<>();
    }
    
    /**
    *   Verifica se o Cartão de Cidadão de um utilizador já existe na lista do repositório
    *   @param utilizador User para ir buscar o próprio Cartão de Cidadão com qual deseja comparar o Cartão de Cidadão enviado por parâmetro
    *   @param cartaoCidadao Cartão de cidadão enviado para comparar com o cartão de cidadão do utilizador
    *   @return Se o Cartão de Cidadão existe ou não
    */
    public boolean verificaCartaoCidadao(User utilizador, String cartaoCidadao) {
        boolean existe = false;
        
        if(utilizador.getCitizenID().equals(cartaoCidadao))
        {
            existe = true;
        }
        
        return existe;
    }
    
    /**
    *   Verifica se o NIF de um utilizador já existe na lista do repositório
    *   @param utilizador User para ir buscar o próprio NIF com qual deseja comparar o NIF enviado por parâmetro
    *   @param NIF NIF enviado para comparar com o NIF do utilizador
    *   @return Se o NIF existe ou não
    */
    public boolean verificaNIF(User utilizador, int NIF) {
        boolean existe = false;
        
        if(utilizador.getNIF() == NIF)
        {
            existe = true;
        }
        
        return existe;
    }
    
    /**
    *   Verifica se o username do utilizador já foi usado
    *   @param utilizador User já criado para saber o seu username
    *   @param username username enviado para ver se já existe em algum utilizador
    *   @return Se o username existe ou não
    */
    public boolean verificaUsername(User utilizador, String username)
    {
        boolean existe = false;
        
        if(utilizador.getUsername().equals(username))
        {
            existe = true;
        }
        
        return existe;
    }
    
    //Adicionar Utilizadores na lista
    public void addUtilizador(User utilizador) {
        
        boolean existe = false;
        
        for(User u: utilizadores)
        {
        }
        
        if(!existe)
        {
            this.utilizadores.add(utilizador);
        }
    }

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


