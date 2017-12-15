/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoalojamento;

import alojamento.Alojamento;
import alojamento.CaracteristicasAlojamento;
import alojamento.TipoAlojamento;
import alojamento.TipoCama;
import alojamento.localidade.Concelho;
import alojamento.localidade.Localidade;
import alojamento.reserva.TipoPagamento;
import alojamento.reserva.TipoReserva;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import utilizador.Utilizador;
import utilizador.contacto.Categoria;
import utilizador.contacto.Departamento;
import utilizador.contacto.Estado;
import utilizador.contacto.Ticket;
import utilizador.contacto.TipoTicket;

/**
 *
 * @author Rafael
 */
public class Repositorio {
    private Map<Alojamento, Concelho> alojamentos;
    private List<CaracteristicasAlojamento> caracteristicas;
    private List<TipoAlojamento> tipoAlojamento;
    private List<TipoCama> tipoCama;
    private List<Localidade> localidades;
    private List<TipoPagamento> tipoPagamento;
    private List<TipoReserva> tipoReserva;
    private List<Utilizador> utilizadores;
    private List<Ticket> tickets;
    private List<Categoria> categoriasTicket;
    private List<Estado> estadosTicket;
    private List<TipoTicket> tiposTicket;
    private List<Departamento> departamentos;
    
    //Adicionar Utilizadores na lista
    public void addUtilizador(Utilizador util){
        
        for(Utilizador u: utilizadores){
            if(util.getCartaoCidadao().equals(u.getCartaoCidadao()) || util.getnFiscal()==u.getnFiscal() || util.getUsername().equals(u.getUsername())){
                System.out.println("Já existe");
            }
            else{
                this.utilizadores.add(util);
            } 
        }
    }
    
    //escrever utilizadores
    public void escreverUtilizadores() throws FileNotFoundException, IOException{
        
        try(FileOutputStream fs = new FileOutputStream("utilizadores.bin")){
            ObjectOutputStream os = new ObjectOutputStream(fs);
            
            os.writeObject(utilizadores);
            os.close();
            
        } catch(FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        
        } catch (IOException e){
        
        
        }
    
    }
    
    //ler utilizadores
    public void lerUtilizadores() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        try(FileInputStream fs = new FileInputStream("utilizadores.bin")){
            ObjectInputStream os = new ObjectInputStream(fs);
            
            List<Utilizador> utilizadores = (List<Utilizador>)os.readObject();
            
        } catch(FileNotFoundException e) {
            System.out.println("Ficheiro não encontrado");
        
        } catch (IOException e){
        
        
        }
    
    }
    
    
    
    
}


