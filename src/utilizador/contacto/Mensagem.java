/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilizador.contacto;

import java.util.List;
import utilizador.Utilizador;

/**
 *
 * @author Rafael
 */
public class Mensagem {
    
    private String titulo;
    private String descricao;
    private Utilizador remetente;
    private List<Utilizador> destinatarios;

    public Mensagem(String titulo, String descricao, Utilizador remetente, List<Utilizador> destinatarios) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.remetente = remetente;
        this.destinatarios = destinatarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Utilizador getRemetente() {
        return remetente;
    }

    public void setRemetente(Utilizador remetente) {
        this.remetente = remetente;
    }

    public List<Utilizador> getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(List<Utilizador> destinatarios) {
        this.destinatarios = destinatarios;
    }
            
    
    
}
